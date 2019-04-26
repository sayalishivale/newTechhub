//package StepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.DriverUtility;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Logout {
//	WebDriver driver;
//	@FindBy(css="button[class = 'bar-buttons bar-buttons-md bar-button bar-button-md bar-button-default bar-button-default-md bar-button-menutoggle bar-button-menutoggle-md']")WebElement Menu;
//	@FindBy(css="button[class = 'item item-block item-md']")WebElement Logout;
//
//	//DriverUtility driverutility;
//	Steps loginStep;
//	@Given("user is on home page")
//	public void user_is_on_home_page() 
//	{
//		loginStep= new Steps();			
//		this.driver=loginStep.returnWebdriverInstance();
//		PageFactory.initElements(driver, this);
//		System.out.println("in logout @given");
//		// Write code here that turns the phrase above into concrete actions
//		//  throw new cucumber.api.PendingException();
//	}
//
//	@When("clicks on logout")
//	public void clicks_on_logout() {
//
//		Menu.click();
//		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
//	}
//
//	@Then("user successfully logout from application")
//	public void user_successfully_logout_from_application() {
//		Logout.click();
//
//		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
//	}
//}
