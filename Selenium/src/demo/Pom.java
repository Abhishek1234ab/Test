package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	//dec
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement btn;
	
	//initia
	public Pom(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//uti
	public void button()
	{
		btn.click();
	}
}
