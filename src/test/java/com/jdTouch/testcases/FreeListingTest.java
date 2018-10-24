package com.jdTouch.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jdTouch.base.BaseClass;
import com.jdTouch.pages.ContextualMenu;
import com.jdTouch.pages.FreeListing;
import com.jdTouch.pages.HomePage;
import com.jdTouch.util.Utilities;

public class FreeListingTest extends BaseClass{
	
public FreeListingTest() {
	super();
}

public HomePage homepage;
ContextualMenu contextual;
FreeListing freelisting;
Utilities utils;


@BeforeMethod
public void setup() throws InterruptedException {
	initialization();
	utils = new Utilities();
	homepage = new HomePage();
	contextual = homepage.openContextualMenu();
	Thread.sleep(1500);
	freelisting = contextual.openFreeListing();
	Thread.sleep(1000);
}

@Test (priority = 1)
public void validateFreelistingPage() {
	Assert.assertTrue(freelisting.checkFreelistingPage());
}

@Test (priority = 2)
public void testFreelistingBack() {
	Assert.assertTrue( freelisting.checkFreelistBacklink());	
}

@Test (priority = 3)
public void testFreelistingCross() {
	Assert.assertTrue(freelisting.checkFreelistCrosslink());	
}

@DataProvider
public Object[][] getFreelistData(){
	Object data[][] = utils.getTestData("freelistvalues");
	return data;
}

@Test (priority = 6, dataProvider = "getFreelistData")
public void testFreeListing (String compname, String username, String mobnumber, String landnumber, String area ) throws InterruptedException {
	freelisting.checkfreeListing(compname, username, mobnumber, landnumber, area);
		
}

@AfterMethod
public void closebrowser() {
	freelisting.closetabs();
}



}
