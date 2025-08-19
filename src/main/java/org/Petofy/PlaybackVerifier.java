package org.Petofy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.Petofy.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;
//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import com.google.android.exoplayer2.ExoPlayer;
// import com.google.android.exoplayer2.Player;

public class PlaybackVerifier {
    private AndroidDriver driver;
    private WaitUtils waitUtils;
    RunnTvTabs runnTvTab;
    private static final Logger logger = LoggerFactory.getLogger(PlaybackVerifier.class);
    // private ExoPlayer player;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(1)")
    private WebElement scrollableTab;

    public PlaybackVerifier(AndroidDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        this.runnTvTab = new RunnTvTabs(driver);
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
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(2)")
    private WebElement moviesTabHorizontalPageEleventh;
    // Movies Tab Seventh Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(3)")
    private WebElement moviesTabHorizontalPageTwelth;
    // Movies Tab Eight Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(4)")
    private WebElement moviesTabHorizontalPageThirteenth;
    // Movies Tab Nineth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(5)")
    private WebElement moviesTabHorizontalPageFouteenth;
    // Movies Tab Tenth Page
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(6)")
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
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\").instance(14)")
    private WebElement scrollLeft;

    /*
     * public void featureTabPlayback() throws Exception {
     * 
     * try {
     * WebElement clickFirstScrollPage = waitUtils.waitForVisibility(scrollableTab);
     * clickFirstScrollPage.click();
     * verifyPlayback();
     * }
     * 
     * catch (TimeoutException e) {
     * 
     * System.out.println("Page did not click");
     * 
     * }
     * 
     * }
     */

