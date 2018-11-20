package annotationExamplesforDatarelated;

import org.testng.annotations.DataProvider;

public class Dataprovider1 {
	
	@DataProvider(name="datagenerator")
	public  String[][] providedate() {
		
		
	//if want you can read the data from Excel and return data.	
		String[][] s= {{"a","b"}};
		
		for(Object s1:s) {
			System.out.println(s1);
		}
		
		return  s;
		
		
	}

}
