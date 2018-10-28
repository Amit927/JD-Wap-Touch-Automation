package com.jdTouch.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jdTouch.base.BaseClass;
import com.jdTouch.util.Utilities;

public class HomePage extends BaseClass {
	
	// Page factory
	
		//public static By searchbar = By.xpath("//input[@id='searchtxt']");
		//public static By locationField = By.id("//input[@id='middle_btn']");
		
	@FindBy(xpath ="//input[@id='searchtxt']")
	WebElement searchbar;
	
	@FindBy(xpath ="//div[@id='middle_btn']")
	WebElement locationField;
	
	@FindBy(xpath = "//span[@class='hdrMenu transform11']")
	WebElement contextualMenuIcon;
	
		
	// Constructor	
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		
		Utilities utilize = new Utilities();
		
		
//  METHODS================		
		public boolean checkSearchBar() {
			return (searchbar.isDisplayed());
		}
		
		public boolean checkLocationfield() {
			return locationField.isDisplayed();
		}
		
		public SearchPage checkSearchBarRedirection() {
			searchbar.click();
			return new SearchPage();
		}

		public int checkSocialData() throws InterruptedException {
			for(int c=0;c<=15;c++) {
				utilize.movePageDown();
			}
			
			List<WebElement> Sfeeds = driver.findElements(By.xpath("//span[@class='wrpfl']"));
			System.out.println("total feeds = "+Sfeeds.size());
			//for(int i=0;i<=Sfeeds.size();i++) {
			for(WebElement feeds : Sfeeds) {
				String feedName = feeds.getText();
				System.out.println(feedName);
			}

			return Sfeeds.size();
		}
		
	public boolean checkHotkeyRedirecions() {	
		boolean status;
		while(status=true) {
		for(int i=1;i<=12;i++) {
			//(//span[@class='hpicon hpshoppingicon'])[2]
		String xpath = "(//span[@class='hptext'])["+i+"]";
		WebElement hotkeys = driver.findElement(By.xpath(xpath)); 
		System.out.println(i+". "+hotkeys.getText());
		hotkeys.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().back();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		status = true;
		}
		break;
		}
		return status;
	}
		
		
	public ContextualMenu openContextualMenu() {
		contextualMenuIcon.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return new ContextualMenu();
	}
	
		
 
}
