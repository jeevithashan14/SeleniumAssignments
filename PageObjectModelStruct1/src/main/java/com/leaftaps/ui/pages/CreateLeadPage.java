package com.leaftaps.ui.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class CreateLeadPage extends BaseClass {

    public CreateLeadPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public CreateLeadPage getTitle() {
	assertTrue(driver.getTitle().contains("Create Lead | opentaps CRM"));
	return this;
    }

    public CreateLeadPage enterCompanyName(String cName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	return this;
    }

    public CreateLeadPage enterFirstName(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	return this;
    }

    public CreateLeadPage enterLastName(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	return this;
    }

    public CreateLeadPage enterPhoneNumber(String phoneNumber) {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
	return this;
    }

    public ViewLeadPage clickCreateLeadBtn() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
    }

}
