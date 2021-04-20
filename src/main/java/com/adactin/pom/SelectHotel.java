package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public WebDriver driver;
	
	public SelectHotel(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement select;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement submit;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}
