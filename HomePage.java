package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public SFIndividualPage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		reportStep("Homepage is loaded", "pass");
		return new SFIndividualPage();
	}
	
//	public MyHomePage clickCrmsfaLink() {
//		click(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
//		reportStep("CRM/SFA link is clicked", "pass");
//		return new MyHomePage();
//	}
//	
	public HomePage clickQuickLaunch() {
		click(locateElement(Locators.CLASS_NAME, "slds-r7"));
		reportStep("quicklaunch is loaded & clicked", "pass");
		return this;
	}
	
	
	
	
	/*
	 * // public HomePage salesMenu() { //
	 * verifyDisplayed(locateElement(Locators.XPATH,
	 * "//a[@data-label='Sales']//div[1]")); //
	 * reportStep("quicklaunch is loaded with Sales", "pass"); // return this; // }
	 * 
	 * 
	 * public SalesPage clickSalesMenu() { click(locateElement(Locators.XPATH,
	 * "//p[text()='Sales']")); reportStep("Salesmenu is clicked", "pass"); return
	 * new SalesPage();
	 }*/
	
	/*public SFIndividualPage clickSalesMenu() {
		click(locateElement(Locators.XPATH, "//p[text()='Sales']"));
		reportStep("Salesmenu is clicked", "pass");
		return new SFIndividualPage();
	}*/
	
}
