package adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	
	@FindBy(id = "radiobutton_0")
	private WebElement buttonRadio;
	
	@FindBy(id = "continue")
	private WebElement pageContinue;

	public WebDriver driver;

	public Select_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getButtonRadio() {
		return buttonRadio;
	}

	public WebElement getPageContinue() {
		return pageContinue;
	}
	
	
	

}
