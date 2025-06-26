package org.Petofy;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Sequence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
//import net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw;

public class petofyRun extends runntvBaseClass {
	// private static final Logger logger = LogManager.getLogger(petofyRun.class);

	@Test
	public void verifyMyPetsText() {
		loginpage loginPage = new loginpage(driver);
		loginPage.setallowButton();
		loginPage.secondAllow();
		loginPage.setLoginClick();
		loginPage.setEmailField("vet.petofy@gmail.com");
		loginPage.setPasswordField("Pass@123");
		loginPage.setSignIn();
		HomePageUI homePageUI = new HomePageUI(driver);
		homePageUI.validateMyPetsText();

	}

	@Test(dataProvider = "getData")
	public void petofyTest(String petname, String petParentname) throws InterruptedException {

		loginpage loginPage = new loginpage(driver);
		loginPage.setallowButton();
		loginPage.secondAllow();
		loginPage.setLoginClick();
		loginPage.setEmailField("vet.petofy@gmail.com");
		loginPage.setPasswordField("Pass@123");
		loginPage.setSignIn();
		// loginPage.clickPlusIcon();
		// HomePageUI homePageUI = new HomePageUI(driver);
		// homePageUI.validateMyPetsText();
		RegisterPet registerPet = new RegisterPet(driver);
		registerPetWithValidation RegisterPetWithValidation = new registerPetWithValidation(driver);
		registerPet.clickPlusIcon();
		RegisterPetWithValidation.validatePetCategory();
		registerPet.checkPetCategoryText();
		registerPet.petCategory();
		registerPet.selectPetType();
		RegisterPetWithValidation.validateGender(); // registerPet.selectPetType();
		registerPet.ChooseGender(); // registerPet.checkGender();
		registerPet.ClickBreedDropdown(); // registerPet.checkMale();
		registerPet.selectBreedName(); // registerPet.checFemale();

		registerPet.checkPetName();
		registerPet.petName(petname);// dogy
		registerPet.checkDateOfBirth();
		registerPet.DOBofPet();
		registerPet.selectDaydropdown();
		registerPet.typeDayofDOB();
		registerPet.clickagebox(6);
		registerPet.clickpetcolordropdown();
		registerPet.selectPetcolorDropdown();
		registerPet.checkPetParent();
		registerPet.petParentname(petParentname);// rakesh
		registerPet.scrollScreen();
		registerPet.checkwhatsAppNumber();
		registerPet.enterWhatsappNumber("9984665660");
		registerPet.checkAlternative();
		registerPet.addAlternatenum("5432765432");
		registerPet.checkEmailAddress();
		registerPet.fillEmail("paswanvet44@gmail.com");
		registerPet.checkAddress();
		registerPet.fillAddress("It park dehradun");
		registerPet.clickContinueButton();
		registerPet.navigateBack();
		// registerPet.checkAllElements();

		SearchFunctionality search = new SearchFunctionality(driver);
		search.clickSearchbox();
		search.typePetName("dogy");
		search.clickSearchIcon();
		search.addClinicButton();
		search.ClickAddclinicVisit();
		search.clickOnNextbutton();
		search.selectNatureOfVisitOption();
		search.selectImmunizationOption();
	}

	@DataProvider
	public Object[][] getData() {

		return new Object[][] { { "Tinni", "Jackey" } };
	}
}

// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

/*
 * try {
 * logger.info("Waiting for allow button to be clickable");
 * WebElement allowButton =
 * wait.until(ExpectedConditions.elementToBeClickable(By.id(
 * "com.android.permissioncontroller:id/permission_allow_foreground_only_button"
 * )));
 * allowButton.click();
 * logger.info("Clicked allow button");
 * 
 * driver.findElement(By.id(
 * "com.android.permissioncontroller:id/permission_allow_button")).click();
 * logger.info("Clicked second allow button");
 * 
 * logger.info("Waiting for login button to be clickable");
 * WebElement loginButton =
 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//android.widget.Button[@resource-id=\"com.cynoteck.petofyOPHR:id/login_BT\"]"
 * )));
 * loginButton.click();
 * logger.info("Clicked login button");
 * 
 * } catch (Exception e) {
 * logger.error("An error occurred while handling permissions or login button: "
 * + e.getMessage());
 * }
 */

/*
 * try {
 * logger.info("Waiting for email field to be visible");
 * WebElement emailField =
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
 * "com.cynoteck.petofyOPHR:id/email_TIET")));
 * emailField.sendKeys("vet.petofy@gmail.com");
 * logger.info("Entered email");
 * 
 * logger.info("Waiting for password field to be visible");
 * WebElement passwordField =
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
 * "com.cynoteck.petofyOPHR:id/password_TIET")));
 * passwordField.sendKeys("Pass@123");
 * logger.info("Entered password");
 * 
 * logger.info("Waiting for login button to be clickable again");
 * WebElement clickLogin =
 * wait.until(ExpectedConditions.elementToBeClickable(By.id(
 * "com.cynoteck.petofyOPHR:id/login_BT")));
 * clickLogin.click();
 * logger.info("Clicked login button again");
 * 
 * } catch (Exception e) {
 * logger.error("An error occurred while handling login fields or button: " +
 * e.getMessage());
 * }
 */
