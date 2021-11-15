package api;

import com.sun.org.glassfish.gmbal.Description;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class GetOperations {

    @Test(testName = "Get all posts", description = "GET /posts" )
    public void getBaseUrl() {
        Response getBaseUrlResponse = get("https://jsonplaceholder.typicode.com/posts");

        int actualStatusCode = getBaseUrlResponse.getStatusCode();
        Assert.assertEquals(actualStatusCode, 200, "Get all posts");

    }

    @Test(testName = "getFirstPost")
    @Description("GET /posts/1")
    public void getFirstPost() {
        Response getFirstPostResponse = get("https://jsonplaceholder.typicode.com/posts/1");
        int actualStatusCode = getFirstPostResponse.getStatusCode();
        Assert.assertEquals(actualStatusCode, 200, "getFirstPost");
    }


    @Test(testName = "getAllPostsFromChosenID")
    @Description("GET /posts/1/comments")
    public void getAllPostsFromChosenID() {
        Response getAllPostsFromChosenIDResponse =
                get("https://jsonplaceholder.typicode.com/posts");

        int actualStatusCode = getAllPostsFromChosenIDResponse.getStatusCode();
        Assert.assertEquals(actualStatusCode, 200, "getAllPostsFromChosenID");

    }

    @Test(testName = "getFromPostID")
    @Description("GET /posts/1/comments")
    public void getFromPostID() {
        Response getAllPostsFromChosenIDResponse =
                get("https://jsonplaceholder.typicode.com/posts");

        int actualStatusCode = getAllPostsFromChosenIDResponse.getStatusCode();
        Assert.assertEquals(actualStatusCode, 200, "getAllPostsFromChosenID");

    }
}
