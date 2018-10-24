package com.jdTouch.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jdTouch.base.BaseClass;

public class FreeListing extends BaseClass {
	
//Page factory
	
	@FindBy(xpath = "//a[@class='uparw ufl arw ' and @id='backlink']")
	WebElement backlink;
	
	@FindBy(xpath = "//a[contains(@class,'cross-mark')]")
	WebElement crosslink;
	
	@FindBy(xpath = "//input[@id='txt_company']")
	WebElement companyName;
	
	@FindBy(xpath = "//input[@id='txt_contact_person']")
	WebElement ownerName;
	
	@FindBy(xpath = "//input[@id='fmb0']")
	WebElement mobNumbaer;
	
	@FindBy(xpath = "//input[@id='txt_landline']")
	WebElement landlineNumber;
	
	@FindBy(xpath = "//input[@id='area']")
	WebElement compArea;
	
	@FindBy(xpath = "//input[@id='txt_auto']")
	WebElement areafield;
	
	@FindBy(xpath = "//div[@id='continue']")
	WebElement continue1;
	
	@FindBy(xpath = "//div[@id='continue5']")
	WebElement continue2;
	
	@FindBy(xpath = "//div[@id='continue']")
	WebElement continue3;
	
	@FindBy(xpath = "//div[@id='continue2']")
	WebElement continue4;
	
	@FindBy(xpath = "//div[@id='continue3']")
	WebElement continue5;
	
	WebElement searchbar ;
	
	
//Constructor	
public FreeListing() {
	PageFactory.initElements(driver, this);
		
	}
	
	

// Methods

public boolean checkFreelistingPage() {
	return companyName.isDisplayed();
}

public boolean checkFreelistBacklink() {
	backlink.click();
	 searchbar = driver.findElement(By.xpath("//div[@class='hdrsrchWpr']"));
	return searchbar.isDisplayed();
}

public boolean checkFreelistCrosslink() {
	crosslink.click();
	 searchbar = driver.findElement(By.xpath("//div[@class='hdrsrchWpr']"));
	return searchbar.isDisplayed();
}

	
public void checkfreeListing(String compname, String username, String mobnumber, String landnumber, String area ) throws InterruptedException {
	
		companyName.sendKeys(compname);
		ownerName.sendKeys(username);
		mobNumbaer.sendKeys(mobnumber);
		landlineNumber.sendKeys(landnumber);
		compArea.click();
		areafield.clear();
		areafield.sendKeys(area);
		Thread.sleep(1500);
		List<WebElement> areaAuto = driver.findElements(By.xpath("//ul[@id='areasugg']//li/a"));
		for(int i=0;i<=areaAuto.size();i++) {
			areaAuto.get(1).click();
			break;
		}
		Thread.sleep(1000);
        continue1.click();
		Thread.sleep(2000);
		continue2.click();
		Thread.sleep(1000);
		continue3.click();
		Thread.sleep(1000);
		continue4.click();
		Thread.sleep(1000);
		continue5.click();

	}
	 

}



