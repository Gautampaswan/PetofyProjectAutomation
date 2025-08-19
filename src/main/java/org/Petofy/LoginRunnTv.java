package org.Petofy;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;
import org.Petofy.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginRunnTv {

    AndroidDriver driver;
    WaitUtils waitUtils;

    public LoginRunnTv(AndroidDriver driver) {
        // super(driver);
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"com.horcrux.svg.CircleView\")")
    private WebElement ClickSignInMenuButton;
    // @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign In\")")
    // private WebElement ClickSignButton;

    By emailLabel = By.xpath("//div[normalize-space()='Email or phone']");
    By next = By.xpath("//span[normalize-space()='Next']");
    // android.widget.TextView[@text="Sign In"]

    public void signInApp() throws TimeoutException {

        try {

            waitUtils.waitForClickability(ClickSignInMenuButton).click();
            // waitUtils.waitForClickability(ClickSignButton);
            WebElement SignButton = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"Sign In\"]"));
            SignButton.click();

            WebElement ContinueButton = waitUtils
                    .waitForVisibility(By.xpath("//android.widget.TextView[@text=\"Continue\"]"));
            ContinueButton.click();

            WebElement googleSign = waitUtils
                    .waitForVisibility(By.xpath(" //android.view.ViewGroup[@content-desc=\"Google\"]"));
            googleSign.click();

            WebElement GmailSignIn = waitUtils
                    .waitForVisibility(By.xpath(
                            "(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[1]"));
            GmailSignIn.click();

        } catch (TimeoutException e) {

        }
    }

}
