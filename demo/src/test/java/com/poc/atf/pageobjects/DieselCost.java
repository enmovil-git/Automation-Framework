package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DieselCost {
	
	// side menu 
		 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
		 private WebElement ClickSideMenu;
		 
		 
		 // Vendor Payment Reconcilliation Menu
		 @FindBy(xpath = ("//span[text()='Vendor Payment Reconcilliation']"))
		 private WebElement ClickVendorPaymentReconcilliationMenu;
		 
		 
			// side Diesel cost menu 
		 @FindBy(xpath = ("//a[text()='Diesel Costs']"))
		 private WebElement ClickDieselCostMenu;
		 
		 // Add Diesel Cost button
		 @FindBy(xpath = ("//button[text()=' Add Diesel Cost']"))
		 private WebElement ClickAddDieselCostButton;
		 
		 // click Close button 
		 @FindBy(xpath = ("(//span[text()='X'])[2]"))
		 private WebElement ClickCloseButton;
		 
		 // Click Edit Button 
		 @FindBy(xpath = ("(//button[text()='Edit'])[1]"))
		 private WebElement ClickEditButton;
		 
		 
		 //Edit click Close button 
		 @FindBy(xpath = ("(//span[text()='X'])[3]"))
		 private WebElement ClickCloseButton2;


		public WebElement getClickSideMenu() {
			return ClickSideMenu;
		}


		public void setClickSideMenu(WebElement clickSideMenu) {
			ClickSideMenu = clickSideMenu;
		}


		public WebElement getClickVendorPaymentReconcilliationMenu() {
			return ClickVendorPaymentReconcilliationMenu;
		}


		public void setClickVendorPaymentReconcilliationMenu(WebElement clickVendorPaymentReconcilliationMenu) {
			ClickVendorPaymentReconcilliationMenu = clickVendorPaymentReconcilliationMenu;
		}


		public WebElement getClickDieselCostMenu() {
			return ClickDieselCostMenu;
		}


		public void setClickDieselCostMenu(WebElement clickDieselCostMenu) {
			ClickDieselCostMenu = clickDieselCostMenu;
		}


		public WebElement getClickAddDieselCostButton() {
			return ClickAddDieselCostButton;
		}


		public void setClickAddDieselCostButton(WebElement clickAddDieselCostButton) {
			ClickAddDieselCostButton = clickAddDieselCostButton;
		}


		public WebElement getClickCloseButton() {
			return ClickCloseButton;
		}


		public void setClickCloseButton(WebElement clickCloseButton) {
			ClickCloseButton = clickCloseButton;
		}


		public WebElement getClickEditButton() {
			return ClickEditButton;
		}


		public void setClickEditButton(WebElement clickEditButton) {
			ClickEditButton = clickEditButton;
		}


		public WebElement getClickCloseButton2() {
			return ClickCloseButton2;
		}


		public void setClickCloseButton2(WebElement clickCloseButton2) {
			ClickCloseButton2 = clickCloseButton2;
		}
		 
		 
		 


}
