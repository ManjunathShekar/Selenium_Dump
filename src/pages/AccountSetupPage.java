package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSetupPage extends BasePage
{
	@FindBy(xpath=".//*[@id='enroller_id']")
	private WebElement EnrollerID;
	
	@FindBy(id="sponsor_id")
	private WebElement SponsorID;
	
	@FindBy(id="enrollerSponsorInputs")
	private WebElement enrollerSponsor;
	
	@FindBy(id="firstname")
	private WebElement FirstName;
	
	@FindBy(id="lastname")
	private WebElement LastName;
	
	@FindBy(id="dob")
	private WebElement DOB;
	
	@FindBy(id="account_phone")
	private WebElement Phone;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="government_id")
	private WebElement SSN;
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement GenderMale;
	
	@FindBy(xpath="//input[@value='Female']")
	private WebElement GenderFemale;
	
	@FindBy(xpath="//input[@value='Single']")
	private WebElement StatusSingle;
	
	@FindBy(xpath="//input[@value='Married']")
	private WebElement StatusMarried;
	
	@FindBy(id="spouse_fullname")
	private WebElement SpouseName;
	
	@FindBy(id="username")
	private WebElement UserName;
	
	@FindBy(id="password1")
	private WebElement Password1;
	
	@FindBy(id="password2")
	private WebElement Password2;
	
	@FindBy(id="showpw")
	private WebElement ShowPassword;
	
	public AccountSetupPage(WebDriver driver)
	{	
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void EnrollerID(String enrollerid)
	{
		EnrollerID.sendKeys(enrollerid);
	}
	public void SponsorID(String sponsorid)
	{
		SponsorID.sendKeys(sponsorid);
	}
	public void enrollerSponsor()
	{
		enrollerSponsor.click();
	}
	public void FirstName(String firstname)
	{
		FirstName.sendKeys(firstname);
	}
	public void LastName(String lastname)
	{
		LastName.sendKeys(lastname);
	}
	public void DOB(String dob)
	{
		DOB.sendKeys(dob);
	}
	public void Phone(String phone)
	{
		Phone.sendKeys(phone);
	}
	public void Email(String email)
	{
		Email.sendKeys(email);
	}
	public void SSN(String ssn)
	{
		SSN.sendKeys(ssn);
	}
	public void GenderMale()
	{
		GenderMale.click();
	}
	public void GenderFemale()
	{
		GenderFemale.click();
	}
	public void StatusSingle()
	{
		StatusSingle.click();
	}
	public void StatusMarried()
	{
		StatusMarried.click();
	}
	public void SpouseName(String spousename)
	{
		SpouseName.sendKeys(spousename);
	}
	public void UserName(String username)
	{
		UserName.sendKeys(username);
	}
	public void Password1(String password1)
	{
		Password1.sendKeys(password1);
	}
	public void Password2(String password2)
	{
		Password2.sendKeys(password2);
	}
	public void ShowPassword()
	{
		ShowPassword.click();
	}
	
}
