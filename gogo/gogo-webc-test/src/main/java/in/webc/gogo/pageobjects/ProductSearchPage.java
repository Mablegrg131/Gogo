package in.webc.gogo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import in.webc.gogo.common.WaitUtil;
import in.webc.gogo.common.WebElementUtil;

public class ProductSearchPage {

	private By priceFilterL = By.xpath("(//select[contains(@class,'priceRangeFilter-')])[2]");

	private By secondProductL = By.xpath("//div[@class='gallery-galleryItem-rHA'][2]");

	private By addToCartBtnL = By.xpath("//div[@class='gallery-galleryItem-rHA'][2]/div/div/div/div/button");

	private By thirdProductL = By.xpath("//div[@class='gallery-galleryItem-rHA'][3]");

	private By quickViewBtnL = By
			.xpath("//div[@class='gallery-galleryItem-rHA'][3]/div/div/div/button[contains(@class, 'itemQuickView')]");

	private By addToCartBtnInQkViewL = By
			.xpath("//button[contains(@class,'itemQuickView')]/span[text()='Add To Cart']");

	private By closeQkViewDialogL = By
			.xpath("//button[contains(@class,'itemQuickView-quickViewDialogHeaderButton') and @type='reset']");

	private By myCartBtnL = By.xpath("//div[text()='My Cart']");

	private By checkoutBtnL = By.xpath("//span[text()='Proceed to Checkout']");

	private By checkoutContinueL = By.xpath("//span[text()='Continue']");

	private By cashonDeliveryL = By.xpath("//input[@id='paymentModes--cashondelivery']");

	private By placeOrderL = By.xpath("//span[text()='Place Order']");

	private By paymentStatusL = By.xpath("//h1[text()='Payment Failed']");

	public WebElement getPriceFilterElement() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.priceFilterL);
	}

	public WebElement getSecondProduct() {

		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.secondProductL);
	}

	public WebElement getAddToCartBtn() {

		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.addToCartBtnL);
	}

	public WebElement getThirdProduct() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.thirdProductL);
	}

	public WebElement getQuickViewBtn() {

		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.quickViewBtnL);
	}

	public WebElement getQuickViewAddToCartBtn() {

		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.addToCartBtnInQkViewL);
	}

	public WebElement getQuickViewCloseBtn() {

		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.closeQkViewDialogL);
	}

	public WebElement getMyCartBtn() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.myCartBtnL);
	}

	public WebElement getCheckoutBtn() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.checkoutBtnL);
	}

	public WebElement getCheckoutContinueBtn() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.checkoutContinueL);
	}

	public WebElement getCashOnDeliveryRadioButton() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.cashonDeliveryL);
	}

	public WebElement getPlaceOrderButton() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.placeOrderL);
	}

	public WebElement getPaymentStatusEle() {
		FluentWait<WebDriver> wait = WaitUtil.explicitWaitByFluentWaitUsingDriver(20, 2);
		return WebElementUtil.applyWaitThenFindElement(wait, this.paymentStatusL);
	}
}