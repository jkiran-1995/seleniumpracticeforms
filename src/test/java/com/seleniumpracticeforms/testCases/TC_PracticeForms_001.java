package com.seleniumpracticeforms.testCases;

import org.testng.annotations.Test;

import com.seleniumpracticeforms.pageObjects.PracticeForms;

public class TC_PracticeForms_001 extends BaseClass {
	
	
	@Test
	public void PracticeForms() {
		
		driver.get(BaseURL);
		logger.info("Browser is Opened");
		driver.manage().window().maximize();
		logger.info("Browser is Maximized");
		PracticeForms PF = new PracticeForms(driver);
		PF.setFirstname(FirstName);
		logger.info("First Name is Entered");
		PF.setlastname(LastName);
		logger.info("Last Name is Entered");
		PF.ClkGender();
		logger.info("Gender is Selected");
		PF.ClkYOE();
		logger.info("Experince is Selected");
		PF.setDate(Date);
		logger.info("Date is Entered");
		PF.SlcProf();
		logger.info("Profession is Selected");
		PF.SlcAutoTool();
		logger.info("Automation Tool is Selected");
	}

}
