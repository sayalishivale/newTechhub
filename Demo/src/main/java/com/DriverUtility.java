//package com;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DriverUtility {
//
//	public static WebDriver driver;
//
//
//	public void initializeDriver() {
//		try{
//			if(driver.equals(null))
//			{
//				System.setProperty("webdriver.chrome.driver","C:/Users/a622996/workspace/Demo/Browser/chromedriver.exe");
//				driver=new ChromeDriver();
//				driver.get("http://techhubportal.ap-south-1.elasticbeanstalk.com/");
//				driver.manage().window().maximize();
//				System.out.println("driver instance ");
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//
//	}
//
//	public void close_driver()
//	{
//		driver.close();
//	}
//
//}
