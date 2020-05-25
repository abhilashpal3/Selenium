package AutomationSample.Work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.LaunchBrowser;

public class DragAndDropSample {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser lc = new LaunchBrowser();

		WebDriver driver = lc.InvokeChromeBrowser();

		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 4500)");

		Thread.sleep(5000);
//WebElement on which drag and drop operation needs to be performed  
		WebElement from = driver.findElement(By.id("sourceImage"));
		Thread.sleep(2000);

//WebElement to which the above object is dropped  
		WebElement to = driver.findElement(By.id("targetDiv"));
		Thread.sleep(5000);

//Creating object of Actions class to build composite actions  
		Actions act = new Actions(driver);

//Performing the drag and drop action  
		act.dragAndDrop(from, to).build().perform();

	}
}
