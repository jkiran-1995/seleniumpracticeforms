package com.seleniumpracticeforms.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.seleniumpracticeforms.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	
	public  String BaseURL = readConfig.getApplicationURL();
	public String FirstName= readConfig.getFirstName();
	public String LastName= readConfig.getLastName();
	public String Date = readConfig.getDate();
	public static WebDriver driver;
	public static ChromeOptions Options;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
		logger = logger.getLogger("Selenium-Forms");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(Options);
		
	}
	@AfterClass
	public void teardown() {
		logger.info("Browser is Closed");
		driver.close();
	}
	
	}


