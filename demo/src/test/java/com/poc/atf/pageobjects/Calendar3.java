package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calendar3 {
	//Calendar 
	 @FindBy(xpath = ("//input[@name='startDate']"))
	 private WebElement ClickFromDateCalendar;
	 
	// Month Year Header 
	 @FindBy(xpath = ("//div[@class='rdt rdtOpen']//th[@class='rdtSwitch']"))
	 private WebElement ClickMonthYear;
	 
	 
	 //year header
		@FindBy(xpath = ("//div[@class='rdt rdtOpen']//th[@class='rdtSwitch']"))
		private WebElement ClickYearHeader;
	
		
		// select year
		@FindBy(xpath = ("//td[text()='2024']"))
		private WebElement SelectYear;


		//select month
		@FindBy(xpath = ("//td[text()='Jan']"))
        private WebElement SelectMonth;

		// select date
		@FindBy(xpath = ("(//td[text()='20'])[1]"))
		private WebElement SelectDate;
		
		
		// To Date Calendar 
	
		@FindBy(xpath = ("//input[@name='endDate']"))
		 private WebElement ClickToDateCalendar;
		
		
		
		// To date Month Year Header 
		 @FindBy(xpath = ("//div[@class='rdt rdtOpen']//th[@class='rdtSwitch']"))
		 private WebElement ClickTodateMonthYear;
		 
		// To date year header
			@FindBy(xpath = ("//div[@class='rdt rdtOpen']//th[@class='rdtSwitch']"))
			private WebElement ClickTodateYearHeader;
		 
			
			// select To date year
			@FindBy(xpath = ("//td[text()='2024']"))
			private WebElement SelectTodateYear;
	

			//select To date  month
			@FindBy(xpath = ("//td[text()='Feb']"))
	         private WebElement SelectTodateMonth;

			// select To date
			@FindBy(xpath = ("(//td[text()='24'])[2]"))
			private WebElement SelectToDate;

			public WebElement getClickFromDateCalendar() {
				return ClickFromDateCalendar;
			}

			public void setClickFromDateCalendar(WebElement clickFromDateCalendar) {
				ClickFromDateCalendar = clickFromDateCalendar;
			}

			public WebElement getClickMonthYear() {
				return ClickMonthYear;
			}

			public void setClickMonthYear(WebElement clickMonthYear) {
				ClickMonthYear = clickMonthYear;
			}

			public WebElement getClickYearHeader() {
				return ClickYearHeader;
			}

			public void setClickYearHeader(WebElement clickYearHeader) {
				ClickYearHeader = clickYearHeader;
			}

			public WebElement getSelectYear() {
				return SelectYear;
			}

			public void setSelectYear(WebElement selectYear) {
				SelectYear = selectYear;
			}

			public WebElement getSelectMonth() {
				return SelectMonth;
			}

			public void setSelectMonth(WebElement selectMonth) {
				SelectMonth = selectMonth;
			}

			public WebElement getSelectDate() {
				return SelectDate;
			}

			public void setSelectDate(WebElement selectDate) {
				SelectDate = selectDate;
			}

			public WebElement getClickToDateCalendar() {
				return ClickToDateCalendar;
			}

			public void setClickToDateCalendar(WebElement clickToDateCalendar) {
				ClickToDateCalendar = clickToDateCalendar;
			}

			public WebElement getClickTodateMonthYear() {
				return ClickTodateMonthYear;
			}

			public void setClickTodateMonthYear(WebElement clickTodateMonthYear) {
				ClickTodateMonthYear = clickTodateMonthYear;
			}

			public WebElement getClickTodateYearHeader() {
				return ClickTodateYearHeader;
			}

			public void setClickTodateYearHeader(WebElement clickTodateYearHeader) {
				ClickTodateYearHeader = clickTodateYearHeader;
			}

			public WebElement getSelectTodateYear() {
				return SelectTodateYear;
			}

			public void setSelectTodateYear(WebElement selectTodateYear) {
				SelectTodateYear = selectTodateYear;
			}

			public WebElement getSelectTodateMonth() {
				return SelectTodateMonth;
			}

			public void setSelectTodateMonth(WebElement selectTodateMonth) {
				SelectTodateMonth = selectTodateMonth;
			}

			public WebElement getSelectToDate() {
				return SelectToDate;
			}

			public void setSelectToDate(WebElement selectToDate) {
				SelectToDate = selectToDate;
			}
		
			
			
		
}