//
// try {
// //Add entry
// logger.info("Waiting for plus icon to be clickable");
// WebElement clickPlusIcon =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/addNewEntry")));
// clickPlusIcon.click();
// logger.info("Clicked plus icon");
//
// } catch (Exception e) {
// logger.error("An error occurred while handling plus icon: " +
// e.getMessage());
// }
//
// //WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
// try {
//
// //Pet type // Log that you are waiting for the pet type dropdown
// logger.info("Waiting for pet type dropdown");
// // Wait for the dropdown element to be clickable
// WebElement clickDropDown =
// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")));
//
// // Retrieve the text of the dropdown element
// String actualText = clickDropDown.getText();
// String expectedText = "Select Pet Category"; // Replace with the actual
// expected text
//
// // Validation check
// if (actualText.equals(expectedText)) {
// // If the text matches the expected text, click the dropdown
// clickDropDown.click();
// logger.info("Dropdown clicked successfully");
// } else {
// // If the text does not match, log an error and throw an exception
// logger.error("Expected text does not match. Found: " + actualText);
// throw new AssertionError("Expected text: '" + expectedText + "', but found:
// '" + actualText + "'");
// }
//// WebElement clickDropDown =
// driver.findElement(By.id("com.cynoteck.petofyOPHR:id/add_pet_type"));
//// clickDropDown.click();
//
//
// //select pet type
// logger.info("waiting for pet type drop down ");
// WebElement petType =
// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1'
// and @text='Dog']")));
// petType.click();
// logger.info("petType");
//
// //Select gender
// logger.info("waiting for pet gender ");
// WebElement gender =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/maleRB")));
// gender.click();
// logger.info("gender");
//
// //Pet breed
// logger.info("waiting for pet breed ");
// WebElement breed =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/add_pet_breed_dialog")));
// breed.click();
// logger.info("breed");
//
// //select breed name
// logger.info("waiting for breed name ");
// WebElement breedName =
// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1'
// and @text='Akita']")));
// breedName.click();
// logger.info("breedName");
//
// //Type Pet Name
// // Log that you are waiting for the pet name input field
// logger.info("Waiting for pet name input field");
//
// // Wait for the pet name element to be clickable
// WebElement petName =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_name_ET")));
//
// // Retrieve the existing text or placeholder of the pet name input field (if
// applicable)
// String actualText2 = petName.getText();
// String expectedText2 = "Pet Name*"; // Replace with the expected initial
// value or leave empty if the field should be empty
//
// // Validation check
// if (actualText2.equals(expectedText2)) {
// // If the existing text matches the expected text, enter the new pet name
// petName.sendKeys("Xolo");
// logger.info("Pet name entered successfully: Xolo");
// } else {
// // If the text does not match, log an error and throw an exception
// logger.error("Unexpected text found in pet name field. Found: " +
// actualText);
// throw new AssertionError("Expected text: '" + expectedText + "', but found:
// '" + actualText + "'");
// }
//
// /* logger.info("waiting for petName ");
// WebElement petName =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_name_ET")));
// petName.sendKeys("Xolo");
// logger.info("petName");*/
//
// //Pet DOB
// logger.info("waiting for pet dob ");
// WebElement petDOB =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/convert_yr_to_age")));
// petDOB.click();
// logger.info("petDOB");
//
// //Select datedrop down com.cynoteck.petofyOPHR:id/age_wise
// logger.info("waiting for dateDropdown ");
// WebElement dateDropdown =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/age_wise")));
// dateDropdown.click();
// logger.info("dateDropdown");
//
// //Select days
// //android.widget.CheckedTextView[@resource-id='android:id/text1' and
// @text='Week']
// logger.info("waiting for Select days ");
// WebElement selectDays =
// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1'
// and @text='Week']")));
// selectDays.click();
// logger.info("selectDays");
//
// //select day of DOB com.cynoteck.petofyOPHR:id/age_neumeric
// logger.info("waiting for dayofDon ");
// WebElement dayOfDOB =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/age_neumeric")));
// dayOfDOB.click();
// logger.info("dayOfDOB");
//
// //type dob com.cynoteck.petofyOPHR:id/age_neumeric
// logger.info("waiting for date of birth ");
// WebElement typeDob =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/age_neumeric")));
// typeDob.sendKeys("4");
// logger.info("typeDob");
// driver.navigate().back();
//
// //pet color com.cynoteck.petofyOPHR:id/add_pet_color_dialog
// logger.info("waiting for date of birth ");
// WebElement petColor =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/add_pet_color_dialog")));
// petColor.click();
// logger.info("petColor");
//
// //Select pet color dropdown
// //android.widget.CheckedTextView[@resource-id='android:id/text1' and
// @text='Beige']
// logger.info("waiting for pet color dropdown ");
// WebElement petColorDropdown =
// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1'
// and @text='Beige']")));
// petColorDropdown.click();
// logger.info("petColorDropdown");
//
// //pet parent dropdown com.cynoteck.petofyOPHR:id/pet_parent_name_ET
// logger.info("waiting for pet parent ");
// WebElement petParentdropdown =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_parent_name_ET")));
// petParentdropdown.sendKeys("doctor");
// logger.info("petParentdropdown");
//
// //Scroll until text is visible com.cynoteck.petofyOPHR:id/pet_address_TV
// //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new
// UiSelector().resourceId(\"com.cynoteck.petofyOPHR:id/pet_contact_number\")).scrollIntoView(new
// UiSelector().text(\"Contact Number\"));")
// //);
// try {
// scroll();
// }
// catch (Exception e) {
// logger.error("An error occurred while scrolling and finding the Address
// field: " + e.getMessage());
// }
//
//
//// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new
// UiSelector()).scrollIntoView(text(\"Address\"));"));
//// Thread.sleep(2000);
//
// // Log that you are waiting for the WhatsApp contact number input field
// logger.info("Waiting for WhatsApp contact number input field");
// // Wait for the WhatsApp contact number element to be clickable
// WebElement whatsAppField =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_contact_number")));
// // Retrieve the existing text or placeholder of the WhatsApp contact number
// input field (if applicable)
// String whatsappActualtext = whatsAppField.getText();
// String whtsappexpectedText = "Contact Number"; // Replace with the expected
// initial value or leave empty if the field should be empty
//
// // Validation check
// if (whatsappActualtext.equals(whtsappexpectedText)) {
// // If the existing text matches the expected text, enter the WhatsApp contact
// number
// whatsAppField.sendKeys("9837765549");
// logger.info("WhatsApp contact number entered successfully: 9837765549");
// } else {
// // If the text does not match, log an error and throw an exception
// logger.error("Unexpected text found in WhatsApp contact number field. Found:
// " + whatsappActualtext);
// throw new AssertionError("Expected text: '" + expectedText + "', but found:
// '" + whatsappActualtext + "'");
// }
//
// /*WebElement whatsAppField =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_contact_number")));
// whatsAppField.sendKeys("9837765549");
// logger.info("whatsAppField"); */
//
//
// // Log that you are waiting for the alternate contact number input field
// logger.info("Waiting for alternate contact number input field");
//
// // Wait for the alternate contact number element to be clickable
// WebElement alterNate =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_Alternatecontact_number")));
//
// // Retrieve the existing text or placeholder of the alternate contact number
// input field (if applicable)
// String altractualText = alterNate.getText();
// String altexpectedText = "Alternate Number"; // Replace with the expected
// initial value or leave empty if the field should be empty
//
// // Validation check
// if (altractualText.equals(altexpectedText)) {
// // If the existing text matches the expected text, enter the alternate
// contact number
// alterNate.sendKeys("4455667788");
// logger.info("Alternate contact number entered successfully: 4455667788");
// } else {
// // If the text does not match, log an error and throw an exception
// logger.error("Unexpected text found in alternate contact number field. Found:
// " + altractualText);
// throw new AssertionError("Expected text: '" + altexpectedText + "', but
// found: '" + altractualText + "'");
// }
//
// /* //Fill alternate mobile
// com.cynoteck.petofyOPHR:id/pet_Alternatecontact_number
// logger.info("waiting for alternate number ");
// WebElement alterNate =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_Alternatecontact_number")));
// alterNate.sendKeys("4455667788");
// logger.info("alterNate");*/
//
// //Fill email address com.cynoteck.petofyOPHR:id/pet_email_ET
// logger.info("waiting for email address");
// WebElement emailAddress =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_email_ET")));
// emailAddress.sendKeys("test44@gmail.com");
// logger.info("emailAddress");
//
// //Fill address field com.cynoteck.petofyOPHR:id/pet_address_ET
// logger.info("waiting for Address fields");
// WebElement Adressfield =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/pet_address_ET")));
// Adressfield.sendKeys("ItPark");
// logger.info("Adressfield");
//
// //Click continue com.cynoteck.petofyOPHR:id/save_changes_BT
// logger.info("waiting for Continue button");
// WebElement Continue =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/save_changes_BT")));
// Continue.click();
// logger.info("Continue");
//
// //Click on Back button com.cynoteck.petofyOPHR:id/back_arrow_RL
// logger.info("waiting for Continue button");
// WebElement clickBack =
// wait.until(ExpectedConditions.elementToBeClickable(By.id("com.cynoteck.petofyOPHR:id/back_arrow_RL")));
// clickBack.click();
// logger.info("clickBack");
//
//
//
// //Click continue button
// //Fill Address field
//
//
//
//
//
//
//// WebElement petType =
// driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1'
// and @text='Dog']"));
//// petType.click();
// }
// catch (Exception e) {
// logger.error("An error occurred while handling plus icon: " +
// e.getMessage());
// }
//
