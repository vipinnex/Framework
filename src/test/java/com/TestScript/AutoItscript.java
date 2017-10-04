package com.TestScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Library.BaseClass;

public class AutoItscript extends BaseClass {
	
	@Test
	public void autoit() throws InterruptedException, IOException{
		
		driver.findElement(By.id("imagesrc")).click();
		
		 Runtime.getRuntime().exec("./Autoitscript/SCRIPT.exe");		
		 
		 
		
	}

}
