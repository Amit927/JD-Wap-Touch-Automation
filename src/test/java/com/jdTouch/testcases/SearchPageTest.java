package com.jdTouch.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jdTouch.base.BaseClass;
import com.jdTouch.pages.HomePage;
import com.jdTouch.pages.SearchPage;

public class SearchPageTest extends BaseClass{
	
	 HomePage homepage;
	 SearchPage searchpage;
	 static boolean status = false;
	
	public SearchPageTest() {
		super();
	}
	
@BeforeMethod
	public void  setup() throws InterruptedException {
		initialization();
		homepage = new HomePage();
		 searchpage = homepage.checkSearchBarRedirection();
	}
	

	@Test (priority=1)
	public void testWhatField() {
		status = searchpage.validateWhatfield();
		Assert.assertTrue(status);
	}
	
	@Test (priority=2)
	public void testWherefield() {
		status = searchpage.validateWherefield();
		Assert.assertTrue(status);
	}
	
	@Test (priority=4)
	public void testSearchCategoryAutosuggest()  {
		boolean status2 = searchpage.checkAutosuggest("categorydata");
		Assert.assertTrue(status);
	}
	
	@Test (priority=5)
	public void testSearchCompanyAutosuggest()  {
		boolean status2 = searchpage.checkAutosuggest("companydata");
		Assert.assertTrue(status);
	}
	
	@Test (priority=6)
	public void testSearchGroupAutosuggest() {
		boolean status2 = searchpage.checkAutosuggest("groupdata");
		Assert.assertTrue(status);
	}
	
	@Test (priority=7)
	public void testSearchProductAutosuggest() {
		boolean status2 = searchpage.checkAutosuggest("productdata");
		Assert.assertTrue(status);
	}
	
@Test (priority=8)
public void navigateToHomePage() {
	status = searchpage.checkSearchpageBack();
	Assert.assertTrue(status);
}
	
	
@AfterMethod
public void teardown() {
	closetabs();
	}	

}
