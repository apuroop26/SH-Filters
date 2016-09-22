package se.example2.softhouse;

import com.bazaarvoice.dropwizard.assets.AssetsBundleConfiguration;
import com.bazaarvoice.dropwizard.assets.AssetsConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.db.PooledDataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;


import javax.validation.Valid;

/**
 * Created by hxs on 2016-08-16.
 */
public class DemoConfiguration extends Configuration implements AssetsBundleConfiguration{



    @Valid
    @javax.validation.constraints.NotNull
    @JsonProperty
    private final AssetsConfiguration assets = new AssetsConfiguration();

    public AssetsConfiguration getAssetsConfiguration() {
        return assets;
    }

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    private String[] allowedOrigins;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }

    @JsonProperty
    public String[] getAllowedOrigins() {
        return allowedOrigins;
    }

    @JsonProperty
    public void setAllowedOrigins(String[] allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    @JsonProperty
    @Valid
    @NotNull

    public PooledDataSourceFactory getDatabaseConfiguration() {
    return database;
    }


        @Valid
        @NotNull
        private DataSourceFactory database = new DataSourceFactory();

        @JsonProperty("database")
        public void setDataSourceFactory(DataSourceFactory factory) {
            this.database = factory;
        }

        @JsonProperty("database")
        public DataSourceFactory getDataSourceFactory() {
            return database;
        }





}
