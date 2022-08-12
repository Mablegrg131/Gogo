package in.webc.gogo.test.landingpage;

import org.testng.annotations.Test;

import in.webc.gogo.common.BaseTest;
import in.webc.gogo.common.WaitUtil;
import in.webc.gogo.teststeps.landingpage.PharmaTestSteps;

public class PharmaTest extends BaseTest {
	
	@Test(description="Verify Website Header")
	public void pageHeaderTC() {
		PharmaTestSteps.acceptCookiesIfAny();
		WaitUtil.applyWait(40); // wait to load google map completely including its events and controls
		PharmaTestSteps.chooseLocation();
		PharmaTestSteps.verifyWebsiteHeader();
	}
	
	@Test(description="verify page url", dependsOnMethods= {"pageHeaderTC"})
	public void pageUrlTC() {
		PharmaTestSteps.verifyPageUrl();

	}
	
	@Test(description="verify login for wrong otp", dependsOnMethods= {"pageHeaderTC"})
	public void wrongOtpLoginTC() {
		PharmaTestSteps.clickOnLoginMenu();
		PharmaTestSteps.enterEmail("test@gmail.com");
		PharmaTestSteps.clickOnProceed();
		PharmaTestSteps.enterOtp("7456");
		PharmaTestSteps.ensureLoginNotAllowed();

	}
	
	@Test(description="verify login for right otp", dependsOnMethods= {"wrongOtpLoginTC"})
	public void loginWithRightOtpTC() {
		PharmaTestSteps.closeOtpDialog();
		PharmaTestSteps.clickOnLoginMenu();
		PharmaTestSteps.enterEmail("mablegrg@gmail.com");
		PharmaTestSteps.clickOnProceed();
		PharmaTestSteps.enterOtp("1234");
		PharmaTestSteps.verifyLogin();
		

	}
	
	@Test(description = "Search, Add, Modify and Checkout products", dependsOnMethods= {"loginWithRightOtpTC"})
	public void searchAndCheckoutProdTC() {
		
		PharmaTestSteps.enterProductNameIntoSearch("tablets");
		WaitUtil.applyWait(3);// apply wait for prod fetch
		PharmaTestSteps.applyPriceFilter();
		WaitUtil.applyWait(5);
		PharmaTestSteps.addToCart();
		WaitUtil.applyWait(5);
		PharmaTestSteps.addToCartViaQuickView();
		WaitUtil.applyWait(3);
		PharmaTestSteps.gotToCart();
		WaitUtil.applyWait(3);
		PharmaTestSteps.checkoutProducts();
		WaitUtil.applyWait(3);
		PharmaTestSteps.doPayment();
		
		
		
		
		

	}

}
