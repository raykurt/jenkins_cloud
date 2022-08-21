package jenkins;

import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;
import static jenkins.Api_Medunna_Database_Utilities.*;

public class Api_Medunna_DatabaseVEApi_Get {

    static Response response;
    static String token;
    static List<Object> actualeMailList;

    public static void main(String[] args) {

//        RequestSpecification spec=new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
//        spec.pathParams("first", "api", "second", "authenticate");
//
//        Map<String, Object> expectedData = new HashMap<>();
//        expectedData.put("username", "adminrecep");
//        expectedData.put("password", "123Recep");
//        expectedData.put("rememberMe","true" );
//
//        response = given().spec(spec).contentType(ContentType.JSON).
//                body(expectedData).when().post("/{first}/{second}");
//
//        JsonPath json = response.jsonPath();
//
//        token = json.getString("id_token");
//
//        response = given().headers("Authorization", "Bearer " + token,
//                        "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().
//                get("https://medunna.com/api/rooms/28483");
//
//        response.prettyPrint();


        createConnection();
        actualeMailList=getColumnData("select * from jhi_user where first_name like '%Recep%'", "email");
        closeConnection();

        System.out.println(actualeMailList);
        Assert.assertTrue(actualeMailList.contains("recep15555@gmail.com"));

    }
}
