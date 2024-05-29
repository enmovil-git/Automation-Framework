package com.poc.atf.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Calendar2 {
	
	
	// Start date calendar 
	
	@FindBy(xpath = ("//input[@name ='startDate']"))
	 private WebElement ClickOnStartDate;
	
	// Click on month Drop down
	
	  @FindBy(xpath = ("//select[@data-handler = 'selectMonth']"))
		 private WebElement ClickMonth;
	  
	  // Select Month 
	  @FindBy(xpath = ("//option[text()= 'Jan']"))
		 private WebElement SelectMonth;
	  
	  
	  //Click on Year Drop Down
	  @FindBy(xpath = ("//select[@data-handler='selectYear']"))
		 private WebElement ClickYear;
	  
	  // Select Year 
	  @FindBy(xpath = ("//option[text() ='2024']"))
		 private WebElement SelectYear;
	
	  // select date 
	  
	  @FindBy(xpath = ("//a[text() = '8']"))
		 private WebElement SelectDate;
	
	
	  
	  // To date Calendar 
	//Click on End Calendar
	  @FindBy(xpath = ("//input[@id='endDate']"))
		 private WebElement ClickOnEndDate;
	
	// Click on month Drop down
		
		  @FindBy(xpath = ("//select[@data-handler = 'selectMonth']"))
			 private WebElement ClickEndMonth;
		  
		  // Select Month 
		  @FindBy(xpath = ("//option[text()= 'Mar']"))
			 private WebElement SelectEndMonth;
		  
		  
		  //Click on Year Drop Down
		  @FindBy(xpath = ("//select[@data-handler='selectYear']"))
			 private WebElement ClickEndYear;
		  
		  // Select Year 
		  @FindBy(xpath = ("//option[text() ='2024']"))
			 private WebElement SelectEndYear;
		
		  // select date 
		  
		  @FindBy(xpath = ("//a[text() = '8']"))
			 private WebElement SelectEndDate;

		public WebElement getClickOnStartDate() {
			return ClickOnStartDate;
		}

		public void setClickOnStartDate(WebElement clickOnStartDate) {
			ClickOnStartDate = clickOnStartDate;
		}

		public WebElement getClickMonth() {
			return ClickMonth;
		}

		public void setClickMonth(WebElement clickMonth) {
			ClickMonth = clickMonth;
		}

		public WebElement getSelectMonth() {
			return SelectMonth;
		}

		public void setSelectMonth(WebElement selectMonth) {
			SelectMonth = selectMonth;
		}

		public WebElement getClickYear() {
			return ClickYear;
		}

		public void setClickYear(WebElement clickYear) {
			ClickYear = clickYear;
		}

		public WebElement getSelectYear() {
			return SelectYear;
		}

		public void setSelectYear(WebElement selectYear) {
			SelectYear = selectYear;
		}

		public WebElement getSelectDate() {
			return SelectDate;
		}

		public void setSelectDate(WebElement selectDate) {
			SelectDate = selectDate;
		}

		public WebElement getClickOnEndDate() {
			return ClickOnEndDate;
		}

		public void setClickOnEndDate(WebElement clickOnEndDate) {
			ClickOnEndDate = clickOnEndDate;
		}

		public WebElement getClickEndMonth() {
			return ClickEndMonth;
		}

		public void setClickEndMonth(WebElement clickEndMonth) {
			ClickEndMonth = clickEndMonth;
		}

		public WebElement getSelectEndMonth() {
			return SelectEndMonth;
		}

		public void setSelectEndMonth(WebElement selectEndMonth) {
			SelectEndMonth = selectEndMonth;
		}

		public WebElement getClickEndYear() {
			return ClickEndYear;
		}

		public void setClickEndYear(WebElement clickEndYear) {
			ClickEndYear = clickEndYear;
		}

		public WebElement getSelectEndYear() {
			return SelectEndYear;
		}

		public void setSelectEndYear(WebElement selectEndYear) {
			SelectEndYear = selectEndYear;
		}

		public WebElement getSelectEndDate() {
			return SelectEndDate;
		}

		public void setSelectEndDate(WebElement selectEndDate) {
			SelectEndDate = selectEndDate;
		}
		
		  
		  
}
	
	
	
	
	
	
