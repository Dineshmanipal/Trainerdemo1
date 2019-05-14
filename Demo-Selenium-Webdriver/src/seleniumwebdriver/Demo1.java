package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String ExpectedTilte = "OrangeHRM";
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		String ActualTitle = driver.getTitle();
		if(ExpectedTilte.equals(ActualTitle))
		{
			System.out.println("IF the title is same then do logout");
			Thread.sleep(3000);
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			//driver.findElement(By.linkText("Logout")).click();
			driver.close();
			
		}
		else
		{
			System.out.println("Title is not same");
			driver.close();
		}
		
		
	}

}
