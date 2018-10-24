package com.jdTouch.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jdTouch.base.BaseClass;
import com.jdTouch.util.Utilities;

public class ContextualMenu extends BaseClass{
	
//PAGE Factory
	
	@FindBy(xpath = "//span[@class='hdrjdtext' and text()='Profile']")
	WebElement headertext;
	
	@FindBy(xpath = "//span[@class='hdrbkarrow transform11']")
	WebElement backlink;
	
	@FindBy(xpath = "//div[@class='prfltbl ']")
	WebElement userNonLogin;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='Favourites']")
	WebElement favorites;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='My Interests']")
	WebElement myInterest;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='My Transaction']")
	WebElement myTransaction;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='Feedback']")
	WebElement feedback;
	
	@FindBy(xpath = "//li[@class='font15']//span[starts-with(text(), 'List')]")
	WebElement freeListingLink;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='Help & Support']")
	WebElement helpnsupport;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='About Us']")
	WebElement aboutUs;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='Privacy Setting']")
	WebElement privacy;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='Others']")
	WebElement others;
	
	@FindBy(xpath = "//span[@class='tdspan' and text()='Login']")
	WebElement loginlink;
	
	@FindBy(xpath = "//input[@placeholder='Your Name']")
	WebElement loginName;
	
	@FindBy(xpath = "//input[@type='tel']")
	WebElement loginNumber;
	
	@FindBy(xpath = "//button[contains(@type,'submit') and contains(@class,'bluearrow ')]")
	WebElement loginButton;
	
	@FindBy(xpath = "//button[contains(@class,'bluearrow') and text()='Login']")
	WebElement submitOTPbutton;
	
	@FindBy(xpath = "//span[@class='nm']")
	WebElement loggedinName;
	
	@FindBy(xpath = "//input[@class='searchfavrttxt']")
	WebElement favoritepageSearch;
	
	@FindBy(xpath = "//span[@class='hdrbkarrow transform11']")
	WebElement favoritesBack;
	
	@FindBy(xpath = "//span[@class='hdrMenu transform11']")
	WebElement favoritesContextual;
	
	@FindBy(xpath = "//span[contains(@class,'list-title') and contains(text(),'Movies')]")
	WebElement interest_movies;
	
	@FindBy(xpath = "//span[@class='head-left']")
	WebElement interestback;
	
	@FindBy(xpath = "//li[contains(text(),'Bill Payments')]")
	WebElement transaction_recharge;
	
	@FindBy(xpath = "//span[contains(@class,'hdrbkarrow')]")
	WebElement transaction_back;
	
	@FindBy(xpath = "//span[contains(@class,'hdrbkarrow')]")
	WebElement feedback_back;
	
	@FindBy(xpath = "//a[@class='tbhdr act' and @id='ratings']")
	WebElement feedback_ratings;
	
	
	
	
	//div[@id='reviewRatings']
	
	@FindBy(xpath = "//div[@class='maybelater']//span[text()='Maybe Later']")
	WebElement maybeLater;
	
	@FindBy(xpath = "//section[contains(@id,'cms_contactus')]//div[@class='tbsbx1']//a[contains(text(),'Registered')]")
	WebElement cmsElement;
	
	@FindBy(xpath = "//p[@class='jd_headings' and text()='About Us']")
	WebElement aboutusElement;
	
	@FindBy(xpath = "//span[@class='mllist bdrbtm' and text()='Free Listing']")
	WebElement Other_freelisting;
	
	@FindBy(xpath = "//span[@class='mllist bdrbtm' and text()='Feedback']")
	WebElement Other_feedback;
	
	@FindBy(xpath = "//span[@class='mllist bdrbtm' and text()='Testimonials']")
	WebElement Other_testimonials;
	
	@FindBy(xpath = "//span[@class='mllist bdrbtm' and text()='Download JD App']")
	WebElement Other_downloadapp;
	
	@FindBy(xpath = "//li//span[contains(@class,'mllist') and contains(text(),'Who')]")
	WebElement Other_whorwe;
	
	@FindBy(xpath = "//li//span[contains(@class,'mllist') and contains(text(),'Policies')]")
	WebElement Other_policies;
	
	@FindBy(xpath = "//li//span[contains(@class,'mllist') and contains(text(),'Term')]")
	WebElement Other_terms;
	
	@FindBy(xpath = "//li//span[contains(@class,'mllist') and contains(text(),'Infringement')]")
	WebElement Other_infringement; 
	
	@FindBy(xpath = "//li//span[contains(@class,'mllist') and contains(text(),'Contact')]")
	WebElement Other_contactus;
	
	@FindBy(xpath = "//span[@class='hdrnoftn transform11']")
	WebElement Other_notification;
	
	@FindBy(xpath = "//span[@class='hdrbkarrow transform11']")
	WebElement Other_back;
	
	@FindBy(xpath = "//a[@class='uparw ufl arw ' and @id='backlink']")
	WebElement freelistingback;
	
	@FindBy(xpath = "//div[@class='testimatter']")
	WebElement testimonialsList;
	
	@FindBy(xpath = "//span[contains(@class,'hdrbkarrow')]")
	WebElement testimonialsback;
	
	@FindBy(xpath = "//div[@class='poli_text']")
	WebElement policypage;
	
	@FindBy(xpath = "//span[contains(@class,'hdrbkarrow')]")
	WebElement policyback;
	
	@FindBy(xpath = "//div[@class='poli_text']")
	WebElement termsofusepage;
	
	@FindBy(xpath = "//span[contains(@class,'hdrbkarrow')]")
	WebElement termsback;
	
	@FindBy(xpath = "//div[@class='poli_text']")
	WebElement infringementpage;
	
	@FindBy(xpath = "//span[contains(@class,'hdrbkarrow')]")
	WebElement infringmenetback;
	
	@FindBy(xpath = "//a[@class='contactbtn' and text()='08888888888']")
	WebElement contactuspage;
	
	@FindBy(xpath = "//span[contains(@class,'hdrbkarrow')]")
	WebElement contactusback;


	WebElement searchbar;
	 boolean status = false;
	 Utilities utilize = new Utilities();
	 //Actions action;
	
