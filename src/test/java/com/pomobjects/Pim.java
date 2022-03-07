package com.pomobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pim {

	WebDriver ldriver;

	public Pim(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/b")
	@CacheLookup
	WebElement pim;

	@FindBy(xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]")
	@CacheLookup
	WebElement EmpList;

	@FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]")
	@CacheLookup
	WebElement addEmp;

	@FindBy(name = "firstName")
	@CacheLookup
	WebElement fname;

	@FindBy(name = "middleName")
	@CacheLookup
	WebElement mname;

	@FindBy(name = "lastName")
	@CacheLookup
	WebElement lname;

	@FindBy(id = "btnSave")
	@CacheLookup
	WebElement save;

	public void pimclick() {
		pim.click();
	}

	public void viewEmp() {
		EmpList.click();
	}

	public void addEmp() {
		addEmp.click();
	}

	public void firstName(String name1) {
		fname.sendKeys(name1);
	}

	public void middleName(String name2) {
		mname.sendKeys(name2);
	}

	public void lastName(String name3) {
		lname.sendKeys(name3);
	}

	public void saveButton() {
		save.click();
	}

}
