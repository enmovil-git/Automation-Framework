package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DayWiseDistanceMonthly {
	
	// side menu 
    @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
	 private WebElement ClickSideMenu;
    
    // Click  close track and trace Menu   
    @FindBy(xpath = ("//span[text()='Track and Trace']"))
	 private WebElement ClickTrackandTraceMenu;
    
   
    
	// Reports menu 
    @FindBy(xpath = ("//span[text()='Reports']"))
	 private WebElement ClickReportsMenu;
    
    
    
 // Reports menu 
    @FindBy(xpath = ("//a[text()='Distance Travelled Report']"))
	 private WebElement ClickDistanceTravelledReportsMenu;
    
    
    // Day Wise Distance Monthly Report 
    @FindBy(xpath = ("//a[text()='Day Wise Distances (Monthly)']"))
	 private WebElement ClickDayWiseDistance;
    
    
    //Click  Monthly Drop down 
    @FindBy(xpath = ("(//div[@class=\" css-yk16xz-control\"])[1]"))
	 private WebElement ClickMonthDropdown;
    
    
    
    //Select  Monthly 
    @FindBy(xpath = ("//div[text()='January']"))
	 private WebElement SelectMonth;
    
    //Click  Year Drop down 
    @FindBy(xpath = ("(//div[@class=\" css-g1d714-ValueContainer\"])[2]"))
	 private WebElement ClickYearDropdown;
    
    
  //Select  Monthly 
    @FindBy(xpath = ("//div[text()='2024']"))
	 private WebElement SelectYear;
  
    
     //Click Submit Button
		@FindBy(xpath = ("//button[text()='Submit']"))
 		 private WebElement ClickSubmitButton;


		public WebElement getClickSideMenu() {
			return ClickSideMenu;
		}


		public void setClickSideMenu(WebElement clickSideMenu) {
			ClickSideMenu = clickSideMenu;
		}


		public WebElement getClickTrackandTraceMenu() {
			return ClickTrackandTraceMenu;
		}


		public void setClickTrackandTraceMenu(WebElement clickTrackandTraceMenu) {
			ClickTrackandTraceMenu = clickTrackandTraceMenu;
		}


		public WebElement getClickReportsMenu() {
			return ClickReportsMenu;
		}


		public void setClickReportsMenu(WebElement clickReportsMenu) {
			ClickReportsMenu = clickReportsMenu;
		}


		public WebElement getClickDistanceTravelledReportsMenu() {
			return ClickDistanceTravelledReportsMenu;
		}


		public void setClickDistanceTravelledReportsMenu(WebElement clickDistanceTravelledReportsMenu) {
			ClickDistanceTravelledReportsMenu = clickDistanceTravelledReportsMenu;
		}


		public WebElement getClickDayWiseDistance() {
			return ClickDayWiseDistance;
		}


		public void setClickDayWiseDistance(WebElement clickDayWiseDistance) {
			ClickDayWiseDistance = clickDayWiseDistance;
		}


		public WebElement getClickMonthDropdown() {
			return ClickMonthDropdown;
		}


		public void setClickMonthDropdown(WebElement clickMonthDropdown) {
			ClickMonthDropdown = clickMonthDropdown;
		}


		public WebElement getSelectMonth() {
			return SelectMonth;
		}


		public void setSelectMonth(WebElement selectMonth) {
			SelectMonth = selectMonth;
		}


		public WebElement getClickYearDropdown() {
			return ClickYearDropdown;
		}


		public void setClickYearDropdown(WebElement clickYearDropdown) {
			ClickYearDropdown = clickYearDropdown;
		}


		public WebElement getSelectYear() {
			return SelectYear;
		}


		public void setSelectYear(WebElement selectYear) {
			SelectYear = selectYear;
		}


		public WebElement getClickSubmitButton() {
			return ClickSubmitButton;
		}


		public void setClickSubmitButton(WebElement clickSubmitButton) {
			ClickSubmitButton = clickSubmitButton;
		}


}