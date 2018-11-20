package retrymachanisium;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Testcase {
	
	@Test
	public void t1() {
		System.out.println("pass t1");
	}
	
	@Test(retryAnalyzer=Retry.class)
	public void t2() {
		assertEquals(true, true);
		
	}


}
