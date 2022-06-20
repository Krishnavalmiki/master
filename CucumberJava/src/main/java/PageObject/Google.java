package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Google {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@title='Search']")
	public WebElement  intgooglesearchText;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	public WebElement  intgooglesearchbutton;
	
	
	
	public Google(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterGoogletext(String strText)
	{
		intgooglesearchText.sendKeys(strText);
	}
	
	public void enterSearchbuttont()
	{
		intgooglesearchbutton.click();
	}

	
	

}
