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
	
	@FindBy(xpath= "//div[contains(@id,'middle')]//span[@class='hdradrs']")
	WebElement wherefield;
	
	@FindBy(xpath = "//span[contains(@class,'hdrbkarrow')]")
	WebElement searchpageBack;
	
	@FindBy(xpath = "//span[contains(@class,'hdrnoftn tr')]")
	WebElement searchNotificationIcon;
	
	@FindBy(xpath = "//input[@id='searchtxt' and @placeholder='Search']")
	WebElement searchbar;

	
	//Constructor
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	
// Objects
	
	 SearchPage searchpage;
	 Utilities utils;
	
	
	// ACTIONS
	
	
	public boolean validateWhatfield() {
		return  whatfield.isDisplayed();
	}

	
	public boolean validateWherefield() {
		return  wherefield.isDisplayed();
	}
	
	public boolean checkSearchpageBack() {
		searchpageBack.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return searchbar.isDisplayed();
	}
	
	
	public boolean checkAutosuggest(String sheetname) {
		boolean status = false;
		utils = new Utilities();
		int totalrows = utils.findRowsCount(datafilepath , sheetname);
		String searchdata="";
		
		for(int i=1;i<=totalrows;i++) {
		whatfield.click();
		searchdata = utils.readDataFromXcel(datafilepath, sheetname , i, 0);
		whatfield.sendKeys(searchdata);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
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
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(searchdata+" - "+status);
		whatfield.clear();
		}
		return status;
	}





}
