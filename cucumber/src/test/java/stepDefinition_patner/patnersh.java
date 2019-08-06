package stepDefinition_patner;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.activation;
import pageObject.createQuote;
import pageObject.customerCapture;
import pageObject.document;
import pageObject.loginPage;
import pageObject.loginPage_patner;
import pageObject.patnership;
import pageObject.submit;
import pageObject.updateScreen;
import util.Testbase;

public class patnersh extends Testbase{
	loginPage LoginPage ;
	patnership PP;
	

	@Given("^User open browser$")
	public void User_open_browser() throws Throwable {	
	Testbase.initialization();
	}
	
	@When("User enter user name and password$")
	public void User_enter_user_name_and_password() throws Throwable{
		loginPage_patner LoginPage1 = new loginPage_patner();
	PP =	LoginPage1.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

@Then("^User enter new proposal option$")
public void user_enter_new_proposal_option() throws Throwable {
	PP.newProposal();
    
}

@Then("^User accept DPA Agreement$")
public void user_accept_DPA_Agreement() throws Throwable {
	Thread.sleep(8000);
	PP.dpaAgreement();
    
}

@Then("^User enter all mandatory answers$")
public void user_enter_all_mandatory_answers() throws Throwable {
	PP.customerType();
	PP.EnterDetail();
	PP.CompanyInformation("Compnay12","Trade1");
//	Thread.sleep(5000);
	PP.busine();
	PP.businesstype("natureBusiness1","01/06/1990","6","3");
	PP.email("test@gmauil.com");
	PP.phonetype0();
	PP. phones0("7895632452");
	PP.phonestype1();
	PP.phones1("7895632452");
	PP.contactMethod1("Main","7895632452");
	PP.currentAddressstreetNumber("74");
	PP.currentAddresszipPostal("6789");
	PP.currentAddressstreetName("ikujik");
    PP.currentAddresstimeAtAddressYears("7");
	PP.currentAddresstimeAtAddressMonths("6");
	PP.invoiceAddressstreetName("Invoice");
	PP.invoiceAddressstreetNumber("9");
	PP.invoiceAddresszipPostal("8596");
	PP.mailingAddressstreetName("mailing");
	PP.mailingAddressstreetNumber("9");
	PP.mailingAddresszipPostal("7896");
		
}

@Then("^User save the form$")
public void user_save_the_form() throws Throwable {
PP.SaveButton();
 }



@Then("^User add patner$")
public void User_add_patner()
{
    	PP.Addpatner();
 
}	 

@Then("^User enter patner form$")
public void User_enter_patner_form()
{
	customerCapture CC = new customerCapture();
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
	CC.currentAddressstreetNumber("74");
	CC.currentAddresszipPostal("6789");
	CC.currentAddressstreetName("ikujik");
    CC.currentAddresstimeAtAddressYears("7");
	CC.currentAddresstimeAtAddressMonths("6");
	CC.SaveButton();
}



@Then("^User create a quote$")
public void User_create_a_quote() throws Throwable {
	createQuote CQ = new createQuote();
	Thread.sleep(10000);
	CQ.quote1();
	Thread.sleep(8000);
	CQ.newquote1();
	Thread.sleep(10000);
	CQ.assetselection1();
	Thread.sleep(10000);
	CQ.manufacture1r();
	CQ.model1();
	CQ.variant1();
	CQ.button2();
	Thread.sleep(10000);
	CQ.finance1();
	CQ.search1();
	CQ.productSelect();
	Thread.sleep(10000);
	CQ.save1();
    
}

@Then("^User submit the proposal$")
public void User_submit_the_proposal() throws Throwable {
	submit SB = new submit();
	Thread.sleep(10000);
	SB.submit1();
	Thread.sleep(20000);
	SB.submit2();
}

@Then("^User goto Update screen$")
public void User_goto_Update_screen() throws Throwable {
	updateScreen US = new updateScreen();
	Thread.sleep(10000);
     US.update1();
     US.paymentdate1();
     US.accountHolderName("testing");
     US.bankName("ploki");
     US.accountNumber("123456");
     US.bankSortCode("789456");
     US.zipPostal("7894");
     US.streetNumber("85");
     US.streetName("plok");
     US.city("plokk");
     US.county("oikuj");
     US.timeAtBankYears("8");
     US.timeAtBankMonths("7");
     US.registrationDate("23/08/2018");
     US.registrationNumber("8596323");
     US.odometer("8");
     US.vin("28945612345698444");
     US.orderNumber("1234567859");
     US.serialNumber("12356");
     US.Save();
     Thread.sleep(10000);
     US.SummaryPage();
}

@Then("^User verify the document$")
public void User_verify_the_document() throws Throwable {
	document DO = new document();
	Thread.sleep(10000);
	DO.generate();
	DO.upload();
	DO.verify();
}


@Then("^User Activate the Proposal$")
public void User_Activate_the_Proposal() throws Throwable {
	activation AT = new activation();
	Thread.sleep(10000);
	AT.submit();
	
}

}