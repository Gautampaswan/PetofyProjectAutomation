package org.Petofy.utils;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {

	AndroidDriver driver;

	public AndroidActions(AndroidDriver driver) {
		this.driver = driver;
	}

	// public void scrollTotext(String text) throws InterruptedException {
	//
	//// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new
	// UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	//// Thread.sleep(2000);
	//
	// }

	// public void expectWait(String text)
	// {
	// driver.find
	// }

}
