package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Utilities {
	
	// side menu 
	 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
	 private WebElement ClickSideMenu;
	
	
	// menuUtilities
	 @FindBy(xpath = ("// a[text()='Utilities']"))
	 private WebElement ClickUtilities;
	 
	 
	 // GPS Integration Status sub Menu
	 @FindBy(xpath = ("// a[text()='GPS Integration Status']"))
	 private WebElement ClickGPSIntegrationStatus;
	 
	 
	 
	 // Total Vins GPS Installed 
	 @FindBy(xpath = ("(//div[@class= 'f28'])[1]"))
	 private WebElement ClickTotalVins;
	 
	 
	 //Total On Trip
	 @FindBy(xpath = ("(//div[@class='counter f20'])[1]"))
	 private WebElement ClickTotalOnVins;
	 
	 
	 
	 //Total active vins
	 @FindBy(xpath = ("(//span[@class='counter mb-0 f35'])[2]"))
	 private WebElement ClickTotalActiveVins;
	 
	 
	 
	 //Total active Ontrip vins
	 @FindBy(xpath = ("(//div[@class='counter f20'])[2]"))
	 private WebElement ClickTotalActiveOnTripVins;
	 
	 //Total inactive vins
	 @FindBy(xpath = ("(//div[@class='f28'])[3]"))
	 private WebElement ClickTotalInActiveVins;
	 
	 
	 
	 //Total inactive Ontrip vins
	 @FindBy(xpath = ("(//div[@class='counter f20'])[3]"))
	 private WebElement ClickTotalinActiveOnTripVins;
	 
	 
	 //At Dealer
	 @FindBy(xpath = ("(//div[@class='f28'])[4]"))
	 private WebElement ClickAtDealer;
	 
	 
	 // Close button 
	 @FindBy(xpath = ("//span[@class='float-right closebtn']"))
	 private WebElement ClickCloseButto;
	 
	


	public WebElement getClickCloseButto() {
		return ClickCloseButto;
	}


	public void setClickCloseButto(WebElement clickCloseButto) {
		ClickCloseButto = clickCloseButto;
	}


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


	public WebElement getClickGPSIntegrationStatus() {
		return ClickGPSIntegrationStatus;
	}


	public void setClickGPSIntegrationStatus(WebElement clickGPSIntegrationStatus) {
		ClickGPSIntegrationStatus = clickGPSIntegrationStatus;
	}


	public WebElement getClickTotalVins() {
		return ClickTotalVins;
	}


	public void setClickTotalVins(WebElement clickTotalVins) {
		ClickTotalVins = clickTotalVins;
	}


	public WebElement getClickTotalOnVins() {
		return ClickTotalOnVins;
	}


	public void setClickTotalOnVins(WebElement clickTotalOnVins) {
		ClickTotalOnVins = clickTotalOnVins;
	}


	public WebElement getClickTotalActiveVins() {
		return ClickTotalActiveVins;
	}


	public void setClickTotalActiveVins(WebElement clickTotalActiveVins) {
		ClickTotalActiveVins = clickTotalActiveVins;
	}


	public WebElement getClickTotalActiveOnTripVins() {
		return ClickTotalActiveOnTripVins;
	}


	public void setClickTotalActiveOnTripVins(WebElement clickTotalActiveOnTripVins) {
		ClickTotalActiveOnTripVins = clickTotalActiveOnTripVins;
	}


	public WebElement getClickTotalInActiveVins() {
		return ClickTotalInActiveVins;
	}


	public void setClickTotalInActiveVins(WebElement clickTotalInActiveVins) {
		ClickTotalInActiveVins = clickTotalInActiveVins;
	}


	public WebElement getClickTotalinActiveOnTripVins() {
		return ClickTotalinActiveOnTripVins;
	}


	public void setClickTotalinActiveOnTripVins(WebElement clickTotalinActiveOnTripVins) {
		ClickTotalinActiveOnTripVins = clickTotalinActiveOnTripVins;
	}


	public WebElement getClickAtDealer() {
		return ClickAtDealer;
	}


	public void setClickAtDealer(WebElement clickAtDealer) {
		ClickAtDealer = clickAtDealer;
	}
	
	 
	 
 
	 
}