package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbuttonoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
/*		WebElement buttonfind = driver.findElement(By.id("home"));
		buttonfind.click();
		
		
		WebElement buttonagainfind = driver.findElement(By.className("wp-categories-link maxheight"));
		buttonagainfind.click();*/
		WebElement buttoncolor = driver.findElement(By.id("color"));
		String buttoncolorcss = buttoncolor.getCssValue("background-color");
		System.out.println("Button colour is"+buttoncolorcss);
		
		
		
		
		
/*driver.get("https://accounts.zoho.in/signin?servicename=ZohoSites&signupurl=https://www.zoho.in/sites/signup.html");
		
		WebElement textfind = driver.findElement(By.id("login_id"));
		textfind.sendKeys("7868032453");
		WebElement buttonfind = driver.findElement(By.id("nextbtn"));
		buttonfind.click();*/
	}
	
	

}
