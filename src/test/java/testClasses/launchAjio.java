package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class launchAjio {
  @Test
  public void openAjio() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening Ajio", true);
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(5000);
	  driver.quit();
  }
}
