package Com.ProjectName.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Com.ProjectName.qa.Base.TestBase;

public class RegistrtionPage extends TestBase {
	
	//Decliration ==>WebEliments
	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_email;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(name="birthday_day") private WebElement birthdate;
	@FindBy(name="birthday_month") private WebElement birthmonth;
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy(name="websubmit") private WebElement submitbtn;
	
	// initilization
	
	public RegistrtionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Usages
	public void ClickFacebookSignupLink() {
		signuplink.click();
	}
	public void VerifyFacebookRegistrationPageFBLogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(),"The facebook logo on regestration page is not displayed");
	}
	public void VerifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(), "The already having an account option on registration page is not displayed");
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	public void SetFacebookRegistrationPageFristName(String fn) {
		firstname.sendKeys(fn);
	}
	public void setFacebookRegstrationPageLastName() {
		surname.sendKeys("XYZ");
	}
	public void SetFacebookRegistrationPageMobileEmail() {
		mob_email.sendKeys("test123@gmail.com");
	}
	public void SetFacebookRegistrationPagePassward() {
		password.sendKeys("Abc@123");
	}
	public void SetFacebookRegistrationPageBirthday() {
		Select bday = new Select(birthdate);
		Assert.assertTrue(birthdate.isDisplayed(), "Birth day drop down is not avialable on the website.");
		Assert.assertFalse(birthdate.isSelected(), "The birth date is selected initially");
		bday.selectByVisibleText("19");
	}
	
	public void SetFacebookRegistrationPageBirthMonth() {
		Select bmonth = new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(), "Birth month drop down is not avialable on the website.");
		Assert.assertFalse(birthmonth.isSelected(), "The birth month is selected initially");
		bmonth.selectByVisibleText("Mar");
	}
	
	public void SetFacebookRegistrationPageBirthyear() {
		Select byer = new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(), "Birth year drop down is not avialable on the website.");
		Assert.assertFalse(birthyear.isSelected(), "The birth year is selected initially");
		byer.selectByVisibleText("1993");
	}
	public void SsetFacebookRegistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();	
		}else {
			System.out.println("please select valid input");
		}
	}
	public void ClickFacebookRegistrationPageSubmitButton() {
		submitbtn.click();
	}
	
	
	
		
	

}
