package Com.ProjectName.qa.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.ProjectName.qa.Base.TestBase;
import Com.ProjectName.qa.Pages.RegistrtionPage;

public class RegistrtionTest extends TestBase {
	
	// Browser setup ==> validations apply ==> browser close.
	
	@BeforeClass
	public void setup() {
		CrossBrowserTesting("chrome");
		}
	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	@Test
	public void FacebookregistrationPageTest_Positive() {
		RegistrtionPage rp = new RegistrtionPage(TestBase.driver);
		rp.ClickFacebookSignupLink();
		rp.VerifyFacebookRegistrationPageFBLogo();
		rp.VerifyFacebookRegistrationPageAlreadyAccount();
		rp.SetFacebookRegistrationPageFristName("ABC");
		rp.setFacebookRegstrationPageLastName();
		rp.SetFacebookRegistrationPageMobileEmail();
		rp.SetFacebookRegistrationPagePassward();
		rp.SetFacebookRegistrationPageBirthday();
		rp.SetFacebookRegistrationPageBirthMonth();
		rp.SetFacebookRegistrationPageBirthyear();
		rp.SsetFacebookRegistrationPageGender("male");
		rp.ClickFacebookRegistrationPageSubmitButton();
		
	}
	
				

}
