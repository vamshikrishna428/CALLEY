package TestClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Instances.BaseClass;
@Test
public class VerifyLoginTest extends BaseClass {
	@Test
	public void verifyLoginTest()  {
	//	loginpage.popUpCloseButton();
		String expectedtitle = "Getcalley - Dashboard";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(actualtitle,expectedtitle);
		softassert.assertAll();
	}
}
