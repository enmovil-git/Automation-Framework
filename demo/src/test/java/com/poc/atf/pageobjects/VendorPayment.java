package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorPayment {
	
	
	
       	// side menu 
	     @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
		 private WebElement ClickSideMenu;
	   
	     
	  // vendor menu 
	     @FindBy(xpath = ("//span[text()= 'Vendor Payment Reconcilliation']"))
		 private WebElement ClickVendorPaymentReconcilliationMenu;
	     
	     
	   
	  // vendor menu 
	     @FindBy(linkText ="Vendor Payments")
		 private WebElement ClickVendorPaymentsMenu;
	     
		
		// Click on  transporter drop down
		@FindBy(xpath = ("//div[@id = 'selectedTransporter']"))
	     private WebElement ClickTransporterdropdown;
				 
				 
	    // Select   transporter name from the drop down
	    @FindBy(xpath = ("//div[text() = 'JOHAL LOGISTICS PRIVATE LIMITED']"))
		private WebElement SelectTransporterName;
	    
	  	//  Click Date Type DropDown 
	     @FindBy(xpath = ("(//div[@class=' css-yk16xz-control'])[3]"))
		 private WebElement ClickDateTypeDropDown;
	     
	     //  Select Date Type DropDown 
	     @FindBy(xpath = ("//div[text()= 'Delivered Date']"))
		 private WebElement SelectDateType;
	     
	     //  Click Dealer zone  DropDown 
	     @FindBy(xpath = ("//div[@id='selectedCluster']"))
		 private WebElement ClickDealerZoneDropDown;
	     
	 //  Select Dealer zone DropDown 
	     @FindBy(xpath = ("//div[text()='North']"))
		 private WebElement SelectDealerZone;
	     
	     
	     //  Click Dealer State DropDown 
	     @FindBy(xpath = ("//div[@id = 'selectedState']"))
		 private WebElement ClickDealerStateDropDown;
	     
	     
	 //  Select Dealer State DropDown 
	     @FindBy(xpath = ("//div[text() = 'Odisha']"))
		 private WebElement SelectDealerState;
	     
	     
	     ////  Click Dealer City DropDown 
	     @FindBy(xpath = ("//div[@id = 'selectedCity']"))
		 private WebElement ClickDealerCityDropDown;
	     
	 //  Select Dealer City DropDown 
	     @FindBy(xpath = ("//div[text()='Rourkela']"))
		 private WebElement SelectDealerCity;
	     
	     
	     
	     ////  Click Dealer  DropDown 
	     @FindBy(xpath = ("//div[@id = 'selectedDealer']"))
		 private WebElement ClickDealerDropDown;
	     
	 //  Select Dealer City DropDown 
	     @FindBy(xpath = ("//div[text()='PPS TRUCKING-3936013AE']"))
		 private WebElement SelectDealer;
	     
	    
	////  Click Submit Button
		     @FindBy(xpath = ("(//button[text()= 'Submit'])[1]"))
			 private WebElement ClickSubmitButton;
	     
	     
	 
				 
	    	////  Click Rest Button 
	    	     @FindBy(xpath = ("//button[text()= 'Reset Filters']"))
	    		 private WebElement ClickRestButton;



	    	     
	    	     

				public WebElement getClickVendorPaymentReconcilliationMenu() {
					return ClickVendorPaymentReconcilliationMenu;
				}




				public void setClickVendorPaymentReconcilliationMenu(WebElement clickVendorPaymentReconcilliationMenu) {
					ClickVendorPaymentReconcilliationMenu = clickVendorPaymentReconcilliationMenu;
				}




				public WebElement getClickVendorPaymentsMenu() {
					return ClickVendorPaymentsMenu;
				}




				public void setClickVendorPaymentsMenu(WebElement clickVendorPaymentsMenu) {
					ClickVendorPaymentsMenu = clickVendorPaymentsMenu;
				}




				public WebElement getClickSideMenu() {
					return ClickSideMenu;
				}




				public void setClickSideMenu(WebElement clickSideMenu) {
					ClickSideMenu = clickSideMenu;
				}




				public WebElement getClickTransporterdropdown() {
					return ClickTransporterdropdown;
				}




				public void setClickTransporterdropdown(WebElement clickTransporterdropdown) {
					ClickTransporterdropdown = clickTransporterdropdown;
				}




				public WebElement getSelectTransporterName() {
					return SelectTransporterName;
				}




				public void setSelectTransporterName(WebElement selectTransporterName) {
					SelectTransporterName = selectTransporterName;
				}




				public WebElement getClickDateTypeDropDown() {
					return ClickDateTypeDropDown;
				}




				public void setClickDateTypeDropDown(WebElement clickDateTypeDropDown) {
					ClickDateTypeDropDown = clickDateTypeDropDown;
				}




				public WebElement getSelectDateType() {
					return SelectDateType;
				}




				public void setSelectDateType(WebElement selectDateType) {
					SelectDateType = selectDateType;
				}




				public WebElement getClickDealerZoneDropDown() {
					return ClickDealerZoneDropDown;
				}




				public void setClickDealerZoneDropDown(WebElement clickDealerZoneDropDown) {
					ClickDealerZoneDropDown = clickDealerZoneDropDown;
				}




				public WebElement getSelectDealerZone() {
					return SelectDealerZone;
				}




				public void setSelectDealerZone(WebElement selectDealerZone) {
					SelectDealerZone = selectDealerZone;
				}




				public WebElement getClickDealerStateDropDown() {
					return ClickDealerStateDropDown;
				}




				public void setClickDealerStateDropDown(WebElement clickDealerStateDropDown) {
					ClickDealerStateDropDown = clickDealerStateDropDown;
				}




				public WebElement getSelectDealerState() {
					return SelectDealerState;
				}




				public void setSelectDealerState(WebElement selectDealerState) {
					SelectDealerState = selectDealerState;
				}




				public WebElement getClickDealerCityDropDown() {
					return ClickDealerCityDropDown;
				}




				public void setClickDealerCityDropDown(WebElement clickDealerCityDropDown) {
					ClickDealerCityDropDown = clickDealerCityDropDown;
				}




				public WebElement getSelectDealerCity() {
					return SelectDealerCity;
				}




				public void setSelectDealerCity(WebElement selectDealerCity) {
					SelectDealerCity = selectDealerCity;
				}




				public WebElement getClickDealerDropDown() {
					return ClickDealerDropDown;
				}




				public void setClickDealerDropDown(WebElement clickDealerDropDown) {
					ClickDealerDropDown = clickDealerDropDown;
				}




				public WebElement getSelectDealer() {
					return SelectDealer;
				}




				public void setSelectDealer(WebElement selectDealer) {
					SelectDealer = selectDealer;
				}




				public WebElement getClickSubmitButton() {
					return ClickSubmitButton;
				}




				public void setClickSubmitButton(WebElement clickSubmitButton) {
					ClickSubmitButton = clickSubmitButton;
				}




				public WebElement getClickRestButton() {
					return ClickRestButton;
				}




				public void setClickRestButton(WebElement clickRestButton) {
					ClickRestButton = clickRestButton;
				}		 
				 
				 
	
				
				
}