package APISession2;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Simplejsonusingpojo {

	public static void main(String[] args) {
		Simplejson sim= new Simplejson();
		sim.setFirstname("shikhar");
		sim.setLastname("dhawan");
		sim.setDesignatin("BA");
		sim.setId("104");
		sim.setAddress("Zirakpur");
		sim.setGender("Male");
		
		Response res=
		given()
	    .contentType(ContentType.JSON)
	    .body(sim)
	    .when()
	    .post("http://localhost:3000/EmployeeRecords");
		
		System.out.println("the status code is " +res.statusCode());
		System.out.println("the data is " +res.asString());
	    
		
	}

}
