package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Jsonfile {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../APISession/Bodydata1.json");
	    FileReader Fr=new FileReader(f);
	    JSONTokener Jt=new JSONTokener(Fr);
	    JSONObject obj=new JSONObject(Jt);
	   
	    Response res=
	    		given()
	    		.contentType(ContentType.JSON)
	    		.body(obj.toString())
	    		.when()
	    		.post("http://localhost:3000/APIBatchStudents");
	    
	    System.out.println("the status code is " +res.statusCode());
	    System.out.println("the data is " + res.asString());
	            
	    
	}

}
