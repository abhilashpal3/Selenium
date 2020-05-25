package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public WebDriver InvokeChromeBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\RequiredFiles\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}

	public static void main(String[] args) {
		LaunchBrowser lc = new LaunchBrowser();

		lc.InvokeChromeBrowser();
	}

}
