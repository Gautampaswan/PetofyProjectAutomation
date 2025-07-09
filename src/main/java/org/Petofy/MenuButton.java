package org.Petofy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.Petofy.utils.ScreenshotUtils;
import org.Petofy.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class MenuButton {

    AndroidDriver driver;
    WaitUtils waitUtils;

    public MenuButton(AndroidDriver driver) {
        super();
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void verifyMenuButton() {

        try {

            WebElement element = waitUtils.waitForVisibility(By.xpath("//com.horcrux.svg.CircleView"));
            element.click();

        } catch (TimeoutException e) {
            System.out.println("⏳ Featured tab not found within timeout.");
        }

    }

    public void verifyStaticTextElements() {
        List<String> expectedTexts = Arrays.asList(
                "Kids Safe",
                "App Settings",
                "Terms Of Use",
                "Privacy Policy",
                "About Us",
                "Content Grievances",
                "For personalised expereince");

        List<By> locators = Arrays.asList(
                By.xpath("//android.widget.TextView[@text='Kids Safe']"),
                By.xpath("//android.widget.TextView[@text='App Settings']"),
                By.xpath("//android.widget.TextView[@text='Terms Of Use']"),
                By.xpath("//android.widget.TextView[@text='Privacy Policy']"),
                By.xpath("//android.widget.TextView[@text='About Us']"),
                By.xpath("//android.widget.TextView[@text='Content Grievances']"),
                By.xpath("//android.widget.TextView[@text='For personalised expereince']"));

        List<String> actualTexts = new ArrayList<>();

        for (int i = 0; i < locators.size(); i++) {
            try {
                WebElement element = waitUtils.waitForVisibility(locators.get(i));
                String text = element.getText();
                System.out.println("✅ Found: " + text);
                actualTexts.add(text);
            } catch (TimeoutException e) {
                System.out.println("❌ Timeout: Could not find element for expected text: " + expectedTexts.get(i));
                actualTexts.add("Not Found");
            }
        }

        // Final comparison
        boolean allMatch = true;
        for (int i = 0; i < expectedTexts.size(); i++) {
            if (!expectedTexts.get(i).equals(actualTexts.get(i))) {
                allMatch = false;
                System.out.println("❌ Mismatch at index " + i + ": Expected [" + expectedTexts.get(i) + "] but found ["
                        + actualTexts.get(i) + "]");
            }
        }

        if (allMatch) {
            System.out.println("✅ All static texts matched successfully.");
        } else {
            System.out.println("❌ Text verification failed.");
        }
    }

    // Code for Verifying screenshot of App setting screen
    public void verifyAppSetting() {
        try {
            // Click "App Settings"
            WebElement ClickAppSettingOption = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"App Settings\"]"));
            ClickAppSettingOption.click();

            // Click "Data Saver"
            WebElement DataSaver = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"Data Saver\"]"));
            DataSaver.click();

            // Wait for popup element (adjust xpath as per actual popup)
            WebElement popupContainer = waitUtils
                    .waitForVisibility(By.xpath(
                            "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));

            // Take screenshot of just the popup element
            Screenshot actualScreenshot = new AShot()
                    .coordsProvider(new WebDriverCoordsProvider())
                    .takeScreenshot(driver, popupContainer);

            // Load baseline popup screenshot
            BufferedImage expectedImage = ImageIO.read(new File(
                    "C:\\Users\\cyno\\OneDrive\\runntv\\PetofyFramework\\src\\test\\java\\org\\Petofy\\resource\\baseline_datasaver_popup.png"));
            BufferedImage actualImage = actualScreenshot.getImage();

            // Compare
            ImageDiff diff = new ImageDiffer().makeDiff(expectedImage, actualImage);
            if (diff.hasDiff()) {
                System.out.println("❌ Popup UI mismatch!");

                // Save failed screenshot using ScreenshotUtils
                ScreenshotUtils.saveImage(actualImage, "failure", "DataSaverPopup");
            } else {
                System.out.println("✅ Popup UI matches expected design.");
            }

        } catch (TimeoutException e) {
            System.out.println("❌ Popup not found within timeout.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyAppSettingText() {
        try {
            // Click "App Settings"
            WebElement ClickAppSettingOption = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"App Settings\"]"));
            ClickAppSettingOption.click();
            // Click "Data Saver"
            WebElement DataSaver = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"Data Saver\"]"));
            DataSaver.click();

        }

        catch (TimeoutException e) {
            System.out.println("Button did not found");
        }

    }

    public void verifyDataSaverPopupUIElements() {
        try {
            // Step 1: Open App Settings > Data Saver
            WebElement appSettings = waitUtils.waitForVisibility(
                    By.xpath("//android.widget.TextView[@text='App Settings']"));
            appSettings.click();

            WebElement dataSaver = waitUtils.waitForVisibility(
                    By.xpath("//android.widget.TextView[@text='Data Saver']"));
            dataSaver.click();

            System.out.println("⚙️ Opened App Settings > Data Saver");

            // Step 2: Verify clickability of radio buttons
            List<String> options = Arrays.asList("Best Available", "Standard", "Data Saver");
            boolean issueFound = false;

            for (String option : options) {
                WebElement radioButton = waitUtils.waitForVisibility(
                        By.xpath("//android.view.ViewGroup[@content-desc='" + option + "']"));

                String clickable = radioButton.getAttribute("clickable");

                if ("true".equalsIgnoreCase(clickable)) {
                    System.out.println("✅ '" + option + "' radio button is clickable.");
                } else {
                    System.out.println("❌ '" + option + "' radio button is NOT clickable.");
                    issueFound = true;
                }
            }

            // Step 3: Verify visibility of popup elements
            List<By> importantElements = Arrays.asList(
                    By.xpath("//android.widget.TextView[@text='Select Streaming Quality for Mobile Data']"),
                    By.xpath(
                            "//android.widget.TextView[@text='Best Available streaming quality will be used on WiFi']"),
                    By.xpath("//android.view.ViewGroup[@content-desc='Cancel']"),
                    By.xpath("//android.view.ViewGroup[@content-desc='Update']"));

            for (By locator : importantElements) {
                try {
                    WebElement element = waitUtils.waitForVisibility(locator);
                    if (element.isDisplayed()) {
                        System.out.println("👁️ Visible: " + locator.toString());
                    } else {
                        System.out.println("❌ Not visible: " + locator.toString());
                        issueFound = true;
                    }
                } catch (TimeoutException e) {
                    System.out.println("⏳ Timeout: Element not found - " + locator.toString());
                    issueFound = true;
                }
            }

            // Step 4: Capture screenshot if any issue found
            if (issueFound) {
                WebElement popupContainer = waitUtils.waitForVisibility(
                        By.xpath("//android.widget.TextView[@text='Data Saver']/../../.."));

                Screenshot screenshot = new AShot()
                        .coordsProvider(new WebDriverCoordsProvider())
                        .takeScreenshot(driver, popupContainer);

                BufferedImage actualImage = screenshot.getImage();
                ScreenshotUtils.saveImage(actualImage, "failure", "DataSaverPopup");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ Exception occurred during popup UI verification.");
        }
    }

    public void verifyAppLanguage() {
        try {
            WebElement clickAppLanguage = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"App Language\"]"));
            clickAppLanguage.click();

            WebElement hindiOptionLocator = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"Hindi\"]"));

            String extractHindiRadioButtonText = hindiOptionLocator.getText();
            System.out.println("Extracted Text From Radio Button:" + extractHindiRadioButtonText);
            if (extractHindiRadioButtonText.equalsIgnoreCase("Hindi")) {
                System.out.println("Hindi Option is visiblr now clicking on radio button");
                WebElement clickRadioButton = waitUtils.waitForVisibility(
                        By.xpath("//android.view.ViewGroup[@content-desc=\"Hindi\"]/android.view.ViewGroup"));
                clickRadioButton.click();

                WebElement clickDoneButton = waitUtils
                        .waitForVisibility(By.xpath("//android.view.ViewGroup[@content-desc=\"Done\"]"));
                clickDoneButton.click();
            } else {
                System.out.println("Hindi language Option is not visible");
            }

        }

        catch (TimeoutException e) {
            System.out.println("Could not validate App Language");
        }

    }

    /*
     * public void verifyRadioButtonsAreClickable() {
     * try {
     * // Step 1: Open App Settings > Data Saver
     * WebElement appSettings = waitUtils.waitForVisibility(
     * By.xpath("//android.widget.TextView[@text='App Settings']"));
     * appSettings.click();
     * 
     * WebElement dataSaver = waitUtils.waitForVisibility(
     * By.xpath("//android.widget.TextView[@text='Data Saver']"));
     * dataSaver.click();
     * 
     * System.out.println("⚙️ Opened App Settings > Data Saver");
     * 
     * // Step 2: Verify clickability of all 3 radio buttons
     * List<String> options = Arrays.asList("Best Available", "Standard",
     * "Data Saver");
     * 
     * for (String option : options) {
     * WebElement radioButton = waitUtils.waitForVisibility(
     * By.xpath("//android.view.ViewGroup[@content-desc='" + option + "']"));
     * 
     * String clickable = radioButton.getAttribute("clickable");
     * 
     * if ("true".equalsIgnoreCase(clickable)) {
     * System.out.println("✅ '" + option + "' is clickable.");
     * } else {
     * System.out.println("❌ '" + option + "' is NOT clickable.");
     * }
     * }
     * 
     * } catch (Exception e) {
     * e.printStackTrace();
     * System.out.
     * println("❌ Exception occurred while checking radio button clickability.");
     * }
     * }
     */

}