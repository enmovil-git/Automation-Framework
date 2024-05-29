package com.poc.atf.services;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.poc.atf.config.BrowserDriver;

public class ViewRouteService {
	
    // Wait for AG Grid to load (You may need to implement an appropriate wait strategy)

    // Find all rows in the AG Grid
    List<WebElement> rows = (List<WebElement>) BrowserDriver.getCurrentDriver().findElement(By.xpath("//div[@role='row' and @row-index]"));

    // Loop through each row
    for (WebElement row : rows) {
        // Find map icons within the row
        List<WebElement> mapIcons = row.findElements(By.xpath("//button[@title='View Route']"));

        // Loop through each map icon in the row and click on it
        for (WebElement mapIcon : mapIcons) {             	
            	mapIcon.click();
            	  Thread.sleep(5000); // Sleep for 3 second
            	  
           
	              
            	 WebElement elementsCB = BrowserDriver.getCurrentDriver().findElement(By.xpath("\"(//span[text()='X'])[2]\""));
	               
            	  
            	  Thread.sleep(3000);
	               if (elementsCB.isDisplayed())
	                   
	                {
	                    // Click the element
	            	   elementsCB.click();
	                } else 
	                {
	                	WebElement elements = BrowserDriver.getCurrentDriver().findElement(By.xpath("//button[text()='OK']"));
	                	elements.click();
	              
            
         
        
    }

   
}

}
}


}
