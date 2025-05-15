package PomPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='txtName']")
	private WebElement name;

	@FindBy(xpath = "//input[@id='txtEmail']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='txt_mobile']")
	private WebElement mobileno;

	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement captcha;

	@FindBy(css = ".recaptcha-checkbox-border")
	private WebElement captchaCB;

	@FindBy(xpath = "//input[@id='checkbox-signup']")
	private WebElement termsconditions;

	@FindBy(xpath = "//input[@name='btnSignUp']")
	private WebElement signup;

	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement smspopup;

	public void nameTxField(String Name) {
		name.sendKeys(Name);
	}

	public void emailTxField(String emailId) {
		email.sendKeys(emailId);
	}

	public void passworsTxField(String passwordtx) {
		password.sendKeys(passwordtx);
	}

	public void mobileNO(String mobilenolng) {
		mobileno.sendKeys(mobilenolng);
	}

	public void captchaFrame() {
		driver.switchTo().frame(captcha);
	}

	public void captchaCheckBox() {
		captchaCB.click();
		driver.switchTo().defaultContent();
	}

	public void termsConditionsCheckBox() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", termsconditions);
	}

	public void signUpButton() {
		signup.submit();
	}

	public void smsPopUp() {
		smspopup.click();
	}
}
