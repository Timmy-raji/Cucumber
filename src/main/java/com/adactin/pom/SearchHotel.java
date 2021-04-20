package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public WebDriver driver;
	public SearchHotel(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noOfRooms;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkInDate;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkoutDate;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adults;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement children;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckoutDate() {
		return checkoutDate;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSearch() {
		return search;
	}
	
}
