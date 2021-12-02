package api;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutOperations extends BaseTest{

    @Test(priority = 1)
    public void testPostMethodUsingJSON() {
        request.put("title", "User3");
        request.put("body", "User3JBody");
        request.put("userId", "56");

        given()
                .body(request.toJSONString())
                .when()
                .put("/posts/10")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test(priority = 2)
    public void test2PutMethodUsingJSON() {

        given()
                .contentType("application/json")
                .queryParam("title", "User4")
                .queryParam("body", "User4JBody")
                .queryParam("userId", "75")
                .when()
                .put("/posts/9")
                .then()
                .statusCode(200)
                .log().all();
    }
}
