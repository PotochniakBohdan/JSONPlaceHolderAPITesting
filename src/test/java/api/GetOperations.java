package api;

import com.sun.org.glassfish.gmbal.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class GetOperations {

    @Test(testName = "Get all posts")
    @Description("GET /posts")

    public void getBaseUrl() {
        Response getBaseUrlResponse = RestAssured.get("https://jsonplaceholder.typicode.com/posts");

        int actualStatusCode = getBaseUrlResponse.getStatusCode();
        Assert.assertEquals(actualStatusCode, 200, "Get all posts");

    }

    @Test(testName = "getFirstPost")
    @Description("GET /posts/1")
    public void getFirstPost() {
        Response getFirstPostResponse = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
        int actualStatusCode = getFirstPostResponse.getStatusCode();
        Assert.assertEquals(actualStatusCode, 200, "getFirstPost");
    }


    @Test(testName = "getAllPostsFromChosenID")
    @Description("GET /posts/1/comments")
    public void getAllPostsFromChosenID() {
        Response getAllPostsFromChosenIDResponse =
                RestAssured.get("https://jsonplaceholder.typicode.com/posts");

        int actualStatusCode = getAllPostsFromChosenIDResponse.getStatusCode();
        Assert.assertEquals(actualStatusCode, 200, "getAllPostsFromChosenID");

    }
}
