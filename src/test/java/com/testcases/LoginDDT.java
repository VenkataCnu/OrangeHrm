package com.testcases;

import org.testng.annotations.Test;

import com.pomobjects.LoginPage;

public class LoginDDT extends BaseClass {

	
	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd) throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("Usename Entered");
		lp.setPassword(pwd);
		logger.info("Password Entered");
		lp.clickSubmit();
		logger.info("Click Operation");
		logger.info("Login Opertaion Started");
	}

}
