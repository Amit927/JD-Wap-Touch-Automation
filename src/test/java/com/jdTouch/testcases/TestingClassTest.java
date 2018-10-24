package com.jdTouch.testcases;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jdTouch.base.BaseClass;
import com.jdTouch.pages.ContextualMenu;
import com.jdTouch.pages.HomePage;
import com.jdTouch.pages.TestingClass;

public class TestingClassTest extends BaseClass {
	
	public TestingClassTest() {
		super();
	}
	
	 TestingClass testobj = new TestingClass();
	 HomePage homepage;
	 ContextualMenu contextmenu;
	 Actions action;

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		homepage = new HomePage();
		contextmenu = homepage.openContextualMenu();
		Thread.sleep(1000);
	}
	
	//@Test (priority = 24)
	public void TestFavoritesPageLoggedinflow() {
		Assert.assertTrue(contextmenu.checkFavoriesLoggedin());
	}

	//@Test (priority = 25)
	public void TestMyInterestPageLoggedinflow() {
		Assert.assertTrue(contextmenu.checkMyInterestLoggedin());
	}

	//@Test (priority = 26)
	public void TestMyTransactionPageLoggedinflow() {
		Assert.assertTrue(contextmenu.checkMyTransactionLoggedin());
	}

	//@Test (priority = 27)
	public void TestFeedbackPageLoggedinflow() {
		Assert.assertTrue(contextmenu.checkFeedbackLoggedin());
	}

	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
	
}
