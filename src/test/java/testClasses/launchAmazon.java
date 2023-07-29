package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class launchAmazon {
  @Test
  public void openAmazon() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  Reporter.log("opening Amazon", true);
		  driver.get("https://www.amazon.com/");
		  Thread.sleep(2000);
		  driver.quit();
	  }
		  
  }
