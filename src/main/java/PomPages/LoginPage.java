package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='txtEmailId']")
	private WebElement emailid;

	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='btnLogIn']")
	private WebElement signin;

	@FindBy(xpath = "//button[@class='close']")
	private WebElement popupclosebutton;

	public void signIn(String userNametx, String passwordtx) {
		emailid.sendKeys(userNametx);
		password.sendKeys(passwordtx);
		signin.click();
	}

	public void popUpCloseButton() {
		popupclosebutton.click();
	}
}
