package TestCases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		 
	
//		   Wait<WebDriver> wait = new FluentWait <WebDriver>(driver)
//			       .withTimeout(Duration.ofSeconds(10))
//			       .pollingEvery(Duration.ofSeconds(5))
//			       .ignoring(NoSuchElementException.class);
//		   
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"onetrust-banner-sdk\"]/div"))).click();
//		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//		driver.findElement(By.xpath("//*[text()='My Account']")).click();
//		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
//		driver.findElement(By.id("email-input")).sendKeys("sb.fitness79@gmail.com");
//		driver.findElement(By.id("password-input")).sendKeys("Automation123");
//		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/div[3]/button/div[2]")).click();
		
	}

}
