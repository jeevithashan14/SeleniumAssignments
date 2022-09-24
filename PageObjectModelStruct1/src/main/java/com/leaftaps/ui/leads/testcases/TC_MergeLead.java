package com.leaftaps.ui.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.BaseClass;
import com.leaftaps.ui.pages.LoginPage;

public class TC_MergeLead extends BaseClass {
    @BeforeTest
    public void setData() {
	excelFileName = "tc_MergeLeadData";
    }

    @Test(dataProvider = "sendData")
    public void runMergeLead(String username, String password, String firstName, String firstName2) throws InterruptedException {
       
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLogin_Positive()
	.clickCRMSFA()
	.clickLeads()
	.clickMergeLeads()
        .clickFromLeadLookUpImage()
        .enterFirstName(firstName)
        .clickFindLeadsBtn() 
	.clickLeadIDMerge()
	.returnMainWindow()
	.clickToLeadLookUpImage()
	.enterFirstName(firstName2)
	.clickFindLeadsBtn()
	.clickLeadIDMerge()
	.returnMainWindow()
	.clickMergeBtn();
        
    }
}
