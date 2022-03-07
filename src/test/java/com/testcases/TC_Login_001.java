package com.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pomobjects.LoginPage;

public class TC_Login_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		Thread.sleep(2000);

		lp.setPassword(password);
		Thread.sleep(2000);
		logger.info("Entered Password");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Click operation");

		logger.info("Logger is Added");

		if (driver.getTitle().contains("OrangeHRM")) {
			System.out.println("Test Passed");
			Assert.assertTrue(true);

		} else {
			try {
				captureScreen(driver, "loginTest");
			} catch (IOException e) {
				e.printStackTrace();
			}
			Assert.assertTrue(false);
		}

	}
}