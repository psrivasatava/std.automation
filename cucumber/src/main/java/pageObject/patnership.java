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

public class patnership extends Testbase {
	
	@FindBy(css = "a[data-hook='dashboard.newproposal']")
 	public WebElement newProposal;
 
	@FindBy(css = "button[data-hook='dpaaccept']")
 	public WebElement dpaAgreement;
 
	@FindBy(css = "select[data-hook='proposal.summary.creation.customertype']")
 	public WebElement customerType ;
	
	@FindBy(css = "button[data-hook='proposal.summary.creation.create']")
 	public WebElement button ;
	
	@FindBy(css = "input[name='companyDetails.legalName']")
 	public WebElement company ;
	
	@FindBy(css = "input[name='companyDetails.tradeName']")
 	public WebElement trade ;
	
	@FindBy(css = "select[name='companyDetails.businessTypeCode']")
 	public WebElement BusinessType ;
	
	@FindBy(css = "select[name='companyDetails.businessSubTypeCode']")
 	public WebElement BusinessSubType ;
	
	@FindBy(css = "input[data-hook='.natureOfBusiness']")
 	public WebElement natureOf ;
	
	@FindBy(css = "input[data-hook='.establishedDate']")
 	public WebElement date ;
	
	@FindBy(css = "input[data-hook='.yearsTrading']")
 	public WebElement year ;
	
	@FindBy(css = "input[data-hook='.numberOfPartners']")
 	public WebElement numberOfPatners ;
	
	@FindBy(css = "input[data-hook='.taxNum']")
 	public WebElement VAT ;
	
	
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
	
	@FindBy(css = "a[data-hook='proposal.applicants.addform.trigger']")
	public WebElement Addapplicant ;
	
	@FindBy(css = "select[data-hook ='proposal.applicants.addform.role']")
	public WebElement Role;
	
	@FindBy(css = "select[data-hook ='proposal.applicants.addform.type']")
	public WebElement Type;
	
	@FindBy(css = "button[data-hook='proposal.applicants.addform.add']")
	public WebElement AddapplicantButton ;
	
	
	public patnership()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void newProposal()
	{
		newProposal.click();
	}
	

	public void dpaAgreement()
	{
		dpaAgreement.click();
	}
	

	public void customerType()
	{
		Select customerType1 = new Select(customerType);
		customerType1.selectByVisibleText("Partnership");
	}

	public void EnterDetail()
	{
		button.click();
	}
	
	  public void CompanyInformation(String companyName1,String TradeName1 )
	    {
		        company.sendKeys("companyName1");
		        trade.sendKeys(TradeName1); 
	    }
	  
	  public void busine() 
	  {
	    	 	Select BusinessType1 = new Select(BusinessType);
	    	 	BusinessType1.selectByVisibleText("B  Fishing ");
	          //  Thread.sleep(5000);   	 	
	    	 	Select BusinessSubType1 = new Select(BusinessSubType);
	    	 	BusinessSubType1.selectByVisibleText("Fishing");
	    	
	    }

	   
	    
	    public void businesstype(String natureBusiness1,String dateIncorporated1, String yearTrading1,String numberOfPatners1)
	    {
	    	       	
	    	natureOf.sendKeys(natureBusiness1);
	       	date.sendKeys(dateIncorporated1);
	       	year.sendKeys(yearTrading1);
	     //  	VAT.sendKeys(VATno1);
	       	numberOfPatners.sendKeys(numberOfPatners1);
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
				ImageIO.write(screenshot .getImage(), "PNG", new File("C:\\Users\\psrivastava\\Documents\\Selenium\\cucumber\\Screenshot\\Proposal_Patnership.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SaveButton.click();
		}
		
         
		public void Addpatner()
		{
			Addapplicant.click();
			
			Select Role1 = new Select(Role);
    	 	Role1.selectByVisibleText("Partner/Member");
          //  Thread.sleep(5000);   	 	
    	 	Select Type1 = new Select(Type);
    	 	Type1.selectByVisibleText("Private Individual");
    	 	
    	 	AddapplicantButton.click();
			
		}


}


