package in.webc.gogo.common;

import java.time.Duration;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitUtil {
	
	/**
	 * 
	 * @param delayInSeconds
	 */
	public static void applyWait(long delayInSeconds) {
		long DELAY = delayInSeconds * 1000L; 
		long startTime = System.currentTimeMillis(); 
		while((System.currentTimeMillis()  - startTime) <= DELAY);

	}
	
	    /**
	     * @param seconds
	     * 
	     * <h1>Description<h1>: 
	     * Implicit wait for page load (whenever a new page or window or iframe loaded And in all navigation activities(back,forward,refresh,to,get) 
	     * this timeout will be applied
	     */
		public static void applyPageLoadTimeOut(long seconds) {
			BrowserUtil.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));// Available with higher version of selenium webdriver
			

		}
		
		
		
		public static FluentWait<WebDriver> explicitWaitByFluentWaitUsingDriver(long timeOutInSeconds, long pollDurationInMilli) {
			
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(BrowserUtil.driver);
			wait.withTimeout(Duration.ofSeconds(timeOutInSeconds))
					.pollingEvery(Duration.ofMillis(pollDurationInMilli))
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
			        .ignoring(ElementNotVisibleException.class);
			        
		return wait;
		}
	
	

}
