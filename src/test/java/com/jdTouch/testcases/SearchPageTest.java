package com.jdTouch.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jdTouch.base.BaseClass;
import com.jdTouch.pages.HomePage;
import com.jdTouch.pages.SearchPage;

public class SearchPageTest extends BaseClass{
	
	 HomePage homepage;
	 SearchPage searchpage;
	
	public SearchPageTest() {
		super();
	}
	
	@BeforeClass
	public void  setup() throws InterruptedException {
		initialization();
		homepage = new HomePage();
	}
	
	
	
	
	@Test (priority=2)
	public void testSearchBarRedirection() {
		 searchpage = homepage.checkSearchBarRedirection();
	//	Assert.assertTrue(searchpage);
		System.out.println("Pass");
	}
	
	@Test (priority=3)
	public void testSearchPage() throws InterruptedException {
		boolean status1 = searchpage.validateSearchPage();
		Assert.assertTrue(status1);
		System.out.println("Pass");
		Thread.sleep(2000);
	}
	
	@Test (priority=4)
	public void testSearchCategoryAutosuggest()  {
		boolean status2 = searchpage.checkAutosuggest("categorydata");
		Assert.assertTrue(status2);
		System.out.println("Pass");
	}
	
	@Test (priority=5)
	public void testSearchCompanyAutosuggest()  {
		boolean status2 = searchpage.checkAutosuggest("companydata");
		Assert.assertTrue(status2);
		System.out.println("Pass");
	}
	
	@Test (priority=6)
	public void testSearchGroupAutosuggest() {
		boolean status2 = searchpage.checkAutosuggest("groupdata");
		Assert.assertTrue(status2);
		System.out.println("Pass");
	}
	
	@Test (priority=7)
	public void testSearchProductAutosuggest() {
		boolean status2 = searchpage.checkAutosuggest("productdata");
		Assert.assertTrue(status2);
		System.out.println("Pass");
	}
	
	
	
@AfterClass
public void teardown() {
	closetabs();
	}	

}
