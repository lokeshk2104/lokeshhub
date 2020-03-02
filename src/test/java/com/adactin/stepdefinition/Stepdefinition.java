package com.adactin.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.ProjectObjectManager;
import com.adactin.pom.BookPage;
import com.adactin.pom.Bookstatus;
import com.adactin.pom.CancelPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefinition extends BaseClass{
	
	public static WebDriver sdriver=Runner.driver;
	ProjectObjectManager pom=new ProjectObjectManager(driver);
	
	
/*	LoginPage lp=new LoginPage(sdriver);
	SearchPage sp=new SearchPage(sdriver);
	BookPage bp=new BookPage(sdriver);
	Bookstatus bs=new Bookstatus(sdriver);
	CancelPage cp=new CancelPage(driver);    */
	

	

	

@When("User select the location")
public void user_select_the_location() {
	
	//dropdown(sp.getLocation(), "London", "byvalue");
	
	dropdown(pom.getSp().getLocation(), "London", "byvalue");
	
	
	
}

@When("User select the hotel")
public void user_select_the_hotel() {
	
	//dropdown(sp.getHotel(), "Hotel Sunshine", "byvalue");
	
	dropdown(pom.getSp().getHotel(), "Hotel Sunshine", "byvalue");
    
}

@When("User select the type of room")
public void user_select_the_type_of_room() {
	
	//dropdown(sp.getRoomtype(), "Super Deluxe", "byvalue");
	
	dropdown(pom.getSp().getRoomtype(), "Super Deluxe", "byvalue");
   
}

@When("User select the number of rooms")
public void user_select_the_number_of_rooms() {
	
	//dropdown(sp.getRoomno(), "4", "byvalue");
	
	dropdown(pom.getSp().getRoomno(), "4", "byvalue");
	
	
   
}

@When("User choose the check in date for stay in hotel")
public void user_choose_the_check_in_date_for_stay_in_hotel() {
	
	//clear(sp.getDatein());
	//inputvalueonelement(sp.getDatein(), "30/02/2020");
	
	clear(pom.getSp().getDatein());
	inputvalueonelement(pom.getSp().getDatein(), "30/02/2020");
	
    
}

@When("User choose the check out date for leave from hotel")
public void user_choose_the_check_out_date_for_leave_from_hotel() {
	
	//clear(sp.getDateout());
	//inputvalueonelement(sp.getDateout(), "05/03/2020");
	
	clear(pom.getSp().getDateout());
	inputvalueonelement(pom.getSp().getDateout(), "05/03/2020");
	
	
    
}

@When("User select number of rooms for adults")
public void user_select_number_of_rooms_for_adults() {
	
	//dropdown(sp.getAdult(), "2", "byindex");
	
	dropdown(pom.getSp().getAdult(), "2", "byindex");
    
}

@When("User select number of rooms for children")
public void user_select_number_of_rooms_for_children() {
	
	//dropdown(sp.getChild(), "3", "byindex");
	
	dropdown(pom.getSp().getChild(), "3", "byindex");
	
	
    
}

@Then("User click on the search button and it should navigates to select hotel page")
public void user_click_on_the_search_button_and_it_should_navigates_to_select_hotel_page() {
	
	//clickonelement(sp.getSearchbtn());
	
	clickonelement(pom.getSp().getSearchbtn());
	
	
    
}


@When("User select the hotel radio button")
public void user_select_the_hotel_radio_button() {
	
	//clickonelement(bp.getHselect());
	
	clickonelement(pom.getBp().getHselect());
	
    }

@Then("User click on continue button and it navigates to booking page")
public void user_click_on_continue_button_and_it_navigates_to_booking_page() {
	
	//clickonelement(bp.getContinuebtn());
	
	clickonelement(pom.getBp().getContinuebtn());
	
    }

@When("User enter the valid first name")
public void user_enter_the_valid_first_name() {
	
	//inputvalueonelement(bp.getFirstname(), "lokesh");
	
	inputvalueonelement(pom.getBp().getFirstname(), "lokesh");
	
    }

@When("User enter the valid last name")
public void user_enter_the_valid_last_name() {
	
	//inputvalueonelement(bp.getLastname(), "k");
	
	inputvalueonelement(pom.getBp().getLastname(), "k");
    
}

@When("User enter the proper billing address")
public void user_enter_the_proper_billing_address() {
	
	//inputvalueonelement(bp.getAddress(), "23/7 lane road newyork");
	
	inputvalueonelement(pom.getBp().getAddress(), "23/7 lane road newyork");
	
    }

@When("User enter the correct credit card number")
public void user_enter_the_correct_credit_card_number() {
	
	//inputvalueonelement(bp.getCardno(), "3623435223564311");
	
	inputvalueonelement(pom.getBp().getCardno(), "3623435223564311");
    
}

@When("User select the type of credit card")
public void user_select_the_type_of_credit_card() {
	
	//dropdown(bp.getCardtype(), "VISA", "byvalue");
	
	dropdown(pom.getBp().getCardtype(), "VISA", "byvalue");
    
}

@When("User select the expiry date of credit card")
public void user_select_the_expiry_date_of_credit_card() {
	
	//dropdown(bp.getMonth(), "5", "byvalue");
	//dropdown(bp.getYear(), "2022", "byvisibletext");
	
	dropdown(pom.getBp().getMonth(), "5", "byvalue");
	dropdown(pom.getBp().getYear(), "2022", "byvisibletext");
	
    
}

@When("User enter the valid CVV number of credit card")
public void user_enter_the_valid_CVV_number_of_credit_card() {
	
	//inputvalueonelement(bp.getCvv(),"5677");
	
	inputvalueonelement(pom.getBp().getCvv(),"5677");
    
}

@Then("User click on book now button and it should navigates to booking confirmation page")
public void user_click_on_book_now_button_and_it_should_navigates_to_booking_confirmation_page() {
	
	//clickonelement(bp.getBooknowbtn());
	
	clickonelement(pom.getBp().getBooknowbtn());
    
}

@Then("User click on my ltinerary button and it navigate to booked hotel status")
public void user_click_on_my_ltinerary_button_and_it_navigate_to_booked_hotel_status() {
	
	
	//clickonelement(bs.getItinerary());
	
	clickonelement(pom.getBs().getItinerary());
    
}

@When("User cancel the booked hotel by selecting the check box button")
public void user_cancel_the_booked_hotel_by_selecting_the_check_box_button() {
	
	//checkbox(cp.getCselect(), "value", "333252");
	
	checkbox(pom.getCp().getCselect(), "value", "333252");
	
    
}

@Then("User click on cancel selected button and selected hotel will be cancelled")
public void user_click_on_cancel_selected_button_and_selected_hotel_will_be_cancelled() {
	
	//clickonelement(cp.getCancel());
	
	clickonelement(pom.getCp().getCancel());
	
	alert("ok", null);
    
}

@Then("User click on logout button and will be terminated from session")
public void user_click_on_logout_button_and_will_be_terminated_from_session()
{

    //clickonelement(cp.getLogout());
	
	clickonelement(pom.getCp().getLogout());


}







}
