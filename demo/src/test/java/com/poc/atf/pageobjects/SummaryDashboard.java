package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryDashboard {
	
	// side menu 
	 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
	 private WebElement ClickSideMenu;
	
	
	// summary dash board 
	 @FindBy(xpath = ("//a[text()='Summary Dashboard']"))
	 private WebElement ClickSummaryDashboardMenu;
	 
	 
	 // Click Consigner drop down 
       @FindBy(xpath =("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"))
       private WebElement ClickConsignerDropdown;
       
	// Select Consigner Name
	 @FindBy(xpath = ("//div[text()='Chennai']"))
	 private WebElement SelectConsignerName;
	 
	 //Click on date Type drop down
	 @FindBy(xpath = ("(//div[@class=\" css-g1d714-ValueContainer\"])[2]"))
	 private WebElement ClickDataDropdown;
	 
	 //select data type
	 @FindBy(xpath = ("//div[text()='Delivered Date']"))
	 private WebElement SelectkDataDropdown;
	
	 // Click on Transporter Drop Down 
	 @FindBy(xpath = ("(//div[@class=\" css-g1d714-ValueContainer\"])[3]"))
	 private WebElement ClickTransporterDropdown; 
	 
	// Select Transporter name
	 @FindBy(xpath = ("//div[text()='JOHAL LOGISTICS PRIVATE LIMITED']"))
	 private WebElement SelectTransporterName;
	 
	 
	 // Click on dealer zone drop down 
	 @FindBy(xpath = ("(//div[@class=\" css-g1d714-ValueContainer\"])[4]"))
	 private WebElement ClickZoneDropdown;
	 
	 //slect dealer zone name
	 @FindBy(xpath = ("//div[text()='North']"))
	 private WebElement SelectZoneName;
	 
	
	 // Click on dealer State drop down 
	 @FindBy(xpath = ("(//div[@class=\" css-g1d714-ValueContainer\"])[5]"))
	 private WebElement ClickStateDropdown;
	 
	// select dealer State 
	 @FindBy(xpath = ("//div[text()='Punjab']"))
	 private WebElement SelectStateName;
	 
	 
	 // click on dealer city drop down 
	 @FindBy(xpath = ("(//div[@class=\" css-g1d714-ValueContainer\"])[6]"))
	 private WebElement ClickCityDropdown;
	 
	 // select dealer city 
	 @FindBy(xpath = ("//div[text()='Pathankot']"))
	 private WebElement SelectCityName;
	 
	 
	 // Click on dealer name drop down 
	 @FindBy(xpath = ("(//div[@class=\" css-g1d714-ValueContainer\"])[7]"))
	 private WebElement ClickDealreDropdown;
 
	 // Select dealer name 
	 @FindBy(xpath = ("//div[text()='GLOBE TRUCKING-3919021AB']"))
	 private WebElement SelectDealreDropdown;
	 
	 // Click on submit button
	 @FindBy(xpath = ("//button[@class='btn btn-success float-right']"))
	 private WebElement ClickSubmitbutton;

	public WebElement getClickSideMenu() {
		return ClickSideMenu;
	}

	public void setClickSideMenu(WebElement clickSideMenu) {
		ClickSideMenu = clickSideMenu;
	}

	public WebElement getClickSummaryDashboardMenu() {
		return ClickSummaryDashboardMenu;
	}

	public void setClickSummaryDashboardMenu(WebElement clickSummaryDashboardMenu) {
		ClickSummaryDashboardMenu = clickSummaryDashboardMenu;
	}

	public WebElement getClickConsignerDropdown() {
		return ClickConsignerDropdown;
	}

	public void setClickConsignerDropdown(WebElement clickConsignerDropdown) {
		ClickConsignerDropdown = clickConsignerDropdown;
	}

	public WebElement getSelectConsignerName() {
		return SelectConsignerName;
	}

	public void setSelectConsignerName(WebElement selectConsignerName) {
		SelectConsignerName = selectConsignerName;
	}

	public WebElement getClickDataDropdown() {
		return ClickDataDropdown;
	}

	public void setClickDataDropdown(WebElement clickDataDropdown) {
		ClickDataDropdown = clickDataDropdown;
	}

	public WebElement getSelectkDataDropdown() {
		return SelectkDataDropdown;
	}

	public void setSelectkDataDropdown(WebElement selectkDataDropdown) {
		SelectkDataDropdown = selectkDataDropdown;
	}

	public WebElement getClickTransporterDropdown() {
		return ClickTransporterDropdown;
	}

	public void setClickTransporterDropdown(WebElement clickTransporterDropdown) {
		ClickTransporterDropdown = clickTransporterDropdown;
	}

	public WebElement getSelectTransporterName() {
		return SelectTransporterName;
	}

	public void setSelectTransporterName(WebElement selectTransporterName) {
		SelectTransporterName = selectTransporterName;
	}

	public WebElement getClickZoneDropdown() {
		return ClickZoneDropdown;
	}

	public void setClickZoneDropdown(WebElement clickZoneDropdown) {
		ClickZoneDropdown = clickZoneDropdown;
	}

	public WebElement getSelectZoneName() {
		return SelectZoneName;
	}

	public void setSelectZoneName(WebElement selectZoneName) {
		SelectZoneName = selectZoneName;
	}

	public WebElement getClickStateDropdown() {
		return ClickStateDropdown;
	}

	public void setClickStateDropdown(WebElement clickStateDropdown) {
		ClickStateDropdown = clickStateDropdown;
	}

	public WebElement getSelectStateName() {
		return SelectStateName;
	}

	public void setSelectStateName(WebElement selectStateName) {
		SelectStateName = selectStateName;
	}

	public WebElement getClickCityDropdown() {
		return ClickCityDropdown;
	}

	public void setClickCityDropdown(WebElement clickCityDropdown) {
		ClickCityDropdown = clickCityDropdown;
	}

	public WebElement getSelectCityName() {
		return SelectCityName;
	}

	public void setSelectCityName(WebElement selectCityName) {
		SelectCityName = selectCityName;
	}

	public WebElement getClickDealreDropdown() {
		return ClickDealreDropdown;
	}

	public void setClickDealreDropdown(WebElement clickDealreDropdown) {
		ClickDealreDropdown = clickDealreDropdown;
	}

	public WebElement getSelectDealreDropdown() {
		return SelectDealreDropdown;
	}

	public void setSelectDealreDropdown(WebElement selectDealreDropdown) {
		SelectDealreDropdown = selectDealreDropdown;
	}

	public WebElement getClickSubmitbutton() {
		return ClickSubmitbutton;
	}

	public void setClickSubmitbutton(WebElement clickSubmitbutton) {
		ClickSubmitbutton = clickSubmitbutton;
	}
	 
}
