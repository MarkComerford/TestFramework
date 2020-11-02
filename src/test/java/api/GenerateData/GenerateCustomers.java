package api.GenerateData;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import api.libraries.Customers;
import api.models.requests.customers.createCustomer;
import utils.commonUtils;

public class GenerateCustomers {
	
  commonUtils utils = new commonUtils();
  
  ObjectMapper mapper = new ObjectMapper();
	
  @Test (groups = {"Gen"})
  public void CreateCustomers() throws JsonProcessingException {
	  
	  Faker faker = new Faker();
	  
	  Integer createCount = 4;
	  
	  File file = new File("src/test/resources/SampleRequestBodys/CreateCustomer.json");
	  
	  Object mappedCustomer = utils.mapObject(file, createCustomer.class);
	  createCustomer request = createCustomer.class.cast(mappedCustomer);
	  
	 for(int i = 0; i < createCount; i++) {
		 
		 String firstName = faker.name().firstName();
		 request.setFirstName(firstName);
		 String lastName = faker.name().lastName();
		 request.setLastName(lastName);
		 String name = firstName + " " + lastName;
		 request.setName(name);
		 String email = firstName + "_" + lastName + "@mailinator.com";
		 request.setEmail(email);
		 String phone = faker.phoneNumber().phoneNumber();
		 request.setPhone(phone);
		 
		 
		 Customers.Create_Cutomer(request);
	 }
	  
  }
}
