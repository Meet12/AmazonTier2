package amazonsignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver-win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Amazon_POM pom = new Amazon_POM(driver);
		
		driver.get("https://www.amazon.ca/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
		
		pom.typename("Meet Pandya");
		pom.typeemail("pandyameetcanada@gmail.com");
		pom.typepassword("iloveMEET");
		pom.typepasswordcheck("iloveMEET");
		pom.clickbutton();

	}

}
