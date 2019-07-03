package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream file;

	public TestBase() {
		try {
			prop = new Properties();
			file = new FileInputStream("C:/Users/Murali Arjun/Documents/FreeCRMTest/src/main/java/com/"
					+ "crm/qa/config/config.properties");
			prop.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initilization() {
		String browserName = prop.getProperty("browsername");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Murali Arjun/Downloads/updatedChromeDriver/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}
