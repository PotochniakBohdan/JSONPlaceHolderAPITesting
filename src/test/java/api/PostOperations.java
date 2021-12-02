package api;

import org.json.simple.JSONObject;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;

public class PostOperations extends BaseTest {


    @Test(priority = 1)
    public void testPostMethodUsingJSON() {
        request.put("title", "User1");
        request.put("body", "User1JBody");
        request.put("userId", "55");

        given()
                .body(request.toJSONString())
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().all();
    }

    @Test(priority = 2)
    public void test2PostMethodUsingQueryParam() {

        given()
                .contentType("application/json")
                .queryParam("title", "User2")
                .queryParam("body", "User2JBody")
                .queryParam("userId", "65")
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().all();
    }

}
