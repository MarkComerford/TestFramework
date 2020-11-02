package api.tests.test;

import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.commonUtils;

public class SampleTest {
	
	public static String csvFile = "F:\\TestFramework\\src\\test\\java\\api\\tests\\test\\testdata.csv";
	
  @Test(dataProvider = "testData")
  public void SampleTest(String[] records) {
	  
	  for (int i = 0; i < records.length; i++) {
		  System.out.println(records[i]);
	  };
	  
	 
  }
  
  @DataProvider(name = "testData")
  public Iterator<Object[]> testData() throws IOException
  {
    return commonUtils.parseCsvData(csvFile);
  }
}
