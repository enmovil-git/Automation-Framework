package com.poc.atf.services;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.Calendar2;

public class Calendar2Service {

	public static Calendar2 calendar2;
	private static void highlightAndClick(WebElement element) {
        BrowserDriver.highlightElement(element);
        element.click();
	}
	public static void CalendarCode2() {
//////////calendar start Date  //////////////////////
		
		highlightAndClick(calendar2.getClickOnStartDate());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getClickEndMonth());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getSelectMonth());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getClickYear());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getSelectYear());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getSelectDate());
		BrowserDriver.wait(2);
		
	
//////////calendar To Date  //////////////////////
		
		highlightAndClick(calendar2.getClickOnEndDate());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getClickEndMonth());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getSelectEndMonth());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getClickYear());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getSelectYear());
		BrowserDriver.wait(1);
		highlightAndClick(calendar2.getSelectEndDate());
		BrowserDriver.wait(1);
	
			
	}
	
	public static void init() {
		calendar2 = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Calendar2.class);
	}
	
}