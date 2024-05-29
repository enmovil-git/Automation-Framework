package com.poc.atf.services;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.DealerDeliveryLocation;
import com.poc.atf.pageobjects.GpsNotReceivedData;


public class GpsNotReceivedDataServices {
		public static GpsNotReceivedData gpsNotReceivedData;
		
		public GpsNotReceivedDataServices clickSeletType() {
			BrowserDriver.wait(5);
			
			gpsNotReceivedData.getClickSideMenu().click();
			
			gpsNotReceivedData.getClickUtilities().click();
			
			gpsNotReceivedData.getClickGpsNotReceivedData().click();
			BrowserDriver.wait(5);
			
			gpsNotReceivedData.getClickTotalVinsCounter().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			gpsNotReceivedData.getClickCounter2().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			gpsNotReceivedData.getClickCounter3().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			gpsNotReceivedData.getClickCounter4().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			gpsNotReceivedData.getClickCounter5().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			gpsNotReceivedData.getClickCounter6().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			gpsNotReceivedData.getClickCounter7().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			
			gpsNotReceivedData.getClickCounter8().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			gpsNotReceivedData.getClickCounter9().click();
			BrowserDriver.wait(5);
			BrowserDriver.scrollDown();
			BrowserDriver.wait(1);
			BrowserDriver.scrollUp();
			
			
			return this;	
		}
		public static void init() {
			gpsNotReceivedData = PageFactory.initElements(BrowserDriver.getCurrentDriver(), GpsNotReceivedData.class);
		}
	}