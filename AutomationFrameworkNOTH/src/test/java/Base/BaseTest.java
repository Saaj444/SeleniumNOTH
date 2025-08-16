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
			// Get the current project's root directory
			String projectRoot = System.getProperty("user.dir");

			// Construct the full paths using the project root and relative paths
			// Use forward slashes for cross-platform compatibility in paths
			fr = new FileReader(projectRoot + "/src/test/resources/ConfigFiles/config.properties");
			fr1 = new FileReader(projectRoot + "/src/test/resources/ConfigFiles/locators.properties");
			prop.load(fr);
			loc.load(fr1);
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			// WebDriverManager handles downloading and setting up the correct ChromeDriver
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize(); // Good practice to maximize the browser window
		}
	}

	@AfterMethod
	public void tearDown()
	{
		if (driver != null) { // Add null check to prevent NullPointerException
			driver.close();
			// driver.quit(); // Consider using driver.quit() to close browser and end WebDriver session properly
		}
		System.out.println("teardown successful");
		System.out.println("testing complete");
	}
}