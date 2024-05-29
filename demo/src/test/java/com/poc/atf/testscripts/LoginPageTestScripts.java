package com.poc.atf.testscripts;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.config.PropertyLoader;
import com.poc.atf.data.IntransitConsignmentsData;
import com.poc.atf.data.POCDataConfig;
import com.poc.atf.data.POCLoginData;
import com.poc.atf.services.AllConsignmenstService;
import com.poc.atf.services.Calendar2Service;
import com.poc.atf.services.Calendar3Service;
import com.poc.atf.services.CalendarService;
import com.poc.atf.services.DayWiseDistanceMonthlyService;
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

import util.BaseListener;

public class LoginPageTestScripts extends BaseListener {
	
	LoginPageService loginPageService = null;
	POCLoginData pocLoginData = null;
	IntransitConsignmentsData intransitConsignmentsData = null;
	IntransitConsignmenstService intransitConsignmenstService = null;
	DeliveredConsignmenstService deliveredConsignmenstService = null;
	AllConsignmenstService allConsignmenstService = null;
	SummaryDashboardService summaryDashboardService = null;
	UtilitiesService utilitiesService = null;
	CalendarService calendarService = null;
	VinsWithInGeoFenceService vinsWithInGeoFence = null;
	ViewCarrierRouteService viewCarrierRoute = null;
	VinLocationService vinLocation = null;
	DealerDeliveryLocationService dealerDeliveryLocation = null;
	GpsNotReceivedDataServices gpsNotReceivedData = null;
	GeoFenceInOutService geoFenceInOut = null;
	TollDetailsService tollDetails = null;
	PodDashBoardService podDashBoard = null;
	DieselCostService dieselCost = null;
    VendorPaymentService vendorPayment = null;
    OverSpeedReportService overSpeedReport = null;
    Calendar2Service calendar2 = null;
    NightDrivingReportService nightDrivingReport = null;
    EnrouteStoppageReportService enrouterStoppageReport = null;
    DistanceTravelledReportService distanceTravelledreport = null;
    DayWiseDistanceMonthlyService dayWiseDistanceMonthly = null;
    Calendar3Service calendar3 = null;

	
    @BeforeClass
    
	public void init() {
	loginPageService = new LoginPageService();
	pocLoginData = new POCDataConfig().getLoginData();
	intransitConsignmentsData = new POCDataConfig().getIntransitConsignmentsData();
	intransitConsignmenstService = new IntransitConsignmenstService();
	deliveredConsignmenstService = new DeliveredConsignmenstService();
	allConsignmenstService = new AllConsignmenstService();
	summaryDashboardService = new SummaryDashboardService();
	utilitiesService = new UtilitiesService();
	calendarService = new CalendarService();
	vinsWithInGeoFence = new VinsWithInGeoFenceService();
	viewCarrierRoute = new ViewCarrierRouteService();
	vinLocation = new VinLocationService();
	dealerDeliveryLocation = new DealerDeliveryLocationService();
	gpsNotReceivedData = new GpsNotReceivedDataServices();
	geoFenceInOut = new GeoFenceInOutService();
	tollDetails = new TollDetailsService ();
	podDashBoard = new PodDashBoardService();
	dieselCost = new DieselCostService();
	vendorPayment = new VendorPaymentService();
	overSpeedReport = new OverSpeedReportService();
	calendar2 = new Calendar2Service();	
	nightDrivingReport = new NightDrivingReportService();
	enrouterStoppageReport = new EnrouteStoppageReportService();   
	distanceTravelledreport = new DistanceTravelledReportService();
	dayWiseDistanceMonthly = new DayWiseDistanceMonthlyService();
	calendar3 = new Calendar3Service();
	
	
	InitializeViews.init();
	logger = extent.createTest("Daimler:: Login Test");
	
    }
    

  @Test(description="Open Daimler Application",priority=1)
  public void logIN() {
	
	BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getPOCUrl());
	loginPageService.loginToPOCApplication(pocLoginData.getPocLoginUser(), pocLoginData.getPocPassword());
   }
  
  
   @Test(description="In Transit Consignment Tab",priority=2)
   public void inTransitTest() {
   intransitConsignmenstService.clickSeletType().clickCalendarType().DealerDropdowns();
   
   }
   
