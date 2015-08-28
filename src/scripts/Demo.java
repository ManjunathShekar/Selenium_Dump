package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://enroll.ng.unicityqa.com/autorefill_newdesign/build/#/enroll/start");
		driver.findElement(By.xpath(".//*[@id='ng-app']/body/footerbtns/div/div/div[2]/button[2]")).click();
		driver.close();
	}

}  