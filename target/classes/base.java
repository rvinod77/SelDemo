package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public String ENV;
	public Properties prop=new Properties();
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	//prop.load(fis);
	
	public WebDriver initalizeDriver() throws IOException
	
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\vinodram\\eclipse-workspace\\E2EFramework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		// get Properties from data.property file
	//	String browserName=prop.getProperty("browser");
		
		// get properties from cmdline or from Jenkins
		String browserName= System.getProperty("browser");
		//System.out.println(browserName);
		log.info(browserName);
		
		//CHOMRE
		if (browserName.equals("headless"))	
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ASel_Learning\\Chromedriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
		}
		
		
		
		//FIREFOX
		else if (browserName.equals("firefox"))
		{
			//need to add system.setprty
			driver = new FirefoxDriver();
		}
		
		// IE
		else if  (browserName.equals("IE"))
		{
			
		}
			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
		public String initalizeEnv() throws IOException
		
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\vinodram\\eclipse-workspace\\E2EFramework\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			ENV=prop.getProperty("url");
		//	System.out.println(ENV);
			log.info(ENV);
			return ENV;
			
	}
	
}
