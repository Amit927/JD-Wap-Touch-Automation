package com.jdTouch.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jdTouch.base.BaseClass;
import com.jdTouch.pages.HomePage;

public class HomePageTest extends BaseClass {
	
	public HomePageTest() {
		super();
	}
	
	HomePage homepage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		 homepage = new HomePage();
	}
	
	@Test (priority = 1)
	public void testSearchBar() {
		Assert.assertTrue(homepage.checkSearchBar());
	}
	
	@Test (priority = 2)
	public void testLocationfield() {
		Assert.assertTrue(homepage.checkLocationfield());
	}
	
	@Test (priority = 9)
	public void testsocialFeedsCount() throws InterruptedException {
		boolean status = false;
		int count = homepage.checkSocialData();
		if(count>=50) {
			status=true;
		}
		else {
			status = false;
		}
		Assert.assertTrue("Social feeds not loading properly", status);
	}
	
	@Test(priority = 10)
	public void testHotkeysRedirections() {
		Assert.assertTrue("Hotkey redirections Failed",homepage.checkHotkeyRedirecions());
	}
	
	@AfterMethod
	public void closebrowsers() {
		closetabs();
	}
	

}
