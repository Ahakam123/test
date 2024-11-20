package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
public static WebDriver driver;
public Properties p;
	
	@BeforeTest
	@Parameters({"os", "browser"})
	public void setup(String os, String br) throws IOException 
	{
		
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file); 
		
		switch(br.toLowerCase())
		{
		case "chrome" :driver= new ChromeDriver(); break;
		case "edge" :driver= new EdgeDriver(); break;
		case "firefox" :driver= new FirefoxDriver(); break;
		default : System.out.println("Invalid browser.."); return;
		}
		
//		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("appURL")); // Getting URL from properties file 
		driver.manage().window().maximize();
		
	}
	
	/*
	 * @AfterTest public void tearDown() { driver.quit();
	 * 
	 * }
	 */

}