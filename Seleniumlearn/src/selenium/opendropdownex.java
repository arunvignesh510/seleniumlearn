package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class opendropdownex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement finddropdown1 = driver.findElement(By.id("dropdown1"));
		Select dropone= new Select(finddropdown1);
		dropone.selectByIndex(4);
		Thread.sleep(3000);
		dropone.selectByValue("2");
		Thread.sleep(3000);
		dropone.selectByVisibleText("Selenium");;
		Thread.sleep(3000);
		
				
	}

}
