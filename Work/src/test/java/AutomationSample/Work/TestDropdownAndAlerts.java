package AutomationSample.Work;

import org.openqa.selenium.WebDriver;

import Utility.LaunchBrowser;

public class TestDropdownAndAlerts {
	public static void main(String[] args) throws InterruptedException {
		DropdownRadioAndCheckboxUse drc = new DropdownRadioAndCheckboxUse();

		LaunchBrowser lc = new LaunchBrowser();
		WebDriver driver = lc.InvokeChromeBrowser();
		drc.UsePagesFeilds(driver);
	}
}
