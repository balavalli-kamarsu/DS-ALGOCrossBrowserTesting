package com.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	private static Helper Helper;    
    private static WebDriver driver ;
    public final static int TIMEOUT = 2;
    
/*    private Helper() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
     } */
   
    public WebDriver initializeDrivers(String browser) {

    	 if (browser.equalsIgnoreCase("chrome")) {
			//Loggerload.info("Testing on chrome");
			WebDriverManager.chromedriver().browserVersion("108.0.0").setup();
			driver = new ChromeDriver();

		} 
//		else if (browser.equalsIgnoreCase("safari")) {
//			//Loggerload.info("Testing on safari");
//			WebDriverManager.safaridriver().setup();
//			driver = new SafariDriver();
//
//		} 
//    	 else if (browser.equalsIgnoreCase("firefox")) {
// 			//Loggerload.info("Testing on firefox");
// 			WebDriverManager.firefoxdriver().setup();
// 			driver = new FirefoxDriver();
//
// 		} 
		else if (browser.equalsIgnoreCase("edge")) {
			//Loggerload.info("Testing on Edge");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		// Set Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		return driver;
	}

    public static void openPage(String url) {
        driver.get(url);
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
   
    public static void setUpDriver() {
        if (Helper==null) {
            Helper = new Helper();
        }
    }
     public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
         Helper = null;
     }

}
