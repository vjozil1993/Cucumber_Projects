package adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Book {
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement billingaddress;
	
	@FindBy(id = "cc_num")
	private WebElement creditcardno;
	
	@FindBy(id = "cc_type")
	private WebElement creditcardtype;
	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement ccvcardnumber;
	
	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebDriver driver;

	public Hotel_Book(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCcvcardnumber() {
		return ccvcardnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	
	

}
