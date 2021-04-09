package com.SampleProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.TestCases.BasicContactFormServices;
import com.app.Utilities.BaseConfiguration;

public class AppBasicContactFormTestCase extends BaseConfiguration{
	
	public static BasicContactFormServices contactform;
	
	
	@BeforeSuite
	public void setupsuite() {
		
		contactform = new BasicContactFormServices();
		
	}
	
  @Test
  public void verifycontact() {
	  
	  
	  contactform.browserlaunch().clicksampleform().clickbasiccontactform().insertyourname().insertmail().insertsubject().clickcontactformsubmit().closeBrowser();
	  
	  
  }
  
  @Test
  public void verifybasicontactlink() {
	  
	  contactform.browserlaunch().clicksampleform().clickbasiccontactform().closeBrowser();
	  
	  
  }
  
  
  
  
  
}