//   
//    @Test(description="Delivered Consignment Tab",priority=3)
//   public void deliveredConsignTest() {
//   deliveredConsignmenstService.clickSeletType().clickCalendarType().DealerDropdowns();
//  }
//
//    
//    
//   @Test(description="All Consignment Tab",priority=4)
//   public void allConsignmentTest() {
//	allConsignmenstService.clickSeletType().clickCalendarType().DealerDropdowns();
//      }


   
   
	@Test(description="Summary Dashboard",priority=5)
	public void summaryDashboardTest() {
		summaryDashboardService.clickSeletType().clickCalendarType().DealerDropdowns();
	}	

	
	
    @Test(description="Utilities GPS Integration",priority=6)
    public void utilitiesTest() {
	utilitiesService.clickSeletType();
   }
    
    

    @Test(description="VinsWithInGeoFence",priority=7)
    public void vinsWithInGeoFenceTest() {
    	vinsWithInGeoFence.clickSeletType();
    }

    @Test(description="VinLocation",priority=8)
    public void vinLocationTest() {
    	vinLocation.clickSeletType();
    }}
//    
//    @Test(description="ViewCarrierRoute",priority=9)
//    public void viewCarrierRouteTest() {
//    	viewCarrierRoute.clickSeletType().clickCalendar3().DealerDropdowns();
//    }
// 
//    
//	
//
// @Test(description="DealerDeliveryLocation",priority=10)
//  public void dealerDeliveryLocationTest() {
//	 dealerDeliveryLocation.clickSeletType();  
//	 
// }
// 
// 
//	 @Test(description="GpsNotReceivedData",priority=11)
//	  public void gpsNotReceivedDataTest() {
//		 gpsNotReceivedData.clickSeletType(); 
//	 } 
//	 
//	 
//		 
//		 @Test(description="GeoFenceInOut",priority=12)
//		  public void GeoFenceInOutTest() {
//			 geoFenceInOut.clickSeletType().clickCalendar3().Submitbutton();
//		 } 
//		 
//	 
//			 @Test(description="TollDetails",priority=13)
//			  public void TollDetailsTest() {
//				 tollDetails.clickSeletType();
//				 
//			 }
//
//				 @Test(description="PodDashBoard",priority=14)
//				  public void PodDashBoardTest() {
//					 podDashBoard.clickSeletType().clickCalendarType().DealerDropdowns();
//				 }
//  
//					 @Test(description="DieselCost",priority=15)
//					  public void DieselCostTest() {
//						 dieselCost.clickSeletType().clickSeletType();
//			 }
//					 
//					 @Test(description="VendorPayment",priority=16)
//					  public void VendorPaymentTest() {
//						 vendorPayment.clickSeletType().clickCalendarType().clickButtons();
//					 
//		 }	 
//					 @Test(description="OverSpeedReport",priority=17)
//					  public void OverSpeedReportTest() {
//						 overSpeedReport.clickSeletType().clickCalendarType().clickButtons();
//
// }
//					 @Test(description="NightDrivingdReport",priority=18)
//					  public void NightDrivingReportTest() {
//						 nightDrivingReport.clickSeletType().clickCalendarType().clickButtons();
//}
//					 @Test(description="EnrouteStoppageReport",priority=19)
//					  public void EnrouteStoppageReportTest() {
//						 enrouterStoppageReport.clickSeletType().clickCalendarType().clickButtons();
//						 
//					 }
//
//					 @Test(description="DistanceTravelledreport",priority=20)
//					  public void DistanceTravelledreportTest() {
//						 distanceTravelledreport.clickSeletType().clickCalendarType().clickButtons();
//}
//
//					 @Test(description="DayWiseDistanceMonthly",priority=21)
//					  public void DayWiseDistanceMonthlyreportTest() {
//						 dayWiseDistanceMonthly.clickSeletType();
//}
//    }	
//

 