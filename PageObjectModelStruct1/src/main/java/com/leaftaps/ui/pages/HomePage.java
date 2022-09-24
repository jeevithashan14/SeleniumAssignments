package com.leaftaps.ui.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class HomePage extends BaseClass {

    public HomePage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public LeadsPage clickLeads() {
	driver.findElement(By.linkText("Leads")).click();
	return new LeadsPage(driver);
    }

    public HomePage getTitle() {
	assertTrue(driver.getTitle().contains("My Home | opentaps CRM"));
	return this;
    }

}
