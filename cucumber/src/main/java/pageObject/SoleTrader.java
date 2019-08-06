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

public class SoleTrader extends Testbase {

	@FindBy(css = "a[data-hook='dashboard.newproposal']")
 	public WebElement newProposal2;
	
	@FindBy(css = "button[data-hook='dpaaccept']")
 	public WebElement Accept2;
	
	@FindBy(css = "select[data-hook='proposal.summary.creation.customertype']")
 	public WebElement customerType;
	
	@FindBy(css = "button[data-hook='proposal.summary.creation.create']")
 	public WebElement EnterDetail;
	
	@FindBy(css = "select[data-hook='.title']")
 	public WebElement title;
	
	@FindBy(css = "input[data-hook='.firstName']")
 	public WebElement firstname;
	
	@FindBy(css = "input[data-hook='.lastName']")
 	public WebElement lastname;
	
	@FindBy(css = "input[data-hook='.dateOfBirth']")
 	public WebElement dob;
	
	@FindBy(css = "select[data-hook='.gender']")
 	public WebElement gender;
	
	@FindBy(css = "select[data-hook='.licenceType']")
 	public WebElement licenceType;
	
	@FindBy(css = "input[data-hook='.licenceNumber']")
 	public WebElement licenceNumber;
	
	@FindBy(css = "select[data-hook='.maritalStatus']")
 	public WebElement maritalStatus;
	
	@FindBy(css = "select[data-hook='.residentialStatus']")
 	public WebElement residentialStatus;
	
	@FindBy(css = "input[data-hook='.numberOfDependants']")
 	public WebElement numberOfDependants;
	
	@FindBy(css = "input[data-hook='.tradeName']")
 	public WebElement tradeName;
	
	@FindBy(css = "input[data-hook='.establishedYear']")
 	public WebElement establishedYear;
	
	@FindBy(css = "input[data-hook='.monthsEstablished']")
 	public WebElement monthsEstablished;
	
	@FindBy(css = "select[data-hook='.businessTypeCode']")
 	public WebElement businessTypeCode;
	
	@FindBy(css = "select[data-hook='.businessSubTypeCode']")
 	public WebElement businessSubTypeCode;
	
	@FindBy(css = "input[data-hook='.natureOfBusiness']")
 	public WebElement natureOfBusiness;
	
	@FindBy(css = "input[data-hook='.taxNum']")
 	public WebElement taxNum;
	
	@FindBy(css = "input[data-hook='.annualIncome']")
 	public WebElement annualIncome;
	
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
	
	@FindBy(css = "select[name='contactConsentDetails.consentQuestions.questions[0].customerConsentAnswer']")
	public WebElement contest1 ;
	
	@FindBy(css = "select[name='contactConsentDetails.consentQuestions.questions[1].customerConsentAnswer']")
	public WebElement contest2 ;
	
	@FindBy(css = "select[name='contactConsentDetails.consentQuestions.questions[2].customerConsentAnswer']")
 	public WebElement contest3 ;
	
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
	
	@FindBy(css = "input[name='businessAddress.streetNumber']")
	public WebElement streetNumber ;
	
	@FindBy(css = "input[name='businessAddress.zipPostal']")
	public WebElement zipPostal ;
	
	@FindBy(css = "input[name='businessAddress.streetName']")
	public WebElement streetName ;
	
		
	@FindBy(css = "input[name='businessAddress.timeAtAddressYears']")
	public WebElement timeAtAddressYears ;
	
	@FindBy(css = "input[name='businessAddress.timeAtAddressMonths']")
	public WebElement timeAtAddressMonths ;
	
	
	@FindBy(css = "button[data-hook='customercapture.save']")
	public WebElement SaveButton ;
	
	
	public SoleTrader()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void newProposal()
	{
		clickon(driver,newProposal2,40);
		//newProposal.click();
	}
	

	public void dpaAgreement()
	{
		clickon(driver,Accept2,50);
	}
	

	public void customerType()
	{
		Select customerType1 = new Select(customerType);
		customerType1.selectByVisibleText("Sole Trader");
	}
	
	public void buttn()
	{
		EnterDetail.click();
	}
	
	
	public void title()
	{
		Select title1 = new Select(title);
		title1.selectByIndex(2);
	}
	
	public void firstName(String firstName1)
	{
		firstname.sendKeys(firstName1);
	}
	
	public void lastName(String lastName1)
	{
		lastname.sendKeys(lastName1);
	}

	public void dateOfBirth(String dateOfBirth1)
	{
		dob.sendKeys(dateOfBirth1);
	}
	
	public void gender()
	{
		Select gender1 = new Select(gender);
		gender1.selectByIndex(2);
	}
	
	public void license()
	{
		Select license1 = new Select(licenceType);
		license1.selectByVisibleText("DVLA Full");
	}
	
	
	public void maritalStatus()
	{
		Select maritalStatus1 = new Select(maritalStatus);
		maritalStatus1.selectByVisibleText("Married");
	}
	
	public void residentialStatus()
	{
		Select residentialStatus1 = new Select(residentialStatus);
		residentialStatus1.selectByVisibleText("Rents");
	}
	
	public void dependant(String depend)
	{
		numberOfDependants.sendKeys(depend);
	}
	
	  public void TradeName(String TradeName1 )
	    {
	    	
		  tradeName.sendKeys(TradeName1); 	
	    }
	
	public void year(String Years,String Months)
	{
		establishedYear.sendKeys(Years);
		monthsEstablished.sendKeys(Months);
	}
	
	   public void businesstype(String natureBusiness1,String annualIncome1,String VATno1)
	    {
	    	Select businesstype1 = new Select(businessTypeCode);
	    	businesstype1.selectByVisibleText("DA Manufacture of Food; Beverages & Tobacco");
	    	
	       	Select businesssubtype1 = new Select(businessSubTypeCode);
	       	businesssubtype1.selectByVisibleText("Production meat & poultry products");
	       	
	       	natureOfBusiness.sendKeys(natureBusiness1);
	       	annualIncome.sendKeys(annualIncome1);
        	taxNum.sendKeys(VATno1);
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

		public void contest1()
		{
			Select contest2 = new Select(contest1);
			contest2.selectByIndex(2);
		}
		
		public void contest2()
		{
			Select contest3 = new Select(contest2);
			contest3.selectByIndex(2);
		}
		
		public void contest3()
		{
			Select contest4 = new Select(contest3);
			contest4.selectByIndex(2);
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

		public void BusinessgAddressstreetNumber(String streetNumber1)
		{
			streetNumber.sendKeys(streetNumber1);
		}
		
		public void BusinesszipPostale1(String zipPostal1)
		{
			zipPostal.sendKeys(zipPostal1);
		}
		
		public void BusinessstreetName(String streetName1)
		{
			streetName.sendKeys(streetName1);
		}
		public void year1(String Years,String Months)
		{
			timeAtAddressYears.sendKeys(Years);
			timeAtAddressMonths.sendKeys(Months);
		}
		
	
			
		public void SaveButton()
		{
			Screenshot screenshot  = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
			try {
				ImageIO.write(screenshot .getImage(), "PNG", new File("C:\\Users\\psrivastava\\Documents\\Selenium\\cucumber\\Screenshot\\Proposal_SoleTrader.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SaveButton.click();
		}
		}
		
		

	