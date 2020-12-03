package testNG;

import org.testng.annotations.Test;

public class Dependancymethods {
	@Test(enabled=true)
	public void highschool() {
		System.out.println("high school");
	}
	@Test(dependsOnMethods="highschool")
	public void highersecondary() {
		System.out.println("highersecondary");
	}
   @Test(dependsOnMethods="highersecondary")
	public void college() {
		System.out.println("college");
	}


}
