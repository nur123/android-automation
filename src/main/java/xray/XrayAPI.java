package xray;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.nio.file.Paths;

public class XrayAPI {

    private static final String CLIENT_ID = "CAC0303A92DC43F6A6EFF3CC1E4336B7";
    private static final String CLIENT_SECRET = "e2ed2568e8e144802d624a963cf0975e270647709b873c3b287866d5874f598d";

    private static final String CUCUMBER_JSON_PATH = "build" + File.separator + "cucumber.json";
    private static final String CONFIG_JSON_PATH = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "xray-config.json";

    public String login() {
        LoginRequest requestBody = new LoginRequest(CLIENT_SECRET, CLIENT_ID);
        Response response = base()
                .header("content-type", "application/json")
                .body(requestBody)
                .post("/v2/authenticate")
                .then().log().all().extract().response();

        return response.getBody().asString();
    }

    private RequestSpecification base() {
        return RestAssured.given().log().all()
                .baseUri("https://xray.cloud.getxray.app")
                .basePath("/api");
    }

    public void uploadTestExecution(String accessToken) {
        Response response = base()
                .header("Authorization", String.format("Bearer %s", accessToken))
                .header("Content-type", "multipart/form-data")
                .multiPart("info", Paths.get(CONFIG_JSON_PATH).toFile(), "application/json")
                .multiPart("results", Paths.get(CUCUMBER_JSON_PATH).toFile(), "application/json")
                .post("/v2/import/execution/cucumber/multipart")
                .then().log().all().extract().response();
    }
}
