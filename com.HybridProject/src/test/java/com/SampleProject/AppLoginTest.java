package com.SampleProject;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.app.Utilities.BaseConfiguration;
import com.app.Utilities.CaptureScreenshot;





public class AppLoginTest extends BaseConfiguration
{
	
	public  AppServices appservice;
	public static CaptureScreenshot capture;
	
	  
	
	//public static String[][] logindata = {{"qatrainer","admin12"},{"qatrainer","admin123"},{"tester3","admin3"}};
	
	
	
	@BeforeSuite
	public void setupsuite() {
		
		appservice=new AppServices();
		
			
	}
	
	
   
    @Test(priority=1,description ="verify valid login")
    public void verifyLogin() throws Exception
    {
    	
        	
    	    	
    	appservice.launchbrowser().clickHomeLink().insertUserName().insertpassword().clicksubmitbutton().clicksignout().close();
    	
    	appservice.launchbrowser().clickHomeLink().close();
    	
    	
    }
    
    
    @Test(priority=2,description ="verify invalid login")
    public void verifyInvalidLogin() throws Exception 
    {
    	
		 
    	appservice.launchbrowser().clickHomeLink().insertInvalidUserName().insertpassword().clicksubmitbutton().clicksignout();
    	
    	
    }
    	
    	
    
    
    
   
  @AfterTest
  public void closebrowser() {
	  
	  appservice.close();
	  
	
	  
  }
  
    
    
}
