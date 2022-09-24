package com.leaftaps.ui.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class EditLeadPage extends BaseClass {

    public EditLeadPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public EditLeadPage getTitle() {
	assertTrue(driver.getTitle().contains(" opentaps CRM"));
	return this;
    }

    public EditLeadPage enterCompanyName(String cName) {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
	return this;
    }

    public ViewLeadPage clickUpdateBtn() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
    }

}
