package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthlyAutoRefillSetupPage extends BasePage
{
	@FindBy(id="second")
	private WebElement ShipTransfromationisOver;
	
	@FindBy(id="over")
	private WebElement ShipNextMonth;
	
	@FindBy(name="0AP")
	private WebElement WhatProductsToShipPrimeHealthPack;
	
	@FindBy(name="0AW")
	private WebElement BuildYourOwn;
	
	@FindBy(id="arShippingDate5")
	private WebElement ShipOn5th;
	
	@FindBy(id="arShippingDate12")
	private WebElement ShipOn12th;
	
	@FindBy(id="arShippingDate19")
	private WebElement ShipOn19th;
	
	@FindBy(id="arShippingDate26")
	private WebElement ShipOn26th;
	
	public MonthlyAutoRefillSetupPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void ShipNextMonth()
	{
		ShipNextMonth.click();	
	}
	public void ShipTransformationisOver()
	{
		ShipTransfromationisOver.click();
	}
	public void WhatProductsToShipPrimeHealthPack()
	{
		WhatProductsToShipPrimeHealthPack.click();
	}
	public void BuildYourOwn()
	{
		BuildYourOwn.click();
	}
	public void ShipOn5th()
	{
		ShipOn5th.click();
	}
	public void ShipOn12th()
	{
		ShipOn12th.click();
	}
	public void ShipOn19th()
	{
		ShipOn19th.click();
	}
	public void ShipOn26th()
	{
		ShipOn26th.click();
	}
}
