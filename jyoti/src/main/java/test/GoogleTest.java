package test;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import jyoti.Post;

public class GoogleTest {

    @Before
    public void init() {
        System.out.println("1");
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com/";
        // RestAssured.port = 8080;
        // RestAssured.basePath = "seller-api-web";
    }
    
    @Before
    public void init3() {
        //RestAssured.baseURI = "http://jsonplaceholder.typicode.com/";
        System.out.println("DSfg");
        // RestAssured.port = 8080;
        // RestAssured.basePath = "seller-api-web";
    }

//    @Test
//    public void test200() {
//        expect().statusCode(200).when().get("users/2");
//    }
//
//    @Test
//    public void test200_body() {
//        expect().statusCode(200).
//        body(
//                "name", equalTo("Ervin Howell"), 
//                "address.zipcode", equalTo("Shanna@melissa.tv")).
//        when().get("users/2");
//    }
    
    @Test
    public void post200(){
        

        
        Post obj1 = new Post();
        obj1.setId(123);
        obj1.setUserId(124);
        obj1.setBody("jyoti");
        obj1.setTitle("mohit");
        
        Response r = given().contentType("application/json").and().body(obj1).when().post("posts");
        String abc = r.getBody().asString();
        System.out.println(r.getStatusCode());
        String a = JsonPath.with( abc).get( "post.title" );
        System.out.println(a);
        Assert.assertEquals("mohit", a);
        //Assert.assertEquals(201, r.getStatusCode());
  
    }

}
