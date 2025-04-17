package org.Petofy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class runntvBaseClass {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void runntvCode() throws MalformedURLException, URISyntaxException {
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("\\Users\\cyno\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 6a API 30"); // Pixel 4 XL API 34/
		options.setApp(
				"C:\\Resources\\app-debug.apk");
		// options.setApp("C:\\Users\\cyno\\OneDrive\\runntv\\Appium\\src\\test\\java\\APKResource\\app-debug
		// 25 (2).apk");
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);

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

	// public void scroll() throws InterruptedException {
	//
	// }
	//
	@AfterClass
	public void teardown() {
		// driver.quit();
		service.stop();
	}

}
