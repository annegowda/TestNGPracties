package annotationExamples;

import org.testng.annotations.Test;

public class OrderPreserve {
	// we can Preserver Order by using priority attribute
	
	@Test(priority=1)
	public void test_attributeTest() {
		System.out.println("always run");
	}
	
	@Test(priority=0)
	public void test_attributeTest1() {
		System.out.println("always run-1");
	}
	
	
	//Grouping in TestNG
	
	
	

}
