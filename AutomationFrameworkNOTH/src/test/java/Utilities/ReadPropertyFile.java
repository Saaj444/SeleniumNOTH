package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Eclipse_workspace\\SeleniumAutomationFramework\\AutomationFramework\\src\\test\\resources\\ConfigFiles\\config.properties");
	
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("testurl"));
		

	}

}
