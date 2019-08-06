package pageObject;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;
import util.Testbase;




public class Company extends Testbase {

	@FindBy(css = "a[data-hook='dashboard.newproposal']")
 	public WebElement newProposal2;
	
	@FindBy(css = "button[data-hook='dpaaccept']")
 	public WebElement Accept2;
	
	@FindBy(css = "select[data-hook='proposal.summary.creation.customertype']")
 	public WebElement customerType;
	
	@FindBy(css = "button[data-hook='proposal.summary.creation.create']")
 	public WebElement EnterDetail;
	
	@FindBy(css = "input[data-hook='.registrationCode']")
 	public WebElement registrationNumber;
	
	@FindBy(css = "select[data-hook='.entityTypeCode']")
 	public WebElement companySubtype;
	
	@FindBy(css = "input[data-hook='.legalName']")
 	public WebElement companyName;
	
	@FindBy(css = "input[data-hook='.tradeName']")
 	public WebElement TradeName;
	
	@FindBy(css = "select[data-hook='.businessTypeCode']")
 	public WebElement businessType;
	
	@FindBy(css = "select[data-hook='.businessSubTypeCode']")
 	public WebElement businessSubType;
	
	@FindBy(css = "input[data-hook='.natureOfBusiness']")
 	public WebElement natureBusiness;
	
	@FindBy(css = "input[data-hook='.establishedDate']")
 	public WebElement dateIncorporated;
	
	@FindBy(css = "input[data-hook='.yearsTrading']")
 	public WebElement yearTrading;

	@FindBy(css = "input[data-hook='.taxNum']")
 	public WebElement VATno;
	
	@FindBy(css = "input[data-hook='.email']")
 	public WebElement email;
	   
	@FindBy(css = "select[name='contactDetails.phones[0].type']")
 	public WebElement phoneType0;
	
	@FindBy(css = "input[name='contactDetails.phones[0].number']")
 	public WebElement phoneNumber0;
	
	@FindBy(css = "select[name ='contactDetails.phones[1].type']")
 	public WebElement phoneType1;
	
	@FindBy(css = "input[name='contactDetails.phones[1].number']")
 	public WebElement phoneNumber1;
	
	@FindBy(css = "select[name ='contactDetails.documentOutputChannel']")
 	public WebElement outputChannel;
	
	@FindBy(css = "input[data-hook='.mainContactName']")
 	public WebElement mainContactName;
	
	@FindBy(css = "input[data-hook='.mainContactPhone']")
 	public WebElement mainContactPhone;

	@FindBy(css = "input[name='currentAddress.streetNumber']")
	public WebElement currentAddressstreetNumber ;
	
	@FindBy(css = "input[name='currentAddress.zipPostal']")
	public WebElement currentAddresszipPostal ;
	
	@FindBy(css = "input[name='currentAddress.streetName']")
	public WebElement currentAddressstreetName ;
	
	@FindBy(css = "input[name='currentAddress.timeAtAddressYears']")
	public WebElement currentAddresstimeAtAddressYears ;
	
	@FindBy(css = "input[name='currentAddress.timeAtAddressMonths']")
	public WebElement currentAddresstimeAtAddressMonths ;
	
	@FindBy(css = "input[name='invoiceAddress.streetNumber']")
	public WebElement invoiceAddressstreetNumber ;
	
	@FindBy(css = "input[name='invoiceAddress.zipPostal']")
	public WebElement invoiceAddresszipPostal ;
	
	@FindBy(css = "input[name='invoiceAddress.streetName']")
	public WebElement invoiceAddressstreetName ;
	
	@FindBy(css = "input[name='mailingAddress.streetNumber']")
	public WebElement mailingAddressstreetNumber ;
	
	@FindBy(css = "input[name='mailingAddress.zipPostal']")
	public WebElement mailingAddresszipPostal ;
	
	@FindBy(css = "input[name='mailingAddress.streetName']")
	public WebElement mailingAddressstreetName ;
	
	@FindBy(css = "button[data-hook='customercapture.save']")
	public WebElement SaveButton ;
	
	public Company()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void newProposal()
	{
		newProposal2.click();
	}
	

	public void dpaAgreement()
	{
		Accept2.click();
	}
	

	public void customerType()
	{
		Select customerType1 = new Select(customerType);
		customerType1.selectByVisibleText("Company");
	}

	public void EnterDetail()
	{
		EnterDetail.click();
	}
    

