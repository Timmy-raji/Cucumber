package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClassCucumber;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClassCucumber {
	public static WebDriver driver = Test_Runner.driver;
	
	//public static LoginPage login = new LoginPage(driver);
	//SearchHotel search = new SearchHotel(driver);
	//SelectHotel selectH = new SelectHotel(driver);
	//BookHotel book = new BookHotel(driver);
	//Logout logout = new Logout(driver);
	public static PageObjectManager pom = new PageObjectManager(driver);
	@Given("^Launch Application$")
	public void launch_Application() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
	   getWebsite(url);
	}

	@When("^Enter The Username In Username Field$")
	public void enter_The_Username_In_Username_Field() throws Throwable {
	   enterText(pom.getInstanceLogin().getUserName(), "timmyraji");
	}

	@When("^Enter The Password In Password Field$")
	public void enter_The_Password_In_Password_Field() throws Throwable {
	   enterText(pom.getInstanceLogin().getPassword(), "Tharunika");
	}

	@Then("^Click Login Button And It Navigate To The Search Hotel  Page$")
	public void click_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
	   clickElement(pom.getInstanceLogin().getLogin());
	}

	@When("^Select Location$")
	public void select_Location() throws Throwable {
	   clickElement(pom.getInstanceSearch().getLocation());
	   dropDown(pom.getInstanceSearch().getLocation(), "value", "London");
	}

	@When("^Select Hotel$")
	public void select_Hotel() throws Throwable {
	   clickElement(pom.getInstanceSearch().getHotels());
	   dropDown(pom.getInstanceSearch().getHotels(), "value", "Hotel Creek");
	}

	@When("^Select Room Type$")
	public void select_Room_Type() throws Throwable {
	   clickElement(pom.getInstanceSearch().getRoomType());
	   dropDown(pom.getInstanceSearch().getRoomType(), "value", "Double");
	}

	@When("^Select No\\. Of Rooms$")
	public void select_No_Of_Rooms() throws Throwable {
	    clickElement(pom.getInstanceSearch().getNoOfRooms());
	    dropDown(pom.getInstanceSearch().getNoOfRooms(), "index", "2");
	}

	@When("^Select Check In Date$")
	public void select_Check_In_Date() throws Throwable {
	  enterText(pom.getInstanceSearch().getCheckInDate(), "20/05/2021");
	}

	@When("^Select Check Out Date$")
	public void select_Check_Out_Date() throws Throwable {
	    enterText(pom.getInstanceSearch().getCheckoutDate(), "21/05/2021");
	}

	@When("^Select No\\. Of Adults$")
	public void select_No_Of_Adults() throws Throwable {
	   clickElement(pom.getInstanceSearch().getAdults());
	   dropDown(pom.getInstanceSearch().getAdults(), "index", "2");
	}

	@When("^Select No\\. Of Children$")
	public void select_No_Of_Children() throws Throwable {
		 clickElement(pom.getInstanceSearch().getChildren());
		   dropDown(pom.getInstanceSearch().getChildren(), "index", "1");
	}

	@Then("^Search Hotel and It Navigate To The Select Hotel Page$")
	public void search_Hotel_and_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
	    clickElement(pom.getInstanceSearch().getSearch());
	}
	@When("^Hotel Select$")
	public void hotel_Select() throws Throwable {
	   clickElement(pom.getInstanceSelectHotel().getSelect());
	}

	@Then("^Click Submit Button And It Navigate To The Book A Hotel Page$")
	public void click_Submit_Button_And_It_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {
	    clickElement(pom.getInstanceSelectHotel().getSubmit());
	}

	@When("^Enter User First Name$")
	public void enter_User_First_Name() throws Throwable {
	   enterText(pom.getIstanceBookHotel().getFirstName(), "Rajalakshmi");
	}

	@When("^Enter User Last Name$")
	public void enter_User_Last_Name() throws Throwable {
		 enterText(pom.getIstanceBookHotel().getLastName(), "M");
	}

	@When("^Enter User Address$")
	public void enter_User_Address() throws Throwable {
		enterText(pom.getIstanceBookHotel().getBillingAddress(), "no.7,tagore st.,Ambattur,chennai-53");
	}

	@When("^Enter Credit Card Number$")
	public void enter_Credit_Card_Number() throws Throwable {
		enterText(pom.getIstanceBookHotel().getCreditCard(), FileReaderManager.getInstance().getInstanceCR().getCardNo());
	}

	@When("^Enter Credit Card Type$")
	public void enter_Credit_Card_Type() throws Throwable {
	    clickElement(pom.getIstanceBookHotel().getCardType());
	    dropDown(pom.getIstanceBookHotel().getCardType(), "index", "0");
	}

	@When("^Enter Card Expiry Date$")
	public void enter_Card_Expiry_Date() throws Throwable {
	    clickElement(pom.getIstanceBookHotel().getExMonth());
	    dropDown(pom.getIstanceBookHotel().getExMonth(), "value", "1");
	}

	@When("^Enter Card Expiry Year$")
	public void enter_Card_Expiry_Year() throws Throwable {
		 clickElement(pom.getIstanceBookHotel().getExYear());
		    dropDown(pom.getIstanceBookHotel().getExYear(), "value", "2022");
	}

	@When("^Enter CVV Number$")
	public void enter_CVV_Number() throws Throwable {
		enterText(pom.getIstanceBookHotel().getCvvNo(), "234");
	}

	@Then("^Click Book Now Button and It Navigate to$")
	public void click_Book_Now_Button_and_It_Navigate_to() throws Throwable {
		 clickElement(pom.getIstanceBookHotel().getBook());  
	}

	@Then("^Click Logout Button And It Navigate To The Home Page$")
	public void click_Logout_Button_And_It_Navigate_To_The_Home_Page() throws Throwable {
	   clickElement(pom.getInstanceLogout().getLogout());
	}


}
