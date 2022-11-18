package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\VR69846\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
        	WebDriver driver= new ChromeDriver();
           driver.get("http://sweetalert2.github.io/");
           //driver.manage().timeouts().implicitlyWait(3, TimeUnit.NANOSECONDS);
           driver.manage().window().maximize();
           Thread.sleep(2000);
           
           JavascriptExecutor js= (JavascriptExecutor) driver;
           js.executeScript("javascript:window.scrollBy(0,400)");
        
        WebElement cust_alert= driver.findElement(By.xpath("//button[@aria-label='Show SweetAlert2 success message']"));
        Thread.sleep(2000);
        cust_alert.click();
        Thread.sleep(2000);
        
        WebElement ok= driver.findElement(By.xpath("//div[@class='swal2-container swal2-center swal2-backdrop-show']/div/div[6]"));
        Thread.sleep(2000);
        ok.click();
       Thread.sleep(2000);
        
        WebElement alert1= driver.findElement(By.xpath("//div[@class='showcase normal']/button"));
        alert1.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        
        js.executeScript("javascript:window.scrollBy(0,450)");
        WebElement tryme= driver.findElement(By.xpath("//*[@id=\"message-example\"]/div/button"));
        Thread.sleep(2000);
        tryme.click();
        Thread.sleep(2000);
        
        WebElement ok1= driver.findElement(By.xpath("//div[@class='swal2-popup swal2-modal swal2-show']/div[6]"));
        Thread.sleep(2000);
        ok1.click();
        Thread.sleep(2000);
        
        driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//System.out.println("hello");
	}
}
