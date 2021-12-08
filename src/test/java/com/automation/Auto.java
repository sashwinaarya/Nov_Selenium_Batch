package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass_Automation;

public class Auto extends BaseClass_Automation {
	
	public static WebDriver driver=BaseClass_Automation.get_Driver("chrome");
	
		public static Home h=new Home(driver);
		
		public static LoginPage login=new LoginPage(driver);
	public static void main(String[] args) throws InterruptedException {
		

		getUrl("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		clickOnElement(h.getSignin());
		inputValueElement(login.getUsername(), "Nandhinivaradhan@gmail.com");
		inputValueElement(login.getPassword(), "A@rya123");
		clickOnElement(login.getSign());
		
		Thread.sleep(3000);
		
		close();
		
	}


}
