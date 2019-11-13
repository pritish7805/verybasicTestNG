package testngFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annot {
	
	WebDriver driver =null;
	@Test
	public void Login() throws IOException
	{
		Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\874531\\eclipse-workspace\\TestNGstart\\src\\testngFiles\\datadriver.properties");
        prop.load(fis);
        
        //Choose driver via datadriver file
       if (prop.getProperty("browser").contains("Chrome"))
       {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
       }
       else if(prop.getProperty("browser").contains("Firefox"))
       {
    	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\874531\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
   		   driver = new FirefoxDriver();
       }
       else
       {
    	   System.setProperty("webdriver.ie.driver", "C:\\Users\\874531\\Downloads\\MicrosoftWebDriver.exe");
   		   driver = new InternetExplorerDriver();
       }
    	// Getting to the url   
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[contains(@id,'userna')]")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("submit")).click();
	}
	

}

