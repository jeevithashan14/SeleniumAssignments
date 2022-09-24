package com.leaftaps.ui.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class WelcomePage extends BaseClass {

    public WelcomePage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public HomePage clickCRMSFA() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new HomePage(driver);
    }

    public LoginPage clickLogout() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new LoginPage(driver);
    }

    public WelcomePage verifyWelcomeText() {
	String verifyWelcomeText = driver.findElement(By.xpath(
		"//h2[br[preceding-sibling::node()[1] = 'Welcome '] [starts-with(following-sibling::node()[1], 'Test Sales Manager')]]"))
		.getText();
	if (verifyWelcomeText.equalsIgnoreCase("Welcome Test Sales Manager")) {
	    System.out.println("Welcome Text is as expected");
	} else {
	    System.out.println("Welcome Text is NOT as expected");
	}
	return this;
    }

    public WelcomePage getTitle() {
	assertTrue(driver.getTitle().contains("Leaftaps - TestLeaf Automation Platform"));
	return this;
    }

}
