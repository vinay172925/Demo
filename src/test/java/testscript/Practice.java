package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\VR69846\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			WebElement uIcon=driver.findElement(By.xpath("//ul[@class='navigation-top-menu navigation-top-menu-user-actions']/li[3]"));
			Actions action=new Actions(driver);
			action.moveToElement(uIcon);
			Thread.sleep(4000);
			
			WebElement register=driver.findElement(By.xpath("//ul[@class='navigation-top-menu navigation-top-menu-user-actions']/li[3]/ul/li[2]/a"));
			action.click(register).build().perform();
			Thread.sleep(4000);
			
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("javascript:window.scrollBy(0,500)");
			Thread.sleep(5000);
			
			//WebElement sel1=driver.findElement(By.xpath("//select[@data-trigger='country-select']"));
			Select select=new Select(driver.findElement(By.xpath("//select[@data-trigger='country-select']")));
			select.selectByVisibleText("India");
			Thread.sleep(5000);
			
			driver.navigate().to("https://www.youtube.com/watch?v=Ch163VfHtvA");
			Thread.sleep(10000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.quit();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
