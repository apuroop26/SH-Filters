package se.example2.softhouse;

/**
 * Created by rohithvajhala on 21-09-2016.
 */
import com.bazaarvoice.dropwizard.assets.AssetsConfiguration;
import com.bazaarvoice.dropwizard.assets.AssetsBundleConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.db.PooledDataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

public class PathConfiguration extends Configuration implements AssetsBundleConfiguration{

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



    /*public PooledDataSourceFactory getDatabaseConfiguration() {
        return database;
    }*/




    @JsonProperty
    @Valid
    @NotNull
    private DataSourceFactory database = new DataSourceFactory();

    public DataSourceFactory getDatabaseConfiguration()
    {
        return database;
    }

    @Valid
    @NotNull
    @JsonProperty
    private final AssetsConfiguration assets = new AssetsConfiguration();

    public AssetsConfiguration getAssetsConfiguration() {
        return assets;
    }


    public void setDatabase(DataSourceFactory database) {
        this.database = database;
    }
}
