package amazonsignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testn_Signup {
	WebDriver driver;
	Amazon_POM pom;
	Actions action;
	
	@BeforeMethod
	public void openbrowser() {
		
System.setProperty("webdriver.chrome.driver", "chromedriver-win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		pom = new Amazon_POM(driver);
		
		driver.get("https://www.amazon.ca/");
		
		action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
	}
	
	@Test
	public void validname() {
		
		pom.typename("Meet Pandya");
	}
	
	@Test
	public void validemail() {
		
		pom.typeemail("pandyameetcanada@gmail.com");
	}
	
	@Test
	public void validpassword() {
		
		pom.typepassword("iloveMEET");
	}
	
	@Test
	public void checkpasswordagain() {
		
		pom.typepasswordcheck("iloveMEET");
	}
	
	
	@AfterMethod
	public void clickcontinue() {
		
		pom.clickbutton();
	}
	
	

}