//Constructor	
public ContextualMenu() {
	PageFactory.initElements(driver, this);
}


/*public void movePageDown() {
	try {
		Thread.sleep(700);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	action.sendKeys(Keys.DOWN).build().perform();
	action.sendKeys(Keys.DOWN).build().perform();
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
}*/
 
//Methods

public boolean checkContextualBack() {
	backlink.click();
	searchbar = driver.findElement(By.xpath("//div[@class='hdrsrchWpr']"));
	status = searchbar.isDisplayed();
	return status;
}

public boolean checkContextualHeader() {
	return headertext.isDisplayed();
}

public boolean checkNonloggedUser() {
	userNonLogin.click();
	status = loginNumber.isDisplayed();
	maybeLater.click();
	return status;
}

public boolean checkNonloggedFavorites() {
	favorites.click();
	status = loginNumber.isDisplayed();
	maybeLater.click();
	return status;

}

public boolean checkNonloggedInterests() {
	
	myInterest.click();
	status = loginNumber.isDisplayed();
	maybeLater.click();
	return status;

}

public boolean checkNonloggedTransactions() {
	myTransaction.click();
	status = loginNumber.isDisplayed();
	maybeLater.click();
	return status;
}

public boolean checkNonloggedHelpnSupport() {
	helpnsupport.click();
	try {
	Thread.sleep(1500);
	}catch(Exception e) {
		e.printStackTrace();
	}
	status = cmsElement.isDisplayed();
	driver.navigate().back();
	return status;
}

public boolean checkNonloggedFeedback() {
	feedback.click();
	status = loginNumber.isDisplayed();
	maybeLater.click();
	return status;
}

public boolean checkNonloggedLoginlink() {
	headertext.click();
	utilize.movePageDown();
	loginlink.click();
	status = loginNumber.isDisplayed();
	maybeLater.click();
	return status;
}

public FreeListing openFreeListing() {
	freeListingLink.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	return new FreeListing();
}

public boolean checkOthers() {
	utilize.movePageDown();
	others.click();
	return Other_notification.isDisplayed();
}

public boolean checkOthersBack() {
	utilize.movePageDown();
	others.click();
	Other_back.click();
	status = userNonLogin.isDisplayed();
	return status;
}

