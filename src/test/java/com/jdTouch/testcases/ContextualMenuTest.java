package com.jdTouch.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jdTouch.base.BaseClass;
import com.jdTouch.pages.ContextualMenu;
import com.jdTouch.pages.HomePage;

public class ContextualMenuTest extends BaseClass{
	
public ContextualMenuTest() {
	super();
}

HomePage homepage;
ContextualMenu contextmenu;
boolean status = false;

@BeforeMethod
public void setup() throws InterruptedException {
	initialization();
	homepage = new HomePage();
	contextmenu = homepage.openContextualMenu();
	Thread.sleep(1000);
}

@Test (priority = 1)
public void TestContextualMenuPage() {
	status = contextmenu.checkContextualHeader();
	Assert.assertTrue(status);
}

@Test (priority = 2)
public void testContextualmenuBack() {
	status = contextmenu.checkContextualBack();
	Assert.assertTrue(status);
}

@Test (priority = 3)
public void TestUsernameNonloggedin() {
	status = contextmenu.checkNonloggedUser();
	Assert.assertTrue(status);
}

@Test (priority = 4)
public void TestFavoriesNonloggedin() {
	status = contextmenu.checkNonloggedFavorites();
	Assert.assertTrue(status);	
}

@Test (priority = 5)
public void TestMyInterestNonloggedin() {
	status = contextmenu.checkNonloggedInterests();
	Assert.assertTrue(status);
}

@Test (priority = 6)
public void TestMyTransactionNonloggedin() {
	status = contextmenu.checkNonloggedTransactions();
	Assert.assertTrue(status);	
}

@Test (priority = 7)
public void TestFeedbackNonloggedin() {
	status = contextmenu.checkNonloggedFeedback();
	Assert.assertTrue(status);	
}

@Test (priority = 8)
public void Testloginlink() throws InterruptedException {
	Thread.sleep(800);
	status = contextmenu.checkNonloggedLoginlink();
	Assert.assertTrue(status);
}

@Test (priority = 9)
public void TestHelpnSupport() {
	status = contextmenu.checkNonloggedHelpnSupport();
	Assert.assertTrue(status);
}

@Test (priority = 10)
public void TestOthersPage() {
	status = contextmenu.checkOthers();
	Assert.assertTrue(status);
}

@Test (priority = 11)
public void TestOthersBack() {
	status = contextmenu.checkOthersBack();
	Assert.assertTrue(status);
}

@Test (priority = 12)
public void TestOthersNotification() {
	status = contextmenu.checkOthersNotification();
	Assert.assertTrue(status);
}

@Test (priority = 13)
public void TestOthersFreelisting() {
	status = contextmenu.checkOthersFreelisting();
	Assert.assertTrue(status);
}

@Test (priority = 14)
public void TestOthersFeedback() {
	status = contextmenu.checkOthersFeedback();
	Assert.assertTrue(status);
}

@Test (priority = 15)
public void TestTestimonials() {
	status = contextmenu.checkTestimonials();
	Assert.assertTrue(status);
}

@Test (priority = 16)
public void TestDownloadJdapp() {
	status = contextmenu.checkDownloadjdapp();
	Assert.assertTrue(status);
}

@Test (priority = 17)
public void TestOthersWhoareWe() {
	status = contextmenu.checkWhorWe();
	Assert.assertTrue(status);
}

@Test (priority = 18)
public void TestPolicies() {
	status = contextmenu.checkPolicy();
	Assert.assertTrue(status);
}

@Test (priority = 19)
public void TestOtherTermsOfUse() {
	status = contextmenu.checkTerms();
	Assert.assertTrue(status);
}

@Test (priority = 20)
public void TestOtherInfringementPolicy() {
	status = contextmenu.checkInfringement();
	Assert.assertTrue(status);
}

@Test (priority = 21)
public void TestOtherContactUs() {
	status = contextmenu.checkContactus();
	Assert.assertTrue(status);
}

@Test (priority = 22)
public void TestLoginPageSubmitButton() {
	status = contextmenu.checkLoginPageButton();
	Assert.assertTrue(status);
}

@Test (priority = 23)
public void TestLoginFunctionality() {
	Assert.assertEquals("Login Issue","Kanchan", contextmenu.checkLoginflow());
}

@Test (priority = 24)
public void TestFavoritesPageLoggedinflow() {
	Assert.assertTrue(contextmenu.checkFavoriesLoggedin());
}

@Test (priority = 25)
public void TestMyInterestPageLoggedinflow() {
	Assert.assertTrue(contextmenu.checkMyInterestLoggedin());
}

@Test (priority = 26)
public void TestMyTransactionPageLoggedinflow() {
	Assert.assertTrue(contextmenu.checkMyTransactionLoggedin());
}

@Test (priority = 27)
public void TestFeedbackPageLoggedinflow() {
	Assert.assertTrue(contextmenu.checkFeedbackLoggedin());
}




@AfterMethod
public void close() {
	driver.quit();
}

}
