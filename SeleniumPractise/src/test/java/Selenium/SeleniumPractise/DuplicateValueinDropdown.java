package Selenium.SeleniumPractise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuplicateValueinDropdown {
	
	WebDriver driver;
	
	DuplicateValueinDropdown(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static void Selectdunction(WebElement Element) {
		Select os=new Select(Element);
		os.selectByIndex(1);
	}
	
	public static void Action(WebDriver driver,WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public static void Webdriverwait_forall(WebDriver driver, WebElement webele)
	{
		
		WebDriverWait waitTransaction=new WebDriverWait(driver, 10);
		waitTransaction.until(ExpectedConditions.elementToBeClickable(webele)).click();
	}
	
	
	
//	public static WebElement CommonElment(WebDriver driver,WebElement idelement)
//	{
//		idelement=driver.findElement(By.id(idelement));
//				
//				return element;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://shop.demoqa.com/product/black-cross-back-maxi-dress/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement wl=driver.findElement(By.id("pa_color"));
		Action(driver,wl);
		
		DuplicateValueinDropdown.Selectdunction(wl);
		
		WebElement wl2=driver.findElement(By.id("pa_size"));
		Action(driver,wl2);
		DuplicateValueinDropdown.Selectdunction(wl2);
		WebElement wl3=driver.findElement(By.xpath("//div[@class='single_variation_wrap']//button[@type='submit']"));
		Webdriverwait_forall(driver, wl3); 
		
		driver.findElement(By.xpath("//a[contains(text(),'View cart')]")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		
		driver.findElement(By.id("billing_first_name")).sendKeys("Krishna");
		driver.findElement(By.id("billing_last_name")).sendKeys("Valmiki");
		
		WebElement dropdown=driver.findElement(By.id("billing_country"));

		Select os=new Select(dropdown);
		
		List<WebElement> list=os.getOptions();
		
		Set<WebElement> set=new HashSet<WebElement>(list.size());
		
		for(WebElement element:set)
		{	
			String value=element.getText();
			System.out.println();
			set.add(element);
			
		}
		System.out.println(set.size());
		System.out.println("No of count is " +list.size());
	}

}
