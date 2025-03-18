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
	@FindBy (xpath = "//input[@id='captcha_input_login']")
	private WebElement captcha;
	@FindBy(xpath = "//button[@id='submit_login_btn']")
	private WebElement submit;
	@FindBy(xpath = "//a[text()='user_forgot_password_btn']")
	private WebElement forgot_password;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")
	private WebElement signup;
	@FindBy(xpath = "//h2[@class='el-notification__title']")
	private WebElement getError;

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enteruserId(String user) {
		userId.sendKeys(user);
	}

	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterCaptcha(String captchaWord) {
		captcha.sendKeys(captchaWord);
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

	public String getErrorText() {
		System.out.println(getError);
	    if (getError.isDisplayed()) {
	    	//System.out.println("captcha error message" + getError.getText());
	        return getError.getText();
	    }
	    return "No error message displayed";
	}

}
