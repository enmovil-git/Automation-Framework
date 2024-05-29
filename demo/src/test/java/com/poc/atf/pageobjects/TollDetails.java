package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class TollDetails {

	// side menu 
		 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
		 private WebElement ClickSideMenu;
		
		 
		 
		// menuUtilities
		 @FindBy(xpath = ("// a[text()='Utilities']"))
		 private WebElement ClickUtilities;
		 
		 // Toll Details 
		 @FindBy(xpath = ("//a[text() = 'Toll Details']"))
		 private WebElement ClickTollDetails;

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

		public WebElement getClickTollDetails() {
			return ClickTollDetails;
		}

		public void setClickTollDetails(WebElement clickTollDetails) {
			ClickTollDetails = clickTollDetails;
		}
		 
		 
}
