package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToForwardAndBack {
	
	public static String verifyTitle() {
		WebDriver drv=new ChromeDriver();
		String Mtitle=drv.getTitle();
		System.out.println("The Title is :"+Mtitle);
		return Mtitle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VR69846\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.get("https://www.orangehrm.com/");
			driver.manage().window().maximize();
			//Thread.sleep(3000);
			
			driver.navigate().to("https://www.google.com");
			//Thread.sleep(3000);
			WebElement sh=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
			sh.sendKeys("today weather");
			//Thread.sleep(3000);
			
			WebElement search=driver.findElement(By.xpath("//input[@class=\"gNO89b\"]"));
			search.click();
			//Thread.sleep(3000);
			
			driver.navigate().back();
			//Thread.sleep(3000);
			driver.navigate().forward();
			//Thread.sleep(3000);
			
			//verifyTitle();
			
			driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
