package ui.tests.login;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basic.TestSetup;
import ui.pageObjects.LoginPage;
import utils.ExtentReports.ExtentTestManager;

public class LoginTests extends TestSetup {

	protected LoginPage loginPage;

	@BeforeTest(alwaysRun=true)
	public void setUp() {
		loginPage = new LoginPage(browser);
	}

	@Test  (groups = {"ui"})
	public void LoginTest() throws InterruptedException {
		ExtentTestManager.startTest("Login Test", "Simple Login Test");

		browser.get("https://" + prop.getProperty("domain"));
		loginPage.inputUsername(prop.getProperty("username"));
		loginPage.inputPassword(prop.getProperty("password"));
		loginPage.clickLoginButton();
		assertNotNull(browser.findElement(By.xpath("//h4[text()='Systum Management']")));
		browser.close();
	}
}
