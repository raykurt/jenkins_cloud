package jenkins;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class JenkinsTests {



    @Test
    public void apiTest(){

        RequestSpecification spec  = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();

        //Set the base url and path params
        spec.pathParams("first", "booking", "second",3);


        //Send the Get request and get the response
        Response response = given().spec(spec).when().get("/{first}/{second}");


        response.prettyPrint();


        Map<String, Object> actualData = response.as(HashMap.class);

        Map<String, Object> bookingdates = (Map)actualData.get("bookingdates");


        assertEquals("Mark", actualData.get("firstname"));
        assertEquals("Jones", actualData.get("lastname"));
        assertEquals(508, actualData.get("totalprice"));
        assertEquals(false, actualData.get("depositpaid"));

        assertEquals("2021-03-04", bookingdates.get("checkin"));
        assertEquals("2021-12-13", bookingdates.get("checkout"));




    }



}
