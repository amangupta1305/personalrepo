package APIBatch.APISession;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Complexjson {

	public static void main(String[] args) {
		
		JSONObject Namedetails= new JSONObject();
			Namedetails.put("Firstname","Anshul");
			Namedetails.put("middlename","bilaal");
		
		
		JSONObject inner= new JSONObject();
			inner.put("House No.","148");
			inner.put("ward No","25");
			inner.put("Landmark","Near kiran taukij bwhind chapra qauter");
			inner.put("Dsitrict","Shahdol");
			inner.put("State","M.P.");
			
	   JSONObject outer= new JSONObject();
	        outer.put("firstName",Namedetails);
	        outer.put("LastName","dev");
	        outer.put("id","109");
	        outer.put("designatin","Devops");
	        outer.put("Gender","Male");
	        outer.put("Address",inner);
	
	
	
	     Response res=
	    		 given()
	    		 .contentType(ContentType.JSON)
	    		 .body(outer.toString())
	             .when()
	             .post("http://localhost:3000/EmployeeRecords");
	     
	     System.out.println("the statusa code is " + res.statusCode());
	     System.out.println("the data is " +res.asString());

	}
}


