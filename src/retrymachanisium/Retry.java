package retrymachanisium;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	private int retrycount=0;
	private int  maxretrycount=2;

	@Override
	public boolean retry(ITestResult result) {
		
		if(retrycount<maxretrycount) {
			retrycount++;
			return true;
		}
		return false;
	}

}
