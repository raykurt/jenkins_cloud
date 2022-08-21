package jenkins;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Api_Medunna_Appo_Post {

    static Response response;
    static Api_Medunna_Appo_Pojo api_pojo =new Api_Medunna_Appo_Pojo();

    public static void main(String[] args) {

        RequestSpecification spec=new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first","api","second","appointments","third","request");

        api_pojo.setEmail("recep1575@gmail.com");
        api_pojo.setFirstName("Recep8a8");
        api_pojo.setLastName("Recep7a7");
        api_pojo.setPhone("(325) 088-9927");
        api_pojo.setSsn("709-28-7996");
        api_pojo.setStartDate("2022-08-29");

        response=given().spec(spec).contentType(ContentType.JSON).body(api_pojo).when().post("/{first}/{second}/{third}");
        response.prettyPrint();
        response.then().statusCode(201);

    }
}
