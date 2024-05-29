package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class VinLocation {
	

	// side menu 
		 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
		 private WebElement ClickSideMenu;
		
		
		// menuUtilities
		 @FindBy(xpath = ("//a[text()='Utilities']"))
		 private WebElement ClickUtilities;
		 
		 
		 // Vin Location Map
		 @FindBy(xpath = ("//a[text() = 'Vin Location (Map)']"))
		 private WebElement ClickVinLocationMap;
		 
		 
		 // click on Select Type Drop Down
		 @FindBy(xpath = ("//div[text() = 'ALL']"))
		 private WebElement ClickSelctTypeDropDown;
		 
		//  Select Type Drop Down
		 @FindBy(xpath = ("//div[text() = 'On Trip']"))
		 private WebElement SelctTypeDropDown;
		 
		 
		 // click on Transporter Drop Down
		 @FindBy(xpath = ("//div[text() = 'ALL Transporters']"))
		 private WebElement ClickTransporterDropDown;
		 
		 
		 // Select Transporter name
		 @FindBy(xpath = ("//div[text() = 'JOHAL LOGISTICS PRIVATE LIMITED']"))
		 private WebElement SelectTransporterName;
		 
		 
		 
		 // click on Submit button
		 @FindBy(xpath = ("(//button[@name = 'go'])[1]"))
		 private WebElement ClickSubmitButton;
		 
		 
		 // Ok button
		 
		 @FindBy(xpath = ("//button[text()='OK']"))
		 private WebElement ClickOkButton;
		 
		 
		 
		 
		 
		 // click on Vin No Drop Down
		 @FindBy(xpath = ("//div[text() = 'Select Vin']"))
		 private WebElement ClickVinNoDropDown;
		
		 
		 
		 // click on Submit button 2
		 @FindBy(xpath = ("(//button[@name = 'go'])[2]"))
		 private WebElement ClickSubmitButton2;



		public WebElement getClickOkButton() {
			return ClickOkButton;
		}



		public void setClickOkButton(WebElement clickOkButton) {
			ClickOkButton = clickOkButton;
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



		public WebElement getClickVinLocationMap() {
			return ClickVinLocationMap;
		}



		public void setClickVinLocationMap(WebElement clickVinLocationMap) {
			ClickVinLocationMap = clickVinLocationMap;
		}



		public WebElement getClickSelctTypeDropDown() {
			return ClickSelctTypeDropDown;
		}



		public void setClickSelctTypeDropDown(WebElement clickSelctTypeDropDown) {
			ClickSelctTypeDropDown = clickSelctTypeDropDown;
		}



		public WebElement getSelctTypeDropDown() {
			return SelctTypeDropDown;
		}



		public void setSelctTypeDropDown(WebElement selctTypeDropDown) {
			SelctTypeDropDown = selctTypeDropDown;
		}



		public WebElement getClickTransporterDropDown() {
			return ClickTransporterDropDown;
		}



		public void setClickTransporterDropDown(WebElement clickTransporterDropDown) {
			ClickTransporterDropDown = clickTransporterDropDown;
		}



		public WebElement getSelectTransporterName() {
			return SelectTransporterName;
		}



		public void setSelectTransporterName(WebElement selectTransporterName) {
			SelectTransporterName = selectTransporterName;
		}



		public WebElement getClickSubmitButton() {
			return ClickSubmitButton;
		}



		public void setClickSubmitButton(WebElement clickSubmitButton) {
			ClickSubmitButton = clickSubmitButton;
		}



		public WebElement getClickVinNoDropDown() {
			return ClickVinNoDropDown;
		}



		public void setClickVinNoDropDown(WebElement clickVinNoDropDown) {
			ClickVinNoDropDown = clickVinNoDropDown;
		}



		public WebElement getClickSubmitButton2() {
			return ClickSubmitButton2;
		}



		public void setClickSubmitButton2(WebElement clickSubmitButton2) {
			ClickSubmitButton2 = clickSubmitButton2;
		}
		 
		 
		
		
	

}
