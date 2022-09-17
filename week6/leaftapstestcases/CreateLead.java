package assignments.week6.leaftapstestcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignments.week6.com.leaftaps.ui.base.BaseClass;

public class CreateLead extends BaseClass {
    @BeforeTest
    public void setData() {
	excelFileName = "tc_CreateLeadData";
    }

    @Test(dataProvider = "sendData")
    public void runCreateLead(String username, String password, String cName, String fName, String lName) {

	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	driver.findElement(By.name("submitButton")).click();

    }
}
