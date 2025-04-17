package org.Petofy;

import java.time.Duration;

import org.Petofy.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

	public class SearchFunctionality extends AndroidActions {
	
	AndroidDriver driver;
	public SearchFunctionality(AndroidDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/search_box_TV")
	private WebElement searchbox;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/search_pet_ET")
	private WebElement typepetName;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/search_IV")
	private WebElement searchIcon;
	
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/Add_Clinic_BT")
	private WebElement petClinicVisit;
	
	//Click on pet visit option
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/add_clinic_visit_CL")
	private WebElement clinicVisitOption;
	
	//Next button
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/btn_next")
	private WebElement nextButton;
	
	//Toast message
//	@AndroidFindBy(xpath="//android.widget.Toast[@text=\"Please Select Nature of Visit\"]")
//	private WebElement validationError;
	
	//Select type of visit
	@AndroidFindBy(id="com.cynoteck.petofyOPHR:id/nature_of_visit_spinner")
	private WebElement selectVisitOption;
	
	//Immunization locator
	@AndroidFindBy(xpath ="//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Immunization\"]")
	private WebElement ImmunizationOption;
	
	
	
	
	public void clickSearchbox() {
		//searchbox.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(searchbox)).click();
			
		}
		catch(TimeoutException e) {
			System.out.println("waiting to click searchbox");
		}
		
	}
	
	public void typePetName(String typePetname) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(typepetName)).sendKeys(typePetname);
			
		}
		catch(TimeoutException e) {
			System.out.println("waiting to type pet name");
		}
		//typepetName.sendKeys(typePetname);
	}
	
	public void clickSearchIcon() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
			//searchbox.sendKeys(searchIcon);
		}
		catch(TimeoutException e) {
			System.out.println("waiting for search icon to visible");
		}
	}
	
	public void addClinicButton() {
		//petClinicVisit.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(petClinicVisit)).click();
			//searchbox.sendKeys(searchIcon);
		}
		catch(TimeoutException e) {
			System.out.println("Clicking Addclinic visit");
		}
	}
	
	public void ClickAddclinicVisit() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(clinicVisitOption)).click();
			//searchbox.sendKeys(searchIcon);
		}
		catch(TimeoutException e) {
			System.out.println("waiting for Addclinic option to be clicked");
		}
	}
	
	
	public void clickOnNextbutton() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    
	    try {
	        // Click on the Next button
	        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	        //selectNatureOfVisitOption();
	        
	        // Check for the toast message
	        String toastMessage = getToastMessageText();
	        if (toastMessage != null && toastMessage.equalsIgnoreCase("Please Select Nature of Visit")) {
	            System.out.println("Validation message displayed: " + toastMessage);
	            
//	            // If the validation toast is displayed, select the Nature of Visit option
	            selectNatureOfVisitOption();
	            //selectImmunizationOption();
	        }
	    } catch (TimeoutException e) {
	        System.out.println("Next button or toast message not found");
	    }
	}


	
	private String getToastMessageText() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Wait for up to 5 seconds for the Toast
	    
	    try {
	        // Locate the Toast message using XPath
	        WebElement toastMessage = wait.until(ExpectedConditions.presenceOfElementLocated(
	                By.xpath("//android.widget.Toast[1]")));
	        
	        // Extract and return the text from the Toast
	        return toastMessage.getAttribute("text");
	    } catch (TimeoutException e) {
	        System.out.println("Toast message not found");
	        return null;
	    }
	}

	
	public void selectNatureOfVisitOption() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(selectVisitOption)).click();
	        System.out.println("Nature of Visit option selected");
	    } catch (TimeoutException e) {
	        System.out.println("Nature of Visit option was not clickable");
	    }
	}
	
	public void selectImmunizationOption() {
		
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    
		    try {
		        wait.until(ExpectedConditions.elementToBeClickable(ImmunizationOption)).click();
		        System.out.println("Immunization option selected");
		    } catch (TimeoutException e) {
		        System.out.println("Waiting to select Immunization Option");
		    }
	}
	
	
}
	
	