package org.Petofy;

import java.time.Duration;

import org.Petofy.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class registerPetWithValidation {

    AndroidDriver driver;
    WaitUtils waitUtils;

    public registerPetWithValidation(AndroidDriver driver) {

        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.cynoteck.petofyOPHR:id/save_changes_BT")
    private WebElement continueButton;
    @AndroidFindBy(id = "com.cynoteck.petofyOPHR:id/add_pet_type")
    private WebElement selectPet;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Dog']")
    private WebElement choosePet;

    @AndroidFindBy(id = "com.cynoteck.petofyOPHR:id/maleRB")
    private WebElement selectGender;

    public void validatePetCategory() {

        try {

            waitUtils.waitForClickability(continueButton).click();
            System.out.println("Continue button clicked");

            By requireText = MobileBy.xpath("//android.widget.Toast[@text='Select pet category !']");
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement errorText = shortWait.until(ExpectedConditions.presenceOfElementLocated(requireText));

            String actualToast = errorText.getText();
            System.out.println("Toast message: " + actualToast);

            String expectedErrorText = "Select pet category !";

            if (actualToast.equals(expectedErrorText)) {
                waitUtils.waitForClickability(selectPet).click();
                waitUtils.waitForClickability(choosePet).click();

            } else {
                System.out.println("Drop down was not clicked");
            }
        }

        catch (Exception e) {
            System.out.println("❌ Error while validating pet name field: " + e.getMessage());
        }
    }

    public void validateGender() {
        try {

            waitUtils.waitForClickability(continueButton).click();
            System.out.println("Continue button clicked");

            By requireText = MobileBy.xpath("//android.widget.Toast[@text=\"Select Gender !\"]");
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement errorText = shortWait.until(ExpectedConditions.presenceOfElementLocated(requireText));

            String actualToast = errorText.getText();
            System.out.println("Toast message: " + actualToast);

            String expectedErrorText = "Select Gender !";

            if (actualToast.equals(expectedErrorText)) {
                RegisterPet registerPet = new RegisterPet(driver);
                registerPet.checkGender();
                registerPet.checkMale();
                registerPet.checFemale();

            } else {
                System.out.println("Drop down was not clicked");
            }
        }

        catch (Exception e) {
            System.out.println("❌ Error while validating gender field: " + e.getMessage());
        }

    }

    public void validateBreed() {

        try {

            waitUtils.waitForClickability(continueButton).click();
            System.out.println("Continue button clicked");

            By requireText = MobileBy.xpath("//android.widget.Toast[@text=\"Select Breed !\"]");
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement errorText = shortWait.until(ExpectedConditions.presenceOfElementLocated(requireText));

            String actualToast = errorText.getText();
            System.out.println("Toast message: " + actualToast);

            String expectedErrorText = "Select Breed !";

            if (actualToast.equals(expectedErrorText)) {
                RegisterPet registerPet = new RegisterPet(driver);
                registerPet.ClickBreedDropdown();
                registerPet.selectBreedName();

            } else {
                System.out.println("Drop down was not clicked");
            }
        }

        catch (Exception e) {
            System.out.println("❌ Error while validating Breedname field: " + e.getMessage());
        }

    }

    public void validatePetName() {

        try {

            waitUtils.waitForClickability(continueButton).click();
            System.out.println("Continue button clicked");

            By requireText = MobileBy.xpath("//android.widget.Toast[@text=\"Enter Pet Name\"]");
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement errorText = shortWait.until(ExpectedConditions.presenceOfElementLocated(requireText));

            String actualToast = errorText.getText();
            System.out.println("Toast message For Pet name: " + actualToast);

            String expectedErrorText = "Enter Pet Name";

            if (actualToast.equals(expectedErrorText)) {
                RegisterPet registerPet = new RegisterPet(driver);
                registerPet.petName("Oscar");
            } else {
                System.out.println("Drop down was not clicked");
            }
        }

        catch (Exception e) {
            System.out.println("❌ Error while validating PetName field: " + e.getMessage());
        }

    }

}
