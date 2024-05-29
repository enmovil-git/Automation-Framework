package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.GeoFenceInOut;


public class GeoFenceInOutService {
	public static GeoFenceInOut geoFenceInOut;
	
	public GeoFenceInOutService clickSeletType() {
		BrowserDriver.wait(3);
		
		geoFenceInOut.getClickSideMenu().click();
		
		geoFenceInOut.getClickUtilities().click();
		
		geoFenceInOut.getClickGeoFenceInOut().click();
		BrowserDriver.wait(1);
		
		geoFenceInOut.getClickDealerDropDown().click();
		BrowserDriver.wait(1);
		
		geoFenceInOut.getSelectDealerDropDown().click();
		BrowserDriver.wait(1);
		
		geoFenceInOut.getClickVinDropDown().sendKeys("MEC854FBBRP157802");
		
		
		return this;
}
	
//	////////// calendar //////////////////////
	
	public GeoFenceInOutService clickCalendar3() {
		BrowserDriver.wait(2);
		Calendar3Service.CalendarCode3();
		return this;
	}

	/////////////////////////////////////////////////////////////////////
	public GeoFenceInOutService Submitbutton() 
	{
		
		geoFenceInOut.getClickGetDataButton().click();
		
		return this;
	}
	
	
	
	public static void init() {
		geoFenceInOut = PageFactory.initElements(BrowserDriver.getCurrentDriver(), GeoFenceInOut.class);
	}
	}