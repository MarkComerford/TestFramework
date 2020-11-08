package ui.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//WebDriver driver = TestSetup.browser;
	private WebDriver browser;

	@FindBy(xpath="//*[@id='username']")
	private WebElement usernameInput;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement passwordInput;
	
	@FindBy(xpath="//button[text() = 'Login']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver browser) {
		this.browser=browser;
		PageFactory.initElements(browser, this);
	}
	
	public void inputUsername(String username) {
		usernameInput.sendKeys(username);
	}
	
	public void inputPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
}
