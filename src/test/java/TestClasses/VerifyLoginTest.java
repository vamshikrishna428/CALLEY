package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Instances.BaseClass;
import Instances.MYListeners;

@Listeners(MYListeners.class)

public class VerifyLoginTest extends BaseClass {
	@Test
	public void verifyLoginTest()  {
		//	loginpage.popUpCloseButton();
		String expectedtitle = "Getcalley - Dashboard";
		String actualtitle = driver.getTitle();
		System.out.println("<----Title is = "+actualtitle+"   Welcome page is Displayed-->");
		SoftAssert softassert=new SoftAssert();
		Assert.fail();
		softassert.assertEquals(actualtitle,expectedtitle);
		softassert.assertAll();
	}
}
