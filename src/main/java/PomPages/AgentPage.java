package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentPage {
	WebDriver driver;

	public AgentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='teams.aspx']")
	private WebElement hoverteam;

	@FindBy(xpath = "//a[@href='agents.aspx']/child::span")
	private WebElement agents;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txt_name'] ")
	private WebElement addagentname;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txt_mobile']")
	private WebElement agentmobileno;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txt_email']")
	private WebElement agentemailidtxfield;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_txt_pass']")
	private WebElement agentpasswordtxfield;

	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_btn_submit']")
	private WebElement agentsubmitbtn;

	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement popup;

	@FindBy(xpath = "//a[@href='call-list-teams.aspx']/child::span[contains(text(),'Call List ')]")
	private WebElement hovercalllist;

	@FindBy(xpath = "//a[@href='BulkUploadCsv.aspx']/child::span[contains(text(),'Add - Power Import')]")
	private WebElement addpowerimport;

	public void mouseHoverTeam() {
		Actions ac = new Actions(driver);
		ac.moveToElement(hoverteam);
		ac.moveToElement(agents);
		ac.click().build().perform();
	}

	public void addAgentNameTxField(String agentName) {
		addagentname.sendKeys(agentName);
	}

	public void agentMobileNoTxField(String mobileNmber) {
		agentmobileno.sendKeys(mobileNmber);
	}

	public void agentEmailId(String agentEmail) {
		agentemailidtxfield.sendKeys(agentEmail);
	}

	public void agentPassword(String agentPassword) {
		agentpasswordtxfield.sendKeys(agentPassword);
	}

	public void agentSubmitButton() {
		agentsubmitbtn.click();
	}

	public void confirmationPopUp() {
		popup.click();
	}

	public void mouseHoverCallList() {
		Actions ac = new Actions(driver);
		ac.moveToElement(hovercalllist);
		ac.moveToElement(addpowerimport);
		ac.click().build().perform();
	}

}
