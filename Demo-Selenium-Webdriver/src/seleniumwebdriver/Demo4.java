package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\selenium server\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
		Actions MH = new Actions(driver);
		//MH.moveToElement(link).click().build().perform();
		//driver.navigate().back();
		
		Action mouseover = MH.moveToElement(link).build();
		mouseover.perform();
		MH.sendKeys(link,(Keys.ENTER)).perform();
		

	}

}
