package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BasePage
{
	@FindBy(id="order.signature")
	private WebElement OrderSignature;
	
	@FindBy(id="disclaimar")
	private WebElement Disclaimar;
	
	public ConfirmationPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void OrderSignature(String signature)
	{
		OrderSignature.sendKeys(signature);
	}
	public void Disclaimar()
	{
		Disclaimar.click();
	}
}
