package scripts;

import library.Excel;

import org.testng.annotations.Test;
import pages.AccountSetupPage;
import pages.BasePage;
import pages.ConfirmationPage;
import pages.InitialOrderPage;
import pages.MonthlyAutoRefillPage;
import pages.MonthlyAutoRefillSetupPage;
import pages.PaymentPage;

public class US_FranchisePartner_Spanish extends SuperTestNG
{
	@Test
	public void testFP_US_ENG()
	{	
		// Click on continue button in Home page
		new BasePage(driver).Continue();
		// Click on Transformation Jr.Manager pack radio button
		new InitialOrderPage(driver).TransformationManager();
		// Click on continue button in Initial Order page
		new BasePage(driver).Continue();
		// Click on Yes button in Monthly Auto-Refill page
		new MonthlyAutoRefillPage(driver).AutoRefillYes();
		// Click on continue button in Monthly Auto-Refill page
		new BasePage(driver).Continue();
		// Click on Ship next month radio button
		new MonthlyAutoRefillSetupPage(driver).ShipNextMonth();
		// Click on continue button in MonthlyAutoRefillSetup page
		new BasePage(driver).Continue();
		
		String xlPath="./Excel/Enroll.xlsx";
		String sheetName="US_FP_SP";
		int rc=Excel.getRowCount(xlPath,sheetName);
		for(int i=1;i<=rc;i++)
		{	
			String enrollerid=Excel.getCellValue(xlPath,sheetName,i,1);
			String sponsorid=Excel.getCellValue(xlPath,sheetName,i,2);
			String firstname=Excel.getCellValue(xlPath,sheetName,i,3);
			String lastname=Excel.getCellValue(xlPath,sheetName,i,4);
			String dob=Excel.getCellValue(xlPath,sheetName,i,5);
			String phone=Excel.getCellValue(xlPath,sheetName,i,6);
			String email=Excel.getCellValue(xlPath,sheetName,i,7);
			String ssn=Excel.getCellValue(xlPath,sheetName,i,8);
			String spousename=Excel.getCellValue(xlPath,sheetName,i,9);
			String username=Excel.getCellValue(xlPath,sheetName,i,10);
			String password1=Excel.getCellValue(xlPath,sheetName,i,11);
			String password2=Excel.getCellValue(xlPath,sheetName,i,12);
			String creditcardname=Excel.getCellValue(xlPath,sheetName,i,13);
			String creditcardnumber=Excel.getCellValue(xlPath,sheetName,i,14);
			String expirymonth=Excel.getCellValue(xlPath,sheetName,i,15);
			String expiryyear=Excel.getCellValue(xlPath,sheetName,i,16);
			String cvv=Excel.getCellValue(xlPath,sheetName,i,17);
			String address1=Excel.getCellValue(xlPath,sheetName,i,18);
			String address2=Excel.getCellValue(xlPath,sheetName,i,19);
			String postalcode=Excel.getCellValue(xlPath,sheetName,i,20);
			String signature=Excel.getCellValue(xlPath,sheetName,i,21);
			
			
			// Click on Enroller's ID textbox and enter the valid data
			new AccountSetupPage(driver).EnrollerID(enrollerid);
			// Click on Sponsor's ID textbox and enter the valid data
			new AccountSetupPage(driver).SponsorID(sponsorid);
			// Click on Firstname testbox and enter the valid data
			new AccountSetupPage(driver).FirstName(firstname);
			// Click on Lastname testbox and enter the valid data
			new AccountSetupPage(driver).LastName(lastname);
			// Click on Birth date textbox and enter the valid data
			new AccountSetupPage(driver).DOB(dob);
			// Click on Phone textbox and enter the valid data
			new AccountSetupPage(driver).Phone(phone);
			// Click on Email textbox and enter the valid data
			new AccountSetupPage(driver).Email(email);
			// Click on SSN textbox and enter the valid data
			new AccountSetupPage(driver).SSN(ssn);
			// Click on Gender Male radio button
			new AccountSetupPage(driver).GenderMale();
			// Click on Marital Status Married radio button
			new AccountSetupPage(driver).StatusMarried();
			// Click on Spouse Full name textbox and enter valid data
			new AccountSetupPage(driver).SpouseName(spousename);
			// Click on username textbox and enter valid data
			new AccountSetupPage(driver).UserName(username);
			// Click on password textbox and enter valid data
			new AccountSetupPage(driver).Password1(password1);
			// Click on Retype you password textbox and enter the same password
			new AccountSetupPage(driver).Password2(password2);
			// Click on Show my Password checkbox
			new AccountSetupPage(driver).ShowPassword();
			// Click on continue button in Accountsetup page
			new BasePage(driver).Continue();
			// Click on credit card name textbox and enter the valid data
			new PaymentPage(driver).CreditCardName(creditcardname);
			// click on credit card number textbox and enter the valid data
			new PaymentPage(driver).CreditCardNumber(creditcardnumber);
			// Click on expiry month drop down list and enter valid data
			new PaymentPage(driver).ExpiryMonth(expirymonth);
			// Click on expiry year drip down list and enter valid data
			new PaymentPage(driver).ExpiryYear(expiryyear);
			// Click on cvv textbox and enter valid data
			new PaymentPage(driver).CVV(cvv);
			// Click on address1 textbox and enter valid data
			new PaymentPage(driver).Address1(address1);
			// Click on address2 textbox and enter valid data
			new PaymentPage(driver).Address1(address2);
			// Click on postal code textbox and enter valid data
			new PaymentPage(driver).PostalCode(postalcode);
			// Click on continue button in paymeny page
			new BasePage(driver).Continue();
			// Click on signature textbox and enter the valid data
			new ConfirmationPage(driver).OrderSignature(signature);
			// Click on disclaimar checkbox
			new ConfirmationPage(driver).Disclaimar();
			// Click on continue button in payment page
			new BasePage(driver).Continue();
		}
		
	}


}
