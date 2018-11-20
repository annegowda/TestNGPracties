package annotationExamples;

import org.testng.annotations.Test;

public class Grouping {

	//Group can defined  using Groups attribute
	@Test(groups= {"regression","Sanity"})
	public void test_attributeTest() {
		System.out.println("always Regression+Sanity");
	}
	
	@Test(groups= {"regression"})
	public void test_attributeTest1() {
		System.out.println("always Regression");
	}
		
		@Test(groups= {"regression","Sanity"})
		public void test_attributeTest2() {
			System.out.println("always Regression+Sanity test2");
		}
		
		@Test(groups= {"regression"})
		public void test_attributeTest4() {
			System.out.println("always Regression test4");
		}
		
		
	}
	

