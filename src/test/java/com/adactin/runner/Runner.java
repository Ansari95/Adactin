package com.adactin.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\adactin\\feature\\Adactin.feature",

				glue="com\\adactin\\stepDefinition")

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void SetUp() {
		
		driver=BaseClass.browserLanch("chrome");
	}
	
	@AfterClass
	public static void tearDown() {
		
		driver.quit();
	}
	
	
}

