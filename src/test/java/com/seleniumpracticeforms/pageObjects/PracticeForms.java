package com.seleniumpracticeforms.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForms {
	
	WebDriver ldriver;
	
	public PracticeForms(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="firstname")
	WebElement txtFirstName;
	
	@FindBy(name="lastname")
	WebElement txtLastName;
	
	@FindBy(id="sex-0")
	WebElement clkGender;
	
	@FindBy(id="exp-5")
	WebElement clkYOE;
	
	@FindBy(id="datepicker")
	WebElement txtsltDate;
	
	@FindBy(css="type=checkbox")
	WebElement sltProf;
	
	@FindBy(id="tool-2")
	WebElement sltAutoTool;
	
	public void setFirstname(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setlastname(String lname) {
		txtLastName.sendKeys(lname);
	}
	public void ClkGender() {
		clkGender.click();
	}
	
	public void ClkYOE() {
		clkYOE.click();
	}
	public void setDate(String date) {
		txtsltDate.sendKeys(date);
	}
	public void SlcProf() {
		clkYOE.click();
	}
	public void SlcAutoTool() {
		clkYOE.click();
	}

}
