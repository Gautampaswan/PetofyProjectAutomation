package org.Petofy;

import org.Petofy.utils.AndroidActions;
import org.Petofy.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePageUI {

    AndroidDriver driver;
    WaitUtils waitUtils;

    public HomePageUI(AndroidDriver driver) {
        super();
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void validateMyPetsText() {
        // Step 1: Use UiSelector with waitUtils to wait for element
        By myPetsLocator = MobileBy.AndroidUIAutomator("new UiSelector().text(\"My Pets\")");
        WebElement myPetsElement = waitUtils.waitForClickability(myPetsLocator); // Wait + find

        // Step 2: Extract the text
        String actualText = myPetsElement.getText();
        System.out.println("Extracted Text: " + actualText);

        // Step 3: Compare it with expected
        String expectedText = "My Pets";

        if (actualText.equals(expectedText)) {
            System.out.println("✅ Text matched: Test PASSED");
        } else {
            System.out.println("❌ Text mismatch: Test FAILED");
        }

        // Optional TestNG assert
        // Assert.assertEquals(actualText, expectedText, "Text doesn't match!");

    }

    public void validateVetOnCallOption() {

        By vetOnCall = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Vet On Call\")");
        WebElement vetOnCallText = waitUtils.waitForClickability(vetOnCall);

        // Step 2: Extract the text
        String actualText = vetOnCallText.getText();
        System.out.println("Extracted Text: " + actualText);

        // Step 3: Compare it with expected
        String expectedText = "Vet On Call";

        if (actualText.equals(expectedText)) {
            System.out.println("✅ Text matched: Vet On Call Text is visible");
        } else {
            System.out.println("❌ Text mismatch: Vet On Call Text is not visible");
        }

    }

    public void generateBill() {

        By GenerateBill = MobileBy.androidUIAutomator("new UiSelector().text(\"Generate Bills\")");
        WebElement generateBillVisibility = waitUtils.waitForVisibility(GenerateBill);

        String actualText = generateBillVisibility.getText();
        System.out.println("Extracted Text: \" + actualText");

        String expectedText = "Generate Bills";

        if (actualText.equals(expectedText)) {
            System.out.println("✅ Text matched: Generate Bill Text is visible");
        } else {
            System.out.println("");
        }

    }

    public void yourStaff() {

        By yourStaffLocator = MobileBy.androidUIAutomator("new UiSelector().text(\"Your Staff\")");
        WebElement yourStaffText = waitUtils.waitForVisibility(yourStaffLocator);

        String actualText = yourStaffText.getText();
        System.out.println("Extracted Text: \" + actualText");

        String expectedText = "Your Staff";

        if (actualText.equals(expectedText)) {
            System.out.println("Text Matched: Your Staff Option Is visible");
        } else {
            System.out.println("Test dis not Passes: Your Staff text option is not visible");
        }
    }

    public void recordsOption() {

        By recordsLocator = MobileBy.androidUIAutomator("new UiSelector().text(\"Records\")");
        WebElement recordsText = waitUtils.waitForVisibility(recordsLocator);

        String actualText = recordsText.getText();
        System.out.println("Extracted Text:\"+actualText");

        String expectedText = "Records";

        if (actualText.equals(expectedText)) {
            System.out.println("Text Matched: Records Text is visible ");

        } else {
            System.out.println("Text did not match: Records Text is not visible");
        }
    }

    public void D2Option() {

        By d2Option = MobileBy.androidUIAutomator("new UiSelector().text(\"D2V\")");
        WebElement d2TextLocator = waitUtils.waitForVisibility(d2Option);

        String actualText = d2TextLocator.getText();
        System.out.println("Extratced Text:\" +actualText");

        String expectedText = "D2V";

        if (actualText.equals(expectedText)) {
            System.out.println("Text Matched: Expected String D2 is Visible");

        } else {
            System.out.println("Text Did not matched: Expected String D2 is not visible");
        }

    }

}
