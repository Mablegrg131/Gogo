package in.webc.gogo.teststeps.landingpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import in.webc.gogo.common.BrowserKeyActions;
import in.webc.gogo.common.BrowserUtil;
import in.webc.gogo.common.WaitUtil;
import in.webc.gogo.common.WebElementUtil;
import in.webc.gogo.pageobjects.LandingPage;
import in.webc.gogo.pageobjects.ProductSearchPage;

public class PharmaTestSteps {
	static LandingPage landingPageObj = new LandingPage();
	static ProductSearchPage prodSearchPage = new ProductSearchPage();

	public static void verifyWebsiteHeader() {
		
		WebElement headerImgEle =  landingPageObj.getHeaderImgElem();
		
		assertNotNull(headerImgEle, "Verify the Website page header");
		
	}

	public static void chooseLocation() {
		WebElement locationSearchBox = landingPageObj.getLocationSearchboxEle();
		locationSearchBox.sendKeys("Ajman - United Arab Emirates");
		WaitUtil.applyWait(5);
		locationSearchBox.click();//Trigger the listing
		WaitUtil.applyWait(2);// wait to display list
		BrowserKeyActions.pressDownArrowKey(); // navigate down towards 1st location displayed 
		WaitUtil.applyWait(2);
		BrowserKeyActions.pressEnterkey();// selecting first location
		WaitUtil.applyWait(2);
		WebElement locationDoneBtn = landingPageObj.getLocationDoneBtnEle();
		locationDoneBtn.click(); 
	}

	public static void verifyPageUrl() {
		String currentUrl = BrowserUtil.driver.getCurrentUrl();
		String expectedUrl = "https://gogo.webc.in/";
		assertEquals(currentUrl, expectedUrl, "verify current url for the website loaded");
		
	}

	public static void clickOnLoginMenu() {
		WebElement loginMenu = landingPageObj.getLoginMenuEle();
		loginMenu.click();
		
	}

	public static void enterEmail(String email) {
		WebElement emailTexBox = landingPageObj.getEmailEle();
		emailTexBox.sendKeys(email);
		
	}

	public static void clickOnProceed() {
		WebElement proceedBtn = landingPageObj.getProceedEle();
		proceedBtn.click();
		
	}

	public static void enterOtp(String otp) {
		WebElement optElement = landingPageObj.getOTPInputEle();
		optElement.sendKeys(otp);
	}

	public static void submitOtp() {
		// TODO Auto-generated method stub
		
	}

	public static void ensureLoginNotAllowed() {
		WebElement wrongOTPElement = landingPageObj.getWrongOtpErrorEle();
		assertNotNull(wrongOTPElement, "Verify Error Message Element");
	}

	public static void closeOtpDialog() {
		WebElement closeDialogEle = landingPageObj.getCloseDialogEle();
		closeDialogEle.click();
		
	}

	public static void verifyLogin() {
		WebElement userNameElem = landingPageObj.getUserNameEle();
		String usernameDisplayed = userNameElem.getText();
		String expectedName = "Mable";
		assertEquals(usernameDisplayed, expectedName, "Verify username displayed for valid login");
		
	}

	public static void enterProductNameIntoSearch(String prodName) {
		WebElement prodSearchElement = landingPageObj.getProductSearchBtnBox();
		prodSearchElement.sendKeys(prodName);
		
		WebElement prodCategoryFirstEle = landingPageObj.getFirstProdElement();
		
		WebElementUtil.clickByJavaScript(prodCategoryFirstEle);
		//prodCategoryFirstEle.click();
		
	}

	public static void applyPriceFilter() {
		WebElement priceFilterEle = prodSearchPage.getPriceFilterElement();
		Select select = new Select(priceFilterEle);
		select.selectByIndex(3);
	}

	

	public static void addToCart() {
		WebElement addToCart2ndProd = prodSearchPage.getSecondProduct();		
		Actions actions = new Actions(BrowserUtil.driver);
		actions.moveToElement(addToCart2ndProd).perform();
		WebElement addToCartBtn = prodSearchPage.getAddToCartBtn();
		actions.moveToElement(addToCartBtn).click().perform();
		System.out.println("########################");
		
	}

	public static void addToCartViaQuickView() {
		WebElement addToCart3rdProd = prodSearchPage.getThirdProduct();
		Actions actions = new Actions(BrowserUtil.driver);
		actions.moveToElement(addToCart3rdProd).perform();
		WebElement quickViewBtn = prodSearchPage.getQuickViewBtn();
		actions.moveToElement(quickViewBtn).click().perform();
		WaitUtil.applyWait(3);
		WebElement addToCartBtn = prodSearchPage.getQuickViewAddToCartBtn();
		WebElementUtil.clickByJavaScript(addToCartBtn);
		
		WebElement closeQkView = prodSearchPage.getQuickViewCloseBtn();
		//closeQkView.click();
		WebElementUtil.clickByJavaScript(closeQkView);
	}

	public static void gotToCart() {
		WebElement goToCartBtn = prodSearchPage.getMyCartBtn();
		goToCartBtn.click();
	//	WebElementUtil.clickByJavaScript(addToCartBtn);
		
	}

	

	public static void checkoutProducts() {
		WebElement checkoutBtn = prodSearchPage.getCheckoutBtn();
		checkoutBtn.click();
		WaitUtil.applyWait(10);
		WebElement continueBtn = prodSearchPage.getCheckoutContinueBtn();
		if(continueBtn.isEnabled()) {
			WebElementUtil.clickByJavaScript(continueBtn);
		}else {
			Assert.fail("Continue is disabled ");
		}
		
	}

	public static void acceptCookiesIfAny() {
		try {
		   WebElement acceptBtn = landingPageObj.getAcceptBtn();
		   acceptBtn.click();
		}catch(Exception e) {
			
		}
		
	}

	public static void doPayment() {
		WebElement cashOnDelivery = prodSearchPage.getCashOnDeliveryRadioButton();
		cashOnDelivery.click();
		
		WebElement placeOrder = prodSearchPage.getPlaceOrderButton();
		placeOrder.click();
		
		WaitUtil.applyWait(5);
		
		WebElement paymentStatus = prodSearchPage.getPaymentStatusEle();
		
		assertNull(paymentStatus, "Verify Payment Success");
	}

}
