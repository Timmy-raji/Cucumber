package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookHotel;
import com.adactin.pom.LoginPage;
import com.adactin.pom.Logout;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	public WebDriver driver;
public PageObjectManager(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


private LoginPage login;
private SearchHotel search;
private SelectHotel select;
private BookHotel booknow;
private Logout logout;

public LoginPage getInstanceLogin() {
	login =new LoginPage(driver);
	return login;
}
public SearchHotel getInstanceSearch(){
	SearchHotel search = new SearchHotel(driver);
	return search;
}
	public BookHotel getInstanceBookHotel(){
		BookHotel book = new BookHotel(driver);
		return book;
	}
	public SelectHotel getInstanceSelectHotel() {
		SelectHotel select = new SelectHotel(driver);
		return select;
	}
	public BookHotel getIstanceBookHotel() {
		BookHotel book = new BookHotel(driver);
		return book;
	}
	public Logout getInstanceLogout() {
		Logout logout = new Logout(driver);
		return logout;
	}
}
