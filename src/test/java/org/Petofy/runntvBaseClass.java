package org.Petofy;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class runntvBaseClass {

	public AndroidDriver driver;

	@BeforeClass
	public void runntvCode() throws MalformedURLException {

		// Load from system property or fallback
		String username = System.getProperty("browserstack.user", "chiragpaswan_wQh5KY");
		String accessKey = System.getProperty("browserstack.key", "9zahoZzNwyhD41n1GhsP");

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserstack.user", username);
		caps.setCapability("browserstack.key", accessKey);
		caps.setCapability("app", "bs://a9a35cf5d82b110ad5a8f5000f559f10c2fb28e7"); // Replace after upload
		caps.setCapability("device", "Google Pixel 6a");
		caps.setCapability("os_version", "13.0");
		caps.setCapability("project", "Runntv Appium Project");
		caps.setCapability("build", "Runntv Build 1");
		caps.setCapability("name", "Runntv Scroll Test");

		driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), caps);
	}

	public void scroll() throws InterruptedException {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

		int numberOfIterations = 1;
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

	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}