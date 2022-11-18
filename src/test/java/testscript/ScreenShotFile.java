package testscript;
//import java.io.FILE;

import java.io.File;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;


import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.OutputType;

public class ScreenShotFile {
  
	public static void main(String[] args) {
		try {
			//WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(3000);
			File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(".//ScreenShots/screen.png"));
			Thread.sleep(3000);
			driver.quit();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
