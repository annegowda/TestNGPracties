package ParallelExectuionrelatedExample;

import org.testng.annotations.Test;

public class perallel2 {

	
	public void test_3(){
		System.out.println("Im test-3");
		System.out.println("theardID="+Thread.currentThread().getId());
		
	}
	
	@Test
	public void test_4(){
		System.out.println("Im test-4");
		System.out.println("theardID="+Thread.currentThread().getId());
		
	}
}
