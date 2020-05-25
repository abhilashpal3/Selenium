package AutomationSample.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginApp {

	public void LoginApplication(WebDriver driver) throws InterruptedException {
		// Navigation to page
		driver.get("https://the-internet.herokuapp.com/login");

		Thread.sleep(1000);

		// To provide explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 50);

		// Wait until elemement display then perform on element
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']"))).sendKeys("tomsmith");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")))
				.sendKeys("SuperSecretPassword!");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']"))).click();

		driver.quit();

		System.out.println("Browser closed successfully");
	}
}
