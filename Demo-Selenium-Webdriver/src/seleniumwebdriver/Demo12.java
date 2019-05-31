package seleniumwebdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		//This is to identify the parent window
		String ParentWindow = driver.getWindowHandle();
		System.out.println("ParentWindow Name -->" + ParentWindow);
		WebElement link = driver.findElement(By.id("button1"));
		// To click and open new child window for 3 times
		for(int i=0;i<3;i++)
		{
			link.click();
			Thread.sleep(2000);
		}
		//To identify my child window + Parent window
		List<String> allwindows = new ArrayList<String>( driver.getWindowHandles());
		//getwindowhandles = parent window + child window
		//getwindowhandle = one browser which is focused
		String lastwindow= "";
		System.out.println("Parent window + Child Window Names -->" + allwindows);
		for(int i=1;i<allwindows.size();i++)
		{
			driver.switchTo().window(allwindows.get(i));
			driver.get("http://www.google.com");
			lastwindow = allwindows.get(i).toString();
			}
		//switch to my parent window
		driver.switchTo().window(ParentWindow);
		driver.get("http://www.gmail.com");
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();

	}

}
