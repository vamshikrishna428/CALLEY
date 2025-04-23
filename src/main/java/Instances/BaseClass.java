package Instances;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import PomPages.AgentPage;
import PomPages.CSVUploadPage;
import PomPages.LogOutPage;
import PomPages.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public 	Robot robot;
	public Random random;
	public Properties properties;
	public FileInputStream fileinputstream;
	public StringSelection stringselection;

	public LoginPage loginpage;
	public AgentPage agentpage;
	public LogOutPage logoutpage;

	public CSVUploadPage csvuploadpage;



	public int randomnumber;
	public long longtimeout;
	public String agentNameTxField;
	public String implicitwait;
	public String loginurl;
	public String usernameData;
	public String passwordData;
	public String agentMobileNumber;
	public String agentEmailId;
	public String agentPassword;

	public String listNameTest;
	
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("BeforeSuiteMethod");
	}
	@BeforeTest
	public void beforeTest()  {
		System.out.println("BeforeTestMethod");
	}

	@BeforeClass
	public void openBrowser()  throws IOException{
		fileinputstream=new FileInputStream("./src/test/resources/testData.properties");
		properties=new Properties();
		properties.load(fileinputstream);

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--disable-notifications");
		driver = new ChromeDriver(chromeoptions);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void login() {

		loginurl = properties.getProperty("LoginUrl");
		driver.get(loginurl);
		implicitwait = properties.getProperty("timeOut");
		longtimeout = Long.parseLong(implicitwait);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longtimeout));
		loginpage=new LoginPage(driver);
		usernameData = properties.getProperty("useremail");
		passwordData = properties.getProperty("userpassword");
		loginpage.signIn(usernameData, passwordData);

	}
	@AfterMethod
	public void logOut() {
		logoutpage=new LogOutPage(driver);
		logoutpage.dashBoardIcon();
		logoutpage.logOutButton();
		System.out.println("log-out sucessfully");
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTestMethod");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("AfterSuiteMethod");
	}


}
