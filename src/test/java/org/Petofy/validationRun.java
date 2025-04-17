package org.Petofy;

import org.testng.annotations.Test;

public class validationRun extends runntvBaseClass {
	
	@Test
	
	public void runvalidationOnlogin() throws InterruptedException {
		
		loginValidation loginvalidation = new loginValidation(driver);
		loginvalidation.setallowButton();
		loginvalidation.secondAllow();
		loginvalidation.setLoginClick();
		loginvalidation.clickSignButton();
	}

	
}
