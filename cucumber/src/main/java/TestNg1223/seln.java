package TestNg1223;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.customerCapture;
import pageObject.loginPage;
import util.Testbase;

public class seln extends Testbase {
	loginPage LoginPage ;
	customerCapture CC;

	@BeforeTest
	   public void setup()
	{
		Testbase.initialization();
		loginPage LoginPage = new loginPage();
		CC =	LoginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void new_proposal()
	{
		CC.newProposal();
	}
	
	@Test(priority=2)
	public void DPA_Agreement()
	{
		CC.newProposal();
	}
	
	@Test(priority=3)
	public void Mandatory() throws InterruptedException
	{
		CC.customerType();
		CC.buttn();
		CC.title();
		CC.firstName("First");
		CC.lastName("Last name");
		CC.dateOfBirth("30/08/2000");
		CC.gender();
		CC.maritalStatus();
		CC.residentialStatus();
		CC.email("test@gmail.com");
		CC.phonestype0();
		CC.phones0("89656565656");
		CC.phonestype1();
		CC.phones1("896565656265");
		CC.contest1();
		CC.contest2();
		CC.contest3();
		CC.currentAddressstreetNumber("74");
		CC.currentAddresszipPostal("6789");
		CC.currentAddressstreetName("ikujik");
	    CC.currentAddresstimeAtAddressYears("7");
		CC.currentAddresstimeAtAddressMonths("6");
		CC.invoiceAddressstreetName("Invoice");
		CC.invoiceAddressstreetNumber("9");
		CC.invoiceAddresszipPostal("8596");
		CC.mailingAddressstreetName("mailing");
		CC.mailingAddressstreetNumber("9");
		CC.mailingAddresszipPostal("7896");
		CC.employmentType();
		Thread.sleep(8000);
		CC.employmentStatus();
		Thread.sleep(8000);
		CC.occupation();
		CC.jobTitle("ploiko");
		CC.employer("ujikil");
		CC.start("7/12/1990");
		CC.end("12/12/2003");
		CC.employersAddressstreetName("9878");
		CC.employersAddresszipPostal("7878");
		CC.employersAddressstreetNumber("8526");
	}
	
	@AfterTest
	public void teardown()
	{
		
	}
}
