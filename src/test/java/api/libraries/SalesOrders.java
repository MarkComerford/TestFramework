package api.libraries;

import java.util.Map;

import Basic.TestSetup;
import api.config.URIs;
import api.models.responses.salesOrders.SalesOrderResults;
import io.restassured.RestAssured;

public class SalesOrders {
	
	public static SalesOrderResults getSalesOrders(Map<String,?> paramMap) {
		
		SalesOrderResults response = RestAssured.given()
				.spec(TestSetup.getRequestSpec())
				.queryParams(paramMap)
				.get(URIs.salesOrdersAPI)
				.then()
				.assertThat()
				.statusCode(200)
				.extract()
				.as(SalesOrderResults.class);
				
		return response;
	}
	
	public static SalesOrderResults getSalesOrders() {
		
		SalesOrderResults response = RestAssured.given()
				.spec(TestSetup.getRequestSpec())
				.get(URIs.salesOrdersAPI)
				.then()
				.assertThat()
				.statusCode(200)
				.extract()
				.as(SalesOrderResults.class);
				
		return response;
	}
}
