package org.Petofy;

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

    // @AndroidFindBy(id = "//android.widget.TextView[@text='Featured']")
    // private WebElement FavouriteTab;

    public void verifyFeaturedTabText() {
        try {
            // Wait for element to be visible
            // WebElement element = waitUtils.waitForVisibility(FavouriteTab);
            // Wait for element to be visible
            WebElement element = waitUtils.waitForVisibility(By.xpath("//android.widget.TextView[@text='Featured']"));
            // Extract text
            String extractedText = element.getText();

            System.out.println("Extracted text: " + extractedText);

            // Compare with expected value
            if (extractedText.equals("Featured")) {
                System.out.println("✅ Featured tab is visible with correct text.");

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
}
