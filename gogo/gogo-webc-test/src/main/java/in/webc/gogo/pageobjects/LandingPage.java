package in.webc.gogo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import in.webc.gogo.common.BrowserUtil;
import in.webc.gogo.common.WaitUtil;
import in.webc.gogo.common.WebElementUtil;

public class LandingPage  {
	
	private By websiteHeaderImgL = By.xpath("//*[@id=\"root\"]/div[3]/main/header/div[1]/div/div/a/img[@alt='GOGO Pharma']");

	private By locationSearchInput = By.xpath("//input[@placeholder='Search for your location']");
	
	private By locationDoneBtnL = By.xpath("//button[@title='Choose city to enable this button']");

	private By loginMenuL = By.xpath("//div[contains(text(),'Login')]");
	
	private By emailTextboxL = By.xpath("//input[contains(@class,'signIn-')]");

	private By proceedBtnL = By.xpath("//*[contains(text(),'Proceed')]");

	private By otpFirstEleL = By.xpath("//input[contains(@aria-label,'verification ')]");

	private By otpErrorEleL= By.xpath("//p[contains(text(),'Something went wrong while verifying the login otp.')]");
	

	private By closeDialogL = By.xpath("//button[contains(@class,'auth') and @type='reset']");

	private By userNameL = By.xpath("//p[contains(@class,'accountChip-name-1JU')]");

	private By prodSearchBoxL = By.xpath("//input[@placeholder='What are you looking for?']");
	private By firstProdFromListL = By.xpath("//ul[contains(@class,'suggestedCategories-')]/li[1]/a");

	private By acceptCookieBtnL = By.xpath("//div[contains(@class,'cookiesPopup')]/button");
	
	

	




	
	public  WebElement getHeaderImgElem() {
		
		return BrowserUtil.driver.findElement(this.websiteHeaderImgL);
	}
	public WebElement getLocationSearchboxEle() {
		
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
        return WebElementUtil.applyWaitThenFindElement(wait, this.locationSearchInput);
		
	}
	public WebElement getLocationDoneBtnEle() {
		return BrowserUtil.driver.findElement(this.locationDoneBtnL);
	}
	public WebElement getLoginMenuEle() {
		return BrowserUtil.driver.findElement(this.loginMenuL );
	}
	public WebElement getEmailEle() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
        return WebElementUtil.applyWaitThenFindElement(wait, this.emailTextboxL);
	}
	public WebElement getProceedEle() {
        return BrowserUtil.driver.findElement(this.proceedBtnL );
	}
	public WebElement getOTPInputEle() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
        return WebElementUtil.applyWaitThenFindElement(wait, this.otpFirstEleL);
	}
	public WebElement getWrongOtpErrorEle() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
        return WebElementUtil.applyWaitThenFindElement(wait, this.otpErrorEleL);
	}
	public WebElement getCloseDialogEle() {
		 return BrowserUtil.driver.findElement(this.closeDialogL);
	}
	public WebElement getUserNameEle() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
        return WebElementUtil.applyWaitThenFindElement(wait, this.userNameL );
	}
	public WebElement getProductSearchBtnBox() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
        return WebElementUtil.applyWaitThenFindElement(wait, this.prodSearchBoxL  );
	}
	public WebElement getFirstProdElement() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
        return WebElementUtil.applyWaitThenFindElement(wait, this.firstProdFromListL  );
	}
	public WebElement getAcceptBtn() {
		
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
        return WebElementUtil.applyWaitThenFindElement(wait, this.acceptCookieBtnL  );
	}
	

	
	
	
}
