package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File file = new File(
				"C:\\Users\\VISHWANATHAN\\eclipse-workspace\\Cucumber.Adactin\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(file);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;

	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getCardNo() {
		String cardNo = p.getProperty("CreditCardNo");
		return cardNo;
	}

	public String getCvvNo() {
		String cvvno = p.getProperty("cvvNo");
		return cvvno;
	}
}
