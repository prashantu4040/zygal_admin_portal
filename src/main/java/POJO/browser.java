package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

	public static WebDriver openBrowser() {
		//to disable browser notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		// instead to setup chromedriver manualy, used WebDriverManager to get update automatically
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.zygal.io/platform_dev_git/zygal/platform/adminV2/index.php");
		driver.manage().window().maximize();
		
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //Implicit wait
		return driver;
	}
	
}