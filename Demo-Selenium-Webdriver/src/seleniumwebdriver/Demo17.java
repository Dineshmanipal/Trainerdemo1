package seleniumwebdriver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo17 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("Demo17");
		PropertyConfigurator.configure("LOG4J.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		logger.info("opened my browser");
		String title = driver.getTitle();
		logger.info(title);
	}

}
