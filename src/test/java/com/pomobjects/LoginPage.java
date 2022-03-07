package com.pomobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="txtUsername")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="txtPassword")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="//a[text()= 'Logout']")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	/* public void clickLogout()
	{
		lnkLogout.click();
	}
*/

}
