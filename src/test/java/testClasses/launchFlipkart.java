package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class launchFlipkart {
  @Test
  public void openFlipkart() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening Flipkart", true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(5000);
	  driver.quit();
  }
}
