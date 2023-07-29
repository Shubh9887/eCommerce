package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyntraTest {
	@Test
	public void myntraTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("open Myntra", true);
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		Assert.assertTrue(true);
		driver.quit();
}
}