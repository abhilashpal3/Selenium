package AutomationSample.Work;

import org.openqa.selenium.WebDriver;

import Utility.LaunchBrowser;

public class TestLoginPage {

	public static void main(String[] args) throws InterruptedException {

		LaunchBrowser lc = new LaunchBrowser();

		WebDriver driver = lc.InvokeChromeBrowser();
		LoginApp lp = new LoginApp();
		lp.LoginApplication(driver);
	}

}
