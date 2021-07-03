package org.objectrepository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.utilities.BaseClass1;

	public class LoginPojo1 extends BaseClass1 {
		public LoginPojo1() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(name="username")
		private WebElement txtUsername;
		
		@FindBy(id="password")
		private WebElement txtPassword;
		
		@FindBy(name="login")
		private WebElement btnLogin;

		public WebElement getTxtUsername() {
			return txtUsername;
		}
		@FindBy(id="location")
		private WebElement btnlocation;
		
		@FindBy(id ="hotels")
		private WebElement btnhotels;
		@FindBy(id ="room type")
		private WebElement roomType;
		@FindBy(id ="room_nos")
		private WebElement noOfRooms;
		@FindBy(id ="adult_room")
		private WebElement adults;
		@FindBy(id ="child_room")
		private WebElement childrens;
		
		
		@FindBy(name="submit")
		private WebElement btnsubmit;
		
		@FindBy(id="radiobutton_0")
				private WebElement select;
		@FindBy(id ="continue")
		private WebElement cont;
		@FindBy(id="first_name")
		private WebElement first_name;
		@FindBy(id="last_name")
		private WebElement last_name;
		@FindBy(id="address")
		private WebElement address;
		@FindBy(id="cc_num")
		private WebElement cc_num ;
		@FindBy(id="cc_type")
		private WebElement cc_type;
		public WebElement getFirst_name() {
			return first_name;
		}
		@FindBy(id="cc_exp_month")
		private WebElement cc_exp_Month;
		@FindBy(id="cc_exp_year")
		private WebElement cc_exp_year;
		@FindBy(id="cc_cvv")
		private WebElement cc_cvv;
		@FindBy(id="book_now")
		private WebElement book_now;

		public WebElement getLast_name() {
			return last_name;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCc_num() {
			return cc_num;
		}

		public WebElement getCc_type() {
			return cc_type;
		}

		public WebElement getCc_exp_Month() {
			return cc_exp_Month;
		}

		public WebElement getCc_exp_year() {
			return cc_exp_year;
		}

		public WebElement getCc_cvv() {
			return cc_cvv;
		}

		public WebElement getBook_now() {
			return book_now;
		}

		
		public WebElement getTextlocation() {
			return getTextlocation();
		}

		public WebElement getBtnsubmit() {
			return btnsubmit;
		}

		public void setBtnsubmit(WebElement btnsubmit) {
			this.btnsubmit = btnsubmit;
		}

		public WebElement gettxtHotels() {
			return gettxtHotels();
		}

		public WebElement getTxtusername() {
			return txtUsername;
		}

		public WebElement getTxtPassword() {
			return ss();
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

		public WebElement getRoomType() {
			return roomType;
		}

		public void setRoomType(WebElement roomType) {
			this.roomType = roomType;
		}

		public WebElement getNoOfRooms() {
			return noOfRooms;
		}

		

		public WebElement getAdults() {
			return adults;
		}

		

		public WebElement getChildrens() {
			return childrens;
		}

		

		public WebElement getSelect() {
			return select;
		}

	

		public WebElement getCont() {
			return cont;
		}

	
		
		

		

}
