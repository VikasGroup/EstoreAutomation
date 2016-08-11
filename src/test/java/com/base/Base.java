package com.base;

import org.apache.log4j.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vselenium.BasicTest;
import com.vselenium.Config;
import com.vselenium.PropertyReader;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.de.Aber;

public class Base extends PropertyReader{
	final static Logger logger = Logger.getLogger(Base.class);
	private static boolean initialized = false;
	private static WebDriver driver;
	public static Config config;

	public Base(BasicTest basicTest) {
		config = basicTest.getcon();
	}

	@Before
	public static void setup() {

		System.out.println(config.getValue("os"));
		if (!initialized) {
			initialized = true;
			logger.info("driver initialised");
			if(config.getValue("browser").equals("CHROME")){
				System.setProperty("webdriver.chrome.driver", config.getValue("chrome.driver.path"));
				driver = new ChromeDriver();
			}
			else if(config.getValue("browser").equals("FIREFOX")){
				driver = new FirefoxDriver();
			}
			else if (config.getValue("browser").equals("IE")){
				System.setProperty("webdriver.chrome.driver", config.getValue("ie.driver.path"));
				driver = new ChromeDriver();
			}
			
		}else
			logger.info("No driver is initialised");
		
		
	}

	public WebDriver getDriver() {
		if (driver == null)
			logger.debug("driver is null");
		return driver;
	}

	@After
	public void EndTest() {
		driver.quit();
		logger.info("driver closed");

	}
}
