package com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.sql.Driver;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage {
	WebDriver LocalDriver;
	@FindBy(xpath="/html[1]/body[1]/ion-app[1]/ng-component[1]/ion-nav[1]/page-home[1]/ion-content[1]/div[2]/ion-nav[1]/page-agenda[1]/ion-content[1]/div[2]/ion-tabs[1]/ion-tab[1]/page-roomwisetab[1]/ion-header[1]/ion-navbar[1]/button[2]")WebElement Menu;
	//@FindBy(xpath="//ion-icon[@name='menu']")WebElement Menu;
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-home/ion-content/div[2]/ion-menu/div/ion-content/div[2]/ion-list/button[4]/div[1]/div")WebElement Logout;
	@FindBy(xpath="//span[contains(text(),'Register')]")WebElement Session1Tr1;

	@FindBy(xpath="//span[contains(text(),'Register')]")WebElement Session1Tr2;

	@FindBy(linkText="Swapnil More , Ajit Kokane")WebElement Presenter;
	//	@FindBy(xpath="//span[contains(text(),'TR02')]")WebElement TR;
	@FindBy(xpath = "//a[@id='tab-t0-1']//ion-icon[@class='tab-button-icon icon icon-md ion-md-home']") WebElement TR2;
	@FindBy(xpath = "//a[@id='tab-t0-1']//ion-icon[@class='tab-button-icon icon icon-md ion-md-home']") WebElement TR3;
	@FindBy(xpath = "/html[1]/body[1]/ion-app[1]/ng-component[1]/ion-nav[1]/page-home[1]/ion-content[1]/div[2]/ion-menu[1]/div[1]/ion-content[1]/div[2]/ion-list[1]/button[4]/div[1]/div[1]") WebElement Feedback;

	@FindBy (xpath="//input[@name='currentPassword']")WebElement OldPsw;
	@FindBy(xpath="//button[@class='submit-btn button button-md button-default button-default-md']") WebElement SubmitNewPassword;

	public HomePage(WebDriver driver) {
		this.LocalDriver=driver;

		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void CheckIfOnHomePage()
	{
		//	Assert.assertFalse(Menu.isEnabled());
	}
	public void RegisterSession1Tr1()
	{
		TR2.click();
		Session1Tr2.click();
//		Session1Tr2.click();
//		WebElement eleAlert=LocalDriver.findElement(By.xpath("//div[@class='alert-head']"));
//		System.out.println(eleAlert.getText());
//		WebElement OKbutton = LocalDriver.findElement(By.xpath("/html[1]/body[1]/ion-app[1]/ion-alert[1]/div[1]/div[3]/button[1]"));
//		WebDriverWait wait = new WebDriverWait(LocalDriver, 5);
//		wait.until(ExpectedConditions.elementToBeClickable(OKbutton));
//		OKbutton.click();
		
		TR3.click();
		//		WebElement eleAlert=LocalDriver.findElement(By.xpath("//div[@class='alert-head']"));
		//				System.out.println(eleAlert.getText());
		//				WebElement OKbutton = LocalDriver.findElement(By.xpath("//button[@class='alert-button alert-button-md alert-button-default alert-button-default-md']"));
		//				WebDriverWait wait = new WebDriverWait(LocalDriver, 5);
		//				wait.until(ExpectedConditions.elementToBeClickable(OKbutton));
		//				OKbutton.click();

		//		Session1Tr1.click();
		//		//		WebDriverWait wait = new WebDriverWait(LocalDriver, 5);
		//		//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//		//		alert.accept();
		//
		//
		//		WebElement eleAlert=LocalDriver.findElement(By.xpath("//div[@class='alert-head']"));
		//		System.out.println(eleAlert.getText());
		//		WebElement OKbutton = LocalDriver.findElement(By.xpath("/html[1]/body[1]/ion-app[1]/ion-alert[1]/div[1]/div[3]/button[1]"));
		//		WebDriverWait wait = new WebDriverWait(LocalDriver, 5);
		//		wait.until(ExpectedConditions.elementToBeClickable(OKbutton));
		//		OKbutton.click();

		//		LocalDriver.findElement(By.xpath("//div[@class='alert-head']"));
		//		LocalDriver.findElement(By.xpath("span[contains(text(),'OK')]")).click();


		//		Alert alert = LocalDriver.switchTo().alert();
		//		String AlertMessage = alert.getText();
		//		System.out.println("ALERT "+AlertMessage);
		//		alert.accept();
		//		
		//		String RegisterStatus = Session1Tr1.getCssValue("color");
		//		System.out.println("staus : "+RegisterStatus);

	}

	public void onFeedbackPage() throws AWTException
	{
		//		Menu.click();
		//		LocalDriver.findElement(By.xpath("/html[1]/body[1]/ion-app[1]/ng-component[1]/ion-nav[1]/page-home[1]/ion-content[1]/div[2]/ion-menu[1]/div[1]/ion-content[1]/div[2]/ion-list[1]/button[1]/div[1]/div[1]")).click();
		Menu.click();
		Feedback.click();
		Actions actions = new Actions(LocalDriver);

		Robot robot = new Robot();

		robot.mouseMove(100,150);

		actions.click().build().perform();

		System.out.println("CLICKED");


	}

	public void GiveFeedback() {
		//		LocalDriver.findElement(By.xpath("/html[1]/body[1]/ion-app[1]/ng-component[1]/ion-nav[1]/page-home[1]/ion-content[1]/div[2]/ion-nav[1]/page-feedback[1]/ion-content[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/li[1]/div[1]/label[1]/input[1]")).click();

	}


	//CHANGE PASSWORD
	public void onChangePasswordPage() throws AWTException {
		Menu.click();

		LocalDriver.findElement(By.xpath("/html[1]/body[1]/ion-app[1]/ng-component[1]/ion-nav[1]/page-home[1]/ion-content[1]/div[2]/ion-menu[1]/div[1]/ion-content[1]/div[2]/ion-list[1]/button[5]/div[1]/div[1]")).click();



		Actions actions = new Actions(LocalDriver);

		Robot robot = new Robot();

		robot.mouseMove(200,70);

		actions.click().build().perform();

	}

	public void SetPassword(String OldPswstr, String NewPsw) throws AWTException {
		Actions actions = new Actions(LocalDriver);

		Robot robot = new Robot();

		robot.mouseMove(100,150);
		//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//actions.click().build().perform();

		System.out.println("CLICKED");
		robot.mouseMove(200,70);
		actions.click().build().perform();
		WebDriverWait wait = new WebDriverWait(LocalDriver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(OldPsw));

		OldPsw.sendKeys(OldPswstr);

		LocalDriver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys(NewPsw);
		LocalDriver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(NewPsw);

		robot.mouseMove(200,70);
		actions.click().build().perform();

	}

	public void SubmitNewPassword() {

		//LocalDriver.findElement(By.xpath("/html[1]/body[1]/ion-app[1]/ng-component[1]/ion-nav[1]/page-home[1]/ion-content[1]/div[2]/ion-nav[1]/page-changepassword[1]/ion-content[1]/div[2]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[4]/div[1]")).click();
		SubmitNewPassword.click();

	}

	//LOGOUT
	public void logout()
	{
		Menu.click();
		LocalDriver.findElement(By.xpath("/html[1]/body[1]/ion-app[1]/ng-component[1]/ion-nav[1]/page-home[1]/ion-content[1]/div[2]/ion-menu[1]/div[1]/ion-content[1]/div[2]/ion-list[1]/button[6]/div[1]/div[1]")).click();
	}

}
