package assignments.week7.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignments.week7.day1.ui.baseclass.BaseClass;

public class CreateLead extends BaseClass {
    @BeforeTest(alwaysRun = true)
    public void setData() {
	excelFileName =  "tc_CreateLeadData";
    }

    @Test(dataProvider = "sendData", invocationCount=3,groups="regression")
    public void runCreateLead(String userName, String password, String cName, String fName, String lName) {
	/*
	 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 */

	driver.findElement(By.id("username")).sendKeys(userName);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	driver.findElement(By.name("submitButton")).click();
	// driver.close();
    }

}
