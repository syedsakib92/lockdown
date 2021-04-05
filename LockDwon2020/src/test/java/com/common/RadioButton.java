package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	

	public static void main (String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement Female=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
	Female.click();
	boolean select=Female.isSelected();
	boolean display=Female.isDisplayed();
	boolean enable=Female.isDisplayed();
	System.out.println(select);
	System.out.println(display);
	System.out.println(enable);
}
	
	

}//static is java keyword. if the method is static then we do not need an object
