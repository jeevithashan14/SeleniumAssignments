package com.leaftaps.ui.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.leaftaps.ui.base.BaseClass;

public class ViewLeadPage extends BaseClass{  
  
    
    public ViewLeadPage(RemoteWebDriver receivedDriver) {   
	this.driver = receivedDriver;
       }
    
    public ViewLeadPage getTitle() {
   	assertTrue(driver.getTitle().contains("View Lead | opentaps CRM"));
   	return this;
       }
    
   
    public String generatedLeadID() {
	String[] xpathParts = new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("viewLead_companyName_sp"))).getText().split(" ");
	String getLeadIDValue = xpathParts[1].replaceAll("\\(", "").replaceAll("\\)", "");
	//int LeadIDValue = Integer.parseInt(getLeadIDVal);
	System.out.println(getLeadIDValue);
	return getLeadIDValue;
       }
    
    public EditLeadPage clickEditBtn() {
	driver.findElement(By.linkText("Edit")).click();
	return new EditLeadPage(driver);
    }
    
    public LeadsPage clickDeleteBtn() {
   	driver.findElement(By.linkText("Edit")).click();
   	return new LeadsPage(driver);
       }
    
    public DuplicateLeadPage clickDuplicateLeadBtn() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
   	return new DuplicateLeadPage(driver);
       }
    
   /* public void setLeadID(String LeadIDValue) {
	this.LeadIDValue=LeadIDValue;
    }*/


}
