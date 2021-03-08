package Techm.E2EFramework;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import resources.base;


public class Homepage extends base {

	
	public static Logger log = LogManager.getLogger(Homepage.class.getName());
	@Test
	
	public void basePageNav() throws IOException
	
	{
		driver=initalizeDriver();
		ENV=initalizeEnv();
		driver.get(ENV);
		
		log.info("Successful Login into Website");
		log.info("GIT code");
		log.info("Branch code");
		
		
	//	System.out.println(driver.getTitle());
		log.info(driver.getTitle());
		
		driver.quit();
	}
	
	
}
