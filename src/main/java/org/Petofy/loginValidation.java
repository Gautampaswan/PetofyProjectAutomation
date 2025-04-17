package org.Petofy;

import java.time.Duration;

import org.Petofy.utils.AndroidActions;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginValidation extends AndroidActions {

	
	AndroidDriver driver;
	public loginValidation(AndroidDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement allowButton;	
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement clickAllowbutton;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/login_BT")
	private WebElement clickLoginButton;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/login_BT")
	private WebElement ValSignButton;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/email_TIET")
	private WebElement typeEmail;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/password_TIET")
	private WebElement typePassword;
	
//	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/login_BT")
//	private WebElement signIn;
	
//	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/email_TIET")
//	private WebElement typeEmail;
//	
//	//com.cynoteck.petofyOPHR:id/textinput_error
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/textinput_error")
	private WebElement errorMessage;
	
	
	public void setallowButton() throws InterruptedException {
		//allowButton.click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(allowButton)).click();
		}
		catch(TimeoutException e) {
			System.out.println("firstallow icon was not clickable within the timeout period");
		}
		
		
	}
	
	public void secondAllow() throws InterruptedException {
		//clickAllowbutton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(clickAllowbutton)).click();
		}
		catch(TimeoutException e) {
			System.out.println("allow icon was not clickable within the timeout period");
		}
	}
	
	public void setLoginClick() throws InterruptedException {
		//clickLoginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(clickLoginButton)).click();
		}
		catch(TimeoutException e) {
			System.out.println("login button was not clickable within the timeout period");
		}
	}
	
	
	public void clickSignButton() throws InterruptedException
	{
		//signIn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ValSignButton)).click();
		}
		catch(TimeoutException e) {
			System.out.println("Sign In button was not clickable within the timeout period");
		}
		
	}
	
	
	// Method to verify email validation message
	public boolean verifyEmailValidationMessage(String email) throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        WebElement validationElement = wait.until(ExpectedConditions.visibilityOf(errorMessage));
	        String validationText = validationElement.getText();
	        String emailf = "vet.petofy@gmail.com";
	        // Check for "Email is empty" validation message
	        if (validationText.equalsIgnoreCase("Email is empty")) {
	            System.out.println("Validation message is displayed: " + validationText);
	            
	            // If email is empty, fill in the email field
	            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(typeEmail));
	            emailField.click();
	            emailField.sendKeys(emailf);
	            System.out.println("Email field was empty, filled with: " + emailf);
	            return true;  // Validation message was correct, email was filled
	        } 
	        // Check for any other unexpected validation message
	        else {
	            System.out.println("Unexpected validation message: " + validationText);
	            return false;  // Validation message was different
	        }
	    } catch (TimeoutException e) {
	        System.out.println("Validation message not found within the timeout period");
	        return false;
	    }
	}

	
	
}
