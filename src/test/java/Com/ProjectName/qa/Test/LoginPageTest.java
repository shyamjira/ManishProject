package Com.ProjectName.qa.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.ProjectName.qa.Base.TestBase;
import Com.ProjectName.qa.Pages.LoginPage;

public class LoginPageTest extends TestBase {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		CrossBrowserTesting("chrome");
		
	}
	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	@Test
	public void FacebookLoginPageTest() {
		LoginPage lp = new LoginPage(TestBase.driver);
		lp.VerifyFacebookLoginPageLogo();
		lp.VerifyFacebookLoginPageTagline();
		lp.VeryFyFacebookLOginPageCreatNewAccountBtn();
		lp.VeriFyFacebookLoginPageForgotPasswardlink();
		lp.VerifyFacebookLoginPageFooterlinksSize();
		lp.SetFacebookLoginPageUsername();
		lp.SetFacebookLoginPagePassward();
		lp.ClickFacebookLoginPageLoginbtn();
	}

}
