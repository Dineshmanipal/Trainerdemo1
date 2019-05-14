package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://retail.upskills.in/admin");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		//driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary' and @type='submit']")).click();
		WebElement link = driver.findElement(By.id("menu-catalog"));
		Actions act = new Actions(driver);
		act.moveToElement(link).click().perform();
		
		
	}

}
