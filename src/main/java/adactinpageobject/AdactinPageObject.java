package adactinpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import adactinpom.Booking_Confirm;
import adactinpom.Hotel_Book;
import adactinpom.Login_Page;
import adactinpom.Search_Hotel;
import adactinpom.Select_Hotel;

public class AdactinPageObject {

	public  WebDriver driver;

	private Login_Page login;

	private Search_Hotel searchhotel;

	private Select_Hotel hotelselect;

	private Hotel_Book bookhotel;
	
	private Booking_Confirm confirmbook;

	public AdactinPageObject(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Login_Page getLogin() {
		login = new Login_Page(driver);
		return login;
	}

	public Search_Hotel getSearchhotel() {
		searchhotel = new Search_Hotel(driver);
		return searchhotel;
	}

	public Select_Hotel getHotelselect() {
		hotelselect = new Select_Hotel(driver);
		return hotelselect;
	}

	public Hotel_Book getbookhotel() {
		bookhotel = new Hotel_Book(driver);
		return bookhotel;
	}
	
	public Booking_Confirm getconfirmbook() {
		
		confirmbook = new Booking_Confirm(driver);
		return confirmbook;
	}

}
