package in.webc.gogo.common;

import java.time.LocalDateTime;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({ TestSuiteEventListener.class})
public abstract class BaseTest { 
	private final String SCREENSHOT_DIRECTORY =  System.getProperty("user.dir") + "\\test-screen-shots"; 
	
	@BeforeSuite
	public void beforeFirstTestCaseMethod() throws Exception {
		BrowserUtil.openBrowser();
		BrowserUtil.openWebsite("https://gogo.webc.in/");
	}
	
	@AfterSuite
	public void afterLastCaseMethod() {
		 BrowserUtil.closeAllBrowserWindows();
	}
	
	@AfterMethod
	public void afterEveryTestCaseMethod(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			String testMethodName = result.getName();
			String screenshotFileName = testMethodName.concat(String.valueOf(LocalDateTime.now().getSecond()));
			ScreenshotManager.captureScreenShot(screenshotFileName, SCREENSHOT_DIRECTORY);
			String screenshotFilePath = SCREENSHOT_DIRECTORY.concat("/").concat(screenshotFileName).concat(".png");
			result.setAttribute("SCREENSHOT_PATH", screenshotFilePath);
		}
		
		
		ExtentReportUtil.recordTestCaseResult(result);
	}

}
