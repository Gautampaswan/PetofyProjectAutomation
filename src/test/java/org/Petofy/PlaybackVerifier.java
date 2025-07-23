package org.Petofy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.Petofy.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
// import io.appium.java_client.pagefactory.AndroidFindBy;
// import io.appium.java_client.pagefactory.AndroidFindBy;
// import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PlaybackVerifier {
    // private AndroidDriver driver;
    // private WaitUtils waitUtils;
    private AndroidDriver driver;
    private WaitUtils waitUtils;

    // @AndroidFindBy(uiAutomator = "new
    // UiSelector().className(\"android.widget.HorizontalScrollView\")")
    // private List<WebElement> horizontalScrollViews;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(1)")
    private WebElement scrollableTab;

    public PlaybackVerifier(AndroidDriver driver) {
        // this.driver = driver;
        // this.waitUtils = new WaitUtils(driver);
        // PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

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

    public void featureTabPlayback() throws Exception {

        try {
            WebElement clickFirstScrollPage = waitUtils.waitForVisibility(scrollableTab);
            clickFirstScrollPage.click();
            verifyPlayback();
        }

        catch (TimeoutException e) {

            System.out.println("Page did not click");

        }

    }
    /*
     * public void clickAllScrollViewsAndVerifyPlayback() throws Exception {
     * System.out.println("🔢 Total HorizontalScrollViews found: " +
     * horizontalScrollViews.size());
     * 
     * for (int i = 0; i < horizontalScrollViews.size(); i++) {
     * 
     * System.out.println("horizontalScrollViews.size()");
     * WebElement scrollView = horizontalScrollViews.get(i);
     * waitUtils.waitForVisibility(scrollView).click();
     * System.out.println("👉 Clicked HorizontalScrollView at index: " + i);
     * 
     * // Verify playback after click
     * verifyPlayback();
     * }
     * }
     */

    /*
     * public void verifyPlayback() throws Exception {
     * System.out.println("⏳ Waiting 15 seconds for video UI to load...");
     * Thread.sleep(15000); // Adjust based on your app's behavior
     * 
     * System.out.println("🧹 Clearing previous logs...");
     * Runtime.getRuntime().exec("adb logcat -c");
     * Thread.sleep(2000); // Allow time to clear
     * 
     * System.out.println("📡 Waiting another 15 seconds for playback to start...");
     * Thread.sleep(15000); // Let playback attempt to start
     * 
     * Process process =
     * Runtime.getRuntime().exec("adb logcat -d | grep ExoPlayer");
     * BufferedReader reader = new BufferedReader(new
     * InputStreamReader(process.getInputStream()));
     * 
     * String line;
     * boolean isPlaying = false;
     * 
     * while ((line = reader.readLine()) != null) {
     * System.out.println("📄 Log: " + line);
     * if ((line.contains("Playback state") && line.contains("READY")) ||
     * (line.contains("ExoPlayerImpl") && line.contains("Init")) ||
     * line.contains("Renderer started") ||
     * line.contains("startPlayback") ||
     * line.contains("playWhenReady=true")) {
     * isPlaying = true;
     * break;
     * }
     * }
     * 
     * if (!isPlaying) {
     * throw new RuntimeException("❌ Playback did not start within expected time.");
     * } else {
     * System.out.println("✅ Playback verified successfully.");
     * }
     * }
     */

    /*
     * public void verifyPlayback() throws Exception {
     * System.out.println("🧹 Clearing previous logs...");
     * Runtime.getRuntime().exec("adb logcat -c");
     * 
     * System.out.println("⏳ Waiting 15 seconds for video UI to load...");
     * Thread.sleep(15000);
     * 
     * Process process =
     * Runtime.getRuntime().exec("adb logcat -d | grep ExoPlayer");
     * BufferedReader reader = new BufferedReader(new
     * InputStreamReader(process.getInputStream()));
     * 
     * String line;
     * boolean isPlaying = false;
     * 
     * while ((line = reader.readLine()) != null) {
     * System.out.println("📄 Log: " + line);
     * if ((line.contains("Playback state") && line.contains("READY")) ||
     * (line.contains("ExoPlayerImpl") && line.contains("Init")) ||
     * line.contains("Renderer started") ||
     * line.contains("startPlayback") ||
     * line.contains("playWhenReady=true")) {
     * isPlaying = true;
     * break;
     * }
     * }
     * 
     * if (!isPlaying) {
     * System.out.
     * println("❌ Playback not detected. Dumping last 50 logs for debugging...");
     * Process fallback = Runtime.getRuntime().exec("adb logcat -d -t 50");
     * BufferedReader fbReader = new BufferedReader(new
     * InputStreamReader(fallback.getInputStream()));
     * while ((line = fbReader.readLine()) != null) {
     * System.out.println("🪵 " + line);
     * }
     * throw new RuntimeException("❌ Playback did not start within expected time.");
     * } else {
     * System.out.println("✅ Playback verified successfully.");
     * }
     * }
     */

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(1)")
    private WebElement horizontalScrollViewOne;
    // Click on Second Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(2)")
    private WebElement horizontalScrollViewSecond;
    // Click on Third page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(3)")
    private WebElement horizontalScrollViewThird;
    // Click on Fourth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(4)")
    private WebElement horizontalScrollViewFourth;
    // Click on Fifth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(5)")
    private WebElement horizontalScrollViewFifth;

    // For Movies Tab
    // Movies Tab First page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(1)")
    private WebElement horizontalScrollViewSix;
    // Movies Tab Second Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(2)")
    private WebElement moviesTabHorizontalPageSeven;
    // Movies Tab Third Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(3)")
    private WebElement moviesTabHorizontalPageEight;
    // Movies Tab Fourth page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(4)")
    private WebElement moviesTabHorizontalPageNineth;
    // Movies Tab Fifth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(5)")
    private WebElement moviesTabHorizontalPageTenth;
    // Movies Sixth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(6)")
    private WebElement moviesTabHorizontalPageEleventh;
    // Movies Tab Seventh Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(7)")
    private WebElement moviesTabHorizontalPageTwelth;
    // Movies Tab Eight Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(8)")
    private WebElement moviesTabHorizontalPageThirteenth;
    // Movies Tab Nineth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(9)")
    private WebElement moviesTabHorizontalPageFouteenth;
    // Movies Tab Tenth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(10)")
    private WebElement moviesTabHorizontalPageFifteenth;
    // Movies Tab Eleventh Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(11)")
    private WebElement moviesTabHorizontalPageSixteenth;
    // Movies Tab Twelth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(12)")
    private WebElement moviesTabHorizontalPageSeventeenth;
    // Movies tab Thirteenth page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(13)")
    private WebElement moviesTabHorizontalPageEighteenth;
    // Movies tab Fourteenth page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(14)")
    private WebElement moviesTabHorizontalPageNineteenth;

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
            if (line.contains("Playback state") && line.contains("READY") ||
                    line.contains("ExoPlayerImpl") && line.contains("Init") ||
                    line.contains("Renderer started") ||
                    line.contains("startPlayback") || line.contains("playWhenReady=true")) {
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

    public void clickFeatureTabAndHorizontal() {
        try {
            waitUtils.waitForClickability(horizontalScrollViewOne).click();
            System.out.print("First Page Clicked");
        } catch (TimeoutException e) {
            System.out.println("Horizontal tab was not clickable within time limit");
        }
    }

    public void verifyFeatureTabLogSecond() {

        try {
            waitUtils.waitForClickability(horizontalScrollViewSecond).click();
        }

        catch (TimeoutException e) {
            System.out.println("Second page was not clickable within time limit");
        }
    }

    public void verifyFeatureTabLogThird() {
        try {
            waitUtils.waitForClickability(horizontalScrollViewThird).click();
        } catch (TimeoutException e) {
            System.out.println("Third page was not clickable within time limit");
        }
    }

    public void verifyFeatureTabLogFourth() {
        try {
            waitUtils.waitForClickability(horizontalScrollViewFourth).click();
        } catch (TimeoutException e) {
            System.out.println("Fourth page was not clickable within time limit");
        }
    }

    public void verifyFeatureTabFifth() {
        try {
            waitUtils.waitForClickability(horizontalScrollViewFifth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    // Verify the playback of Movies Tab
    public void verifyMoviesTabFirstPage() {
        try {
            waitUtils.waitForClickability(horizontalScrollViewSix).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    // Verify playback log for Movies Tab for horizontal scrollbar
    public void verifyMoviesTabSecondPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageSeven).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabThirdPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageEight).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabFourthPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageNineth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabFifthPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageTenth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabSixthPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageEleventh).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void scroll() throws InterruptedException {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        int numberOfIterations = 2;
        for (int j = 0; j < numberOfIterations; j++) {
            Dimension size = driver.manage().window().getSize();
            int startX = size.width / 2;
            int startY = (int) (size.height * 0.8);
            int endY = (int) (size.height * 0.1);

            Sequence swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(
                    finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Arrays.asList(swipe));
            Thread.sleep(10000);
        }
    }

    public void verifyMoviesTabSeventhPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageTwelth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabEightPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageThirteenth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabNinethPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageFouteenth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabTenthPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageFifteenth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabEleventhPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageSixteenth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

    public void verifyMoviesTabTwelthPage() {
        try {
            waitUtils.waitForClickability(moviesTabHorizontalPageSeventeenth).click();
        } catch (TimeoutException e) {
            System.out.println("Fifth page was not clickable within time limit");
        }
    }

}

/*
 * @AndroidFindBy(uiAutomator =
 * "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(2)"
 * )
 * private WebElement horizontalScrollViewOne;
 * 
 * public void verifyPlayback() throws Exception {
 * System.out.println("⏳ Waiting 15 seconds for video UI to load...");
 * Thread.sleep(15000); // Adjust based on your app's behavior
 * 
 * System.out.println("🧹 Clearing previous logs...");
 * Runtime.getRuntime().exec("adb logcat -c");
 * Thread.sleep(2000); // Allow time to clear
 * 
 * System.out.println("📡 Waiting another 15 seconds for playback to start...");
 * Thread.sleep(15000); // Let playback attempt to start
 * 
 * Process process =
 * Runtime.getRuntime().exec("adb logcat -d | grep ExoPlayer");
 * BufferedReader reader = new BufferedReader(new
 * InputStreamReader(process.getInputStream()));
 * 
 * String line;
 * boolean isPlaying = false;
 * 
 * while ((line = reader.readLine()) != null) {
 * System.out.println("📄 Log: " + line);
 * if (line.contains("Playback state") && line.contains("READY") ||
 * line.contains("ExoPlayerImpl") && line.contains("Init") ||
 * line.contains("Renderer started") ||
 * line.contains("startPlayback") || line.contains("playWhenReady=true")) {
 * isPlaying = true;
 * break;
 * }
 * }
 * 
 * if (!isPlaying) {
 * throw new RuntimeException("❌ Playback did not start within expected time.");
 * } else {
 * System.out.println("✅ Playback verified successfully.");
 * }
 * }
 * 
 * public void clickFeatureTabAndHorizontal() {
 * try {
 * waitUtils.waitForClickability(horizontalScrollViewOne).click();
 * System.out.print("Second Tab clicked");
 * } catch (TimeoutException e) {
 * System.out.println("Horizontal tab was not clickable within time limit");
 * }
 * }
 */
