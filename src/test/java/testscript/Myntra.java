package testscript;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

   public static void main(String[] args) {
        
        
        try{
        	
        	System.setProperty("webdriver.chrome.driver","C:\\Users\\VR69846\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
        	WebDriver driver= new ChromeDriver();
           driver.get("https://www.myntra.com");
           driver.manage().window().maximize();
        
        WebElement men= driver.findElement(By.xpath("//a[@data-group='men']"));
        WebElement fashion= driver.findElement(By.xpath("//li[@data-reactid='145']"));
        WebElement phoneCases =driver.findElement(By.xpath("//a[@href='/mobile-phone-cases']"));
        Actions action=new Actions(driver);
        action.moveToElement(men);
        Thread.sleep(2000);
        action.moveToElement(fashion);
        Thread.sleep(3000);
        //action.moveToElement(phoneCases);
        //Thread.sleep(3000);
        action.click(phoneCases).build().perform();
        Thread.sleep(5000);
        
        //(((//div[@class='product-productMetaInfo'])[11])/div/span/span[1])
        WebElement RowItem = driver.findElement(By.xpath("//ul[@class='results-base']/li[11]"));
        action.moveToElement(RowItem);
        Thread.sleep(3000);
        action.click(RowItem).build().perform();
        Thread.sleep(5000);
        ArrayList<String> tab=new ArrayList(driver.getWindowHandles());
        
       
        
        driver.switchTo().window(tab.get(0));
        Thread.sleep(3000);
        
        System.out.println("The title of page is :"+driver.getTitle());
       
			/*WebElement price =driver.findElement(By.xpath("//*[@id='mountRoot']/div/div[1]/main/div[2]/div[2]/div[1]/div/p[1]/span[1]/strong"));
			action.moveToElement(price);
			Thread.sleep(3000);
			action.click().build().perform();
			Thread.sleep(5000);*/


      
		/*WebElement addBag =driver.findElement(By.xpath("//*[@id='mountRoot']/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]"));
		action.moveToElement(addBag);
		Thread.sleep(3000);
		action.click(addBag).build().perform();
		Thread.sleep(5000);*/
		
		driver.quit();

    }
    catch(Exception ex){
        ex.getStackTrace();
        System.out.println(ex);
    }
    }
}