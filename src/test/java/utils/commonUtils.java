package utils;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class commonUtils {
	
	public ObjectMapper objectMapper = new ObjectMapper();
	
	public Object mapObject(File file, Class<?> className) {
		
		Object mappedObject = null;
		
		try {
			mappedObject = objectMapper.readValue(file, className);
			
			} catch (JsonMappingException e) {
				System.out.println(e);
			} catch (JsonProcessingException s) {
				System.out.print(s);
			} catch (IOException ioe) {
				System.out.println(ioe);
			}
				
			return mappedObject;
		}
	
	public Object mapObject(String json, Class<?> className) {
		
		Object mappedObject = null;
		
		try {
			mappedObject = objectMapper.readValue(json, className);
			
			} catch (JsonMappingException e) {
				System.out.println(e);
			} catch (JsonProcessingException s) {
				System.out.print(s);
			}
				
			return mappedObject;
		}

}
