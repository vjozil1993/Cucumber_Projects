package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.comfigurationproperty.File_Reader_Manager;

import adactinpageobject.AdactinPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testrunner.TONE;

public class AdactinOne extends Base_Class{
	
	public static WebDriver driver = TONE.driver;
	
	public static AdactinPageObject pom = new AdactinPageObject(driver);
	
	
	@Given("^user Already Launch The Application$")
	public void user_Already_Launch_The_Application() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getURL();
		
		getUrl(url);
	   
	}

	@When("^user Enters Username In The Username Field$")
	public void user_Enters_Username_In_The_Username_Field() throws Throwable {
		
		inputValues(pom.getLogin().getUsername(), "vjozil1993");
	   
	}

	@When("^user Enters Password In The Password Field$")
	public void user_Enters_Password_In_The_Password_Field() throws Throwable {
		
		inputValues(pom.getLogin().getPasswd(), "67614943vj");
	   
	}

	@Then("^user Click On Login Button And Navigates To Search Hotel$")
	public void user_Click_On_Login_Button_And_Navigates_To_Search_Hotel() throws Throwable {
	 
		clickOnElement(pom.getLogin().getLogin());
		
	}

	@When("^user Select Location$")
	public void user_Select_Location() throws Throwable {
		
		inputValues(pom.getSearchhotel().getLocation(), "Melbourne");
	   
	}

	@When("^user Select Hotels$")
	public void user_Select_Hotels() throws Throwable {
		inputValues(pom.getSearchhotel().getHotel(), "Hotel Sunshine");
	    
	}

	@When("^user Select RoomType$")
	public void user_Select_RoomType() throws Throwable {
		inputValues(pom.getSearchhotel().getRoomtype(), "Deluxe");
	   
	}

	@When("^user Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
		
		inputValues(pom.getSearchhotel().getRoomnumbers(), "4 - Four");
	    
	}

	@When("^user Select CheckInDate$")
	public void user_Select_CheckInDate() throws Throwable {
		inputValues(pom.getSearchhotel().getCheckinDate(), "10/02/2022");
	  
	}

	@When("^user Select CheckOutDate$")
	public void user_Select_CheckOutDate() throws Throwable {
		inputValues(pom.getSearchhotel().getCheckoutDate(), "12/02/2022");
	    
	}

	@When("^user Select Adults Per Room$")
	public void user_Select_Adults_Per_Room() throws Throwable {
		inputValues(pom.getSearchhotel().getAdultroom(), "3 - Three");
	    
	}

	@When("^user Select Childrens Per Room$")
	public void user_Select_Childrens_Per_Room() throws Throwable {
		inputValues(pom.getSearchhotel().getChildroom(), "3 - Three");
	   
	}

	@Then("^user Click On Search Button And Navigates To Select Hotel Page$")
	public void user_Click_On_Search_Button_And_Navigates_To_Select_Hotel_Page() throws Throwable {
	
clickOnElement(pom.getSearchhotel().getSearchnext());		
		
	}

	@When("^user Clicks On RadioButton$")
	public void user_Clicks_On_RadioButton() throws Throwable {
		
clickOnElement(pom.getHotelselect().getButtonRadio());	    
	}

	@When("^user Click On Continue Button Navigates To Book Hotel$")
	public void user_Click_On_Continue_Button_Navigates_To_Book_Hotel() throws Throwable {
	   
		clickOnElement(pom.getHotelselect().getPageContinue());
		
	}

	@When("^user Enters Firstname$")
	public void user_Enters_Firstname() throws Throwable {
		
inputValues(pom.getbookhotel().getFirstname(), "vijayakumar");	  
	}

	@When("^user Enters Lastname$")
	public void user_Enters_Lastname() throws Throwable {
		
		inputValues(pom.getbookhotel().getLastname(), "R");
	    
	}

	@When("^user Enters Billing Address$")
	public void user_Enters_Billing_Address() throws Throwable {
		
		inputValues(pom.getbookhotel().getBillingaddress(), "new Area");
	   
	}

	@When("^user Enters CreditCardNumber$")
	public void user_Enters_CreditCardNumber() throws Throwable {
		
		inputValues(pom.getbookhotel().getCreditcardno(), "1234567812345678");
	    
	}

	@When("^user Credit Card Type$")
	public void user_Credit_Card_Type() throws Throwable {
		
		inputValues(pom.getbookhotel().getCreditcardtype(), "Master Card");
	   
	}

	@When("^user Selects Expiry Month$")
	public void user_Selects_Expiry_Month() throws Throwable {
		inputValues(pom.getbookhotel().getExpirymonth(), "August");
	 
	}

	@When("^user Selects Expiry Year$")
	public void user_Selects_Expiry_Year() throws Throwable {
		
		inputValues(pom.getbookhotel().getExpiryyear(), "2022");
	   
	}

	@When("^user Selects CCV Number$")
	public void user_Selects_CCV_Number() throws Throwable {
		
		inputValues(pom.getbookhotel().getCcvcardnumber(), "123");
	    
	}

	@Then("^user Click Book Now Button And Navigates To Booking COnfirmation Page$")
	public void user_Click_Book_Now_Button_And_Navigates_To_Booking_COnfirmation_Page() throws Throwable {
	
		
		clickOnElement(pom.getbookhotel().getBooknow());
	}
	

	@Then("^user Click On My Itinary Button It Navigates To Booked Itinary Page$")
	public void user_Click_On_My_Itinary_Button_It_Navigates_To_Booked_Itinary_Page() throws Throwable {
	   
		
		clickOnElement(pom.getconfirmbook().getMyitinary());
	}

	@Then("^user Click On Logout Button And Navigates TO Logout Page$")
	public void user_Click_On_Logout_Button_And_Navigates_TO_Logout_Page() throws Throwable {
	   
		clickOnElement(pom.getconfirmbook().getLogoutpage());
		
	}

}
