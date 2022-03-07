package com.testcases;

import org.testng.annotations.Test;

import com.pomobjects.LoginPage;
import com.pomobjects.Pim;

public class TC_AddEmployee_002 extends BaseClass {

	@Test
	public void AddEmpTest() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username Entered");
		lp.setPassword(password);
		logger.info("Password Entered");
		lp.clickSubmit();
		logger.info("clicked");

		Thread.sleep(5000);
		
		Pim pim = new Pim(driver);
		pim.pimclick();
		logger.info("Click action on PIM");
		pim.addEmp();
		logger.info("Ad Emp");
		pim.firstName("John");
		logger.info("First Name");
		pim.middleName("F");
		logger.info("Middle Name");
		pim.lastName("Kennedy");
		logger.info("Last Name");
		pim.saveButton();
		logger.info("Click action");
	}
}
