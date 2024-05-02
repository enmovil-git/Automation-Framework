package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuNamesandRepectiveScreenNamesObjects {
	
	@FindBy(xpath = "//img[@id='sidebar-toggle']")
	private WebElement threedots;
	
	@FindBy(xpath = "//a[text()='Consignments']")
	private WebElement menuConsignmentText;
	
	@FindBy(xpath = "//span[text()='Consignments ']")
	private WebElement screenConsignmentText;
	
	@FindBy(xpath = "//a[text()='Create DO']")
	private WebElement menuCreateDOText;
	
	@FindBy(xpath = "//h5[text()='Create DO']")
	private WebElement screenCreateDOText;
  
	@FindBy(xpath = "//a[text()='Utilities']")
	private WebElement clickOnUtilitiesName;
	
	@FindBy(xpath = "//a[text()='Trucks Within Geofence']")
	private WebElement menuTruckWithinGeofText;
	
	@FindBy(xpath = "//span[text()='Trucks Within Geofence']")
	private WebElement screenTruckWithinGeofText;
	
	@FindBy(xpath = "//a[text()='View Carrier Route']")
	private WebElement menuViewCarrierText;
	
	@FindBy(xpath = "//span[text()='View Carrier Route']")
	private WebElement screenViewCarrierText;
	
	@FindBy(xpath = "//a[text()='Trucks Location (Map)']")
	private WebElement menuTruckLocationText;
	
	@FindBy(xpath = "//span[text()='Trucks Location']")
	private WebElement screenTruckLocationText;
	
	@FindBy(xpath = "//a[text()='Manage']")
	private WebElement clickOnManage;
	
	@FindBy(xpath = "//a[text()='Trucks']")
	private WebElement menuTruckText;
	
	@FindBy(xpath = "//span[text()='Manage Trucks']")
	private WebElement screenTruckText;
	
	public WebElement getThreedots() {
		return threedots;
	}

	public void setThreedots(WebElement threedots) {
		this.threedots = threedots;
	}

	public WebElement getMenuConsignmentText() {
		return menuConsignmentText;
	}

	public void setMenuConsignmentText(WebElement menuConsignmentText) {
		this.menuConsignmentText = menuConsignmentText;
	}

	public WebElement getScreenConsignmentText() {
		return screenConsignmentText;
	}

	public void setScreenConsignmentText(WebElement screenConsignmentText) {
		this.screenConsignmentText = screenConsignmentText;
	}

	public WebElement getMenuCreateDOText() {
		return menuCreateDOText;
	}

	public void setMenuCreateDOText(WebElement menuCreateDOText) {
		this.menuCreateDOText = menuCreateDOText;
	}

	public WebElement getScreenCreateDOText() {
		return screenCreateDOText;
	}

	public void setScreenCreateDOText(WebElement screenCreateDOText) {
		this.screenCreateDOText = screenCreateDOText;
	}

	public WebElement getClickOnUtilitiesName() {
		return clickOnUtilitiesName;
	}

	public void setClickOnUtilitiesName(WebElement clickOnUtilitiesName) {
		this.clickOnUtilitiesName = clickOnUtilitiesName;
	}

	public WebElement getMenuTruckWithinGeofText() {
		return menuTruckWithinGeofText;
	}

	public void setMenuTruckWithinGeofText(WebElement menuTruckWithinGeofText) {
		this.menuTruckWithinGeofText = menuTruckWithinGeofText;
	}

	public WebElement getScreenTruckWithinGeofText() {
		return screenTruckWithinGeofText;
	}

	public void setScreenTruckWithinGeofText(WebElement screenTruckWithinGeofText) {
		this.screenTruckWithinGeofText = screenTruckWithinGeofText;
	}

	public WebElement getMenuViewCarrierText() {
		return menuViewCarrierText;
	}

	public void setMenuViewCarrierText(WebElement menuViewCarrierText) {
		this.menuViewCarrierText = menuViewCarrierText;
	}

	public WebElement getScreenViewCarrierText() {
		return screenViewCarrierText;
	}

	public void setScreenViewCarrierText(WebElement screenViewCarrierText) {
		this.screenViewCarrierText = screenViewCarrierText;
	}

	public WebElement getMenuTruckLocationText() {
		return menuTruckLocationText;
	}

	public void setMenuTruckLocationText(WebElement menuTruckLocationText) {
		this.menuTruckLocationText = menuTruckLocationText;
	}

	public WebElement getScreenTruckLocationText() {
		return screenTruckLocationText;
	}

	public void setScreenTruckLocationText(WebElement screenTruckLocationText) {
		this.screenTruckLocationText = screenTruckLocationText;
	}

	public WebElement getClickOnManage() {
		return clickOnManage;
	}

	public void setClickOnManage(WebElement clickOnManage) {
		this.clickOnManage = clickOnManage;
	}

	public WebElement getMenuTruckText() {
		return menuTruckText;
	}

	public void setMenuTruckText(WebElement menuTruckText) {
		this.menuTruckText = menuTruckText;
	}

	public WebElement getScreenTruckText() {
		return screenTruckText;
	}

	public void setScreenTruckText(WebElement screenTruckText) {
		this.screenTruckText = screenTruckText;
	}
	
	
}
