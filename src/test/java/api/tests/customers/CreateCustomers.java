package api.tests.customers;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.models.requests.customers.*;
import utils.commonUtils;
import Basic.TestSetup;
import api.libraries.Customers;

public class CreateCustomers  {
	
	commonUtils utils = new commonUtils();
	
	@Test (groups = {"Disabled"})
	public void create_customer() {

		File file = new File("src/test/resources/SampleRequestBodys/CreateCustomer.json");

		Object mappedObject = utils.mapObject(file, createCustomer.class);
		createCustomer mapped = createCustomer.class.cast(mappedObject);

		String response = Customers.Create_Cutomer(mapped);
		System.out.println(response);


	}
}
