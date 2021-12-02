package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class DeleteOperations extends BaseTest{

    @Test
    public void testDeleteMethod() {

                when()
                .put("/posts/9")
                .then()
                .statusCode(200)
                .log().all();
    }
}
