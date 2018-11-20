package annotationExamplesforDatarelated;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class TestNGAnotationforDatarelated {

	
	
	@Test
	public void tset1() {
		System.out.println("test");
	}
	
	//optional key
	@Test(parameters= {"name","password"})
	public void test2(@Optional("gowd")String name,@Optional("ps")String password) {
	System.out.println("name="+name +"password="+password);	
	}
	
	//pass the parameter from xml file
	//we can pass the parameter at suit and test level,test level always override suit level value.
	@Test(parameters= {"name1","password1"})
	public void test3(String name,String password) {
		System.out.println("name="+name +"password="+password);
	}
	
	
	@Test(dataProvider="datagenerator",dataProviderClass=Dataprovider1.class)
	public void test4(String a,String b) {
		System.out.println("a1="+a );
	}
	
	
}
