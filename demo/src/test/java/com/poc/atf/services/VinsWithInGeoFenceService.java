package com.poc.atf.services;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.VinsWithInGeoFence;


public class VinsWithInGeoFenceService {
	
public static VinsWithInGeoFence vinsWithInGeoFence;

	
	public  VinsWithInGeoFenceService clickSeletType() {
		BrowserDriver.wait(5);
	
		vinsWithInGeoFence.getClickSideMenu().click();
		BrowserDriver.wait(5);
		
		vinsWithInGeoFence.getClickUtilities().click();
		BrowserDriver.wait(5);
		
		vinsWithInGeoFence.getClickOnVinsWithInGeoFence().click();
		BrowserDriver.wait(5);
		
		vinsWithInGeoFence.getClickOnSearchTYpeDropDown().click();
		BrowserDriver.wait(5);
		
        vinsWithInGeoFence.getSelectPlant().click();
		
		vinsWithInGeoFence.getClickOnSelectTYpeDropDown().click();
		BrowserDriver.wait(5);
		vinsWithInGeoFence.getSelectAllVins().click();
		

		vinsWithInGeoFence.getClickOnPlantDropDown().click();
		BrowserDriver.wait(5);
		vinsWithInGeoFence.getSelectChennai().click();
		
		vinsWithInGeoFence.getClear().clear();
		vinsWithInGeoFence.getEnterRadius().sendKeys("1500");
		
		vinsWithInGeoFence.getClickOnCheckBox().click();
		
		vinsWithInGeoFence.getClickonSubmitButton().click();
		BrowserDriver.wait(7);
		
		vinsWithInGeoFence.getClickOKButton().click();
		
		
		return this;	
       }
	
    public static void init() {
	vinsWithInGeoFence = PageFactory.initElements(BrowserDriver.getCurrentDriver(), VinsWithInGeoFence.class);
}

}