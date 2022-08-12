package in.webc.gogo.common;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestSuiteEventListener implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		ExtentReportUtil.initExtendReportConfig(suite.getName());
	}
	
	@Override
	public void onFinish(ISuite suite) {
		ExtentReportUtil.endExtendReportCreation();
	}


}
