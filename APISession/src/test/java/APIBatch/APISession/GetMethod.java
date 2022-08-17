package APIBatch.APISession;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetMethod {

	public static void main(String[] args) {
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIBatchStudents");
		
		System.out.println("The status code is");
		System.out.println(res.statusCode());
		System.out.println("The Data is ");
		System.out.println(res.asString());
	}
	

}
