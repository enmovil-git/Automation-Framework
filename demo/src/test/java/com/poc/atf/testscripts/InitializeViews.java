package com.poc.atf.testscripts;
import org.openqa.selenium.WebDriver;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.VinLocation;
import com.poc.atf.services.AllConsignmenstService;
import com.poc.atf.services.Calendar2Service;
import com.poc.atf.services.Calendar3Service;
import com.poc.atf.services.CalendarService;
import com.poc.atf.services.DayWiseDistanceMonthlyService;
import com.poc.atf.services.DealerDeliveryLocationService;
import com.poc.atf.services.DeliveredConsignmenstService;
import com.poc.atf.services.DieselCostService;
import com.poc.atf.services.DistanceTravelledReportService;
import com.poc.atf.services.EnrouteStoppageReportService;
import com.poc.atf.services.GeoFenceInOutService;
import com.poc.atf.services.IntransitConsignmenstService;
import com.poc.atf.services.LoginPageService;
import com.poc.atf.services.NightDrivingReportService;
import com.poc.atf.services.OverSpeedReportService;
import com.poc.atf.services.PodDashBoardService;
import com.poc.atf.services.SummaryDashboardService;
import com.poc.atf.services.TollDetailsService;
import com.poc.atf.services.UtilitiesService;
import com.poc.atf.services.VendorPaymentService;
import com.poc.atf.services.VinsWithInGeoFenceService;
import com.poc.atf.services.ViewCarrierRouteService;
import com.poc.atf.services.VinLocationService;
import com.poc.atf.services.DealerDeliveryLocationService;
import com.poc.atf.services.GpsNotReceivedDataServices;


public class InitializeViews {
	
protected static WebDriver uiDriver = null;
	
	public static void init() {
		if(uiDriver == null) {
			uiDriver = BrowserDriver.getCurrentDriver();
		}
		LoginPageService.init();
		IntransitConsignmenstService.init();
		DeliveredConsignmenstService.init();
		AllConsignmenstService.init();
		SummaryDashboardService.init();
		UtilitiesService.init();
		CalendarService.init();
		VinsWithInGeoFenceService.init();
		ViewCarrierRouteService.init();
		VinLocationService.init();
		DealerDeliveryLocationService.init();
		GpsNotReceivedDataServices.init();
		GeoFenceInOutService.init();
		TollDetailsService.init();
		PodDashBoardService.init();
		DieselCostService.init();
		VendorPaymentService.init();
		OverSpeedReportService.init();
		Calendar2Service.init();
		NightDrivingReportService.init();
		EnrouteStoppageReportService.init();
		DistanceTravelledReportService.init();
		DayWiseDistanceMonthlyService.init();
		Calendar3Service.init();

	
		
	} 
}
