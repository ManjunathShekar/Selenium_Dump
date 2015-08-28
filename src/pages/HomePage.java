package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
	
	@FindBy(xpath="//select[@ng-model='selectedCountry']")
	private WebElement SelectCountry;

	@FindBy(xpath="//button[@success='nextStep()']")
	private WebElement Continue;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void SelectCountry()
	{
		SelectCountry.click();

	}
}