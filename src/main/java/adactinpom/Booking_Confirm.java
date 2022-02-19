package adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm {
	
	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement myitinary;
	
	@FindBy(partialLinkText = "Logout")
	private WebElement logoutpage;

	public WebDriver driver;

	public Booking_Confirm(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}
	

	public WebElement getMyitinary() {
		return myitinary;
	}

	public WebElement getLogoutpage() {
		return logoutpage;
	}
	
	
	

}
