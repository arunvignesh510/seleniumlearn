package testNG;

import org.testng.annotations.Test;

public class DriveCar {

	@Test(priority=0)
	public void startCar()

	{
		System.out.println("start the car");
	}
	@Test(priority=1)
	public void firstGear()

	{
		System.out.println("first gear");
	}
	@Test(priority=2)
	public void secondGear()

	{
		System.out.println("second gear");
	}	
	@Test(priority=3)
	public void thirdGear()

	{
		System.out.println("third gear");
	}	
	@Test(priority=4,enabled=false)
	public void fourthGear()

	{
		System.out.println("fourth gear");
	}
	@Test(priority=5)
	public void turnonmusic()

	{
		System.out.println("music ON");
	}
}
