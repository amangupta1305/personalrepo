package APIBatch.APISession;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) {
		
		JSONObject obj1=new JSONObject();
		obj1.put("firstName","Aman");
		obj1.put("LastName","Gupta");
		obj1.put("id","101");
		obj1.put("designatin","Tester");
        obj1.put("Gender","Male");
        obj1.put("Address","shahdol");
        
        
        
        
       Response res=
        		given()
        		.contentType(ContentType.JSON)
                .body(obj1.toString())
                .when()
                .post("http://localhost:3000/EmployeeRecords");
       
       System.out.println("the status code is " + res.statusCode());
       System.out.println("the data is " +res.asString());
     
                
	}

}
