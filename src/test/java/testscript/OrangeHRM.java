package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VR69846\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			WebElement fn=driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']"));
			fn.sendKeys("vinay reyyi");
			Thread.sleep(3000);
			
			WebElement email=driver.findElement(By.xpath("//input[@id='Form_getForm_Email']"));
			email.sendKeys("vinay.reyyi@gmail.com");
			Thread.sleep(3000);
			
			Select country=new Select(driver.findElement(By.xpath("//select[@id='Form_getForm_Country']")));
			country.selectByVisibleText("India");
			Thread.sleep(3000);
			
			WebElement phone=driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']"));
			phone.sendKeys("913274992");
			Thread.sleep(3000);
			
			WebElement check1=driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
			check1.click();
			Thread.sleep(3000);
			
			WebElement submit=driver.findElement(By.id("//input[@id='Form_getForm_action_submitForm']"));
			submit.click();
			Thread.sleep(3000);
			driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
