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

        assertEquals("Eric", actualData.get("firstname"));
        assertEquals("Jackson", actualData.get("lastname"));
        assertEquals(935, actualData.get("totalprice"));
        assertEquals(false, actualData.get("depositpaid"));

        assertEquals("2017-01-01", bookingdates.get("checkin"));
        assertEquals("2021-05-11", bookingdates.get("checkout"));
    }

    @Test
    public void apiTest2(){
        System.out.println("*** Jenkins Works Well ***");
    }

    @Test
    public void apiTest3(){
        System.out.println("*** Jenkins Well ***");
    }

//    static void printArray(int arr[], int n)
//    {
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//    static void RearrangePosNeg(int arr[], int n)
//    {
//
//        int key =0;
//
//        for(int i =0; i <n ; i++){
//            for (int j=i+1; j<n; j++){
//                if(arr[i]>0){
//                    key=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=key;
//                }
//            }
//        }
//
//    }
//    public static void main(String[] args)
//    {
//        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6 };
//        int n = arr.length;
//        RearrangePosNeg(arr, n);
//        printArray(arr, n);
//    }


}

