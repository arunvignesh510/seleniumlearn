package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.co.in");
	}

}
