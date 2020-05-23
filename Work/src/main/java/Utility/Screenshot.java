package Utility;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.sql.Driver;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void takeSnapShot(WebDriver webdriver, String fileName) throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String TestResultsFolderPath = "D:\\SnapshotFromAutomation\\";
		File DestFile = new File(TestResultsFolderPath + fileName + now.toLocalDate() + ".png");

		// Copy file at destination
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

	}
}
