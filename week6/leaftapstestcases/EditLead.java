package assignments.week6.leaftapstestcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignments.week6.com.leaftaps.ui.base.BaseClass;

public class EditLead extends BaseClass {
    @BeforeTest
    public void setData() {
	excelFileName = "tc_EditLeadData";
    }

    @Test(dataProvider = "sendData")
	public void runEditLead(String username, String password, String phoneNumber, String companyName) throws InterruptedException {
	
	        driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






