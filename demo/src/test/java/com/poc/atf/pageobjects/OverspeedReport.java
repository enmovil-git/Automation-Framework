package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class OverspeedReport {
	
	// side menu 
    @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
	 private WebElement ClickSideMenu;
    
    // Click  Menu   
    @FindBy(xpath = ("//span[text()='Track and Trace']"))
	 private WebElement ClickTrackandTraceMenu;
    
    
    
	// Reports menu 
    @FindBy(xpath = ("//span[text()='Reports']"))
	 private WebElement ClickReportsMenu;
    
    
 // Over Speed menu 
    @FindBy(xpath = ("//a[text()='Overspeed']"))
	 private WebElement ClickOverSpeedMenu;
  
	// Click on vin Number drop down.
	@FindBy(xpath = ("//div[text()='Select Vin']"))
	 private WebElement ClickVinNoDropDown;
	
	
	// Select vin Number 
		@FindBy(xpath = ("//div[text() = 'MEC909FCKPP150671']"))
		 private WebElement SelectVinNo;
	
	
	//Click Submit Button
	@FindBy(xpath = ("//button[text()='Submit']"))
	 private WebElement ClickSubmitButton;
	
	
	

	public WebElement getClickTrackandTraceMenu() {
		return ClickTrackandTraceMenu;
	}

	public void setClickTrackandTraceMenu(WebElement clickTrackandTraceMenu) {
		ClickTrackandTraceMenu = clickTrackandTraceMenu;
	}

	public WebElement getSelectVinNo() {
		return SelectVinNo;
	}

	public void setSelectVinNo(WebElement selectVinNo) {
		SelectVinNo = selectVinNo;
	}

	public WebElement getClickSideMenu() {
		return ClickSideMenu;
	}

	public void setClickSideMenu(WebElement clickSideMenu) {
		ClickSideMenu = clickSideMenu;
	}

	public WebElement getClickReportsMenu() {
		return ClickReportsMenu;
	}

	public void setClickReportsMenu(WebElement clickReportsMenu) {
		ClickReportsMenu = clickReportsMenu;
	}

	public WebElement getClickOverSpeedMenu() {
		return ClickOverSpeedMenu;
	}

	public void setClickOverSpeedMenu(WebElement clickOverSpeedMenu) {
		ClickOverSpeedMenu = clickOverSpeedMenu;
	}

	public WebElement getClickVinNoDropDown() {
		return ClickVinNoDropDown;
	}

	public void setClickVinNoDropDown(WebElement clickVinNoDropDown) {
		ClickVinNoDropDown = clickVinNoDropDown;
	}

	public WebElement getClickSubmitButton() {
		return ClickSubmitButton;
	}

	public void setClickSubmitButton(WebElement clickSubmitButton) {
		ClickSubmitButton = clickSubmitButton;
	}
	
	
	
}
