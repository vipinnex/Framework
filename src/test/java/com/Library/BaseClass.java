package com.Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.kirwa.nxgreport.NXGReports;

public class BaseClass {
		public static WebDriver driver;
	
	
	@BeforeMethod
	public void setup(){
		
		if(GenericClass.getproperties("BROWSERNAME").equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumFramework\\Framework\\BrowserDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(GenericClass.getproperties("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		}
		else if(GenericClass.getproperties("BROWSERNAME").equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "./BrowserDriver/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(GenericClass.getproperties("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
		}
		else if(GenericClass.getproperties("BROWSERNAME").equals("Edge")){
			System.setProperty("webdriver.edge.driver", "./BrowserDriver/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.get(GenericClass.getproperties("URL"));
			//driver.manage().window().maximize();
		}
		else if(GenericClass.getproperties("BROWSERNAME").equals("ie")){
			System.setProperty("webdriver.ie.driver", "./BrowserDriver/IEDriverServer.exe");
			/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);*/
			driver = new InternetExplorerDriver();
			driver.get(GenericClass.getproperties("URL"));
			//driver.manage().window().maximize();
		}
		NXGReports.setWebDriver(driver);
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
	
	

}
