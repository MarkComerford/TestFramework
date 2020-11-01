package api.libraries;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import Basic.TestSetup;
import api.config.URIs;
import api.models.requests.customers.createCustomer;
import api.models.responses.customers.GetCustomerDetails;

public class Customers {
	
	public static GetCustomerDetails Get_Customer(String CustomerId) {
		
		GetCustomerDetails response = null;
		
		response = RestAssured.given()
				.spec(TestSetup.getRequestSpec())
				.get(URIs.customersAPI+CustomerId+"/")
				.then()
				.statusCode(200)
				.extract()
				.as(GetCustomerDetails.class);
		
		return response;
	}
	
	public static String Create_Cutomer(createCustomer requestBody) {
		
		Response response = null;
		
		response = RestAssured.given()
				.spec(TestSetup.getRequestSpec())
				.body(requestBody)
				.post(URIs.customersAPI)
				.then()
				.statusCode(200)
				.extract()
				.response();
		
		return response.getBody().asString();
	}

}
