package com.leaftaps.ui.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.BaseClass;
import com.leaftaps.ui.pages.LoginPage;


public class TC_CreateLead extends BaseClass {
    @BeforeTest
    public void setData() {
	excelFileName = "tc_CreateLeadData";
    }

    @Test(dataProvider = "sendData")
    public void runCreateLead(String username, String password, String cName, String fName, String lName,
	    String phoneNumber) {

	new LoginPage(driver).enterUserName(username).enterPassword(password).clickLogin_Positive().clickCRMSFA()
		.clickLeads().clickCreateLead().enterCompanyName(cName).enterFirstName(fName).enterLastName(lName)
		.enterPhoneNumber(phoneNumber).clickCreateLeadBtn().generatedLeadID();

    }
}
