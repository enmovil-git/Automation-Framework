package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class GpsNotReceivedData 
{
	  // side menu 
	 @FindBy(xpath = ("//img[@id='sidebar-toggle']"))
	 private WebElement ClickSideMenu;
	
	 
	 
	// menuUtilities
	 @FindBy(xpath = ("// a[text()='Utilities']"))
	 private WebElement ClickUtilities;
	 
	 
	 //GPS Not Received Data
	 @FindBy(xpath = ("// a[text()='GPS Not Received Data']"))
	 private WebElement ClickGpsNotReceivedData;
	 
	 
	 // Total Vins counter
	 @FindBy(xpath = ("//span[text()=' Total Vins']"))
	 private WebElement ClickTotalVinsCounter;

	 // 1- 5 Days Counter
	 @FindBy(xpath = ("//span[text()=' 1-5 Days']"))
	 private WebElement ClickCounter2;
	 
	 
	 // 6- 10 Days Counter
	 @FindBy(xpath = ("//span[text()=' 6-10 Days']"))
	 private WebElement ClickCounter3;
	 
	 
	 // 10- 15 Days Counter
	 @FindBy(xpath = ("//span[text()=' 10-15 Days']"))
	 private WebElement ClickCounter4;
	 
	 
	 // 16- 20 Days Counter
	 @FindBy(xpath = ("//span[text()=' 16-20 Days']"))
	 private WebElement ClickCounter5;
	 
	 
	 // 21- 25 Days Counter
	 @FindBy(xpath = ("//span[text()=' 21-25 Days']"))
	 private WebElement ClickCounter6;
	 
	 
	 // 26- 30 Days Counter
	 @FindBy(xpath = ("//span[text()=' 26-30 Days']"))
	 private WebElement ClickCounter7;
	 
	 
	 // 31- 45 Days Counter
	 @FindBy(xpath = ("//span[text()=' 31-45 Days']"))
	 private WebElement ClickCounter8;
	 
	 
	 
	 // >45 Days Counter
	 @FindBy(xpath = ("//span[text()=' > 45 Days']"))
	 private WebElement ClickCounter9;



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



	public WebElement getClickGpsNotReceivedData() {
		return ClickGpsNotReceivedData;
	}



	public void setClickGpsNotReceivedData(WebElement clickGpsNotReceivedData) {
		ClickGpsNotReceivedData = clickGpsNotReceivedData;
	}



	public WebElement getClickTotalVinsCounter() {
		return ClickTotalVinsCounter;
	}



	public void setClickTotalVinsCounter(WebElement clickTotalVinsCounter) {
		ClickTotalVinsCounter = clickTotalVinsCounter;
	}



	public WebElement getClickCounter2() {
		return ClickCounter2;
	}



	public void setClickCounter2(WebElement clickCounter2) {
		ClickCounter2 = clickCounter2;
	}



	public WebElement getClickCounter3() {
		return ClickCounter3;
	}



	public void setClickCounter3(WebElement clickCounter3) {
		ClickCounter3 = clickCounter3;
	}



	public WebElement getClickCounter4() {
		return ClickCounter4;
	}



	public void setClickCounter4(WebElement clickCounter4) {
		ClickCounter4 = clickCounter4;
	}



	public WebElement getClickCounter5() {
		return ClickCounter5;
	}



	public void setClickCounter5(WebElement clickCounter5) {
		ClickCounter5 = clickCounter5;
	}



	public WebElement getClickCounter6() {
		return ClickCounter6;
	}



	public void setClickCounter6(WebElement clickCounter6) {
		ClickCounter6 = clickCounter6;
	}



	public WebElement getClickCounter7() {
		return ClickCounter7;
	}



	public void setClickCounter7(WebElement clickCounter7) {
		ClickCounter7 = clickCounter7;
	}



	public WebElement getClickCounter8() {
		return ClickCounter8;
	}



	public void setClickCounter8(WebElement clickCounter8) {
		ClickCounter8 = clickCounter8;
	}



	public WebElement getClickCounter9() {
		return ClickCounter9;
	}



	public void setClickCounter9(WebElement clickCounter9) {
		ClickCounter9 = clickCounter9;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
