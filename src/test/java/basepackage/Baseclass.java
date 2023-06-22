package basepackage;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import utility.Timeutils;

import java.util.Properties;
import java.io.File;
//import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;


public class Baseclass {

	
	public static Properties prop =new Properties();
	public static WebDriver driver = new ChromeDriver();
	
	public void BaseClass() {
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Vineet Kanwar Singh\\eclipse-workspace\\TestNG\\src\\test\\java\\environementvariables\\Config.properties");
		prop.load(file); 
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}
		public static void initiate() {
			
		String browsername =prop.getProperty("browser");
		
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
			}
		else if(browsername.equals("Firefox")) {			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(Timeutils.timepage, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}


		public static void screenshot(String Filename) {
			
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
			FileUtils.copyFile(file, new File("C:\\Users\\Vineet Kanwar Singh\\eclipse-workspace\\TestNG\\src\\test\\java\\screenshot\\screenshots" +Filename+".jpeg"));
			}
		catch(IOException e) {
			e.printStackTrace();
		}
			
			}
	 
	
}
