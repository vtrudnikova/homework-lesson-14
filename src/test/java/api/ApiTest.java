package api;

import config.ApiConfig;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void gitHubIndexPage() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class);
        String url = apiConfig.getBaseUrl();
        RestAssured.given()
                .baseUri(url)
                .queryParam("token", apiConfig.getToken())
                .get()
                .then().statusCode(200);
    }
    //./gradlew -DconfigFilePath=C:/config/file.properties.txt clean test
}
