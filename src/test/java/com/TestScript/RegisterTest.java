package com.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Library.BaseClass;
import com.Library.GenericClass;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.LoginPage;

public class RegisterTest extends BaseClass {
	
	
	@Test(priority=1,enabled=true,description="Reigster the user details")
	public void registersignin() throws InterruptedException{
		HomePage home=new HomePage();
		LoginPage login=new LoginPage();
		NXGReports.addStep("mY aCCOUNT OPTION  IS DISPLAYED", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		home.myaccountOption.click();
		NXGReports.addStep("The myACCOUNT OPTION IS CLICKED", LogAs.PASSED, null);
		Thread.sleep(4000);
		Assert.assertTrue(login.EmailAddressText.isDisplayed(),"The Email address text is not present");
		NXGReports.addStep("The Email address text is preseent",LogAs.PASSED, null);
		login.EmailAddressTextBox.sendKeys(GenericClass.getExcelData("Register", 1,0));
		Thread.sleep(4000);
		login.passwordTextBox.sendKeys(GenericClass.getExcelData("Register", 1,1));
		Thread.sleep(4000);
		login.registerButton.click();
		Assert.assertTrue(login.saME.isDisplayed(), "THE ERPR IS NTO DISPLAYED");
		NXGReports.addStep("tHE ERROR PAAGEOS ", LogAs.PASSED, null);
		
	}

}
