import org.testng.annotations.Test;

public class HandleException1 {
	
	@Test
	public void m1() {
		System.out.println(10/0);
	}

	//test case is going pass because we know the exception
	//if exception not present then this one will fail
	@Test(expectedExceptions=java.lang.ArithmeticException.class)
	public void m2() {
		System.out.println(10/0);
		System.out.println("hii");
	}
	
	
	
	
}
