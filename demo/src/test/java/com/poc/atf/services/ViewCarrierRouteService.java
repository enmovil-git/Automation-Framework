package com.poc.atf.services;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.ViewCarrierRoute;

public class ViewCarrierRouteService {	
public static ViewCarrierRoute viewCarrierRoute;

	
	public ViewCarrierRouteService clickSeletType() {
		BrowserDriver.wait(5);
		
		viewCarrierRoute.getClickSideMenu().click();
		BrowserDriver.wait(2);
		
		viewCarrierRoute.getClickUtilities().click();
		BrowserDriver.wait(2);
		
		viewCarrierRoute.getClickViewCarrierRoute().click();
		BrowserDriver.wait(2);
		
		viewCarrierRoute.getEnterVinNo().click();
		BrowserDriver.wait(5);
		viewCarrierRoute.getSelectVinNo().click();
		
		return this;
		}
			
		////////// calendar //////////////////////
			
			public ViewCarrierRouteService clickCalendar3() {
				BrowserDriver.wait(2);
				Calendar3Service.CalendarCode3();
				return this;
			}
			/////////////////////////////////////////////////////////////////////
			
			public ViewCarrierRouteService DealerDropdowns() 
			{

				viewCarrierRoute.getEnterDataIntreval().sendKeys("30");
				
				viewCarrierRoute.getClickOnSubmitButton().click();
				BrowserDriver.wait(5);
				
				viewCarrierRoute.getClickOKButton().click();
				
				return this;
			}
			public static void init() {
				viewCarrierRoute = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ViewCarrierRoute.class);
			}
			}