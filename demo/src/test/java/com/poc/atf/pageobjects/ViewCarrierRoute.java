package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCarrierRoute {

	// side menu 
		 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
		 private WebElement ClickSideMenu;
		
		
		// menuUtilities
		 @FindBy(xpath = ("// a[text()='Utilities']"))
		 private WebElement ClickUtilities;
		 
		 // View carrier Route
		 @FindBy(xpath = ("//a[text()='View Carrier Route']"))
		 private WebElement ClickViewCarrierRoute;
		 
		 // click on vin No drop down
		 @FindBy(xpath = ("//div[text()='Vin No']"))
		 private WebElement EnterVinNo;


		 
		// click on vin No drop down
				 @FindBy(xpath = ("//div[text()='MEC871ECJPP148123']"))
				 private WebElement SelectVinNo;
		
		 
		 // Enter  Data Interval Mints
		 @FindBy(xpath = ("//input[@name='frequency']"))
		 private WebElement EnterDataIntreval;
		 
		 
		// Click on submit button 
		 @FindBy(xpath = ("//button[text()='Submit']"))
		 private WebElement ClickOnSubmitButton;
		 
		 
		// Click on submit button 
				 @FindBy(xpath = ("//button[text()='OK']"))
				 private WebElement ClickOKButton;
				 
		 
		 
		 
		 
		 
		 

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

		public WebElement getClickUtilities() {
			return ClickUtilities;
		}

		public void setClickUtilities(WebElement clickUtilities) {
			ClickUtilities = clickUtilities;
		}

		public WebElement getClickViewCarrierRoute() {
			return ClickViewCarrierRoute;
		}

		public void setClickViewCarrierRoute(WebElement clickViewCarrierRoute) {
			ClickViewCarrierRoute = clickViewCarrierRoute;
		}

		public WebElement getEnterVinNo() {
			return EnterVinNo;
		}

		public void setEnterVinNo(WebElement enterVinNo) {
			EnterVinNo = enterVinNo;
		}

		public WebElement getEnterDataIntreval() {
			return EnterDataIntreval;
		}

		public void setEnterDataIntreval(WebElement enterDataIntreval) {
			EnterDataIntreval = enterDataIntreval;
		}

		public WebElement getClickOnSubmitButton() {
			return ClickOnSubmitButton;
		}

		public void setClickOnSubmitButton(WebElement clickOnSubmitButton) {
			ClickOnSubmitButton = clickOnSubmitButton;
		}

		public WebElement getClickOKButton() {
			return ClickOKButton;
		}

		public void setClickOKButton(WebElement clickOKButton) {
			ClickOKButton = clickOKButton;
		}
		
		 
		 
		
		 
		 
}
