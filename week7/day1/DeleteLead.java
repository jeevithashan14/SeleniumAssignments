package assignments.week7.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignments.week7.day1.ui.baseclass.BaseClass;

public class DeleteLead extends BaseClass {

    @BeforeTest(alwaysRun = true)
    public void setData() {
	excelFileName = "tc_DeleteLeadData";
    }

    @Test(dataProvider="sendData", enabled = true, groups="smoke")
    public void runDeleteLead(String userName, String password, String phoneNumber) throws InterruptedException {

	/*
	 WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
	 ChromeDriver(); driver.manage().window().maximize();
	 driver.get("http://leaftaps.com/opentaps/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 */
	driver.findElement(By.id("username")).sendKeys(userName);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
		.getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
	    System.out.println("Text matched");
	} else {
	    System.out.println("Text not matched");
	}
	// driver.close();

    }
}
