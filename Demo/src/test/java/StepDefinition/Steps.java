package StepDefinition;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import com.HomePage;
import com.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;import cucumber.api.java.en.When;

public class Steps 
{
	static WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;

	//public Steps() {
	//	driverutility= new DriverUtility();
	//	driverutility.initializeDriver();
	//	LoginPage loginPage= new LoginPage();
	//	HomePage homePage = new HomePage();
	//
	//
	//	// TODO Auto-generated constructor stub
	//}



	//LOGIN SCENARIO
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver","C:/Users/a622996/workspace/Demo/Browser/chromedriver.exe");
		driver=new ChromeDriver();
		//		System.setProperty("webdriver.gecko.driver","C:/Users/a622996/workspace/Demo/Browser/geckodriver.exe");
		//		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://techhubportal.ap-south-1.elasticbeanstalk.com/");
		driver.manage().window().maximize();
		System.out.println("driver instance ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage= new LoginPage(driver);
		loginPage.CheckLoginPage();

	}

	@When("user enters username and Password")
	public void user_enters_username_and_Password() 
	{
		loginPage.SignIn("A622996", "1234");
	}

	@Then("success message is displayed")
	public void success_message_is_displayed() 
	{
		System.out.println("Login sucessfull");
	}

	//REGISTER

	@Given("User has logged in")
	public void user_has_logged_in() {
		System.out.println("in register @Given :"+driver);
		homePage = new HomePage(driver);
		homePage.CheckIfOnHomePage();

	}

	@When("User tries to register for sessionONE in TR_ONE")
	public void user_tries_to_register_for_sessionONE_in_TR_ONE() {

		homePage.RegisterSession1Tr1();
	}

	@When("He is has not registred for any other TR for sessionONE")
	public void he_is_has_not_registred_for_any_other_TR_for_sessionONE() {

	}

	@Then("User able to register sucessfully")
	public void user_able_to_register_sucessfully() {

	}

	//FEEDBACK

	@Given("User is on Feedback page")
	public void user_is_on_Feedback_page() throws AWTException {
		homePage = new HomePage(driver);

		homePage.onFeedbackPage();
	}

	@When("User Selects all valid options")
	public void user_Selects_all_valid_options() {
		homePage.GiveFeedback();

	}

	@Then("User able o submit the feedback")
	public void user_able_o_submit_the_feedback() {

	}

	//CHANGE PASSWORD

	@Given("User clicks on Logout")
	public void user_clicks_on_Logout() throws AWTException {
		homePage = new HomePage(driver);

		homePage.onChangePasswordPage();
	}

	@When("User provides current and new password")
	public void user_provides_current_and_new_password() throws AWTException {
		homePage = new HomePage(driver);

		homePage.SetPassword("1234","1234");
	}

	@Then("User able to change the password")
	public void user_able_to_change_the_password() {
		homePage = new HomePage(driver);

		homePage.SubmitNewPassword();
	}


	//LOGOUT

	@Given("User Clicks on Logout")
	public void user_Clicks_on_Logout() {
		homePage = new HomePage(driver);
		homePage.logout();
	}

	@Then("User LogsOut")
	public void user_LogsOut() {
	}


}
