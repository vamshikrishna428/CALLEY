package TestClasses;

import java.util.Random;

import org.testng.annotations.Test;

import Instances.BaseClass;
import PomPages.AgentPage;

public class AddAgentsTest extends BaseClass {
	@Test
	public void addAgentsTest() {
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
//		System.out.println(driver.switchTo().alert().getText());
		agentpage.confirmationPopUp();

	}

}
