package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogletextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		//to search the text
		driver.findElement(By.name("q")).sendKeys("apple"+Keys.ENTER);

	}

}
