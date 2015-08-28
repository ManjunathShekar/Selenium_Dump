package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperTestNG
{
	public WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://enroll.ng.unicityqa.com/develop/build/#/enroll/start");
//		WebElement listbox = driver.findElement(By.xpath("//select[@ng-model='selectedCountry"));
//		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(listbox);
//		select.selectByVisibleText("United States");
//		WebElement listbox1 = driver.findElement(By.xpath("//select[@ng-options='language.name for language in languages']"));
//		Select select1 = new Select(listbox1);
//		select1.selectByVisibleText("English");
	}
	//@AfterMethod
	//public void postCondtion()
	//{
	//	driver.quit();
	//}
}
