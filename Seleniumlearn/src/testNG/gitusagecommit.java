package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class gitusagecommit {
	
	public class beforesuitemethod {
		WebDriver driver;
		@BeforeSuite
		public void launchbrowser() {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		@Test
		public void opengoogle() {

			driver.get("http://www.google.com");
			System.out.println("google opened");
		}
		@Test
		public void openyahoo() {

			driver.get("http://www.yahoo.com");
			System.out.println("yahoo opened");
		}

		@AfterSuite
		public void quitbrowser() {

			driver.quit();
			System.out.println("browser closed");
		}


}
}
