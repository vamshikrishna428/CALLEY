package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	WebDriver driver;
	public LogOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle waves-effect waves-light nav-user']")
	private WebElement dashboardicon;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right profile-dropdown desktop_profilesetup show']/child::a[@class='dropdown-item notify-item']/child::span[contains(text(),'Logout')]")
	private WebElement logoutbutton;

	public void dashBoardIcon() {
		dashboardicon.click();
	}
	public void logOutButton() {
		logoutbutton.click();
	}

}
