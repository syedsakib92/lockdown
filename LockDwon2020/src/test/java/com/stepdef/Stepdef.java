package com.stepdef;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.common.Flightbase;
import com.pageobject.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef extends Flightbase {
	
	//WebDriver driver;
	@Given("^I am on the application home page$")
	public void i_am_on_the_application_home_page()  {
	
		getDriver();
		driver.get("http://44.239.24.72:8000/welcome");
	
	
	}
	@When("^I click on user register link$")
	public void i_click_on_user_register_link()  {
	    
	//WebElement registerlink=driver.findElement(By.linkText("REGISTER"));
		//registerlink.click();
		
		HomePage hp= new HomePage(driver);
		hp.clickRegister();
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String firstname, String lastname, String phone, String  email, String  username , String  password, String ConfirmPassword)  {
	WebElement editfirstName=driver.findElement(By.name("firstName"));
	 editfirstName.sendKeys(firstname);
	 
	 WebElement editlastname=driver.findElement(By.xpath("//input[@name='lastName']"));
	 editlastname.sendKeys(lastname);
	 
	WebElement editphone= driver.findElement(By.cssSelector("input[name='phone']"));
	 editphone.sendKeys(phone);
	 
	 WebElement editEmail= driver.findElement(By.cssSelector("input[id='userName']"));
	 editEmail.sendKeys(email);
	
	
	 
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button()  {
	
	 WebElement btnSubmit= driver.findElement(By.name("register"));
	 btnSubmit.click();
	}

	@Then("^i find registration Successful page$")
	public void i_find_registration_Successful_page()  {
	 String tittle= driver.getTitle();
	 Assert.assertEquals(tittle, "Register: Mercury Tours");
	 closeBrowser();//close the active browser
	 //driver.quit();//close all web browser
	}



}
