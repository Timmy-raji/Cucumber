package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public WebDriver driver;
	public BookHotel(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billingAddress;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement creditCard;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardType;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement exMonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement exYear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvNo;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCreditCard() {
		return creditCard;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExMonth() {
		return exMonth;
	}
	public WebElement getExYear() {
		return exYear;
	}
	public WebElement getCvvNo() {
		return cvvNo;
	}
	public WebElement getBook() {
		return book;
	}
	
	
	
	
}
