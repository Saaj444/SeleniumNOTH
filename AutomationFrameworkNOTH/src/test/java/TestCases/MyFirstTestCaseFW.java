package TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Base.BaseTest;
import Utilities.ReadXLSData;

public class MyFirstTestCaseFW extends BaseTest {
	
	@Test(dataProviderClass=ReadXLSData.class,dataProvider="testdata")
	public static void LoginTest(String userame, String password) 
	{

		   
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("cookie_alert")))).click();
		driver.findElement(By.id(loc.getProperty("cookie_accept"))).click();
		driver.findElement(By.xpath(loc.getProperty("myaccount_link"))).click();
		driver.findElement(By.xpath(loc.getProperty("sign_in_link"))).click();
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(userame);
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("confirm_sign_in"))).click();
	}
	
//	data needs to be externalised
//	@DataProvider(name="testdata")
//	public Object [][] tData()
//	{
//		return new Object [][] 
//		{
//			{"sb.fitness79@gamil.com","bla"},
//			{"sb.fitness79@gmail.com","Automation123"}
//		};
//	}

}
