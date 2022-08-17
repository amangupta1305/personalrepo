package APISession2;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Posatusingcomplex {

	public static void main(String[] args) {
		
		
		Complexjson[] Address=new Complexjson[2];
		Address[0]=new Complexjson();
		
		Address[0].setHouseNo("87");
		Address[0].setWardNo("125");
		Address[0].setLandmark("Near sarojni market");
		Address[0].setType("Primary Address");
		Address[0].setDistirct("Badlapur");
		Address[0].setState("Bihar");
		
		Address[1]=new Complexjson();
		
		Address[1].setHouseNo("86");
		Address[1].setWardNo("125");
		Address[1].setLandmark("Near DLF Building");
		Address[1].setType("Secondary Address");
		Address[1].setDistirct("jonaghar");
		Address[1].setState("Bihar");
		
		
		
		Complexjsonusingpojo outer=new Complexjsonusingpojo();
		outer.setFirstname("suresh");;
		outer.setLastname("Raina");
		outer.setId("2019");
		outer.setDesignatin("sr.techanical");
		outer.setGender("Male");
		outer.setAddress(Address);
		
		
		
		Response res=
		given()
        .contentType(ContentType.JSON)
        .body(outer)
        .when()
        .post("http://localhost:3000/APIBatchStudents");
		
		System.out.println("the status code is " + res.statusCode());
		System.out.println("the data is " + res.asString());

	}
	
	

}
