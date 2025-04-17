package org.Petofy;

import org.testng.annotations.Test;

public class search extends runntvBaseClass {
	
	@Test
	
	public void testSearchFunctionality() throws InterruptedException {
		
		loginpage loginPage = new loginpage(driver);
		loginPage.setallowButton();
		loginPage.secondAllow();
		loginPage.setLoginClick();
		loginPage.setEmailField("vet.petofy@gmail.com");
		loginPage.setPasswordField("Pass@123");
		loginPage.setSignIn();
		
		SearchFunctionality search = new SearchFunctionality(driver);
		search.clickSearchbox();
		search.typePetName("dogy");
		search.clickSearchIcon();
		search.addClinicButton();
		search.ClickAddclinicVisit();
		search.clickOnNextbutton();
		search.selectImmunizationOption();
		search.clickOnNextbutton();
		
		
		
	}
	
	

}
