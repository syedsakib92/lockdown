package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flightbase {
	
	public WebDriver driver;
	
	
	String browser="chrome";
	
	public void getDriver() {
		if (browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else
			System.out.println("Not support Browser");
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void closeBrowser() {
		driver.close();
	}

}
