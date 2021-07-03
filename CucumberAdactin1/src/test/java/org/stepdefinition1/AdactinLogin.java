package org.stepdefinition1;

import org.objectrepository.LoginPojo1;
import org.utilities.BaseClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinLogin extends BaseClass1 {
	public LoginPojo1 l1;
	
	@Given("User is in Login Page")
	public void user_is_in_Login_Page() {
		launchBrowser();
		loadhUrl("http://adactinhotelapp.com/");
	    
	}

	@Given("User enter {string}, {string}")
	public void user_enter(String username, String password) {
		l1= new LoginPojo1();
		fill(l1.getTxtusername(),username);
		fill(l1.getTxtPassword(),password);
	   
	}

	@When("User click Login")
	public void user_click_Login() throws InterruptedException {
		LoginPojo1 l2= new LoginPojo1();
		btnClick(l2.getBtnLogin());
		Thread.sleep(5000);

	    
	}

	@When("User is in search page,User enter details for hotel search")
	public void user_is_in_search_page_User_enter_details_for_hotel_search() throws InterruptedException {
		LoginPojo1 l2 =new LoginPojo1();
		selectByVisibleText(l2.getTextlocation(),"Sydney");
		selectByVisibleText(l2.gettxtHotels(),"Hotel Sunshine");
		selectByVisibleText(l2.getRoomType(),"Double");
		Thread.sleep(1000);
		
	    
	}

	@When("User click search button,User click Radio button and click continue")
	public void user_click_search_button_User_click_Radio_button_and_click_continue() {
		LoginPojo1 l2 = new LoginPojo1();
		btnClick(l2.getBtnsubmit());
		btnClick(l2.getSelect());
		btnClick(l2.getCont());
	    
	}

	@Then("User book the hotel by filling {string}, {string},{string}")
	public void user_book_the_hotel_by_filling(String firstname, String lastname, String address) {
		LoginPojo1 l1 = new  LoginPojo1();
		fill(l1.getFirst_name(),firstname);
		fill(l1.getLast_name(),lastname);
		fill(l1.getAddress(),address);
	
	}

	@Then("User pay amount using {string},{string},{string},{string},{string}")
	public void user_pay_amount_using(String cc_num, String cvv, String ccType, String month, String year) {
		 LoginPojo1  l1 = new LoginPojo1();
		fill(l1.getCc_num(),cc_num);
		fill(l1.getCc_cvv(),cvv);
		fill(l1. getCc_type(),ccType);
		fill(l1.getCc_exp_Month(),month);
		fill(l1.getCc_exp_year(),year);
	
	}

	@Then("User click booknow button and id number is generated")
	public void user_click_booknow_button_and_id_number_is_generated() throws InterruptedException {
	    LoginPojo1 l5= new LoginPojo1();
	    btnClick(l5.getBook_now());
	    Thread.sleep(6000);
	    System.out.println("order no= "+getAttribute(l5.getValue()));
	}
}


	