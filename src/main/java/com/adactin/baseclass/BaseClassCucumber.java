package com.adactin.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClassCucumber {
	public static WebDriver driver;static Actions ac;static Robot r;
	
	public static WebDriver getBrowser(String type){
	try {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			 driver = new ChromeDriver();
		}else if (type.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
	} catch (Exception e) {
		e.printStackTrace();
	}return driver;
}
  public static WebDriver getWebsite(String url) {
	try {
		driver.get(url);
		
	} catch (Exception e) {
		e.printStackTrace();
	}return driver;
} 
   public static WebDriver closeTab() {
	try {
		driver.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return driver;
}
   public static WebDriver quitBrowser() {
	   try {
		driver.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return driver;
}
   public static WebDriver newWeb(String url) {
	try {
		driver.navigate().to(url);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return driver;
}
   public static WebDriver navigateBack(String type) {
	   try {
		if (type.equalsIgnoreCase("back")) {
			   driver.navigate().back();	
		}else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}else if (type.equalsIgnoreCase("refersh")) {
			driver.navigate().refresh();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return driver;
}
  
   public static WebDriver simpleAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
   public static WebDriver confirmAlert(String button) {
	   try {
		if (button.equalsIgnoreCase("ok")) {
			   driver.switchTo().alert().accept();
		}
		   else {
			driver.switchTo().alert().dismiss();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}return driver;
   }
   public static WebDriver promptAlert(String button) {
	   try {
		if (button.equalsIgnoreCase("ok")) {
			   driver.switchTo().alert().accept();
			  
		}
		   else {
			driver.switchTo().alert().dismiss();
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}return driver;
   }
   public static void enterText(WebElement element, String text) {
	   try {
		element.sendKeys(text);
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
   public static Actions mouseActions(WebElement element,String action ) {
	   try {
		ac = new Actions(driver);
		   if (action.equalsIgnoreCase("clickandhold")) {
			   ac.moveToElement(element).build().perform();
		}else if (action.equalsIgnoreCase("mouseover")) {
			ac.moveToElement(element).build().perform();
			
		}else if (action.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).build().perform();
		}else if (action.equalsIgnoreCase("rightclick")) {
			ac.contextClick(element).build().perform();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}   
	return ac;   
   }
   public static WebDriver frames(String switchBy,String value) {
	   try {
		if (switchBy.equalsIgnoreCase("index")) {
			int number = Integer.parseInt(value);
			   driver.switchTo().frame(number);
		}else if (switchBy.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);
		}else if (switchBy.equalsIgnoreCase("element")) {
			driver.switchTo().frame(value);
		}else if (switchBy.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}else if (switchBy.equalsIgnoreCase("mainpage")) {
			driver.switchTo().parentFrame();	
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		return driver;
	}
    public static WebDriver frame(String type) {
    	 try {
			if (type.equalsIgnoreCase("defaultcontent")) {
				 driver.switchTo().defaultContent();	
			}else if (type.equalsIgnoreCase("parentframe")) {
				driver.switchTo().parentFrame();	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
      
   public static Robot pageDown() throws Throwable {
	    try {
			r =new Robot();
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return r;
}
   public static Robot enter() throws Throwable {
	    try {
			r =new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return r;
}
   public static void windowsTitle() {
	try {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handles : windowHandles) {
			String title = driver.switchTo().window(handles).getTitle();
			System.out.println(title);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void switchToOneWindow(String uniqueTitle) {
	try {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handles : windowHandles) {
			if (driver.switchTo().window(handles).equals(uniqueTitle)) {
				break;
			}	
}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	public static void dropDown(WebElement element,String type,String value) {
	try {
		Select sc = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int number = Integer.parseInt(value);
			sc.selectByIndex(number);	
		}else if (type.equalsIgnoreCase("value")) {
			sc.selectByValue(value);
		}else if (type.equalsIgnoreCase("value")) {
			sc.selectByVisibleText(value);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void buttonOptions(WebElement element,String check) {
	try {
		if (check.equalsIgnoreCase("enabled")) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		}else if (check.equalsIgnoreCase("displayed")) {
			
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		}else if (check.equalsIgnoreCase("selected")) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void getOptions(WebElement element,String options) {
	
	try {
		Select sc = new Select(element);
		if (options.equalsIgnoreCase("getoptions")) {
			List<WebElement> allOptions = sc.getOptions();
			System.out.println(allOptions);
		}else if (options.equalsIgnoreCase("getfirstselectedoptions")) {
			WebElement firstSelectedOption = sc.getFirstSelectedOption();
			System.out.println(firstSelectedOption);
		}else if (options.equalsIgnoreCase("getallselectedoptions")) {
			
			List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
			System.out.println(allSelectedOptions);

		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void isMultiple(WebElement element) {
	try {
		Select sc = new Select(element);
		boolean multiple = sc.isMultiple();
		System.out.println(multiple);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void getAttribute(WebElement element,String value) {
try {
	String attribute = element.getAttribute(value);
	System.out.println(attribute);
} catch (Exception e) {
	e.printStackTrace();
}
}
public static WebDriver gets(String type) {
	try {
		if (type.equalsIgnoreCase("title")) {
			String title = driver.getTitle();
			System.out.println(title);
		}else if (type.equalsIgnoreCase("currenturl")) {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}return driver;
		
	}
public static void screenShot(String filename) throws Throwable {
	TakesScreenshot ts = (TakesScreenshot) driver;
		try {
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination =new File(System.getProperty("user.dir")+"//Screenshot//"+filename+".png");
			FileHandler.copy(source, destination);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
}
public static void clickElement(WebElement element) {
	try {
		element.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	public static void scrollToElement(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()",element);
}
	

}
