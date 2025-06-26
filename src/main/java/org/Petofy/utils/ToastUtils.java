package org.Petofy.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ToastUtils {

    private AndroidDriver driver;

    public ToastUtils(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getToastMessage(String partialText, int timeoutInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            WebElement toast = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[contains(@text,'" + partialText + "')]")));
            return toast.getText();
        } catch (Exception e) {
            System.out.println("❌ Toast not found: " + e.getMessage());
            return null;
        }
    }
}
