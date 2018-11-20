package ParallelExectuionrelatedExample;

import org.testng.annotations.Test;

public class PeralelExe {
	
	@Test
	public void test_1(){
		System.out.println("Im test-1");
		System.out.println("theardID="+Thread.currentThread().getId());
		
	}
	
	@Test
	public void test_2(){
		System.out.println("Im test-2");
		System.out.println("theardID="+Thread.currentThread().getId());
		
	}

}
