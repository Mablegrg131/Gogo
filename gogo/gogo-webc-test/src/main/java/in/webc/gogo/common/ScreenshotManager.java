package in.webc.gogo.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ScreenshotManager {
	public static void captureScreenShot(String filename, String filepath) {

		File targetDirectory = createScreenshotFolder(filepath);

		File screenshotTargetFile = new File(targetDirectory + "/" + filename + ".png"); // creating an empty physical screenshot file
		File screenshotsrcfile = getTheScreenshot();// in-memory file

		placeFileIntoPhysicalLocation(screenshotTargetFile, screenshotsrcfile); // copying in-memory file into physical screenshot file

	}

	private static File createScreenshotFolder(String filepath) {
		File directory = new File(filepath);
		if (!directory.exists()) {
			directory.mkdir();
		}
		return directory;
	}
	
	private static File getTheScreenshot() {
		// Program from selenium webdriver to take screenshot
		TakesScreenshot ts = (TakesScreenshot) BrowserUtil.driver;
		File screenshotsrcfile = ts.getScreenshotAs(OutputType.FILE); // in-memory file
		return screenshotsrcfile;
	}

	private static void placeFileIntoPhysicalLocation(File screenshotTargetFile,
			File screenshotsrcfile) {
		try {
			FileUtils.copyFile(screenshotsrcfile, screenshotTargetFile);

		} catch (IOException e) {
		}
	}
}