    public void clickFeatureTabAndHorizontal() throws Exception {
        try {

            // Verify Featured tab text
            runnTvTab.verifyFeaturedTabText();
            // Click on horizontal scroll view
            WebElement element = waitUtils.waitForClickability(horizontalScrollViewOne);
            // Assert.notNull(element, "❌ horizontalScrollViewOne was not found.");
            element.click();
            logger.info("✅ First Page Clicked");
            // Playback verification
            verifyPlayback();
            // Poll up to 5 times, 5s apart, printing last 20 log lines if failed

        } catch (TimeoutException e) {
            logger.warn("⏳ Horizontal tab was not clickable within time limit.");
            throw new RuntimeException("❌ Timeout while clicking horizontal tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyFeatureTabLogSecond() throws Exception {

        try {
            // Verify Featured tab text
            runnTvTab.verifyFeaturedTabText();
            waitUtils.waitForClickability(horizontalScrollViewSecond).click();
            logger.info("✅ Second Page Clicked");
            // Playback verification
            verifyPlayback();
        }

        catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyFeatureTabLogThird() throws Exception {
        try {

            // Verify Featured tab text
            runnTvTab.verifyFeaturedTabText();
            waitUtils.waitForClickability(horizontalScrollViewThird).click();
            logger.info("✅ Third Page Clicked");
            // Playback verification
            verifyPlayback();
        }

        catch (TimeoutException e) {
            logger.warn("⏳ Third Horizontal tab of Feature was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyFeatureTabLogFourth() throws Exception {
        try {
            // Verify Featured tab text
            runnTvTab.verifyFeaturedTabText();
            waitUtils.waitForClickability(horizontalScrollViewFourth).click();
            logger.info("Fourth Page Clicked");
            // Playback verification
            verifyPlayback();
        }

        catch (TimeoutException e) {
            logger.warn("⏳ Fourth Horizontal tab of Feature was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyFeatureTabFifth() throws Exception {
        try {

            // Verify Featured tab text
            runnTvTab.verifyFeaturedTabText();
            waitUtils.waitForClickability(horizontalScrollViewFifth).click();
            logger.info("Fifth Page Clicked");
            // Playback verification
            verifyPlayback();
        }

        catch (TimeoutException e) {
            logger.warn("⏳ Fifth Horizontal tab of Feature was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    // Verify the playback of Movies Tab
    public void verifyMoviesTabFirstPage() throws Exception {
        try {

            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(horizontalScrollViewSix).click();
            logger.info("Movies First Page Clicked");
            verifyPlayback();
        } catch (TimeoutException e) {
            logger.warn("⏳ First Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    // Verify playback log for Movies Tab for horizontal scrollbar
    public void verifyMoviesTabSecondPage() {
        try {
            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(moviesTabHorizontalPageSeven).click();
            logger.info("Movies First Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMoviesTabThirdPage() {
        try {
            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(moviesTabHorizontalPageEight).click();
            logger.info("Movies Third Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Third Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMoviesTabFourthPage() {
        try {
            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(moviesTabHorizontalPageNineth).click();
            logger.info("Movies Fourth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fourth Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMoviesTabFifthPage() {
        try {
            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(moviesTabHorizontalPageTenth).click();
            logger.info("Movies Fourth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fourth Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMoviesTabSixthPage() {
        try {
            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(moviesTabHorizontalPageEleventh).click();
            logger.info("Movies Sixth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Sixth Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void scroll() throws InterruptedException {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        int numberOfIterations = 2;
        for (int j = 0; j < numberOfIterations; j++) {
            Dimension size = driver.manage().window().getSize();
            int startX = size.width / 2;
            int startY = (int) (size.height * 0.6);
            int endY = (int) (size.height * 0.2);

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

    public void swipeHorizontalNavigation() throws InterruptedException {
        // Locate the horizontal navigation bar (parent container of the tabs)
        WebElement navigationBar = waitUtils.waitForVisibility(scrollLeft);

        // Get the size and location of the navigation bar
        Dimension size = navigationBar.getSize();
        Point location = navigationBar.getLocation();

        // Calculate swipe coordinates
        int startX = (int) (location.getX() + size.getWidth() * 0.8); // Start from 80% (right side)
        int endX = (int) (location.getX() + size.getWidth() * 0.2); // End at 20% (left side)
        int startY = location.getY() + size.getHeight() / 2; // Middle of the navigation bar vertically

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(
                finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, startY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Perform the swipe action
        driver.perform(Arrays.asList(swipe));

        // Optional: Wait for the swipe to complete
        Thread.sleep(1000); // Adjust sleep time as needed
    }

    public void verifyMoviesTabSeventhPage() {
        try {
            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(moviesTabHorizontalPageTwelth).click();
            logger.info("Movies Seventh Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Seventh Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMoviesTabEightPage() {
        try {
            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(moviesTabHorizontalPageThirteenth).click();
            logger.info("Movies Eight Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Eight Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMoviesTabNinethPage() {
        try {
            runnTvTab.verifyMoviesTabText();
            waitUtils.waitForClickability(moviesTabHorizontalPageFouteenth).click();
            logger.info("Movies Nineth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Nineth Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Movies Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    // *******************Verify Music tab playback log
    // ******************************************

    public void verifyMusicTabFirstpage() {
        try {
            runnTvTab.verifyMusicTabText();
            waitUtils.waitForClickability(horizontalScrollViewOne).click();
            logger.info("Music First Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ First Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Music Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMusicTabSecondPage() {
        try {
            runnTvTab.verifyMusicTabText();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewSecond).click();
            logger.info("Music Second Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Music Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMusicTabThirdPage() {
        try {
            runnTvTab.verifyMusicTabText();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewThird).click();
            logger.info("Music Third Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Third Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Music Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMusicTabFourthPage() {
        try {
            runnTvTab.verifyMusicTabText();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewFourth).click();
            logger.info("Music Fourth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fourth Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Music Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyMusicTabFifthPage() {
        try {
            runnTvTab.verifyMusicTabText();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewFifth).click();
            logger.info("Music Fifth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fifth Horizontal tab of Movies was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Music Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    // *************** Verify the playback log for Entertainment
    // Tab*****************************//
    public void verifyEntertainmentTabFirstPage() {
        try {
            runnTvTab.verifyEntertainment();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewOne).click();
            logger.info("Entertainment First Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ First Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Entertainment Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyEntertainmentTabSecondPage() {
        try {
            runnTvTab.verifyEntertainment();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewSecond).click();
            logger.info("Entertainment Second Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Entertainment Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyEntertainmentTabThirdPage() {
        try {
            runnTvTab.verifyEntertainment();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewThird).click();
            logger.info("Entertainment Third Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Third Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Entertainment Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyEntertainmentTabFourthPage() {
        try {
            runnTvTab.verifyEntertainment();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewFourth).click();
            logger.info("Entertainment Fourth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fourth Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Entertainment Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyEntertainmentTabFifthPage() {
        try {
            runnTvTab.verifyEntertainment();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewFifth).click();
            logger.info("Entertainment Fifth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fifth Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Entertainment Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyNewsAndOpinionTabFirstPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.newsAndOpinionTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewOne).click();
            logger.info("News & Opinion First Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ First Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of News & Opinion Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyNewsAndOpinionTabSecondPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.newsAndOpinionTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewSecond).click();
            logger.info("News & Opinion Second Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of News & Opinion Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyNewsAndOpinionTabThirdPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.newsAndOpinionTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewThird).click();
            logger.info("News & Opinion Third Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Third Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of News & Opinion Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyNewsAndOpinionTabFourthPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.newsAndOpinionTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewFourth).click();
            logger.info("News & Opinion Fourth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fourth Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of News & Opinion Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyNewsAndOpinionTabFifthPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.newsAndOpinionTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewFifth).click();
            logger.info("News & Opinion Fifth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fifth Horizontal tab of Entertainment was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of News & Opinion Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    // **************************** Verify playback logs for Kids Tab
    // **************************************//

    public void verifyKidsTabFirstPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.verifyKidsTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewOne).click();
            logger.info("Kids First Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ First Horizontal tab of Kids was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Kids Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyKidsTabSecondPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.verifyKidsTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewSecond).click();
            logger.info("Kids Second Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Kids was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Kids Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyKidsTabThirdPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.verifyKidsTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewThird).click();
            logger.info("Kids Third Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Third Horizontal tab of Kids was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Kids Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyKidsTabFourthPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            runnTvTab.verifyKidsTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewFourth).click();
            logger.info("Kids Fourt Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fourth Horizontal tab of Kids was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Kids Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    // *************************Verify the playback log test for Short Films
    // tab************************//
    public void verifyShortFilmsTabFirstPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            WebElement kids = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Kids']"));
            kids.click();
            runnTvTab.verifyShortTabFilms();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewOne).click();
            logger.info("Short Films Second Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Short Films was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Short Films Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyShortFilmsTabSecondPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            WebElement kids = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Kids']"));
            kids.click();
            // waitUtils.waitForClickability(kids).click();
            runnTvTab.verifyShortTabFilms();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewSecond).click();
            logger.info("Short Films Second Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Short Films was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Short Films Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyShortFilmsTabThirdPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            WebElement kids = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Kids']"));
            kids.click();
            runnTvTab.verifyShortTabFilms();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewThird).click();
            logger.info("Short Films Third Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Third Horizontal tab of Short Films was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Short Films Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyShortFilmsTabFourthPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            WebElement kids = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Kids']"));
            kids.click();
            runnTvTab.verifyShortTabFilms();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewFourth).click();
            logger.info("Short Films Fourth Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Fourth Horizontal tab of Short Films was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Short Films Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    // ****************** Health And Fitness *****************************//
    public void verifyHealthFitnessTabFirstPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            WebElement kids = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Kids']"));
            kids.click();
            runnTvTab.verifyHealthAndFitness();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewOne).click();
            logger.info("Health Fitness First Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ First Horizontal tab of Health And Fitness was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Health And Fitness Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    public void verifyHealthAndFitnessTabSecondPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            WebElement kids = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Kids']"));
            kids.click();
            runnTvTab.verifyHealthAndFitness();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewSecond).click();
            logger.info("Health Fitness Second Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Health And Fitness was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Health And Fitness Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    // ******************** Devotional *************************************** //
    public void verifyDevotionalTabFirstPage() {
        try {
            WebElement element = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Entertainment']"));

            element.click();
            WebElement kids = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Kids']"));
            kids.click();
            WebElement healthFitness = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text='Health & Fitness']"));
            healthFitness.click();

            runnTvTab.verifyDevotionalTab();
            // waitUtils.waitForClickability(horizontalScrollViewSecond);
            waitUtils.waitForClickability(horizontalScrollViewOne).click();
            logger.info("Devotional First Page Clicked");
            verifyPlayback();

        } catch (TimeoutException e) {
            logger.warn("⏳ Second Horizontal tab of Devotional was not clickable within time limit");
            throw new RuntimeException("❌ Timeout while clicking horizontal page of Devotional Tab");
        } catch (Exception e) {
            logger.error("❌ Unexpected exception occurred", e);
            throw new RuntimeException("❌ Unexpected exception occurred: " + e.getMessage(), e);

        }
    }

    /*
     * public void verifyPlayback(int maxAttempts, int pollIntervalSeconds, int
     * debugLogLines) throws Exception {
     * System.out.println("🧹 Clearing previous logs...");
     * Runtime.getRuntime().exec("adb logcat -c");
     * Thread.sleep(2000); // Let logs clear
     * 
     * boolean isPlaying = false;
     * for (int attempt = 1; attempt <= maxAttempts; attempt++) {
     * System.out.println("⏳ Poll attempt " + attempt + "/" + maxAttempts +
     * ": Checking playback...");
     * if (attempt > 1)
     * Thread.sleep(pollIntervalSeconds * 1000);
     * 
     * Process process = Runtime.getRuntime().exec("adb logcat -d");
     * BufferedReader reader = new BufferedReader(new
     * InputStreamReader(process.getInputStream()));
     * String line;
     * List<String> logLines = new ArrayList<>();
     * while ((line = reader.readLine()) != null) {
     * logLines.add(line);
     * if ((line.contains("ExoPlayer") || line.contains("Renderer")) &&
     * (line.contains("READY") || line.contains("Renderer started") ||
     * line.contains("startPlayback") || line.contains("playWhenReady=true"))) {
     * System.out.println("📄 Detected playback log: " + line);
     * isPlaying = true;
     * break;
     * }
     * }
     * reader.close();
     * if (isPlaying)
     * break;
     * else
     * System.out.println("➖ No playback log found yet, will retry...");
     * }
     * 
     * if (!isPlaying) {
     * System.out.println("❌ Playback not detected. Recent logs for debugging:");
     * Process process = Runtime.getRuntime().exec("adb logcat -d");
     * BufferedReader debugReader = new BufferedReader(new
     * InputStreamReader(process.getInputStream()));
     * LinkedList<String> recentLines = new LinkedList<>();
     * String log;
     * while ((log = debugReader.readLine()) != null) {
     * if (recentLines.size() == debugLogLines)
     * recentLines.poll();
     * recentLines.offer(log);
     * }
     * debugReader.close();
     * for (String debugLine : recentLines)
     * System.out.println(debugLine);
     * throw new RuntimeException("❌ Playback did not start within expected time.");
     * } else {
     * System.out.println("✅ Playback verified successfully!");
     * }
     * 
     * }
     */

    public void verifyPlayback() throws Exception {
        System.out.println("⏳ Waiting for video UI to load...");
        Thread.sleep(15000); // Adjust based on your app's behavior

        System.out.println("🧹 Clearing previous logs...");
        Runtime.getRuntime().exec("adb logcat -c");
        Thread.sleep(2000); // Allow time to clear

        System.out.println("📡 Waiting for playback to start...");
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