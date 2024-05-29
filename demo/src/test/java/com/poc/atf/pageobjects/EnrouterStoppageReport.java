package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrouterStoppageReport {
	// side menu 
    @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
	 private WebElement ClickSideMenu;
    
    // Click  close track and trace Menu   
    @FindBy(xpath = ("//span[text()='Track and Trace']"))
	 private WebElement ClickTrackandTraceMenu;
    
   
    
	// Reports menu 
    @FindBy(xpath = ("//span[text()='Reports']"))
	 private WebElement ClickReportsMenu;
    
  // Enroute Stoppage Report
    @FindBy(xpath = ("//a[text()='Enroute Stoppage']"))
	 private WebElement ClickEnrouteStoppageReports;
    
    // Click Break Duration 
    @FindBy(xpath = ("//div[text()='Select Duration']"))
	 private WebElement ClickDuration;
    
    // Click Break Duration 
    @FindBy(xpath = ("//div[text()='24 Hr']"))
	 private WebElement SelectDuration;
    
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



		public WebElement getClickEnrouteStoppageReports() {
			return ClickEnrouteStoppageReports;
		}

		public void setClickEnrouteStoppageReports(WebElement clickEnrouteStoppageReports) {
			ClickEnrouteStoppageReports = clickEnrouteStoppageReports;
		}

		public WebElement getClickDuration() {
			return ClickDuration;
		}

		public void setClickDuration(WebElement clickDuration) {
			ClickDuration = clickDuration;
		}

		public WebElement getSelectDuration() {
			return SelectDuration;
		}

		public void setSelectDuration(WebElement selectDuration) {
			SelectDuration = selectDuration;
		}

		public WebElement getClickSubmitButton() {
			return ClickSubmitButton;
		}

		public void setClickSubmitButton(WebElement clickSubmitButton) {
			ClickSubmitButton = clickSubmitButton;
		}
    
    
    
    

}
