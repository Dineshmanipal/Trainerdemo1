package seleniumwebdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("No of Tabs = " + tabs.size());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(tabs.get(0));
		//some action here
		System.out.println(driver.getTitle());
		//some action here
	}

}
