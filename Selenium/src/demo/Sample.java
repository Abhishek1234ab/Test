package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample 
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Pom p = new Pom(driver);
		p.button();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.button();
	}
}
