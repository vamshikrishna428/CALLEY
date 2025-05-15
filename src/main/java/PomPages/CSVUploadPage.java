package PomPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CSVUploadPage {
	WebDriver driver;

	public CSVUploadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtlistname']")
	private WebElement listnametxbx;

	@FindBy(xpath = "//button[@class='multiselect dropdown-toggle btn btn-default']")
	private WebElement selectanagent;

	@FindBy(xpath = "//input[@value='all']")
	private WebElement selectall;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_fileUpload']")
	private WebElement fileupload;

	@FindBy(xpath = "//i[@class='fa fa-upload']")
	private WebElement uploadfilebutton;

	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement sweetpopupbutton;

	@FindBy(xpath = "//select[@id='ddlbelongto_1']")
	private WebElement belongtofirstname;

	@FindBy(xpath = "//select[@id='ddlbelongto_2']")
	private WebElement belongtophonenumber;

	@FindBy(xpath = "//select[@id='ddlbelongto_3']")
	private WebElement belongtonotes;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnUpload']")
	private WebElement importdatabutton;

	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement datauploadedsuccessfullypopup;

	public void listNameTextField(String listNameTextBox) {
		listnametxbx.sendKeys(listNameTextBox);
	}

	public void selectAnAgent() {
		selectanagent.click();
	}

	public void selectAll() {
		selectall.click();
	}

	public void fileUpLoad() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", fileupload);
	}

	public void mouseHover() {
		Actions ac = new Actions(driver);
		ac.moveToElement(listnametxbx);
		ac.click().build().perform();
	}

	public void uploadFileButton() {
		uploadfilebutton.click();
	}

	public void sweetPopUpButton() {
		sweetpopupbutton.click();
	}

	public void belongToFirstName() {
		Select select = new Select(belongtofirstname);
		select.selectByVisibleText("FirstName");
	}

	public void belongToPhoneNumber() {
		Select select = new Select(belongtophonenumber);
		select.selectByValue("Phone");
	}

	public void belongToNotes() {
		Select select = new Select(belongtonotes);
		select.selectByValue("Notes");
	}

	public void importDataButton() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true);", importdatabutton);
		importdatabutton.click();
	}

	public void dataUploadedSuccessfullyPopUp() {
		datauploadedsuccessfullypopup.click();
	}

}
