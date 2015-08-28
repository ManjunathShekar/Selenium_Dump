package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	@FindBy(linkText="Reset")
	private WebElement Reset;
	
	@FindBy(linkText="Go Back")
	private WebElement GoBack;
	
	@FindBy(xpath="//button[@success='nextStep()']")
	private WebElement Continue;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Base()
	{
		Reset.click();
		GoBack.click();
	}
	public void Continue()
	{
		Continue.click();
	}
}
