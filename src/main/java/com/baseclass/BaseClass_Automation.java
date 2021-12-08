package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Automation {
	
	public static WebDriver driver; //---- null 	
	public static WebDriver get_Driver(String type) {
		
		if(type.equalsIgnoreCase("chrome")) 		
		{
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		else if(type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			 driver=new ChromeDriver();
		}	
		
			return driver;
			}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();
	}
	
	public static void inputValueElement(WebElement element, String values) {
		
		element.sendKeys(values);
	}
	
	public static void close() {
		driver.close();

	}
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	
	public static void dropdown(WebElement element, String type, String value1) {
		
		Select s=new Select(element);
		
		
		if(type.equalsIgnoreCase("byvalue")) {
			
			s.selectByValue(value1);
			
		}
		
		else if(type.equalsIgnoreCase("byvisibleText")) {
			s.selectByVisibleText(value1);
			
		}
		else if(type.equalsIgnoreCase("byIndex")) {
			
			int parseInt = Integer.parseInt(value1);
			s.selectByIndex(parseInt);
		}
		

	}
	


}
