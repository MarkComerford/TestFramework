package SampleTests;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.models.sampledata.*;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class SampleDataTest {
  @Test
  public void SampleTest() throws IOException {
	  
	  ObjectMapper mapper = new ObjectMapper();
	  
	  File SampleDataA = new File("src/test/java/SampleTests/SampleDataA.json");
	  File SampleDataB = new File("src/test/java/SampleTests/SampleDataB.json");
	  
	  SampleData SampleA = mapper.readValue(SampleDataA, SampleData.class);
	  SampleData SampleB = mapper.readValue(SampleDataB, SampleData.class);
	  
	  assertEquals(mapper.readTree(mapper.writeValueAsString(SampleA)), mapper.readTree( mapper.writeValueAsString(SampleB)));
  }
}
