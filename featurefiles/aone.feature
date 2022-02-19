Feature: Adactin Hotel Booking App
Scenario: Check Login Page Of Adactin Home Page
Given user Already Launch The Application
When user Enters Username In The Username Field
And user Enters Password In The Password Field
Then user Click On Login Button And Navigates To Search Hotel


Scenario: Hotel Search
When user Select Location
And user Select Hotels
And user Select RoomType
And user Select Number Of Rooms
And user Select CheckInDate
And user Select CheckOutDate
And user Select Adults Per Room
And user Select Childrens Per Room
Then user Click On Search Button And Navigates To Select Hotel Page

Scenario: Select Hotel 
When user Clicks On RadioButton
And user Click On Continue Button Navigates To Book Hotel

Scenario: Book A Hotel
When user Enters Firstname
And user Enters Lastname
And user Enters Billing Address
And user Enters CreditCardNumber
And user Credit Card Type
And user Selects Expiry Month
And user Selects Expiry Year
And user Selects CCV Number
Then user Click Book Now Button And Navigates To Booking COnfirmation Page

Scenario: Confirmation Booking
Then user Click On My Itinary Button It Navigates To Booked Itinary Page

Scenario: Itinary Booking
Then user Click On Logout Button And Navigates TO Logout Page

