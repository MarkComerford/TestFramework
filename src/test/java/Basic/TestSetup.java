package Basic;

import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.json.JSONObject;

import org.testng.annotations.BeforeSuite;

public class TestSetup {

	public static String token;
	
	private Properties prop = new Properties();
	
	public static RequestSpecBuilder builder;
    public static RequestSpecification requestSpec;
	
	@Parameters({"properties-file"}) 
	@BeforeSuite(alwaysRun=true) 
	public void classSetup(String properties_file) {
		
		try (InputStream propFile = new FileInputStream("src/test/resources/config/" + properties_file)) {
			
			prop.load(propFile);
			
			System.out.println("Running on domain " + prop.getProperty("domain"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		RestAssured.urlEncodingEnabled=false;
		RestAssured.baseURI = "https://" + prop.getProperty("domain");
		
		token =	generateLoginToken();
		
	}
	
	public static RequestSpecification getRequestSpec() {
		
		builder = new RequestSpecBuilder();
		builder.addHeader("content-type", "application/json");
		builder.addHeader("Authorization", "Token " + token);
		requestSpec = builder.build();
		requestSpec.log().uri();
		
		return requestSpec;
		
	}

	
	protected String generateLoginToken() {

		JSONObject requestBody = new JSONObject();
		requestBody.put("domain", prop.getProperty("domain"));
		requestBody.put("username", prop.getProperty("username"));
		requestBody.put("password", prop.getProperty("password"));
		requestBody.put("grant_type", "password");

		String token = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBody.toString())
				.post("/api/identity/auth/employee/")
				.then()
				.extract()
				.path("token");
		
		System.out.println("Token: " + token);

		return token;

	}
}