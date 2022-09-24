package com.leaftaps.ui.pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class MergeLeadsPage extends BaseClass {

    public MergeLeadsPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public MergeLeadsPage getTitle() {
	assertTrue(driver.getTitle().contains("Merge Leads | opentaps CRM"));
	return this;
    }
    
    public FindLeadsPage clickFromLeadLookUpImage() {
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
	return new FindLeadsPage(driver) ;
    }
    
    public FindLeadsPage clickToLeadLookUpImage() {
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
 	Set<String> allWindows = driver.getWindowHandles();
 	List<String> allhandles = new ArrayList<String>(allWindows);
 	driver.switchTo().window(allhandles.get(1));
 	return new FindLeadsPage(driver) ;
     }
    
    public MergeLeadsPage returnMainWindow() {
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(0));
	return this;
    }
    
    public ViewLeadPage clickMergeBtn() {
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
	return new ViewLeadPage(driver);
    }
    
}
