package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class FindLeadsPage extends BaseClass {

    public FindLeadsPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public FindLeadsPage clickNameAndID() {
	driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
	return this;
    }

    public FindLeadsPage clickPhone() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
    }

    public FindLeadsPage enterPhoneNumber(String phoneNumber) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	return this;
    }

    public void enterLeadID() {
	WebElement enterLeadIDVlaue = driver
		.findElement(By.xpath("//label[text()='Lead ID:']/following-sibling::div/input"));
	ViewLeadPage viewLeadPage = new ViewLeadPage(driver);
	String generatedLeadID = viewLeadPage.generatedLeadID();
	enterLeadIDVlaue.sendKeys(generatedLeadID);
    }

    public FindLeadsPage enterFirstName(String firstName) {
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
	return this;
    }

    public FindLeadsPage clickFindLeadsBtn() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	return this;
    }

    public ViewLeadPage clickLeadID() throws InterruptedException {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	Thread.sleep(1000);
	return new ViewLeadPage(driver);
    }
    
    public MergeLeadsPage clickLeadIDMerge() throws InterruptedException {
   	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
   	Thread.sleep(1000);
   	return new MergeLeadsPage(driver);
       }

}
