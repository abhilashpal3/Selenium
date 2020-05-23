package AutomationSample.Work;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utility.LaunchBrowser;
import Utility.Screenshot;

public class TestScreenshotUtility {

	public static void main(String[] args) throws Exception {

		LaunchBrowser lc = new LaunchBrowser();

		WebDriver driver = lc.InvokeBrowser();

		Screenshot screenshotUtility = new Screenshot();
		screenshotUtility.takeSnapShot(driver, "Sample");

		System.out.println("Screenshot performed");
	}
}
