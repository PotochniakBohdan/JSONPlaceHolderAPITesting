package api;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.baseURI;

public class BaseTest {
    @BeforeMethod
    public void setBaseURI() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    JSONObject request = new JSONObject();
}
