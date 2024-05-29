package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class GeoFenceInOut {

	  // side menu 
	 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
	 private WebElement ClickSideMenu;
	
	 
	 
	// menuUtilities
	 @FindBy(xpath = ("// a[text()='Utilities']"))
	 private WebElement ClickUtilities;
	 
	 // GeoFence in/Out
	 @FindBy(xpath = ("//a[text()='Geofence In/Out(SND)']"))
	 private WebElement ClickGeoFenceInOut;
	 
	 
	 
	 // Click on Dealer name drop down
	 @FindBy(xpath = ("//select[@name='fence_name']"))
	 private WebElement ClickDealerDropDown;
	 
	 
	 
	 // select Dealer name
	 @FindBy(xpath = ("//option[text()='GLOBE TRUCKING']"))
	 private WebElement SelectDealerDropDown;
	 
	  //  Click on ViN Number Drop down.
     @FindBy(xpath = ("//input[@placeholder= 'Vin Number']"))
	 private WebElement ClickVinDropDown;
     
     
     // Click on Get button 
     @FindBy(xpath = ("//button[text()= 'Get Data']"))
	 private WebElement ClickGetDataButton;


	public WebElement getClickSideMenu() {
		return ClickSideMenu;
	}


	public void setClickSideMenu(WebElement clickSideMenu) {
		ClickSideMenu = clickSideMenu;
	}


	public WebElement getClickUtilities() {
		return ClickUtilities;
	}


	public void setClickUtilities(WebElement clickUtilities) {
		ClickUtilities = clickUtilities;
	}


	public WebElement getClickGeoFenceInOut() {
		return ClickGeoFenceInOut;
	}


	public void setClickGeoFenceInOut(WebElement clickGeoFenceInOut) {
		ClickGeoFenceInOut = clickGeoFenceInOut;
	}


	public WebElement getClickDealerDropDown() {
		return ClickDealerDropDown;
	}


	public void setClickDealerDropDown(WebElement clickDealerDropDown) {
		ClickDealerDropDown = clickDealerDropDown;
	}


	public WebElement getSelectDealerDropDown() {
		return SelectDealerDropDown;
	}


	public void setSelectDealerDropDown(WebElement selectDealerDropDown) {
		SelectDealerDropDown = selectDealerDropDown;
	}


	public WebElement getClickVinDropDown() {
		return ClickVinDropDown;
	}


	public void setClickVinDropDown(WebElement clickVinDropDown) {
		ClickVinDropDown = clickVinDropDown;
	}


	public WebElement getClickGetDataButton() {
		return ClickGetDataButton;
	}


	public void setClickGetDataButton(WebElement clickGetDataButton) {
		ClickGetDataButton = clickGetDataButton;
	} 

}
