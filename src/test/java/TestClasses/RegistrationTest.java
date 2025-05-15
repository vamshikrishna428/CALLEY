package TestClasses;

import org.testng.annotations.Test;

import Instances.RegBaseClass;

@Test
public class RegistrationTest extends RegBaseClass {

	@Test
	public void registrationTest() {

		nametx = properties.getProperty("Name");
		emailid = properties.getProperty("emailid");
		password = properties.getProperty("password");
		passwordstring = password.toString();
		mobileno = properties.getProperty("mobileNo");

		registrationpage.nameTxField(nametx);
		registrationpage.emailTxField(emailid);
		registrationpage.passworsTxField(passwordstring);
		registrationpage.mobileNO(mobileno);
		registrationpage.captchaFrame();
		registrationpage.captchaCheckBox();
		registrationpage.termsConditionsCheckBox();

		registrationpage.signUpButton();
		registrationpage.smsPopUp();
	}
}
