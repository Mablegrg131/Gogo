package in.webc.gogo.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;


public class WebElementUtil {
	

	public static WebElement applyWaitThenFindElement(FluentWait<WebDriver> wait, By elementLocator) {

		return wait.until((driver) -> { return driver.findElement(elementLocator);});
	}
	
	/**
	 * Method used to click an element using JavaScript
	 * @param elementToBeClicked
	 */
	public static void clickByJavaScript(WebElement elementToBeClicked) {
		JavascriptExecutor je =   (JavascriptExecutor) BrowserUtil.driver; // https://www.browserstack.com/guide/javascriptexecutor-in-selenium
		je.executeScript("arguments[0].click();", elementToBeClicked);
	}
}
