package Com.ProjectName.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.ProjectName.qa.Base.TestBase;

public class Utils extends TestBase {
	
	// ======================================= Take ScreenShot ================================================
	public static void getscreenshot(WebDriver driver, String testname) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		System.out.println(d);
		String filename = testname + "" + d.toString().replace(" ", "").replace(":", "_") + ".jpg";
		File dest = new File("C:\\Users\\user\\OneDrive\\Desktop\\screenshot\\"+filename);
		FileUtils.copyFile(src, dest);

	}
	
	
	// ======================================= Excel Handle ================================================
	public static void gettestdata(int r, int c) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("\"C:\\Users\\user\\OneDrive\\Desktop\\mr.xlsx\"");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue();
		System.out.println(value);
		
	}	
			
			
			
			
			
		//======================================= Java Script Methods ================================================
			
		// 1. Drawing the border around the element.
		
		public static void BorderbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		// 2. Capture the title of the webpage.
		public static String titlebyJS (WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
		    String Title = js.executeScript("return document.title").toString();
		    return Title;
		}
		
		// 3. Click on Some Element.
		public static void clivkbyJS(WebDriver driver,WebElement element) {
		    JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("arguments[0].click();", element);
		}
				
		// 4. Generate an Alert.
		public static void alertbyJS(WebDriver driver, String Message) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("alert('"+ Message + "')");
		}
		
		// 5. Refreshing the webpage.
		public static void refreshbyJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("history.go(0)");
		}
			
		// 6. Scrolling of the webpage.
		public static void scroolldownbyJS(WebDriver driver,int x,int y) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("scroll("+x+","+y+")");
		}
			
		public static void scrollupbyJS(WebDriver driver,int x, int y) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("scroll("+x+","+y+")");	
		}
			// Scroll into view
		public static void scriollintoviewbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("arguments[0].scrollIntoView(true);",element );
		}

}
