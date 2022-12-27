package Flip;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class Ab extends Generic
{
	@Test
	public void test() throws AWTException
	{
		driver.get("https://flipkart.com");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		driver.manage().window().maximize();
		Point p = new Point(200,300);
		driver.manage().window().setPosition(p);
		Dimension d = new Dimension(400, 500);
		driver.manage().window().setSize(d);
	}
}
