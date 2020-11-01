package api.tests.salesOrders;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.libraries.*;
import api.models.responses.salesOrders.SalesOrderResults;
import utils.commonUtils;

import utils.ExtentReports.ExtentTestManager;

public class GetSalesOrders {
	
  commonUtils utils = new commonUtils();
	
  @Test (groups = {"Main1"})
  public void Get_Sales_Orders(Method method) throws JsonProcessingException {
	  ExtentTestManager.startTest(method.getName(), "Get Sales Orders test");
	  
	  ObjectMapper mapper = new ObjectMapper();
	  
	  Map<String, String> params = new HashMap<String, String>() {{
		  put("start", "1");
		  put("limit", "5");
		  put("sortBy", "-dateCreated");
		  
	  }};
	  
	  SalesOrderResults response = SalesOrders.getSalesOrders(params);
	  
	  File file = new File("src/test/java/api/tests/salesOrders/TestData/SOResponse.json");
	  
	  Object object = utils.mapObject(file, SalesOrderResults.class);
	  SalesOrderResults expected_results = SalesOrderResults.class.cast(object);
	  
	  JSONAssert.assertEquals(mapper.writeValueAsString(expected_results), mapper.writeValueAsString(response), false);

  }
}
