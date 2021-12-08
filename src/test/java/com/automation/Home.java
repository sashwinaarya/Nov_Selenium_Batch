package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;

	public Home(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}
	
	

}
