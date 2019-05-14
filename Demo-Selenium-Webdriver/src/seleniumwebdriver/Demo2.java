package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement username =driver.findElement(By.name("userName"));
		if(username.isEnabled())
		{
			username.sendKeys("sunil");
			username.clear();
			username.sendKeys("sunil");
			username.getAttribute("value");
		}
		if(driver.findElement(By.name("userName")).isDisplayed())
		{
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Sunil");
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		}
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
			WebElement DD = driver.findElement(By.name("passCount"));
			Select sel = new Select(DD);
			List<WebElement> data = sel.getOptions();
			System.out.println(data.size());
			for(int i=0;i<data.size();i++)
			{
				System.out.println(data.get(i).getText());
			}
			sel.selectByValue("2");
			driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
			driver.findElement(By.name("findFlights")).click();
			driver.findElement(By.name("reserveFlights")).click();
			driver.findElement(By.name("passFirst0")).sendKeys("sunil");
			driver.findElement(By.name("passLast0")).sendKeys("kumar");
			driver.findElement(By.name("passFirst1")).sendKeys("vinay");
			driver.findElement(By.name("passLast1")).sendKeys("kumar");
			driver.findElement(By.name("creditnumber")).sendKeys("1234 1234 1234");
			List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
			for(WebElement e:checkbox)
			{
				e.click();
			}
		}
		
	}

}
