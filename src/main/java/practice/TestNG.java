package practice;


import org.testng.annotations.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;




public class TestNG {

	@BeforeSuite // e.g. system.setproeprty
  
public void beforesuite() {
	System.out.println("Before Suite");
}
  @BeforeTest // will be executed before first method
public void beforetest() {
	System.out.println("before test");
}
  @BeforeClass // login details
  public void beforeclass() {
	  System.out.println("before class");
  }
  @BeforeMethod // before each and every test case. e.g. 
  public void beforemethod() {
	  System.out.println("Before Method");
  }
 @AfterSuite
 public void aftersuite() {
	  System.out.println("after suite");
  }
	@Test(priority=1)
	public void Writetestcases() {
		System.out.println("First");
	}
	@Test(priority=3)
	public void executetestcases() {
			System.out.println("3rd");
	}
	
	@Test(priority=2)
	public void defectlog() {
		
		System.out.println("2nd");
	}
}
