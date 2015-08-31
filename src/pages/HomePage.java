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
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div[2]/div/div[1]/div[2]/span[1]")
	private WebElement PageName;
	
	@FindBy(xpath=".//*[@id='page-wrapper']/div[2]/div/div[1]/div[2]/span[2]")
	private WebElement PageNumber;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void SelectCountry()
	{
		SelectCountry.click();

	}
	
	public void PageNumber()
	{
		PageNumber.getText();
	}

	public void PageName()
	{
		PageName.getText();
	}

	
}