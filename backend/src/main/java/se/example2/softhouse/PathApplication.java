package se.example2.softhouse;

import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;

import io.dropwizard.Application;
import io.dropwizard.Bundle;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

import java.sql.SQLException;

import se.bth.softhouse.db.PathDao;
import se.bth.softhouse.resources.AudioResource;
import se.bth.softhouse.resources.PathResource;
import se.example2.softhouse.Resource.HelloWorldResource;
import se.example2.softhouse.health.TemplateHealthCheck;


public class PathApplication extends Application<PathConfiguration> {
    public static void main(String[] args) throws Exception {
        new PathApplication().run(args);
    }

    private static final String API_URL_PATTERN = "/api/*";

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void run(PathConfiguration configuration, Environment environment) throws SQLException {
        //configureCrossOriginFilter(configuration, environment);
        //environment.jersey().register(MultiPartFeature.class);
        // resources
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDatabaseConfiguration(), "h2");
        org.h2.tools.Server myH2adminGUI = org.h2.tools.Server.createWebServer("-webDaemon");
        myH2adminGUI.start();

        final PathDao pathDao = jdbi.onDemand(PathDao.class);
        environment.jersey().setUrlPattern("/api/*");
        pathDao.createpathsTable();

        final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(),
                configuration.getDefaultName());
        final PathResource PathResource = new PathResource();

        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);

        environment.jersey().register(resource);
        environment.jersey().register(new PathResource(pathDao));
    }

    @Override
    public void initialize(Bootstrap<PathConfiguration> configuration) {
        // nothing to do yet
        configuration.addBundle( new ConfiguredAssetsBundle("/assets/", "/", "index.html"));
    }



}