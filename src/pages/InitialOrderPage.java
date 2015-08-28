package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InitialOrderPage extends BasePage
{
	@FindBy(id="packInput_packIndex0")
	private WebElement TransformationManager;
	
	@FindBy(id="packInput_packIndex1")
	private WebElement TransformationManagerJr;
	
	@FindBy(id="packInput_packIndex2")
	private WebElement AssociatePack;
	
	@FindBy(id="packInput_packIndex3")
	private WebElement BuildYourOwn;
	
	@FindBy(id="26550")
	private WebElement Cholesterol;
	
	@FindBy(id="26551")
	private WebElement Glucose;
	
	@FindBy(id="26552")
	private WebElement Energy;
	
	@FindBy(id="26553")
	private WebElement Focus;
	
	@FindBy(id="26554")
	private WebElement Vanilla;
	
	@FindBy(id="27587")
	private WebElement Vegan;
	
	@FindBy(id="27585")
	private WebElement Choclate;
	
	public InitialOrderPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void TransformationManager()
	{
		TransformationManager.click();
	}
	public void TransformationManagerJr()
	{
		TransformationManagerJr.click();
	}
	public void AssociatePack()
	{
		AssociatePack.click();
	}
	public void BuildYourOwn()
	{
		BuildYourOwn.click();
	}
	public void Cholesterol()
	{
		Cholesterol.click();
	}
	public void Glucose()
	{
		Glucose.click();
	}
	public void Energy()
	{
		Energy.click();
	}
	public void Focus()
	{
		Focus.click();
	}
	public void Vanilla()
	{
		Vanilla.click();
	}
	public void Vegan()
	{
		Vegan.click();
	}
	public void Choclate()
	{
		Choclate.click();
	}
}
