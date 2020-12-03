package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
	
	@Test
	@Parameters("testq")
	public void parameterizationexample(String testq ) {
		System.out.println("val is" + testq);
	}
}
