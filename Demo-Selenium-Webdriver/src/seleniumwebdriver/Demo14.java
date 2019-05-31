package seleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\selenium server\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		Alert alert = driver.switchTo().alert();
		//Accept(TO click on OK Button)
		//dismiss ( To click on Cancel button)
		//GetText which alert contains
		//sendkeys(To Pass some value in to alert and then click on accept or dimiss)
		String Text = alert.getText();
		System.out.println(Text);
		Thread.sleep(3000);
		alert.accept();
		driver.findElement(By.xpath("//*[@id='content']/p[8]/button")).click();
		Thread.sleep(3000);
		alert.dismiss();
		driver.findElement(By.xpath("//*[@id='content']/p[11]/button")).click();
		Thread.sleep(3000);
		alert.sendKeys("YES");
		Thread.sleep(3000);
		alert.accept();
	}

}
