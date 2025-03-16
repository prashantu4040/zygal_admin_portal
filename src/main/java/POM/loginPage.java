package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	@FindBy(xpath = "//input[@id='user_email_login']")
	private WebElement userId;
	@FindBy(xpath = "//input[@id='user_password_login']")
	private WebElement password;
	@FindBy(xpath = "//button[@id='submit_login_btn']")
	private WebElement submit;
	@FindBy(xpath = "//a[text()='user_forgot_password_btn']")
	private WebElement forgot_password;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")
	private WebElement signup;
	@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']")
	private WebElement geterror;

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enteruserId(String user) {
		userId.sendKeys(user);
	}

	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}

	public void ClickOnSubmit() {
		submit.click();
	}

	public void ClickOnforgot() {
		forgot_password.click();
	}

	public void ClickOnSignup() {
		signup.click();
	}

	public boolean getErrorText() {
		boolean text = geterror.isDisplayed();
		System.out.println(text);
		return text;

		/*
		 * public String getErrorText() { String error=geterror.getText();
		 * System.out.println(error); return error;
		 */
	}

}
