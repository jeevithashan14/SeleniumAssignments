package assignments.week7.day1.ui.baseclass;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import assignments.week7.day1.ui.utils.LeafTapsReadExcelData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public RemoteWebDriver driver;
    public String excelFileName;

    @Parameters({"browser","url"})
    @BeforeMethod(alwaysRun = true)
    public void preCondition(String browser, String url) {
	
	if (browser.equalsIgnoreCase("chrome")){
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}
	
	if (browser.equalsIgnoreCase("edge")){
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	}

	driver.manage().window().maximize();
	//driver.get("http://leaftaps.com/opentaps/");
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod(alwaysRun = true)
    public void postCondition() {
	driver.close();
    }
    
    @DataProvider
    public String[][] sendData() throws IOException{
	String[][] data = LeafTapsReadExcelData.getData(excelFileName);
	return data;
    }

}
