package TestClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.testng.annotations.Test;

import Instances.BaseClass;
import PomPages.AgentPage;
import PomPages.CSVUploadPage;

public class FullTeamSetUpTest extends BaseClass {
	@Test
	public void teamSetUpTest() throws InterruptedException, AWTException  {
		agentpage=new AgentPage(driver);
		agentpage.mouseHoverTeam();
		agentNameTxField = properties.getProperty("AgentName");
		random=new Random();
		randomnumber = random.nextInt(99);
		agentpage.addAgentNameTxField(agentNameTxField+randomnumber);
		agentMobileNumber = properties.getProperty("AgentmobileNumber");
		agentpage.agentMobileNoTxField(agentMobileNumber+randomnumber);
		agentEmailId = properties.getProperty("AgentEmailId");

		agentpage.agentEmailId(agentEmailId+randomnumber+"@gmail.com");
		agentPassword = properties.getProperty("AgentPassword");
		agentpage.agentPassword(agentPassword);
		agentpage.agentSubmitButton();
		agentpage.confirmationPopUp();
		agentpage.mouseHoverCallList();

		listNameTest = properties.getProperty("ListName");
		
		csvuploadpage=new CSVUploadPage(driver);
		csvuploadpage.listNameTextField(listNameTest);
		csvuploadpage.selectAnAgent();
		csvuploadpage.selectAll();
		csvuploadpage.mouseHover();
		Thread.sleep(2000);
		csvuploadpage.fileUpLoad();

		robot = new Robot();
		robot.delay(2000);
		stringselection = new StringSelection("C:\\Users\\vamsh\\Downloads\\Sample File.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER); 

		csvuploadpage.uploadFileButton();
		csvuploadpage.sweetPopUpButton();
		csvuploadpage.belongToFirstName();
		csvuploadpage.belongToPhoneNumber();
		csvuploadpage.belongToNotes();
		csvuploadpage.importDataButton();
		csvuploadpage.dataUploadedSuccessfullyPopUp();


	}
}
