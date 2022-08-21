package jenkins;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Api_Medunna_Register_Post {

    static Response response;
    static Api_Medunna_Register_Pojo api_pojo1 =new Api_Medunna_Register_Pojo();

    public static void main(String[] args) {

        RequestSpecification spec=new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first","api","second","register");

        api_pojo1.setEmail("recep9514@gmail.com");
        api_pojo1.setFirstName("RecepA");
        api_pojo1.setLastName("RecepB");
        api_pojo1.setLangKey("en");
        api_pojo1.setSsn("109-88-8896");
        api_pojo1.setPassword("ReceAB12**");
        api_pojo1.setLogin("recep1987");

        response=given().spec(spec).contentType(ContentType.JSON).body(api_pojo1).when().post("/{first}/{second}");
        response.prettyPrint();
        response.then().statusCode(201);

    }
}
