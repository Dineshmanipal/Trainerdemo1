package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		List<WebElement> Noframewindow = driver.findElements(By.xpath("//iframe"));
		System.out.println("No of frames -->" + Noframewindow.size());
		for(int i=0; i<Noframewindow.size();i++)
		{
			System.out.println(Noframewindow.get(i).getAttribute("name"));
		}
		driver.switchTo().frame("iframe1");
		String Text = driver.findElement(By.xpath("//*[@class='wpb_wrapper']//child::h2/span")).getText();
		System.out.println(Text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe2");
	}

}
