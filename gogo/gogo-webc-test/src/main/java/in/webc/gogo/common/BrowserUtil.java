package in.webc.gogo.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserUtil {
	public static WebDriver driver = null;
	public static void openBrowser() throws Exception {
		/* String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory + "\\src\\main\\resources\\driver\\chromedriver.exe"); // informing selenium framework about the chromedriver.exe
		*/
		WebDriverManager.chromedriver().setup();
		openChrome();
		WaitUtil.applyPageLoadTimeOut(120);
		
	}
	
	public static void openWebsite(String url) {
		driver.get(url);

	}
	/**
	 * To close a window (first window opened - 'Parent Window' ) and its associated
	 * windows (Child windows) together
	 */
	public static void closeAllBrowserWindows() {
		
		if( null != BrowserUtil.driver) {
			BrowserUtil.driver.quit();
		}
	}

	/**
	 * To close the current focused Browser Window
	 */
	public static void closeTheWindow() {
		if( null != BrowserUtil.driver) {
			BrowserUtil.driver.close();
		}

	}
	
	private static void openChrome() throws Exception {
		ChromeOptions chromeSettings = getChromeBrowserSettings();
		try {
			driver = new ChromeDriver(chromeSettings); // browser will be opened	
		}catch(Exception e) {
			throw new Exception("WebDriver object couldnt created, hence system couldn't open browser");
		}
		
		

	}


	
	private static ChromeOptions getChromeBrowserSettings() {
		// https://chromedriver.chromium.org/capabilities ---> chrome option arguments
		// reference
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments(Arrays.asList("--test-type", "test-type=browser", "--disable-default-apps",
				"--enable-precise-memory-info", "--js-flags=--expose-gc", "--disable-infobars", "--start-maximized",
				"--ignore-certificate-errors", "--disable-popup-blocking", "--allow-running-insecure-content",
				"--disable-notifications", "--disable-save-password", "--disable-translate",
				"--always-authorize-plugins", "--incognito"));
		options.addArguments("disable-geolocation");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		return options;
	}
	


}
