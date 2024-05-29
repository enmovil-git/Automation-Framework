package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllConsignments {
	// delivered Consignments Tab 
		 @FindBy(xpath = ("//button[text()='All']"))
		 private WebElement ClickAllTab;
		
		// select Type dropdown
		 @FindBy(xpath = ("//*[@id=\"selectedFilter\"]"))
		 private WebElement clickSelectType; 
		 @FindBy(xpath = ("//div[text()='Delivery No']"))
		 private WebElement selectInvoiceNumber;
		 
		 // Vin / Serial No input text box
		 @FindBy(xpath = ("//*[@id=\"inputTruckConsignment\"]"))
		 private WebElement EnterDeliveryNumber; 
		 
		 // submit button
		 @FindBy(xpath = ("//*[@id=\"pbody\"]/div/div[2]/div[1]/div/div/form/div[3]/button[1]"))
		 private WebElement clickSubmitButton1;
		 
		 // reset button 
		 @FindBy(xpath = ("//button[text()= 'Reset Filters']"))
		 private WebElement ClickResetButton1;
		
		
		// CHOOSE TRANSPORTER
		 @FindBy(xpath = ("//*[@id=\"selectedTransporter\"]"))
		 private WebElement clickTransporterDropdown;
		 @FindBy(xpath = ("//div[text()='GLOBAL LOGISTICS SYSTEMS']"))
		 private WebElement selectTransporterName;
		 
		// reset button 
		 @FindBy(xpath = ("//*[@id=\"filterForm\"]/div[3]/button[2]"))
		 private WebElement clickResetButton2ndTime;
		 
		
		

		// dealer zone drop down  
		 @FindBy(xpath =("//*[@id=\"selectedCluster\"]/div/div[2]"))
		 private WebElement clickDealerzone;
		 @FindBy(xpath = ("//div[text()=\"West\"]"))
		 private WebElement selectDealerZone;
		 
		 // dealer state drop down
		 @FindBy(xpath = ("//*[@id=\"selectedState\"]/div/div[1]"))
		 private WebElement clickDealerState;
		 @FindBy (xpath = ("//div[text()='Gujarat']"))
		 private WebElement selectDealerState;
		 
		 // dealer city drop down 
		 @FindBy(xpath = ("//*[@id=\"selectedCity\"]/div/div[1]"))
		 private WebElement clickDealerCity;
		@FindBy(xpath = ("//div[text()='Ahmedabad']"))
	   	private WebElement selectDealerCity;
		
		// dealer name drop down 
		 @FindBy(xpath = ("//*[@id=\"selectedDealer\"]/div/div[1]"))
		 private WebElement clcikDealerName;
		 @FindBy(xpath = ("//div[text()='KATARIA TRUCKING-4106002A']"))
		 private WebElement selectDealerName;
		
		 // Submit button 
		 @FindBy(xpath = ("//*[@id=\"filterForm\"]/div[3]/button[1]"))
		 private WebElement clickSubmitButton2;
		 
		 // reset button 
		 @FindBy(xpath = ("//*[@id=\"filterForm\"]/div[3]/button[2]"))
		 private WebElement clickRestbutton;
		 
		// Consignments KPI
		 @FindBy(xpath = ("//span[text()='Consignments']"))
		 private WebElement clickConsignmentsKpi;
		 
			
		// Transit dealys KPI
		 @FindBy(xpath = ("//span[text()='Transit Delays']"))
		 private WebElement clickTransitDelayKpi;
		 
		// Over speed KPI
		 @FindBy(xpath = ("//span[text()='Overspeeding']"))
		 private WebElement clickOverSpeedKpi;
		 
		// Night driving KPI
		 @FindBy(xpath = ("//span[text()='Night Driving']"))
		 private WebElement clickNightDrivingKpi;
		 
		// Stoppages KPI
		 @FindBy(xpath = ("//span[text()='Stoppages']"))
		 private WebElement clickStoppagesKpi;
		 
		//Accidents KPI
		 @FindBy(xpath = ("//span[text()='Accidents']"))
		 private WebElement clickAccidentsKpi;
		 
		// LSP Deviations KPI
		 @FindBy(xpath = ("//span[text()='LSP Deviations']"))
		 private WebElement clickLSPDeviationsKpi;
		   
		 
		 // Trip Deviation KPI 
		 @FindBy(xpath = ("//span[text()='Trip Deviations']"))
		 private WebElement clickTripDeviationsKpi;
		 
		 
		 
		 // reset button 
		 @FindBy(xpath = ("//*[@id=\"filterForm\"]/div[3]/button[2]"))
		 private WebElement ClickResetButton;
		 
		 @FindBy(xpath = "//button[text()='OK']")
		 private WebElement ClickOkButton;
		 
		 
		 

		

		public WebElement getClickLSPDeviationsKpi() {
			return clickLSPDeviationsKpi;
		}

		public void setClickLSPDeviationsKpi(WebElement clickLSPDeviationsKpi) {
			this.clickLSPDeviationsKpi = clickLSPDeviationsKpi;
		}

		public WebElement getClickTripDeviationsKpi() {
			return clickTripDeviationsKpi;
		}

		public void setClickTripDeviationsKpi(WebElement clickTripDeviationsKpi) {
			this.clickTripDeviationsKpi = clickTripDeviationsKpi;
		}

		public WebElement getClickAllTab() {
			return ClickAllTab;
		}

		public void setClickAllTab(WebElement clickAllTab) {
			ClickAllTab = clickAllTab;
		}

		public WebElement getClickSelectType() {
			return clickSelectType;
		}

		public void setClickSelectType(WebElement clickSelectType) {
			this.clickSelectType = clickSelectType;
		}

		public WebElement getSelectInvoiceNumber() {
			return selectInvoiceNumber;
		}

		public void setSelectInvoiceNumber(WebElement selectInvoiceNumber) {
			this.selectInvoiceNumber = selectInvoiceNumber;
		}

		public WebElement getEnterDeliveryNumber() {
			return EnterDeliveryNumber;
		}

		public void setEnterDeliveryNumber(WebElement enterDeliveryNumber) {
			EnterDeliveryNumber = enterDeliveryNumber;
		}

		public WebElement getClickSubmitButton1() {
			return clickSubmitButton1;
		}

		public void setClickSubmitButton1(WebElement clickSubmitButton1) {
			this.clickSubmitButton1 = clickSubmitButton1;
		}

		public WebElement getClickResetButton1() {
			return ClickResetButton1;
		}

		public void setClickResetButton1(WebElement clickResetButton1) {
			ClickResetButton1 = clickResetButton1;
		}

		public WebElement getClickTransporterDropdown() {
			return clickTransporterDropdown;
		}

		public void setClickTransporterDropdown(WebElement clickTransporterDropdown) {
			this.clickTransporterDropdown = clickTransporterDropdown;
		}

		public WebElement getSelectTransporterName() {
			return selectTransporterName;
		}

		public void setSelectTransporterName(WebElement selectTransporterName) {
			this.selectTransporterName = selectTransporterName;
		}

		public WebElement getClickResetButton2ndTime() {
			return clickResetButton2ndTime;
		}

		public void setClickResetButton2ndTime(WebElement clickResetButton2ndTime) {
			this.clickResetButton2ndTime = clickResetButton2ndTime;
		}

		public WebElement getClickDealerzone() {
			return clickDealerzone;
		}

		public void setClickDealerzone(WebElement clickDealerzone) {
			this.clickDealerzone = clickDealerzone;
		}

		public WebElement getSelectDealerZone() {
			return selectDealerZone;
		}

		public void setSelectDealerZone(WebElement selectDealerZone) {
			this.selectDealerZone = selectDealerZone;
		}

		public WebElement getClickDealerState() {
			return clickDealerState;
		}

		public void setClickDealerState(WebElement clickDealerState) {
			this.clickDealerState = clickDealerState;
		}

		public WebElement getSelectDealerState() {
			return selectDealerState;
		}

		public void setSelectDealerState(WebElement selectDealerState) {
			this.selectDealerState = selectDealerState;
		}

		public WebElement getClickDealerCity() {
			return clickDealerCity;
		}

		public void setClickDealerCity(WebElement clickDealerCity) {
			this.clickDealerCity = clickDealerCity;
		}

		public WebElement getSelectDealerCity() {
			return selectDealerCity;
		}

		public void setSelectDealerCity(WebElement selectDealerCity) {
			this.selectDealerCity = selectDealerCity;
		}

		public WebElement getClcikDealerName() {
			return clcikDealerName;
		}

		public void setClcikDealerName(WebElement clcikDealerName) {
			this.clcikDealerName = clcikDealerName;
		}

		public WebElement getSelectDealerName() {
			return selectDealerName;
		}

		public void setSelectDealerName(WebElement selectDealerName) {
			this.selectDealerName = selectDealerName;
		}

		public WebElement getClickSubmitButton2() {
			return clickSubmitButton2;
		}

		public void setClickSubmitButton2(WebElement clickSubmitButton2) {
			this.clickSubmitButton2 = clickSubmitButton2;
		}

		public WebElement getClickRestbutton() {
			return clickRestbutton;
		}

		public void setClickRestbutton(WebElement clickRestbutton) {
			this.clickRestbutton = clickRestbutton;
		}

		public WebElement getClickConsignmentsKpi() {
			return clickConsignmentsKpi;
		}

		public void setClickConsignmentsKpi(WebElement clickConsignmentsKpi) {
			this.clickConsignmentsKpi = clickConsignmentsKpi;
		}

		public WebElement getClickTransitDelayKpi() {
			return clickTransitDelayKpi;
		}

		public void setClickTransitDelayKpi(WebElement clickTransitDelayKpi) {
			this.clickTransitDelayKpi = clickTransitDelayKpi;
		}

		public WebElement getClickOverSpeedKpi() {
			return clickOverSpeedKpi;
		}

		public void setClickOverSpeedKpi(WebElement clickOverSpeedKpi) {
			this.clickOverSpeedKpi = clickOverSpeedKpi;
		}

		public WebElement getClickNightDrivingKpi() {
			return clickNightDrivingKpi;
		}

		public void setClickNightDrivingKpi(WebElement clickNightDrivingKpi) {
			this.clickNightDrivingKpi = clickNightDrivingKpi;
		}

		public WebElement getClickStoppagesKpi() {
			return clickStoppagesKpi;
		}

		public void setClickStoppagesKpi(WebElement clickStoppagesKpi) {
			this.clickStoppagesKpi = clickStoppagesKpi;
		}

		public WebElement getClickAccidentsKpi() {
			return clickAccidentsKpi;
		}

		public void setClickAccidentsKpi(WebElement clickAccidentsKpi) {
			this.clickAccidentsKpi = clickAccidentsKpi;
		}


		public WebElement getClickResetButton() {
			return ClickResetButton;
		}

		public void setClickResetButton(WebElement clickResetButton) {
			ClickResetButton = clickResetButton;
		}

		public WebElement getClickOkButton() {
			return ClickOkButton;
		}

		public void setClickOkButton(WebElement clickOkButton) {
			ClickOkButton = clickOkButton;
		}
		 
		
}
		 
		 
		 
		 
