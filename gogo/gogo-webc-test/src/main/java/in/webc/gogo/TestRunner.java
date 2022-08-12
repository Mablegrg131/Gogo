package in.webc.gogo;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

/**
 * Hello world!
 *
 */
public class TestRunner 
{
    public static void main( String[] args )
    {
    	TestNG tg = new TestNG();
		List<String> suiteFilsPathList = new ArrayList<>();
		String currentDirectory = System.getProperty("user.dir");
		suiteFilsPathList.add(currentDirectory + "\\src\\main\\resources\\master_suite.xml");
		tg.setTestSuites(suiteFilsPathList);
		tg.run();
    }
}