    public void CompanyInformation(String companyName1,String Number )
    {
    	
    	registrationNumber.sendKeys(Number);
    	Select companySubtype1 = new Select(companySubtype);
    	companySubtype1.selectByVisibleText("Sole Proprietorship");
        companyName.sendKeys(companyName1);
    	
    	
    }

    public void TradeName(String TradeName1 )
    {
    	
    	TradeName.sendKeys(TradeName1); 	
    }

    public void businesstype(String natureBusiness1,String dateIncorporated1, String yearTrading1,String VATno1)
    {
    	Select businesstype1 = new Select(businessType);
    	businesstype1.selectByVisibleText("DA Manufacture of Food; Beverages & Tobacco");
    	
       	Select businesssubtype1 = new Select(businessSubType);
       	businesssubtype1.selectByVisibleText("Production meat & poultry products");
       	
       	natureBusiness.sendKeys(natureBusiness1);
       	dateIncorporated.sendKeys(dateIncorporated1);
       	yearTrading.sendKeys(yearTrading1);
       	VATno.sendKeys(VATno1);
    }
    
	public void email(String email1)
	{
		email.sendKeys(email1);
	}
	
	public void phonetype0()
	{
		Select phonestype01 = new Select(phoneType0);
		phonestype01.selectByVisibleText("Business Phone");
	}
	
	public void phones0(String phones01)
	{
		phoneNumber0.sendKeys(phones01);
	}
	
	public void phonestype1()
	{
		Select phonestype11 = new Select(phoneType1);
		phonestype11.selectByVisibleText("Business Phone");
	}
	
	public void phones1(String phones11)
	{
		phoneNumber1.sendKeys(phones11);
	}

	public void contactMethod1(String ContactName, String ContactPhone )
	{
		Select contactMethod0 = new Select(outputChannel);
		contactMethod0.selectByIndex(2);
		mainContactName.sendKeys(ContactName);
		mainContactPhone.sendKeys(ContactPhone);
	}
	
	public void currentAddressstreetNumber(String currentAddressstreetNumber1)
	{
		currentAddressstreetNumber.sendKeys(currentAddressstreetNumber1);
	}
	
	public void currentAddresszipPostal(String currentAddresszipPostal1)
	{
		currentAddresszipPostal.sendKeys(currentAddresszipPostal1);
	}
	
	public void currentAddresstimeAtAddressYears(String currentAddresstimeAtAddressYears1)
	{
		currentAddresstimeAtAddressYears.sendKeys(currentAddresstimeAtAddressYears1);
	}
	
	public void currentAddresstimeAtAddressMonths(String currentAddresstimeAtAddressMonths1)
	{
		currentAddresstimeAtAddressMonths.sendKeys(currentAddresstimeAtAddressMonths1);
	}
	
	public void currentAddressstreetName(String currentAddressstreetName1)
	{
		currentAddressstreetName.sendKeys(currentAddressstreetName1);
	}
	
	
	public void invoiceAddressstreetNumber(String invoiceAddressstreetNumber1)
	{
		invoiceAddressstreetNumber.sendKeys(invoiceAddressstreetNumber1);
	}
	
	public void invoiceAddresszipPostal(String invoiceAddresszipPostal1)
	{
		invoiceAddresszipPostal.sendKeys(invoiceAddresszipPostal1);
	}
	
	public void invoiceAddressstreetName(String invoiceAddressstreetName1)
	{
		invoiceAddressstreetName.sendKeys(invoiceAddressstreetName1);
	}
	
	public void mailingAddressstreetNumber(String mailingAddressstreetNumber1)
	{
		mailingAddressstreetNumber.sendKeys(mailingAddressstreetNumber1);
	}
	
	public void mailingAddresszipPostal(String mailingAddresszipPostal1)
	{
		mailingAddresszipPostal.sendKeys(mailingAddresszipPostal1);
	}
	
	public void mailingAddressstreetName(String mailingAddressstreetName1)
	{
		mailingAddressstreetName.sendKeys(mailingAddressstreetName1);
		
		
	}

			
	public void SaveButton()
	{
	Screenshot screenshot  = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
	try {
		ImageIO.write(screenshot .getImage(), "PNG", new File("C:\\Users\\psrivastava\\Documents\\Selenium\\cucumber\\Screenshot\\Proposal_Company.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	SaveButton.click();
}
}
