package com.jdTouch.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
    public static Properties prop;
	
	public static String geckodriverpath=" /Users/amitkumarv/Documents/Automation/geckodriver.exe";
	public static String chromedriverpath= "/Users/amitkumarv/Documents/Automation/chromedriver.exe";
	public static String datafilepath = "C:\\Users\\amitkumarv\\Documents\\DOCUMENTS\\AMIT 1\\Automation 1\\TESTDATA\\testdata.xls";
	public static String propertiesfilePath = "C:\\Users\\amitkumarv\\Documents\\DOCUMENTS\\AMIT 1\\Automation 1\\JD_WapTouch\\src\\main\\java\\com\\jdTouch\\config\\config.properties";
	public static String freeListdata = "C:\\Users\\amitkumarv\\Documents\\DOCUMENTS\\AMIT 1\\Automation 1\\JD_WapTouch\\src\\main\\java\\com\\jdTouch\\data\\freelistdata.xls";
	
	
	public static File file;
	public static FileInputStream fis;
	
	public BaseClass() {
		
		try {
		prop = new Properties();
		FileInputStream fiss = new FileInputStream(propertiesfilePath);
		prop.load(fiss);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void initialization()   {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("Chrome")|| browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox") || browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", geckodriverpath);
			driver = new FirefoxDriver();
		}
		 
		Dimension resolution = new Dimension(280, 660);
		driver.manage().window().setSize(resolution);
		
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("baseurl"));
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	public void closetabs() {
		/*ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		tabs.size();
		for(int i=0;i<tabs.size();i++) {
			driver.switchTo().window(tabs.get(i));
			driver.close();
		}*/
		driver.quit();
	}
	
}
