package in.webc.gogo.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserKeyActions {
	
	public static void pressEnterkey() {
		Actions builder = new Actions(BrowserUtil.driver);        
		builder.sendKeys(Keys.ENTER);
		builder.perform();

	}
	public static void pressDownArrowKey() {
	
		Actions action = new Actions(BrowserUtil.driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
        

	}

	
	

}
