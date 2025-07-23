package org.Petofy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.Petofy.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RunnTvTabs {

    AndroidDriver driver;
    WaitUtils waitUtils;

    public RunnTvTabs(AndroidDriver driver) {
        super();
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(1)")
    private WebElement horizontalScrollViewOne;

    public void secondAllow() {
        try {
            WebElement clickAllowbutton = waitUtils.waitForClickability(
                    By.id("com.android.permissioncontroller:id/permission_allow_button"));
            clickAllowbutton.click();// com.android.permissioncontroller:id/permission_allow_button
        } catch (TimeoutException e) {
            System.out.println("second allow icon was not clickable within the timeout period");
        }
    }

    public void verifyFeaturedTabText() throws Exception {
        try {

            // Wait for element to be visible
            WebElement element = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Featured']"));

            // Extract text
            String extractedText = element.getText();

            System.out.println("Extracted text: " + extractedText);

            // Compare with expected value
            if (extractedText.equals("Featured")) {
                System.out.println("✅ Featured tab is visible with correct text.");
                element.click();
                // horizontalScrollViewOne.click();
                // verifyPlayback();

            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }

        } catch (TimeoutException e) {
            System.out.println("⏳ Featured tab not found within timeout.");
        }
    }

    public void verifyMoviesTabText() {
        try {
            // Wait for element to be visible
            WebElement element = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Movies']"));

            // Extract text
            String extractedText = element.getText();
            System.out.println("Extracted text: " + extractedText);

            // Compare with expected value
            if (extractedText.equals("Movies")) {
                System.out.println("✅ Movies tab is visible with correct text.");
            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }

            // Click on the element after verification
            element.click();

        } catch (TimeoutException e) {
            System.out.println("⏳ Movies tab not found within timeout.");
        }
    }

    public void verifyMusicTabText() {
        try {
            // Wait for element to be visible
            WebElement element = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Music']"));

            // Extract text
            String extractedText = element.getText();
            System.out.println("Extracted text: " + extractedText);

            // Compare with expected value
            if (extractedText.equals("Music")) {
                System.out.println("✅ Movies tab is visible with correct text.");
            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }

            // Click on the element after verification
            element.click();

        } catch (TimeoutException e) {
            System.out.println("⏳ Movies tab not found within timeout.");
        }
    }

    public void newsAndOpinionTab() {
        try {
            // Wait for element to be visible
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='News & Opinion']"));

            // Extract text
            String extractedText = element.getText();
            System.out.println("Extracted text: " + extractedText);

            // Compare with expected value
            if (extractedText.equals("News & Opinion")) {
                System.out.println("✅ News And Opinion tab is visible with correct text.");
            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }

            // Click on the element after verification
            element.click();

        } catch (TimeoutException e) {
            System.out.println("⏳ News & Opinion tab not found within timeout.");
        }
    }

    public void verifyKidsTab() {
        try {
            // Wait for element to be visible
            WebElement element = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Kids']"));

            // Extract text
            String extractedText = element.getText();
            System.out.println("Extracted text: " + extractedText);

            // Compare with expected value
            if (extractedText.equals("Kids")) {
                System.out.println("✅ Kids tab is visible with correct text.");
            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }

            // Click on the element after verification
            element.click();

        } catch (TimeoutException e) {
            System.out.println("⏳ Kids tab not found within timeout.");
        }
    }

    public void verifyShortTabFilms() {
        try {
            // Wait for element to be visible
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Short Films']"));

            // Extract text
            String extractedText = element.getText();
            System.out.println("Extracted text: " + extractedText);

            // Compare with expected value
            if (extractedText.equals("Short Films")) {
                System.out.println("✅ Short Films tab is visible with correct text.");
            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }

            // Click on the element after verification
            element.click();

        } catch (TimeoutException e) {
            System.out.println("⏳ Short Films tab not found within timeout.");
        }
    }

    public void verifyEntertainment() {
        try {

            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));
            String extractedText = element.getText();
            if (extractedText.equals("Entertainment")) {
                System.out.println("✅ Entertainment tab is visible with correct text.");
            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }
            element.click();

        } catch (TimeoutException e) {
            System.out.println("⏳Entertainment tab not found within timeout.");
        }

    }

    public void verifyHealthAndFitness() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Health & Fitness']"));
            String extractedText = element.getText();
            if (extractedText.equals("Health & Fitness")) {
                System.out.println("✅ Health & Fitness tab is visible with correct text.");
            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }
            element.click();

        } catch (TimeoutException e) {
            System.out.println("Health & Fitness tab not found within timeout.");
        }
    }

    public void verifyDevotionalTab() {

        try {

            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"Devotional\"]"));
            String extractedText = element.getText();
            if (extractedText.equals("Devotional")) {
                System.out.println("✅ Devotional tab is visible with correct text.");
            } else {
                System.out.println("❌ Text mismatch. Found: " + extractedText);
            }
            element.click();

        } catch (TimeoutException e) {
            System.out.println("Devotional tab not found within timeout.");
        }
    }

    public void verifyPlayback() throws Exception {
        System.out.println("⏳ Waiting 15 seconds for video UI to load...");
        Thread.sleep(15000); // Adjust based on your app's behavior

        System.out.println("🧹 Clearing previous logs...");
        Runtime.getRuntime().exec("adb logcat -c");
        Thread.sleep(2000); // Allow time to clear

        System.out.println("📡 Waiting another 15 seconds for playback to start...");
        Thread.sleep(15000); // Let playback attempt to start

        Process process = Runtime.getRuntime().exec("adb logcat -d | grep ExoPlayer");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        boolean isPlaying = false;

        while ((line = reader.readLine()) != null) {
            System.out.println("📄 Log: " + line);
            if ((line.contains("Playback state") && line.contains("READY")) ||
                    (line.contains("ExoPlayerImpl") && line.contains("Init")) ||
                    line.contains("Renderer started") ||
                    line.contains("startPlayback") ||
                    line.contains("playWhenReady=true")) {
                isPlaying = true;
                break;
            }
        }

        if (!isPlaying) {
            throw new RuntimeException("❌ Playback did not start within expected time.");
        } else {
            System.out.println("✅ Playback verified successfully.");
        }
    }

}
