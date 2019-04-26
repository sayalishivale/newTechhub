package com;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(css="button[class = 'submit-btn button button-md button-default button-default-md button-full button-full-md']")WebElement Signin;
	@FindBy(css="input[type='password'][class='text-input text-input-md']") WebElement Pass;
	@FindBy(css="input[type = \"text\"][name = \"dasid\"]") WebElement UName;
	WebDriver Localdriver;

	public LoginPage(WebDriver driver) {
		this.Localdriver=driver;
		PageFactory.initElements(driver, this);

	}
	public void CheckLoginPage()
	{
		Assert.assertEquals(Localdriver.getTitle(), "Ionic App");

	}

	public void SignIn(String UserName, String Password)
	{
		UName.sendKeys(UserName);
		Pass.sendKeys(Password);
		Signin.click();

	}

}
