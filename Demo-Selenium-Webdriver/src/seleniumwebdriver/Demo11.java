package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C://Users//sunilna//Desktop//Selenium-html-xml%20files//janki2.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText());

	}

}
