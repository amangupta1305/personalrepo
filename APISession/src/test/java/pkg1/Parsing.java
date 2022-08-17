package pkg1;

import static io.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class Parsing {

	public static void main(String[] args) {
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(" http://localhost:3000/APIBatchStudents");

		JSONArray g=new JSONArray(res.asString());
		String wer=g.getJSONObject(4).get("firstname").toString();
		System.out.println(wer);
		}
}

