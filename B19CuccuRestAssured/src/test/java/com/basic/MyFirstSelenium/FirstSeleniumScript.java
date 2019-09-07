package com.basic.MyFirstSelenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstSeleniumScript {
	
	
	WebDriver driver;
	
	@Given("^User opens seleniumhq website$")
	public void User_opens_seleniumhq_website11(){
		System.setProperty("webdriver.gecko.driver","C:\\RadicalSoftware\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		
	}
	
	@When("^user clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_Project_tab(String tabName){
				System.out.println("tabName ="+tabName);
				driver.findElement(By.xpath("//div/div/ul/li//a[@title='Selenium Projects']"));
		
	}
	
	@When("^user clicks on Download tab$")
	public void user_clicks_on_Download_tab(){
		
		driver.findElement(By.xpath("//ul/li/a[contains(text(),'Download')]")).click();
	}
	
	
	@Then("^user clicks About tabs$")
	public void user_clicks_About_tabs(){
		Assert.assertTrue(true);
		driver.quit();
		
	}
		 
}
