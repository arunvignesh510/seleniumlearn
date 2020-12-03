package testNG;

import org.testng.annotations.Test;

public class groupingmethod {
	@Test(groups= {"apple"})
	public void apple1(){
	System.out.println("apple1 print");	
	}
	@Test(groups= {"apple"})
	public void apple2(){
		System.out.println("apple2 print");	
		}
	@Test(groups= {"vivo"})
	public void vivo1(){
		System.out.println("vivo1 print");	
		}
	@Test(groups= {"vivo"})
	public void vivo2(){
		System.out.println("vivo2 print");	
		}
	@Test(groups= {"moto"})
	public void moto1(){
		System.out.println("moto1 print");	
		}
	@Test(groups= {"moto"})
	public void  moto2(){
		System.out.println("moto2 print");	
		}

}
