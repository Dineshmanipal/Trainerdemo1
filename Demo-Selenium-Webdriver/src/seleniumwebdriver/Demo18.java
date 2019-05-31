package seleniumwebdriver;



import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo18 {

	public static void main(String[] args) {
	
		ExtentReports extent;
		ExtentTest logger;
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/sunil.html",true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		logger = extent.startTest("Demo1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		logger.log(LogStatus.PASS, "Application opened");
		String title = driver.getTitle();
		logger.log(LogStatus.PASS, title);
		driver.close();
		logger.log(LogStatus.FAIL, "Broswer closed successfully");
		extent.endTest(logger);
		extent.flush();
		extent.close();

	}

}
