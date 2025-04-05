package Instances;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import PomPages.RegistrationPage;


public class RegBaseClass {
	public WebDriver driver;
	public FileInputStream fileinputstream;
	public Properties properties;

	public	RegistrationPage registrationpage;
	
	
	public String registrationurl;
	public String implicitwait;
	public long longtimeout;
	
	public String nametx;
	public String emailid;
	public String password;
	public String passwordstring;
	public String mobileno;

	@BeforeTest
	public  void config() throws IOException {
		fileinputstream=new FileInputStream("./src/test/resources/testData.properties");
		properties=new Properties();
		properties.load(fileinputstream);
	}
	@BeforeClass
	public void openBrowser() {
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--disable-notifications");
		driver = new ChromeDriver(chromeoptions);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void loginRegister() {
		registrationurl = properties.getProperty("RegistrationUrl");
		driver.get(registrationurl);
		implicitwait = properties.getProperty("timeOut");
		longtimeout = Long.parseLong(implicitwait);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longtimeout));
		registrationpage=new RegistrationPage(driver);

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
