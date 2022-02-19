package testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.comfigurationproperty.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles/aone.feature",glue = {"stepdefinitions"},
monochrome = true,
plugin = {"html:cucumber/report1","pretty","json:Report/cucumberreport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:repo/cucu.html"})



public class TONE {
	
	
	
	public static WebDriver driver;

	@BeforeClass
	public static  void setup() throws Throwable {
		
String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();		
driver = Base_Class.getDriver(browser);
	}
	
	
	
	
	@AfterClass
	public static  void finish() {
driver.close();
	}

}
