package seleniumwebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//String title = driver.getTitle();
		//System.out.println(title);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println("Title of the Page --> " + title);
		//String URL = driver.getCurrentUrl();
		//System.out.println(URL);
		String url = js.executeScript("return document.URL").toString();
		System.out.println("To fetch the Current URL of the webpage --> " + url);
		String domain = js.executeScript("return document.domain").toString();
		System.out.println("To fetch the domain name --> " + domain);
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		//driver.navigate().refresh();
		js.executeScript("history.go(0)");
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		WebElement ele = (WebElement)js.executeScript("return document.getElementById('txtUsername')");
		String value = ele.getAttribute("value");
		System.out.println(value);
		js.executeScript("document.querySelector('input#txtPassword').value='admin123'");
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('ohrmList_chkSelectRecord_6').scrollIntoView()");
		String  tabledata = js.executeScript("return document.getElementById('resultTable').innerText").toString();
		System.out.println(tabledata);
		Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		js.executeScript("window.history.back()");
		Thread.sleep(3000);
		js.executeScript("window.history.forward()");
		js.executeScript("alert('Welcome to the session on selenium')");
		js.executeScript("confirm('Enter the credentials')");
		js.executeScript("prompt('Enter the details','Enter YES/NO'");
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		//to get value in the edit box using web driver(getattribute)
		//String name = driver.findElement(By.id("txtUsername")).getAttribute("value");
		//System.out.println(name);

	}

}
