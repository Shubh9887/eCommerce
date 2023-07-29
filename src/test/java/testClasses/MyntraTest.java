package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class MyntraTest {
	public void MMt() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("MMT is pening", true);
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		Assert.assertTrue(true);
}
}