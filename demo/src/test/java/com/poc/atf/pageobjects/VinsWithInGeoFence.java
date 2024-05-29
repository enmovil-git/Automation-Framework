package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VinsWithInGeoFence {
	
	// side menu 
		 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
		 private WebElement ClickSideMenu;
		
		
		// menuUtilities
		 @FindBy(xpath = ("// a[text()='Utilities']"))
		 private WebElement ClickUtilities;
	
	
	// click on vins with in geofence 
	@FindBy(xpath = ("//a[text()='Vins Within Geofence']"))
	private WebElement ClickOnVinsWithInGeoFence;
	 
	// search type drop dwon
	@FindBy(xpath = ("//select[@name='view_type']"))
	private WebElement ClickOnSearchTYpeDropDown;
	
	@FindBy(xpath = ("//option[text()='Plant']"))
	private WebElement SelectPlant;

	
// select type drop down 
	@FindBy(xpath = ("//select[@name='request_type']"))
	private WebElement ClickOnSelectTYpeDropDown;
	@FindBy(xpath = ("//option[text()='All Vins']"))
	private WebElement SelectAllVins;
	
	
	// select plant drop down
	@FindBy(xpath = ("//div[text()='Select Plant']"))
	private WebElement ClickOnPlantDropDown;
	@FindBy(xpath = ("//div[text()='Chennai']"))
	private WebElement SelectChennai;
	
	
	// radius input text Box
	@FindBy(xpath = ("//input[@name='radius']"))
	private WebElement Clear;
	@FindBy(xpath = ("//input[@name='radius']"))
	private WebElement EnterRadius;
	
	// click on vins with in GPs(24hrs) Check box
	@FindBy(xpath = ("//input[@id='gps_record_flag']"))
	private WebElement ClickOnCheckBox;
	
	
	// Click on submit button 
	@FindBy(xpath = ("//button[@class='btn btn-success ']"))
	private WebElement ClickonSubmitButton;
	
	
	// Click on OK  button 
	 @FindBy(xpath = ("//button[text()='OK']"))
	 private WebElement ClickOKButton;
	 


	public WebElement getClickOKButton() {
		return ClickOKButton;
	}


	public void setClickOKButton(WebElement clickOKButton) {
		ClickOKButton = clickOKButton;
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


	public WebElement getClickOnVinsWithInGeoFence() {
		return ClickOnVinsWithInGeoFence;
	}


	public void setClickOnVinsWithInGeoFence(WebElement clickOnVinsWithInGeoFence) {
		ClickOnVinsWithInGeoFence = clickOnVinsWithInGeoFence;
	}


	public WebElement getClickOnSearchTYpeDropDown() {
		return ClickOnSearchTYpeDropDown;
	}


	public void setClickOnSearchTYpeDropDown(WebElement clickOnSearchTYpeDropDown) {
		ClickOnSearchTYpeDropDown = clickOnSearchTYpeDropDown;
	}


	public WebElement getSelectPlant() {
		return SelectPlant;
	}


	public void setSelectPlant(WebElement selectPlant) {
		SelectPlant = selectPlant;
	}


	public WebElement getClickOnSelectTYpeDropDown() {
		return ClickOnSelectTYpeDropDown;
	}


	public void setClickOnSelectTYpeDropDown(WebElement clickOnSelectTYpeDropDown) {
		ClickOnSelectTYpeDropDown = clickOnSelectTYpeDropDown;
	}


	public WebElement getSelectAllVins() {
		return SelectAllVins;
	}


	public void setSelectAllVins(WebElement selectAllVins) {
		SelectAllVins = selectAllVins;
	}


	public WebElement getClickOnPlantDropDown() {
		return ClickOnPlantDropDown;
	}


	public void setClickOnPlantDropDown(WebElement clickOnPlantDropDown) {
		ClickOnPlantDropDown = clickOnPlantDropDown;
	}


	public WebElement getSelectChennai() {
		return SelectChennai;
	}


	public void setSelectChennai(WebElement selectChennai) {
		SelectChennai = selectChennai;
	}


	public WebElement getClear() {
		return Clear;
	}


	public void setClear(WebElement clear) {
		Clear = clear;
	}


	public WebElement getEnterRadius() {
		return EnterRadius;
	}


	public void setEnterRadius(WebElement enterRadius) {
		EnterRadius = enterRadius;
	}


	public WebElement getClickOnCheckBox() {
		return ClickOnCheckBox;
	}


	public void setClickOnCheckBox(WebElement clickOnCheckBox) {
		ClickOnCheckBox = clickOnCheckBox;
	}


	public WebElement getClickonSubmitButton() {
		return ClickonSubmitButton;
	}


	public void setClickonSubmitButton(WebElement clickonSubmitButton) {
		ClickonSubmitButton = clickonSubmitButton;
	}
	
}
