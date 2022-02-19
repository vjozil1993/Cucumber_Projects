package adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	

	
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement passwd;
	
	@FindBy(id = "login")
	private WebElement login;

	public WebDriver driver;

	public Login_Page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	

}
