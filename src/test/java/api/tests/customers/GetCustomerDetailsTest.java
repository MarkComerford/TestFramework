package api.tests.customers;

import org.testng.annotations.Test;

import api.libraries.Customers;
import api.models.responses.customers.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.*;
import org.skyscreamer.jsonassert.*;

import utils.ExtentReports.ExtentTestManager;

import java.io.File;
import java.io.IOException;

class GetCustomerDetailsTest {

	@Test (groups = {"Main1"})
	public void getCustomerDetails() {
		ExtentTestManager.startTest("Get Customer Details", "Gets a Single Customers Details");
		
		GetCustomerDetails response = Customers.Get_Customer("2419");
		System.out.println(response.getEmail());
		
		ObjectMapper mapper = new ObjectMapper();
	
		File file = new File("src/test/java/Basic/CustomerData.json");
		
		
		
		
		try {
			GetCustomerDetails expected_customer = mapper.readValue(file, GetCustomerDetails.class);

		
			JSONAssert.assertEquals(mapper.writeValueAsString(expected_customer), mapper.writeValueAsString(response), false);
			
			
		} catch (JsonMappingException e) {
			System.out.println(e);
		} catch (JsonProcessingException s) {
			System.out.print(s);
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		 
		
	}
	
	
}
