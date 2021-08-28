package web;


import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;


public class WebTest {
    @Test
    public void goToGitHubLocal() {
        System.setProperty("remote", "local");
        WebConfig webConfig = ConfigFactory.create(WebConfig.class);
        String url = webConfig.getBaseUrl();
        open(url);
        assertThat(webConfig.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(webConfig.getNameBrowser()).isEqualTo("chrome");
        assertThat(webConfig.getVersionBrowser()).isEqualTo("92.0");
        assertThat(webConfig.getIsRemote()).isEqualTo(false);


    }

    @Test
    public void goToGitHubRemote() {
        System.setProperty("remote", "remote");
        WebConfig webConfig = ConfigFactory.create(WebConfig.class);
        String url = webConfig.getBaseUrl();
        open(url);
        assertThat(webConfig.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(webConfig.getNameBrowser()).isEqualTo("chrome");
        assertThat(webConfig.getVersionBrowser()).isEqualTo("92.0");
        assertThat(webConfig.getIsRemote()).isEqualTo(true);
    }
    //./gradlew -Dremote=remote clean test
}
