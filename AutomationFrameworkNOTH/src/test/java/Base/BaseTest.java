package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		if (driver==null) {
			fr = new FileReader("C:\\eclipseWorkspace\\SeleniumNOTHRepo\\SeleniumNOTH\\AutomationFrameworkNOTH\\src\\test\\resources\\ConfigFiles\\config.properties");
			fr1 = new FileReader("C:\\eclipseWorkspace\\SeleniumNOTHRepo\\SeleniumNOTH\\AutomationFrameworkNOTH\\src\\test\\resources\\ConfigFiles\\locators.properties");
			prop.load(fr);
			loc.load(fr1);
		}
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
		}
	}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
		System.out.println("teardown sucessful");
		System.out.println("testing complete");
	}
}
