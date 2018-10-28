package com.jdTouch.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IllegalFormatException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.internal.Utils;

import com.jdTouch.base.BaseClass;

public class Utilities extends BaseClass {

public Utilities() {
	
}

static Workbook wb = null;
static Sheet sheet = null;

//Find Rows count
public int findRowsCount(String xcelfilePath,String sheetName) {
	
	try {
		file = new File(xcelfilePath);
		fis = new FileInputStream(file);
		wb = new HSSFWorkbook(fis);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
		sheet = wb.getSheet(sheetName);
		int rowsCount =  sheet.getLastRowNum();
		return rowsCount;
}

//Read xcel data from sheet
public String readDataFromXcel(String dataFilePath, String sheetName, int rowsCount, int columnNumber) {

	String readdata;
	
try {
	 file = new File(dataFilePath);
	fis = new FileInputStream(file);
	 wb = new HSSFWorkbook(fis);
	 sheet =  wb.getSheet(sheetName);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}	
	readdata = sheet.getRow(rowsCount).getCell(columnNumber).getStringCellValue();
	return readdata;
}
 

 
public static Object[][] getTestData(String sheetName) {
	
	FileInputStream file = null;
	try {
		file = new FileInputStream(freeListdata);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		wb = WorkbookFactory.create(file);
	} catch (IllegalFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	sheet = wb.getSheet(sheetName);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	// System.out.println(sheet.getLastRowNum() + "--------" +
	// sheet.getRow(0).getLastCellNum());
	for (int i = 0; i < sheet.getLastRowNum(); i++) {
		for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
			data[i][k] = sheet.getRow(i).getCell(k).toString();
			// System.out.println(data[i][k]);
		}
	}
	return data;
}

// MOVE PAGE DOWN FOR FOCUS==========

public void movePageDown() {
	try {
		Thread.sleep(700);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	Actions action = new Actions(driver);
	action.sendKeys(Keys.END).perform();
	action.sendKeys(Keys.PAGE_DOWN).perform();
	action.sendKeys(Keys.DOWN).perform();
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
}


// Enter OTP

public void enterOTP() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i=0; i<=5; i++) {
		String otpxpath = "//input[@class='pin' and @id='"+i+"']";
		String pin = Integer.toString(i+1);
		driver.findElement(By.xpath(otpxpath)).sendKeys(pin);
		}
}

// get System Time==============

public String getCurrentTime() {
	DateFormat format = new SimpleDateFormat("ddMMyyyy_HHmm_ss");
	Date date = new Date();
	String time = format.format(date);
	return time;
}

//Take Screenshots ========================

public void takeScreenshot() {
	file = new File(screenshotPath+getCurrentTime()+".jpg");
	TakesScreenshot scsht = ((TakesScreenshot)driver);
	File scrsource = scsht.getScreenshotAs(OutputType.FILE);
	Utils.copyFile(scrsource, file);

}

}














