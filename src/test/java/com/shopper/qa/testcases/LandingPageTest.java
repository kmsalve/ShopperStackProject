package com.shopper.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopper.qa.base.TestBase;
import com.shopper.qa.pages.LandingPage;
import com.shopper.qa.pages.SignInPage;

public class LandingPageTest extends TestBase
{

	//define annotations
	LandingPage landingPage;
	SignInPage signInPage;
		
		
	public LandingPageTest() 
	{
		super();	
		
	}
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();	
		landingPage = new LandingPage();
		signInPage = new SignInPage();
		
	}
	
	@Test(priority=1)
	public void clickLoginTest() 
	{
		signInPage = landingPage.clickLoginFromLandingPage();
	}
	
	@AfterMethod
	public void TearDown() 
	{
		driver.quit();
	}
}
