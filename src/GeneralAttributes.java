import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GeneralAttributes {
	
	
	//Skip the test by using enabled attribute
	
		@Test(enabled=false)
		public void m3() {
			System.out.println("disabled");
		}
		
		
		//We can make test case can depend on another test or group execution
		
		@Test(groups= {"n"})
		public void m4() {
			System.out.println("Execute m4");
			assertEquals(true, false);
		}
		//m4 fail then m5 is Skip
		@Test(dependsOnMethods="m4")
		public void m5() {
			System.out.println("Execute m5");
		}
		//when always run true,if depended test pass or fail,the test case m6 always run.
		@Test(dependsOnGroups="n",alwaysRun=true)
		public void m6() {
			System.out.println("Execute m6");
		}
		
// Time out:if Test case taking more then defined timeout,then testcase fail
		@Test(timeOut=10)
		public void m7() throws InterruptedException {
			System.out.println("exe started");
			Thread.sleep(11);
			System.out.println("stopped");
			
		}
		//invocationcount:how many time the test case invoke
		@Test(invocationCount=5,invocationTimeOut=100)
		public void m8() throws InterruptedException {
			System.out.println("threadID pool size="+Thread.currentThread().getId());
			
		}
		
		//Threadpoolsize:number of thread the test case use to invoke,5 time share by 2 threads 
		@Test(invocationCount=5,threadPoolSize=2)
		public void m9() throws InterruptedException {
			System.out.println("threadID pool size="+Thread.currentThread().getId());
			
		}
		
		
}
