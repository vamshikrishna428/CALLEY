package TestClasses;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Instances.BaseClass;
import Instances.MYListeners;
import PomPages.AgentPage;
@Listeners(MYListeners.class)
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
		agentpage.confirmationPopUp();

	}

}
