package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthlyAutoRefillPage extends BasePage
{
	@FindBy(xpath=".//*[@id='auto_refill']/div[1]/div[3]/button[1]")
	private WebElement AutoRefillYes;
	
	@FindBy(linkText="No, thank you")
	private WebElement AutoRefillNo;
	
	public MonthlyAutoRefillPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void AutoRefillYes()
	{
		AutoRefillYes.click();	
	}
	public void AutoRefillNo()
	{
		AutoRefillNo.click();
	}
}