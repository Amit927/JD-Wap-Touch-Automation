package com.jdTouch.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jdTouch.base.BaseClass;
import com.jdTouch.util.Utilities;

public class SearchPage extends BaseClass{
	
	// Page factory
	
	@FindBy(xpath="//input[@type='text']")
	WebElement whatfield;
	
	@FindBy(xpath= "//div[@id='middle_btn']//spam[@class='hdradrs']")
	WebElement wherefield;
	
	

	
	//Constructor
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	
// Objects
	
	 SearchPage searchpage;
	 Utilities utils;
	
	
	// ACTIONS
	
	
	public boolean validateSearchPage() {
		return  (whatfield.isDisplayed());
	}

	
	public boolean validateWherefield() {
		return  wherefield.isDisplayed();
	}
	
	public boolean checkAutosuggest(String sheetname) throws InterruptedException {
		boolean status = false;
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		utils = new Utilities();
		int totalrows = utils.findRowsCount(datafilepath , sheetname);
		String searchdata="";
		
		for(int i=1;i<=totalrows;i++) {
		whatfield.click();
		searchdata = utils.readDataFromXcel(datafilepath, sheetname , i, 0);
		whatfield.sendKeys(searchdata);
		Thread.sleep(1500);
		List<WebElement> ASlist = driver.findElements(By.xpath("//ul[@class='rntsrchs']//li//span[@class='adrswp']"));
		for(WebElement atsgt : ASlist) {
			if(atsgt.getText().contains(searchdata)) {
				status = true;
				break;
			}
			else {
				status = false;
				break;
			}
		}
		System.out.println(searchdata+" - "+status);
		whatfield.clear();
		}
		return status;
	}





}
