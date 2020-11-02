package SampleTests;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SimpleTest {
  @Test
  public void f() {
	  
	  RestAssured.baseURI = "https://mcomerford-branch.systum.com";
	  
	  JSONObject requestBody = new JSONObject();
		requestBody.put("domain", "mcomerford-branch.systum.com");
		requestBody.put("username", "mcomerford@systum.com");
		requestBody.put("password", "m@rk169!");
		requestBody.put("grant_type", "password");

		String token = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBody.toString())
				.post("/api/identity/auth/employee/")
				.then()
				.extract()
				.path("token");
		
		System.out.println("Token: " + token);
		
		Response response = null;
		
		response = RestAssured.given()
				.headers("content-type", "application/json", "Authorization", "Token " + token)
				.get("/api/customers/2419/")
				.then()
				.statusCode(200)
				.extract()
				.response();
		
		System.out.println(response.getBody().asString());
  }
}
