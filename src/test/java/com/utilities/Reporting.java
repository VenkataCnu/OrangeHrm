package com.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting extends TestListenerAdapter {

	ExtentReports extent;
	ExtentTest test;
	ExtentSparkReporter report;

	public void onStartup(ITestListener list) {
		extent = new ExtentReports();
		ExtentSparkReporter sparkrep = new ExtentSparkReporter(
				"D:/MyWorkSpace/OrangeHrmDemp/Report/MyReport.html");
		extent.attachReporter(sparkrep);

		System.out.println("Test Started Now " + list);
		Reporter.log("Test Started in report" + list);
	}

	public void onTestSuccess(ITestListener list) {
		System.out.println("Test run Successfully " + list);
		Reporter.log("Test run Success" + list);
	}

	/*public String timeStamp() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");

		return sd.format(new Date());
	} */

	public void onFinish(ITestListener list) {
		extent.flush();

	}

}