public boolean checkOthersNotification() {
	utilize.movePageDown();
	others.click();
	Other_notification.click();
	status = loginNumber.isDisplayed();
	maybeLater.click();
	return status;
}

public boolean checkOthersFreelisting() {
	utilize.movePageDown();
	others.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	Other_freelisting.click();
	status = freelistingback.isDisplayed();
	return status;
}

public boolean checkOthersFeedback() {
	utilize.movePageDown();
	others.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	Other_feedback.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = cmsElement.isDisplayed();
	return status;	
}

public boolean checkTestimonials() {
	utilize.movePageDown();
	others.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	Other_testimonials.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = testimonialsList.isDisplayed();
	testimonialsback.click();
	return status;	
}

public boolean checkDownloadjdapp() {
	utilize.movePageDown();
	others.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = Other_downloadapp.isDisplayed();
	return status;	
}

public boolean checkWhorWe() {
	utilize.movePageDown();
	others.click();
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}	Other_whorwe.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = aboutusElement.isDisplayed();
	return status;	
}

public boolean checkPolicy() {
	utilize.movePageDown();
	others.click();
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}	Other_policies.click();
	status = policypage.isDisplayed();
	policyback.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	return status;	
}

public boolean checkTerms() {
	utilize.movePageDown();
	others.click();
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
	Other_terms.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = termsofusepage.isDisplayed();
	termsback.click();
	return status;	
}

public boolean checkInfringement() {
	utilize.movePageDown();
	others.click();
	utilize.movePageDown();
	Other_infringement.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = infringementpage.isDisplayed();
	infringmenetback.click();
	return status;	
}

public boolean checkContactus() {
	utilize.movePageDown();
	others.click();
	utilize.movePageDown();
	Other_contactus.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	WebElement contactuspage =driver.findElement(By.xpath("//a[@class='contactbtn' and text()='08888888888']"));
	status = contactuspage.isDisplayed();
	contactusback.click();
	return status;	
}

//Logged in cases -----------------------------------------

public boolean checkLoginPageButton() {
	utilize.movePageDown();
	loginlink.click();
	status = loginButton.isEnabled();
	return status;
	
}

public String checkLoginflow() {
	utilize.movePageDown();
	loginlink.click();
	loginName.sendKeys(prop.getProperty("username"));
	loginNumber.sendKeys(prop.getProperty("loginnumber"));
	loginButton.click();
	utilize.enterOTP();
	submitOTPbutton.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	String Name = loggedinName.getText();
	System.out.println(Name);
	return Name;
}

public boolean checkFavoriesLoggedin() {
	favorites.click();
	loginName.sendKeys(prop.getProperty("username"));
	loginNumber.sendKeys(prop.getProperty("loginnumber"));
	loginButton.click();
	utilize.enterOTP();
	submitOTPbutton.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = favoritepageSearch.isDisplayed();
	favoritesBack.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	favorites.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	favoritesContextual.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	favorites.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = favoritepageSearch.isDisplayed();
	return status;
}

public boolean checkMyInterestLoggedin() {
	myInterest.click();
	loginName.sendKeys(prop.getProperty("username"));
	loginNumber.sendKeys(prop.getProperty("loginnumber"));
	loginButton.click();
	utilize.enterOTP();
	submitOTPbutton.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	myInterest.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	status = interest_movies.isDisplayed();
	interestback.click();
	return status;
}
	
public boolean checkMyTransactionLoggedin() {
	myTransaction.click();
	loginName.sendKeys(prop.getProperty("username"));
	loginNumber.sendKeys(prop.getProperty("loginnumber"));
	loginButton.click();
	utilize.enterOTP();
	submitOTPbutton.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	status = transaction_recharge.isDisplayed();
	transaction_back.click();
	return status;
}

public boolean checkFeedbackLoggedin() {
	feedback.click();
	loginName.sendKeys(prop.getProperty("username"));
	loginNumber.sendKeys(prop.getProperty("loginnumber"));
	loginButton.click();
	utilize.enterOTP();
	submitOTPbutton.click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	status = feedback_ratings.isDisplayed();
	feedback_back.click();
	return status;
}

	







	

}
