package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealerDeliveryLocation {
	        // side menu 
			 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
			 private WebElement ClickSideMenu;
			
			
			// menuUtilities
			 @FindBy(xpath = ("// a[text()='Utilities']"))
			 private WebElement ClickUtilities;
			 
			 // Dealer Delivery Location
			 @FindBy(xpath = ("//a[text() = 'Dealer Deliver Locations']"))
			 private WebElement ClickDealerDeliveryLocation;
			 
			 //Show Leg Icon
			 @FindBy(xpath = ("(//i[@class=\"icofont icofont-list f25\"])[1]"))
			 private WebElement ClickShowLegIcon;
			 
			 //Recent Five Location 
			 @FindBy(xpath = ("(//i[@class=\"icofont icofont-map-pins f25\"])[3]"))
			 private WebElement ClickRecentFiveLocationIcon;
			 
			 
			 //Show Leg Icon
			 @FindBy(xpath = ("(//i[@class=\"icofont icofont-map-pins f25\"])[4]"))
			 private WebElement ClickViewRouteIcon;

			 
			 //Show Leg Icon
			 @FindBy(xpath = ("//button[text()='OK']"))
			 private WebElement ClickOkButton;


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


			public WebElement getClickDealerDeliveryLocation() {
				return ClickDealerDeliveryLocation;
			}


			public void setClickDealerDeliveryLocation(WebElement clickDealerDeliveryLocation) {
				ClickDealerDeliveryLocation = clickDealerDeliveryLocation;
			}


			public WebElement getClickShowLegIcon() {
				return ClickShowLegIcon;
			}


			public void setClickShowLegIcon(WebElement clickShowLegIcon) {
				ClickShowLegIcon = clickShowLegIcon;
			}


			public WebElement getClickRecentFiveLocationIcon() {
				return ClickRecentFiveLocationIcon;
			}


			public void setClickRecentFiveLocationIcon(WebElement clickRecentFiveLocationIcon) {
				ClickRecentFiveLocationIcon = clickRecentFiveLocationIcon;
			}


			public WebElement getClickViewRouteIcon() {
				return ClickViewRouteIcon;
			}


			public void setClickViewRouteIcon(WebElement clickViewRouteIcon) {
				ClickViewRouteIcon = clickViewRouteIcon;
			}


			public WebElement getClickOkButton() {
				return ClickOkButton;
			}


			public void setClickOkButton(WebElement clickOkButton) {
				ClickOkButton = clickOkButton;
			}
			
			 
			 
			 
}
