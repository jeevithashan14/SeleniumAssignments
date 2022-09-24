package com.leaftaps.ui.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class DuplicateLeadPage extends BaseClass {

    public DuplicateLeadPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public DuplicateLeadPage getTitle() {
	assertTrue(driver.getTitle().contains("Duplicate Lead | opentaps CRM"));
	return this;
    }

    public ViewLeadPage clickCreateLeadBtn() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
    }

}
