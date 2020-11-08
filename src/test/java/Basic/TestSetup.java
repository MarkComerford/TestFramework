package Basic;

import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.apache.commons.io.FileUtils;

public class TestSetup {

	public static String token;
	
	public static Properties prop = new Properties();
	
	public static RequestSpecBuilder builder;
    public static RequestSpecification requestSpec;
    
    public static WebDriver browser = null;
	
	@Parameters({"properties-file"}) 
	@BeforeSuite(alwaysRun=true) 
	public void classSetup(String properties_file) {
		
		try (InputStream propFile = new FileInputStream("src/test/resources/config/" + properties_file)) {
			
			prop.load(propFile);
			
			System.out.println("Running on domain " + prop.getProperty("domain"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		RestAssured.urlEncodingEnabled=false;
		RestAssured.baseURI = "https://" + prop.getProperty("domain");
		
		token =	generateLoginToken();
		
	}
	
	@Parameters({"properties-file"})
	@BeforeSuite (groups = {"ui"})
	public void driverSetup(String properties_file) {
		try (InputStream propFile = new FileInputStream("src/test/resources/config/" + properties_file)) {
			
			prop.load(propFile);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		 System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe"); 
		 ChromeOptions options = new ChromeOptions();
		 System.out.println(prop.getProperty("headless"));
		 if(prop.getProperty("headless").equals("true")) {
			 options.addArguments("--headless","--window-size=1920,1080");
		 }
		 options.addArguments("--start-maximized");
		 browser = new ChromeDriver(options);
		 browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterSuite  (groups = {"ui"})
	public void driverTeardown() {
		System.out.println("Quitting driver...");
		browser.quit();
	}
	
	public static RequestSpecification getRequestSpec() {
		
		builder = new RequestSpecBuilder();
		builder.addHeader("content-type", "application/json");
		builder.addHeader("Authorization", "Token " + token);
		requestSpec = builder.build();
		requestSpec.log().uri();
		
		return requestSpec;
		
	}

	
	protected String generateLoginToken() {

		JSONObject requestBody = new JSONObject();
		requestBody.put("domain", prop.getProperty("domain"));
		requestBody.put("username", prop.getProperty("username"));
		requestBody.put("password", prop.getProperty("password"));
		requestBody.put("grant_type", "password");

		String token = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBody.toString())
				.post("/api/identity/auth/employee/")
				.then()
				.extract()
				.path("token");
		
		System.out.println("Token: " + token);

		return token;

	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
}