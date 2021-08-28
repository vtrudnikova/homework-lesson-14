package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:web-${remote}.properties"
})
public interface WebConfig extends Config {
    @Key("url")
    String getBaseUrl();

    @Key("browser")
    String getNameBrowser();

    @Key("version")
    String getVersionBrowser();

    @Key("is_remote")
    Boolean getIsRemote();
}
