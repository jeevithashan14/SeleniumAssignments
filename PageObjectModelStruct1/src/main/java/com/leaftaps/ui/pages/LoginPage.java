package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.BaseClass;

public class LoginPage extends BaseClass {

    public LoginPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
    }

    public LoginPage enterUserName(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
	//LoginPage LoginPage = new LoginPage(); - object creation
	//return LoginPage; 
	//return new LoginPage();
	return this;
    }

    public LoginPage enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
	return this;
    }

    public WelcomePage clickLogin_Positive() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage(driver);
    }
    
    public LoginPage clickLogin_Negative() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return this;
    }
}
