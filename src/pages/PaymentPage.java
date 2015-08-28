package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage
{
	@FindBy(id="cc_name")
	private WebElement CreditCardName;
	
	@FindBy(id="cc_number")
	private WebElement CreditCardNumber;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpiryYear;
	
	@FindBy(id="cvv_code")
	private WebElement CVV;
	
	@FindBy(id="address_line_1")
	private WebElement Address1;
	
	@FindBy(id="address_line_2")
	private WebElement Address2;
	
	@FindBy(id="address_postal_code")
	private WebElement PostalCode;
	
	public PaymentPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void CreditCardName(String creditcardname)
	{
		CreditCardName.sendKeys(creditcardname);
	}
	public void CreditCardNumber(String creditcardnumber)
	{
		CreditCardNumber.sendKeys(creditcardnumber);
	}
	public void ExpiryMonth(String expirymonth)
	{
		ExpiryMonth.sendKeys(expirymonth);
	}
	public void ExpiryYear(String expiryyear)
	{
		ExpiryYear.sendKeys(expiryyear);
	}
	public void CVV(String cvv)
	{
		CVV.sendKeys(cvv);
	}
	public void Address1(String address1)
	{
		Address1.sendKeys(address1);
	}
	public void Address2(String address2)
	{
		Address2.sendKeys(address2);
	}
	public void PostalCode(String postalcode)
	{
		PostalCode.sendKeys(postalcode);
	}
}
