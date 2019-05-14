package seleniumwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\selenium server\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
	}

}
