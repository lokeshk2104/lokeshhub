Feature: Hotel booking functionality in adactin application

@loginwithexamples
Scenario Outline: User validate the login function using valid username1 and password1
Given User launch the adactin application
When User enter the username1 "<username>"
And User enter the password1 "<password>"
Then User click on the login button1 and it should navigate to search hotel page

Examples:

|username|password|
|aaaaaa|kkkkkkk|
|lokesh11|lokesh11|
|aaaaaa|kkkkkkk|
|lokesh11|lokesh11|


@login
Scenario: User validate the login function using valid username and password
Given User launch the adactin application
When User enter the username
And User enter the password
Then User click on the login button and it should navigate to search hotel page


@searchhotel
Scenario: User validate the search function with mandatory fields
When User select the location
And User select the hotel
And User select the type of room
And User select the number of rooms 
And User choose the check in date for stay in hotel
And User choose the check out date for leave from hotel
And User select number of rooms for adults
And User select number of rooms for children
Then User click on the search button and it should navigates to select hotel page


@bookhotel
Scenario: User validate the booking function using valid user details
When User select the hotel radio button
Then User click on continue button and it navigates to booking page
When User enter the valid first name
And User enter the valid last name
And User enter the proper billing address
And User enter the correct credit card number
And User select the type of credit card
And User select the expiry date of credit card
And User enter the valid CVV number of credit card
Then User click on book now button and it should navigates to booking confirmation page


@itinerary
Scenario: User validate the booked hotel information status using valid username and password
Then User click on my ltinerary button and it navigate to booked hotel status

@cancelhotel
Scenario: User validate the cancel hotel function using valid username and password
When User cancel the booked hotel by selecting the check box button
Then User click on cancel selected button and selected hotel will be cancelled
Then User click on logout button and will be terminated from session