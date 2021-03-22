package com.SampleProject;



import com.Project.Utilities.Objectrep;
import com.app.Utilities.BaseConfiguration;
import com.myApp.utility.CommonUtils;


public class AppServices extends BaseConfiguration {
 
	public Objectrep read;
	
	
	public AppServices launchbrowser() {
		
		read = new Objectrep();
		InvokeBrowser("chrome");
		return this;
	}
	
	
	public AppServices clickHomeLink() {
		
		
		CommonUtils.clickweblink("xpath", read.getObjects().getProperty("mycontactform_samplelink"), driver);
		
		
		
		return this;
	}
	
	public AppServices insertUserName() {
		
		CommonUtils.insertText("name", read.getObjects().getProperty("subject_field"),"qatrainer",driver);
		
		return this;
	}
	
	public AppServices insertInvalidUserName() {
		
		CommonUtils.insertText("name", read.getObjects().getProperty("subject_field"),"tester",driver);
		
		return this;
	}
	
	
	public AppServices insertpassword() {
		
		CommonUtils.insertText("name", read.getObjects().getProperty("password_field"), "admin123",driver);
		
		return this;
	}
	
	
	public AppServices clicksubmitbutton() {
		CommonUtils.clickButton("name",read.getObjects().getProperty("login_button"), driver);
		
		return this;
	}
	
	
	public AppServices clicksignout() {
		
		
		try {
			
			CommonUtils.clickButton("xpath", read.getObjects().getProperty("signout_button"), driver);
								
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("Login Fail");
			
		}
		
		
		
		return this;
	}
	
	
	
	public AppServices close() {
		
		closeBrowser();
		System.out.println("Closing browser");
		
		
		
		return this;
		
	}
	
	
}
