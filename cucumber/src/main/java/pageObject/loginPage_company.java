package pageObject;


import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;

import util.Testbase;

public class loginPage_company extends Testbase{
	
	
		 
	@FindBy(css = "input[data-hook='login.username']")
 	public WebElement UserName;
 
	@FindBy(css = "input[data-hook='login.password']")
 	public WebElement Password;
 
	@FindBy(css = "BUTTON[data-hook='login.submit']")
 	public WebElement btn_Login ;
	
	public loginPage_company()
	{
		PageFactory.initElements(driver, this);
	}
	
 
    public Company Login(String un, String pw)
    {
    	UserName.sendKeys("superuser");
    	Password.sendKeys("admin1");
    	btn_Login.click();
    	return  new Company();
    }

    }
