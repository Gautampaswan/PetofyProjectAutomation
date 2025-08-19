package org.Petofy;

import java.time.Duration;

import org.Petofy.utils.AndroidActions;
import org.Petofy.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginpage extends AndroidActions {

	AndroidDriver driver;
	WaitUtils waitUtils;

	public loginpage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		this.waitUtils = new WaitUtils(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	@AndroidFindBy(id = "com.cynoteck.petofyOPHR:id/login_BT")
	private WebElement clickLoginButton;

	@AndroidFindBy(id = "com.cynoteck.petofyOPHR:id/email_TIET")
	private WebElement typeEmail;

	@AndroidFindBy(id = "com.cynoteck.petofyOPHR:id/password_TIET")
	private WebElement typePassword;

	@AndroidFindBy(id = "com.cynoteck.petofyOPHR:id/login_BT")
	private WebElement signIn;

	public void setallowButton() {
		try {
			WebElement allowButton = waitUtils.waitForClickability(
					By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
			allowButton.click();
		} catch (TimeoutException e) {
			System.out.println("firstallow icon was not clickable within the timeout period");
		}
	}

	public void secondAllow() {
		try {
			WebElement clickAllowbutton = waitUtils.waitForClickability(
					By.id("com.android.permissioncontroller:id/permission_allow_button"));
			clickAllowbutton.click();// com.android.permissioncontroller:id/permission_allow_button
		} catch (TimeoutException e) {
			System.out.println("second allow icon was not clickable within the timeout period");
		}
	}

	public void setLoginClick() {
		try {
			waitUtils.waitForClickability(clickLoginButton).click();
		} catch (TimeoutException e) {
			System.out.println("login button was not clickable within the timeout period");
		}
	}

	public void setEmailField(String email) {
		try {
			waitUtils.waitForClickability(typeEmail).click();
			typeEmail.sendKeys(email);
		} catch (TimeoutException e) {
			System.out.println("email field was not clickable within the timeout period");
		}
	}

	public void setPasswordField(String password) {
		try {
			waitUtils.waitForClickability(typePassword).click();
			typePassword.sendKeys(password);
		} catch (TimeoutException e) {
			System.out.println("password field was not clickable within the timeout period");
		}
	}

	public void setSignIn() {
		try {
			waitUtils.waitForClickability(signIn).click();
		} catch (TimeoutException e) {
			System.out.println("Sign In button was not clickable within the timeout period");
		}
	}
}
