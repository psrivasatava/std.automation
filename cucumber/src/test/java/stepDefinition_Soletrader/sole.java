package stepDefinition_Soletrader;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.SoleTrader;
import pageObject.activation;
import pageObject.createQuote;
import pageObject.document;
import pageObject.loginPage;
import pageObject.loginPage_soleTrader;
import pageObject.submit;
import pageObject.updateScreen;
import util.Testbase;

public class sole extends Testbase{
	loginPage LoginPage ;
	SoleTrader ST;
	

	@Given("^User open browser$")
	public void User_open_browser() throws Throwable {	
	Testbase.initialization();
	}
	
	@When("User enter user name and password$")
	public void User_enter_user_name_and_password() throws Throwable{
		loginPage_soleTrader LoginPage1 = new loginPage_soleTrader();
	ST =	LoginPage1.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

@Then("^User enter new proposal option$")
public void user_enter_new_proposal_option() throws Throwable {
	ST.newProposal();
    
}

@Then("^User accept DPA Agreement$")
public void user_accept_DPA_Agreement() throws Throwable {
	Thread.sleep(8000);
	ST.dpaAgreement();
    
}

@Then("^User enter all mandatory answers$")
public void user_enter_all_mandatory_answers() throws Throwable {
	ST.customerType();
	ST.buttn();
	ST.title();
	ST.firstName("Fisrt");
	ST.lastName("last");
	ST.dateOfBirth("30/35/1980");
	ST.gender();
	ST.license();
	ST.maritalStatus();
	ST.residentialStatus();
	ST.dependant("12");
	ST.TradeName("edrft");
	ST.year("7","6");
	ST.businesstype("tgyhh", "100020", "859623");
	ST.email("test@gmauil.com");
	ST.phonetype0();
	ST. phones0("452363636");
	ST.phonestype1();
	ST.phones1("7895632452");
	ST.contest1();
	ST.contest2();
	ST.contest3();
	ST.currentAddressstreetNumber("74");
	ST.currentAddresszipPostal("6789");
	ST.currentAddressstreetName("ikujik");
	ST.currentAddresstimeAtAddressYears("7");
	ST.currentAddresstimeAtAddressMonths("6");
	ST.invoiceAddressstreetName("Invoice");
	ST.invoiceAddressstreetNumber("9");
	ST.invoiceAddresszipPostal("8596");
	ST.mailingAddressstreetName("mailing");
	ST.mailingAddressstreetNumber("9");
	ST.mailingAddresszipPostal("7896");
	ST.BusinessgAddressstreetNumber("45");
	ST.BusinesszipPostale1("7895");
	ST.BusinessstreetName("wse");
	ST.year1("7", "6");
	
	
}

@Then("^User save the form$")
public void user_save_the_form() throws Throwable {
ST.SaveButton();
 
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