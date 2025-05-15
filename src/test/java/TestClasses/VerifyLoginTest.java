package TestClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Instances.BaseClass;

//@Listeners(Instances.ListenersConcept.class)
@Test
public class VerifyLoginTest extends BaseClass {
	@Test
	public void verifyLoginTest() {
		// loginpage.popUpCloseButton();
		String expectedtitle = "Getcalley - Dashboard";
		String actualtitle = driver.getTitle();
		System.out.println("<----Title is = " + actualtitle + "   Welcome page is Displayed-->");
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualtitle, expectedtitle);
		softassert.assertAll();
	}
}
