package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TechHubRaw {
	static WebDriver driver;
	public static void main(String[] args) {


		driver= new FirefoxDriver();
		driver.get("http://techhubportal.ap-south-1.elasticbeanstalk.com/");
		driver.manage().window().maximize();
		System.out.println("LoginPage title : "+driver.getTitle());
		 driver.findElement(By.xpath("//input[@name='dasid']")).sendKeys("A622996");
		 driver.findElement(By.cssSelector("input[type='password'][class='text-input text-input-md']")).sendKeys("Atos@123");
		 driver.findElement(By.cssSelector("button[class = 'submit-btn button button-md button-default button-default-md button-full button-full-md']")).click();
		 
		 System.out.println("HomePage title : "+driver.getTitle());
		 
		 driver.findElement(By.xpath("//button[@class='menuButtonClass bar-buttons bar-buttons-md bar-button bar-button-md bar-button-default bar-button-default-md bar-button-menutoggle bar-button-menutoggle-md']")).click();
	}
}
