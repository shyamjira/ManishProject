package Com.ProjectName.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver;
	
	public void CrossBrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1\\chromedriver.exe");
		 driver = (WebDriver) new ChromeDriver();
	   }else if(browser.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium all file\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 driver = (WebDriver) new FirefoxDriver();
	   }else {
		   System.out.println("wrong browser selected");
	   }
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		


	
    }

}
