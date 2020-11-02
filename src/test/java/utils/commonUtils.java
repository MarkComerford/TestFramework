package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
	public static Iterator<Object[]> parseCsvData(String fileName) throws IOException
	{
	  BufferedReader input = null;
	  File file = new File(fileName);
	  input = new BufferedReader(new FileReader(file));
	  String line = null;
	  ArrayList<Object[]> data = new ArrayList<Object[]>();
	  while ((line = input.readLine()) != null)
	  {
	    String in = line.trim();
	    String[] temp = in.split(",");
	    List<Object> array = new ArrayList<Object>();
	    for(String s : temp)
	    {
	      array.add(s);
	    }
	    data.add(array.toArray());
	  }
	  input.close();
	  return data.iterator();
	}

}
