package Com.ProjectName.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Com.ProjectName.qa.Base.TestBase;

public class LoginPage extends TestBase {
	
	// Declaration
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement login_fblogo;
	@FindBy(xpath="//h2[starts-with(text(),'Facebook helps you')]")private WebElement login_fbtagline;
	@FindBy(xpath="//input[@name='email']")private WebElement username;
	@FindBy(xpath="//input[@name='pass']")private WebElement passward;
	@FindBy(xpath="//button[@value='1']")private WebElement login_btn;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgot_password;
	@FindBy (xpath="//a[text()='Create New Account']") private WebElement createnew_account;
	@FindBys({@FindBy (xpath="//div[@id='pageFooterChildren']//li")})private List<WebElement> footerlinks;
	
	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	// usage
	
	public void VerifyFacebookLoginPageLogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(), "The fb logo on login page is not displayed.");
		Reporter.log("VerifyFacebookLoginPageLogo",true);
	}
	public void VerifyFacebookLoginPageTagline() {
	    Assert.assertTrue(login_fbtagline.isDisplayed(), "The fb tagline on login page is not displayed.");	
	    Assert.assertEquals(login_fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
	    Reporter.log("VerifyFacebookLoginPageTagline", true);
	}
	public void VeriFyFacebookLoginPageForgotPasswardlink() {
		Assert.assertTrue(forgot_password.isDisplayed(), "The forgot password link on login page is not displayed.");
		Assert.assertEquals(forgot_password.getText(), "Forgotten password?");
		Reporter.log("VeriFyFacebookLoginPageForgotPasswardlink", true);	
	}
	public void VeryFyFacebookLOginPageCreatNewAccountBtn() {
		Assert.assertTrue(createnew_account.isDisplayed(), "Create New Account button is not displayed");
		Assert.assertTrue(createnew_account.isEnabled(), "Create New Account button is disabled");
		Assert.assertEquals(createnew_account.getText(), "Create New Account");
		Reporter.log("VeryFyFacebookLOginPageCreatNewAccountBtn", true);
	}
	public void SetFacebookLoginPageUsername() {
		Assert.assertTrue(username.isDisplayed(), "Username Field is not diplayed");
		username.sendKeys("test@gmail.com");
		Reporter.log("SetFacebookLoginPageUsername", true);
	}
	public void SetFacebookLoginPagePassward() {
		Assert.assertTrue(passward.isDisplayed(), "Password Field is not diplayed");
		passward.sendKeys("Abcd@123");
		Reporter.log("SetFacebookLoginPagePassward", true);
	}
	public void ClickFacebookLoginPageLoginbtn() {
		Assert.assertTrue(login_btn.isDisplayed(), "Login Button is not diplayed");
		Assert.assertTrue(login_btn.isEnabled(), "Login Button is not enabled");
		login_btn.click();
		Reporter.log("ClickFacebookLoginPageLoginbtn", true);
	}
	public void VerifyFacebookLoginPageFooterlinksSize() {
		Assert.assertEquals(footerlinks.size(), 31);
		Reporter.log("VerifyFacebookLoginPageFooterlinksSize",true);
	}
	

}
