package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

  public class DistanceTravelledreport {
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
    
    
    // Transporter Drop down. 
    @FindBy(xpath = ("//div[text()='Select...']"))
	 private WebElement ClickTransporterDropDown;
    
    
    // Select Transporter Drop down. 
    @FindBy(xpath = ("//div[text()='JOHAL LOGISTICS PRIVATE LIMITED']"))
    private WebElement SelectTransporter;
    
    
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


		public WebElement getClickTransporterDropDown() {
			return ClickTransporterDropDown;
		}


		public void setClickTransporterDropDown(WebElement clickTransporterDropDown) {
			ClickTransporterDropDown = clickTransporterDropDown;
		}


		public WebElement getSelectTransporter() {
			return SelectTransporter;
		}


		public void setSelectTransporter(WebElement selectTransporter) {
			SelectTransporter = selectTransporter;
		}


		public WebElement getClickSubmitButton() {
			return ClickSubmitButton;
		}


		public void setClickSubmitButton(WebElement clickSubmitButton) {
			ClickSubmitButton = clickSubmitButton;
		}
    
   
    

}

  
  