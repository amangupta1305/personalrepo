package pkg2;

import APISession2.Complexjsonusingpojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Postusingpojo {

	public static void main(String[] args) {
		
		FirstName firstname=new FirstName();
		firstname.setFirstName("Harbharjan");
		firstname.setMiddlename("kumar");
		
		PhoneNo phoneNo=new PhoneNo();
		phoneNo.setCountryCode("+91");
		phoneNo.setSTDCode("1234");
		phoneNo.setTelephoneNo("6239570209");
		
		Complex1json outer=new Complex1json();
		outer.setFirstname(firstname);
		outer.setLastName("Singh");
		outer.setId("2021");
		outer.setDesignatin("sr.Assistant");
		outer.setGender("Male");
		outer.setAddress("Bhopal");
		outer.setPhoneNo(phoneNo);
		
		Response res=
		 given()
		.contentType(ContentType.JSON)
		.body(outer)
		.when()
		.post("http://localhost:3000/APIBatchStudents");
		
		System.out.println("the status code is " +res.statusCode());
		System.out.println("the data is " +res.asString());

	}

}
