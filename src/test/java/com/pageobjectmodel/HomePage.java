package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Library.BaseClass;

public class HomePage {
	
public HomePage(){
		
		PageFactory.initElements(BaseClass.driver, this);
	}

@FindBy(xpath="//a[text()='My Account']")
public WebElement myaccountOption;
}
