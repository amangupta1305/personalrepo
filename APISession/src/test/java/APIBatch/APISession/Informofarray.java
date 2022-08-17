package APIBatch.APISession;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Informofarray {

	public static void main(String[] args) {
		JSONObject inner1=new JSONObject();
		inner1.put("house no","30");
		inner1.put("wardno","130");
		inner1.put("type","Primary Address");
		inner1.put("landmark","near raghuraj school");
		inner1.put("Distirct","indore");
		inner1.put("state","M.P.");
		
		
		JSONObject inner2=new JSONObject();
		inner2.put("house no","34");
		inner2.put("wardno","136");
		inner2.put("type","secondary Address");
		inner2.put("landmark","near ABC hotel");
		inner2.put("Distirct","Tharike Census Town");
		inner2.put("state","Lucknow");
		
		
		JSONArray innerarray=new  JSONArray();
		innerarray.put(0,inner1);
		innerarray.put(1,inner2);				
				
				
		JSONObject outer=new JSONObject();
		outer.put("firstname","anita");
		outer.put("lastname","Desai");
		outer.put("id","1202");
		outer.put("Designatio","CEO");
		outer.put("Address",innerarray);
		outer.put("gender","Female");
		
		Response abc=
				given()
		        .contentType(ContentType.JSON)
		        .body(outer.toString())
		        .when()
		        .post("http://localhost:3000/APIBatchStudents");
		
		System.out.println("the status code is "+ abc.statusCode());
		System.out.println("the data is "+abc.asString());
		
}
}
