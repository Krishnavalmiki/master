package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunction {
	
	public void Initialize(WebDriver driver) throws Exception
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is " +projectPath);
	    
	    System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

}
