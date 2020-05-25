package AutomationSample.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownRadioAndCheckboxUse {

	public void UsePagesFeilds(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);

		// Navigation to page
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		Thread.sleep(1000);
		// To provide explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 50);

		// Dropdown Use*****************************************************************

		// Using Select class for selecting value from dropdown

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Drop down :')]")));

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='testingDropdown']")));

		// dropdown.selectByIndex(2);
		dropdown.selectByValue("Performance");

		System.out.println("Dropdown Selected");

		System.out.println("Driver closed successfully");

		// Alert use(Only
		// Accept)************************************************************************
		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//button[contains(text(),'Generate Alert Box')]"))) .click();
		 * 
		 * driver.switchTo().alert().accept();
		 */
		// Confirmation message
		// ***************************************************************
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Generate Confirm Box')]")))
				.click();

		driver.switchTo().alert().dismiss();

		driver.close();
	}
}
