$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/aone.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking App",
  "description": "",
  "id": "adactin-hotel-booking-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Check Login Page Of Adactin Home Page",
  "description": "",
  "id": "adactin-hotel-booking-app;check-login-page-of-adactin-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user Already Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enters Username In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enters Password In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click On Login Button And Navigates To Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinOne.user_Already_Launch_The_Application()"
});
formatter.result({
  "duration": 16785695800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Enters_Username_In_The_Username_Field()"
});
formatter.result({
  "duration": 1252933800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Enters_Password_In_The_Password_Field()"
});
formatter.result({
  "duration": 389821300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Click_On_Login_Button_And_Navigates_To_Search_Hotel()"
});
formatter.result({
  "duration": 3271443400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Hotel Search",
  "description": "",
  "id": "adactin-hotel-booking-app;hotel-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user Select Location",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select Hotels",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select RoomType",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select CheckInDate",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select CheckOutDate",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select Childrens Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Click On Search Button And Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinOne.user_Select_Location()"
});
formatter.result({
  "duration": 440834600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Select_Hotels()"
});
formatter.result({
  "duration": 419175700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Select_RoomType()"
});
formatter.result({
  "duration": 336664000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Select_Number_Of_Rooms()"
});
formatter.result({
  "duration": 273226800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Select_CheckInDate()"
});
formatter.result({
  "duration": 320242500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Select_CheckOutDate()"
});
formatter.result({
  "duration": 366433800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Select_Adults_Per_Room()"
});
formatter.result({
  "duration": 314951500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Select_Childrens_Per_Room()"
});
formatter.result({
  "duration": 279261000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Click_On_Search_Button_And_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 4439567000,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Select Hotel",
  "description": "",
  "id": "adactin-hotel-booking-app;select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user Clicks On RadioButton",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Click On Continue Button Navigates To Book Hotel",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinOne.user_Clicks_On_RadioButton()"
});
formatter.result({
  "duration": 258193000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Click_On_Continue_Button_Navigates_To_Book_Hotel()"
});
formatter.result({
  "duration": 1531750000,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Book A Hotel",
  "description": "",
  "id": "adactin-hotel-booking-app;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user Enters Firstname",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Enters Lastname",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Enters Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Enters CreditCardNumber",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Selects Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Selects Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Selects CCV Number",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Click Book Now Button And Navigates To Booking COnfirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinOne.user_Enters_Firstname()"
});
formatter.result({
  "duration": 516443600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Enters_Lastname()"
});
formatter.result({
  "duration": 317897000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Enters_Billing_Address()"
});
formatter.result({
  "duration": 341729000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Enters_CreditCardNumber()"
});
formatter.result({
  "duration": 380705700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Credit_Card_Type()"
});
formatter.result({
  "duration": 316084000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Selects_Expiry_Month()"
});
formatter.result({
  "duration": 394722900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Selects_Expiry_Year()"
});
formatter.result({
  "duration": 376848600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Selects_CCV_Number()"
});
formatter.result({
  "duration": 384246100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinOne.user_Click_Book_Now_Button_And_Navigates_To_Booking_COnfirmation_Page()"
});
formatter.result({
  "duration": 229475500,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Confirmation Booking",
  "description": "",
  "id": "adactin-hotel-booking-app;confirmation-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "user Click On My Itinary Button It Navigates To Booked Itinary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinOne.user_Click_On_My_Itinary_Button_It_Navigates_To_Booked_Itinary_Page()"
});
formatter.result({
  "duration": 3498897700,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Itinary Booking",
  "description": "",
  "id": "adactin-hotel-booking-app;itinary-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "user Click On Logout Button And Navigates TO Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinOne.user_Click_On_Logout_Button_And_Navigates_TO_Logout_Page()"
});
formatter.result({
  "duration": 1366569200,
  "status": "passed"
});
});