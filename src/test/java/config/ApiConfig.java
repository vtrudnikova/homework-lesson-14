package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:${configFilePath}",
        "classpath:api-prod.properties"
         })
public interface ApiConfig extends Config {

    @Key("url")
    String getBaseUrl();
    @Key("token")
    String getToken();
}
