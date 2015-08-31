package Asserts;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import scripts.SuperTestNG;

public class Home_Page extends SuperTestNG
{	
	@Test
	void titleVerify ()
	{
		String actual = driver.getTitle();
		String expected = "Start | Unicity Enrollment";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
		void PageName()
	{
		// Need to write for Page Name asserts
	}

	@AfterTest
	public void closeFirefox()
	{
		driver.close();
		driver.quit();
	}	
}