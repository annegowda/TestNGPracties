package TestNGListners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Simple {

	
	@Test()
	public void test_11(){
		System.out.println("Im test-11");
		
		
	}
	
	@Test
	public void test_12(){
		System.out.println("Im test-2");
		
		
	}
	
	@Test(dependsOnMethods="test_14")
	public void test_13(){
		System.out.println("Im test-13");
		
		
		
	}
	@Test
	public void test_14(){
		System.out.println("Im test-14");
		assertEquals(true, false);
		
		
	}
}
