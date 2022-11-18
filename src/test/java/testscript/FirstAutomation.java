package testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class FirstAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VR69846\\eclipse-workspace\\selenium-sample-project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	
		WebElement userIcon=driver.findElement(By.xpath("(//ul[@class=\"navigation-top-menu navigation-top-menu-user-actions\"]/li)[3]"));
		WebElement registerLink=driver.findElement(By.xpath("(((//ul[@class=\"navigation-top-menu-sublist\"])[6])/li[2])"));
		Actions action=new Actions(driver);
		action.moveToElement(userIcon);
		Thread.sleep(3000);
		
		action.click(registerLink).build().perform();
		Thread.sleep(3000);
		
		WebElement fn=driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement ln=driver.findElement(By.xpath("(//input)[2]"));
		WebElement email=driver.findElement(By.xpath("(//input)[3]"));
		WebElement cemail=driver.findElement(By.id("ConfirmEmail"));
		WebElement username=driver.findElement(By.id("Username"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
		WebElement checkAvailability=driver.findElement(By.id("check-availability-button"));
		WebElement check1=driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		fn.sendKeys("Vinay");
		Thread.sleep(2000);
		ln.sendKeys("Reyyi");
		Thread.sleep(2000);
		email.sendKeys("xyz@gmail.com");
		Thread.sleep(2000);
		cemail.sendKeys("xyz@gmail.com");
		Thread.sleep(2000);
		username.sendKeys("xyzabcdef");
		Thread.sleep(2000);
		checkAvailability.click();
		Thread.sleep(10000);
		sel.selectByVisibleText("India");
		Thread.sleep(2000);
		if(check1.isEnabled()) {
			Thread.sleep(2000);
			check1.click();
			Thread.sleep(2000);
		}
		Thread.sleep(5000);
		Select sel2=new Select(driver.findElement(By.xpath("//select[@id='TimeZoneId']")));
		sel2.selectByVisibleText("(UTC-10:00) Hawaii");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("abcdefgh");
		Thread.sleep(2000);
		WebElement cpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		cpassword.sendKeys("abcdefgh");
		Thread.sleep(2000);
	
		Select sel3=new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']")));
		sel3.selectByVisibleText("Develops nopCommerce extensions");
		Thread.sleep(2000);
		
		Select sel4=new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyRoleId']")));
		sel4.selectByVisibleText("Technical developer");
		Thread.sleep(2000);
		
		Select sel5=new Select(driver.findElement(By.id("Details_CompanySizeId")));
		sel5.selectByVisibleText("1–3 years");
		Thread.sleep(2000);
		
		
		WebElement mycmp=driver.findElement(By.xpath("//input[@id='Details_CompanyWebsiteUrl']"));
		mycmp.sendKeys("Zensar");
		Thread.sleep(2000);
		
		WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
		register.click();
		Thread.sleep(2000);
		
		driver.quit();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
