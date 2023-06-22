package practice;

import java.time.Duration;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;




public class ContactUs {

	WebDriver driver = new ChromeDriver();
	
	@BeforeSuite
	public void roicians () {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.roicians.com/contact-us/");
		driver.manage().window().maximize();
	
	}
	
	
//	@BeforeTest
//	public void openbrowser() {
//		
		
	//}
	
	@BeforeMethod
	public void method ()  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	
	@Test
	public void firstname() throws InterruptedException {
		driver.findElement(By.id("text-77525447616")).sendKeys("Vineet Kanwar");
		Thread.sleep(3000);
	}


	
	@Test
	public void message() throws InterruptedException {
		driver.findElement(By.cssSelector("#field-kJfKGbPLNi5yFI7")).sendKeys("This is just for practice");
		Thread.sleep(3000);

	}
	@Test
	public void send() throws InterruptedException {
		driver.findElement(By.id("button-18782068913")).click();
		Thread.sleep(3000);

	}
	
	@AfterMethod
	public void closewindow() {
		
		driver.close();
	}
}
