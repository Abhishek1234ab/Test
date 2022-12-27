package Abhi;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public static void test1()
	{
		Reporter.log("hi",true);
	}
	@Test
	public static void test2()
	{
		Reporter.log("hello",true);
	}
}
