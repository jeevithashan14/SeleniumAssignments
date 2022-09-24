package com.leaftaps.ui.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.BaseClass;
import com.leaftaps.ui.pages.LoginPage;


public class TC_DuplicateLead extends BaseClass {
    @BeforeTest
    public void setData() {
	excelFileName = "tc_DuplicateLeadData";
    }

    @Test(dataProvider = "sendData")
    public void runDuplicateLead(String username, String password, String phoneNumber) throws InterruptedException {
       
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLogin_Positive()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLeads()
	.clickPhone()
	.enterPhoneNumber(phoneNumber)
        .clickFindLeadsBtn()        
        .clickLeadID()
        .clickDuplicateLeadBtn()
        .clickCreateLeadBtn();
       
    }
}
