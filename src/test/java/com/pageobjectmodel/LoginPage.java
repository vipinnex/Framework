package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Library.BaseClass;

public class LoginPage {
	
	public LoginPage(){
		
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(xpath="//label[contains(text(),'Email address')]")
	public WebElement EmailAddressText;
	
	@FindBy(id="reg_email")
	public WebElement EmailAddressTextBox;
	
	@FindBy(xpath="(//label[contains(text(),'Password')])[2]")
	public WebElement passwordtext;
	
	@FindBy(id="reg_password")
	public WebElement passwordTextBox;
	
	@FindBy(name="register")
	public WebElement registerButton;
	
	@FindBy(id="username")
	public 	WebElement LoginEmailAddressTextBox;	
	
	@FindBy(id="password")
	public WebElement LoginpasswordTextbox;
	
	@FindBy(name="login")
	public WebElement loginButton;
	
	@FindBy(xpath="(//span[text()='Ah shoot! Email already in use!'])[1]")
	public WebElement saME;
}
