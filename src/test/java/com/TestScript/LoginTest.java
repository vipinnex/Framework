package com.TestScript;

import org.testng.annotations.Test;

import com.Library.BaseClass;
import com.Library.GenericClass;
import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.LoginPage;

public class LoginTest extends BaseClass {
	
	
	@Test(priority=1,enabled=true,description="Login to the application")
	public void Logintoapplication() throws InterruptedException{
		
		
		HomePage home=new HomePage();
		LoginPage login=new LoginPage();
		Thread.sleep(3000);
		home.myaccountOption.click();
		Thread.sleep(3000);
		login.LoginEmailAddressTextBox.sendKeys(GenericClass.getExcelData("Register", 1,0));
		Thread.sleep(3000);
		login.LoginpasswordTextbox.sendKeys(GenericClass.getExcelData("Register", 1,1));
		Thread.sleep(3000);
		login.loginButton.click();
	}

}
