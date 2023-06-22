package testlayer;

import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import basepackage.Baseclass;
import pompackage.POMLogin; 

public class TestLayer extends Baseclass {

	
	POMLogin Log;
	public TestLayer() {
		
		super ();
	}
		@BeforeMethod
		public void initsetup() {
			initiate();
			screenshot("Login");
			
			
			Log = new POMLogin();
		}
		
		@Test
		public void validusername() {
			
		}
	
		@Test
		
		public void Title() {
			String actual = Log.verify();
		Assert.assertEquals(actual,"OrangeHRM");
		
		}
		@Test
		public void login() {
			Log.typepassword(null);
		}
		
		
		@AfterMethod
		public void close() {
			
			driver.close();
		}
		}
		
		

	
	
	

