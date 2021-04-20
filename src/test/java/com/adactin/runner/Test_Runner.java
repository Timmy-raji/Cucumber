package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.adactin.baseclass.BaseClassCucumber;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//com//adactin//featurefile",glue = "com.adactin.stepdefinition",monochrome =true,
dryRun = false,plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Report/Extentreport.html"})

public class Test_Runner{
	
	public static WebDriver driver;//  = BaseClassCucumber.getBrowser("chrome");
	
	
	@BeforeClass
	public static void setup() throws Throwable {
	String 	browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClassCucumber.getBrowser(browser);
	}
//	
	@AfterClass
	public static void tearDown() {
		driver = BaseClassCucumber.closeTab();

	}
}
