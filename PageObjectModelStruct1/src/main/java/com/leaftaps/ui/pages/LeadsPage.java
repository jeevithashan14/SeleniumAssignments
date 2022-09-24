package com.leaftaps.ui.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class LeadsPage extends BaseClass {

    public LeadsPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public LeadsPage getTitle() {
	assertTrue(driver.getTitle().contains("My Leads | opentaps CRM"));
	return this;
    }

    public CreateLeadPage clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
    }

    public FindLeadsPage clickFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	return new FindLeadsPage(driver);
    }
    
    public MergeLeadsPage clickMergeLeads() {
	driver.findElement(By.linkText("Merge Leads")).click();
	return new MergeLeadsPage(driver);
    }

}
