package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.*;
import org.testng.annotations.*;

public class GetOperations {

    @Test(testName = "Get all posts")
    public void getBaseUrl(){
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");

        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(actualStatusCode, 200);

    }

    public void getFirstPost(){

    }

    public void getAllPostsFromChosenID(){

    }
}
