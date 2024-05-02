package com.poc.atf.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.AllScreenObjects;
import com.poc.atf.pageobjects.CreateDOObjects;
import com.poc.atf.pageobjects.MenuNamesandRepectiveScreenNamesObjects;

public class MenuNamesandRespectiveScreenNamesServices {
	
	public static MenuNamesandRepectiveScreenNamesObjects menuNamesandRepectiveScreenNamesObjects;
	private static Logger log = Logger.getLogger(MenuNamesandRespectiveScreenNamesServices.class);
	
	// Initialize LoginObjects
    public static void init() {
    	menuNamesandRepectiveScreenNamesObjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MenuNamesandRepectiveScreenNamesObjects.class);
    }
    
    public MenuNamesandRespectiveScreenNamesServices Threedots(){
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	BrowserDriver.wait(2);
    	return this;
    }
    
    public void consignmentscreennames() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuConsignmentText().click();
    	
    }
    
    public String menuconsignmnettext() {
    	String menuconstext = menuNamesandRepectiveScreenNamesObjects.getMenuConsignmentText().getText();
    	System.out.println("Cosignment text in menu: " + menuconstext);
    	return menuconstext;
    }
    
    
    public String screenconsignmnettext() {
    	String screenconstext = menuNamesandRepectiveScreenNamesObjects.getScreenConsignmentText().getText();
    	System.out.println("Consignment text in screen: " + screenconstext);
    	return screenconstext;
    }
    
    public void createDONameValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getMenuCreateDOText().click();
    }
    
    public String menuCreateDOtext() {
    	String menucreatedotext = menuNamesandRepectiveScreenNamesObjects.getMenuCreateDOText().getText();
    	System.out.println("CreateDO text in menu: " + menucreatedotext);
    	return menucreatedotext;
    }
    
    public String screenCreateDOtext() {
    	String screencreatedotext = menuNamesandRepectiveScreenNamesObjects.getScreenCreateDOText().getText();
    	System.out.println("CreateDO text in screen: " + screencreatedotext);
    	return screencreatedotext;
    }
    
    public void utilitiesnameclick() {
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnUtilitiesName().click();
    	BrowserDriver.wait(2);
    }
    
    public void truckWithGeoValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuTruckWithinGeofText().click();
    }
    
    public String screenTruckWithGeotext() {
    	String screentwgtext = menuNamesandRepectiveScreenNamesObjects.getScreenTruckWithinGeofText().getText();
    	System.out.println("Trucks Within Geofence text in screen: " + screentwgtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnUtilitiesName().click();
    	BrowserDriver.wait(2);
    	return screentwgtext;
    }
    
    public String menuTruckWithGeotext() {
    	String menutwgtext = menuNamesandRepectiveScreenNamesObjects.getMenuTruckWithinGeofText().getText();
    	System.out.println("Trucks Within Geofence text in menu: " + menutwgtext);
    	return menutwgtext;
    }
    
    public void viewCarrierValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuViewCarrierText().click();
    }
    
    public String screenViewCarrierText() {
    	String screenVCRtext = menuNamesandRepectiveScreenNamesObjects.getScreenViewCarrierText().getText();
    	System.out.println("Trucks Within Geofence text in screen: " + screenVCRtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnUtilitiesName().click();
    	BrowserDriver.wait(2);
    	return screenVCRtext;
    }
    
    public String menuViewCarriertext() {
    	String menuVCRtext = menuNamesandRepectiveScreenNamesObjects.getMenuViewCarrierText().getText();
    	System.out.println("Trucks Within Geofence text in menu: " + menuVCRtext);
    	return menuVCRtext;
    }
    
    public void truckLocationValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuTruckLocationText().click();
    }
    
    public String screenTruckLocationText() {
    	String screenTLtext = menuNamesandRepectiveScreenNamesObjects.getScreenTruckLocationText().getText();
    	System.out.println("Trucks Within Geofence text in screen: " + screenTLtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnUtilitiesName().click();
    	BrowserDriver.wait(2);
    	return screenTLtext;
    }
    
    public String menutruckLocationtext() {
    	String menuTLtext = menuNamesandRepectiveScreenNamesObjects.getMenuTruckLocationText().getText();
    	System.out.println("Trucks Within Geofence text in menu: " + menuTLtext);
    	return menuTLtext;
    }
    
    public void manageNameClick() {
    	menuNamesandRepectiveScreenNamesObjects.getClickOnManage().click();
    }
    
    public void manageTruckValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuTruckText().click();
    }
    
    public String screenTruckText() {
    	String screenTrutext = menuNamesandRepectiveScreenNamesObjects.getScreenTruckText().getText();
    	System.out.println("Truck text in screen: " + screenTrutext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnManage().click();
    	BrowserDriver.wait(2);
    	return screenTrutext;
    }
    
    public String menuTrucktext() {
    	String menuTrutext = menuNamesandRepectiveScreenNamesObjects.getMenuTruckText().getText();
    	System.out.println("Truck text in menu: " + menuTrutext);
    	return menuTrutext;
    }
}
