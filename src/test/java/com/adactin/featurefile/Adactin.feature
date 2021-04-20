Feature: Hotel Booking In Adactin Application

Scenario: Home Page Module
Given Launch Application
When Enter The Username  In Username Field
And Enter The Password In Password Field
Then Click Login Button And It Navigate To The Search Hotel  Page
	
	
Scenario: Search Hotel
When Select Location
And Select Hotel
And Select Room Type
And Select No. Of Rooms
And Select Check In Date
And Select Check Out Date
And Select No. Of Adults
And Select No. Of Children
Then Search Hotel and It Navigate To The Select Hotel Page

Scenario: User Select Hotel
When Hotel Select
Then Click Submit Button And It Navigate To The Book A Hotel Page

Scenario: User Book A Hotel
When Enter User First Name
And Enter User Last Name
And Enter User Address
And Enter Credit Card Number
And Enter Credit Card Type
And Enter Card Expiry Date
And Enter Card Expiry Year
And Enter CVV Number
Then Click Book Now Button and It Navigate to

Scenario: Booking Confirmation Details
Then Click Logout Button And It Navigate To The Home Page