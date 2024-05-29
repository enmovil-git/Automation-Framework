package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PodDashBoard {
	
	// side menu 
			 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
			 private WebElement ClickSideMenu;
			 
			// POD menu
			 @FindBy(xpath = ("//span[text()='POD Status']"))
			 private WebElement ClickPodMenu;
			 
			// POD dashBoard menu
			 @FindBy(xpath = ("//a[text()='POD Dashboard']"))
			 private WebElement ClickPodDashBoard;
			 
			 
			// Click Dealer DropDOwn 
			 @FindBy(xpath = ("//div[@id='dealercode']"))
			 private WebElement ClickDealerDropDOwn;
			 
			// Select Dealer DropDOwn 
			 @FindBy(xpath = ("//div[text()='JAYARAJ TRUCKING-4122018A-Madurai']"))
			 private WebElement SelectDealerName;
			 
				// Click Dealer DropDOwn 
			 @FindBy(xpath = ("//button[text()='Submit']"))
			 private WebElement ClickSubmitButton;
			 
			 
			 
			 // Click on Total PODS KPI
			 @FindBy(xpath = ("//span[text()='Total PODS']"))
			 private WebElement ClickTotalPODSKPI;
			 
			 
			 // Click on Pending PODS KPI
			 @FindBy(xpath = ("//span[text()='POD Pending']"))
			 private WebElement ClickPendingPODSKPI;
			 
			 
			 // Click on PODS Submitted KPI
			 @FindBy(xpath = ("//span[text()='POD Submitted']"))
			 private WebElement ClickPODSSubmittedKPI;
			
			 
			// Click on With Defects KPI
			 @FindBy(xpath = ("//span[text()='With Defects:']"))
			 private WebElement ClickWithDefectsKPI;
			 
			 
			// Click on WithOut  Defects KPI
			 @FindBy(xpath = ("//span[text()='Without Defects:']"))
			 private WebElement ClickWithOutDefectsKPI;
			 
			 
			// Click on With Defects KPI
			 @FindBy(xpath = ("//span[text()='POD Approved']"))
			 private WebElement ClickPodApprovedsKPI;


			public WebElement getClickSideMenu() {
				return ClickSideMenu;
			}


			public void setClickSideMenu(WebElement clickSideMenu) {
				ClickSideMenu = clickSideMenu;
			}


			public WebElement getClickPodMenu() {
				return ClickPodMenu;
			}


			public void setClickPodMenu(WebElement clickPodMenu) {
				ClickPodMenu = clickPodMenu;
			}


			public WebElement getClickPodDashBoard() {
				return ClickPodDashBoard;
			}


			public void setClickPodDashBoard(WebElement clickPodDashBoard) {
				ClickPodDashBoard = clickPodDashBoard;
			}


			public WebElement getClickDealerDropDOwn() {
				return ClickDealerDropDOwn;
			}


			public void setClickDealerDropDOwn(WebElement clickDealerDropDOwn) {
				ClickDealerDropDOwn = clickDealerDropDOwn;
			}


			public WebElement getSelectDealerName() {
				return SelectDealerName;
			}


			public void setSelectDealerName(WebElement selectDealerName) {
				SelectDealerName = selectDealerName;
			}


			public WebElement getClickSubmitButton() {
				return ClickSubmitButton;
			}


			public void setClickSubmitButton(WebElement clickSubmitButton) {
				ClickSubmitButton = clickSubmitButton;
			}


			public WebElement getClickTotalPODSKPI() {
				return ClickTotalPODSKPI;
			}


			public void setClickTotalPODSKPI(WebElement clickTotalPODSKPI) {
				ClickTotalPODSKPI = clickTotalPODSKPI;
			}


			public WebElement getClickPendingPODSKPI() {
				return ClickPendingPODSKPI;
			}


			public void setClickPendingPODSKPI(WebElement clickPendingPODSKPI) {
				ClickPendingPODSKPI = clickPendingPODSKPI;
			}


			public WebElement getClickPODSSubmittedKPI() {
				return ClickPODSSubmittedKPI;
			}


			public void setClickPODSSubmittedKPI(WebElement clickPODSSubmittedKPI) {
				ClickPODSSubmittedKPI = clickPODSSubmittedKPI;
			}


			public WebElement getClickWithDefectsKPI() {
				return ClickWithDefectsKPI;
			}


			public void setClickWithDefectsKPI(WebElement clickWithDefectsKPI) {
				ClickWithDefectsKPI = clickWithDefectsKPI;
			}


			public WebElement getClickWithOutDefectsKPI() {
				return ClickWithOutDefectsKPI;
			}


			public void setClickWithOutDefectsKPI(WebElement clickWithOutDefectsKPI) {
				ClickWithOutDefectsKPI = clickWithOutDefectsKPI;
			}


			public WebElement getClickPodApprovedsKPI() {
				return ClickPodApprovedsKPI;
			}


			public void setClickPodApprovedsKPI(WebElement clickPodApprovedsKPI) {
				ClickPodApprovedsKPI = clickPodApprovedsKPI;
			}
	 
}
