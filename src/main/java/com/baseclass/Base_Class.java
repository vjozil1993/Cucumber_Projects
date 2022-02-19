package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	// browser
	public static WebDriver getDriver(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\drivers\\firefoxdriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		return driver;

	}

	// url
	public static void getUrl(String url) {
		driver.get(url);
	}

	// click

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	// inputValues

	public static void inputValues(WebElement element, String values) {

		element.sendKeys(values);

	}

	// clear
	public static void clear(WebElement element) {
		element.clear();

	}

	// dropDown

	public static void dropDown(String type, WebElement element, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byText")) {

			s.selectByVisibleText(value);

		} else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}

	}
	
	//quit
	
	public static void qiut() {
driver.quit();
		
	}
	
	//close
	
	public static void close() {
		driver.close();

	}
	

}
