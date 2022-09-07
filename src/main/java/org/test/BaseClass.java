package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// WebDriver/////
		public static WebDriver driver;

		// ChromeDriver///
		public static WebDriver chromeLaunch() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		}

		// EgdeDriver////
		public static WebDriver edgeLaunch() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			return driver;
		}

		// BrowserLaunch
		public static void browserLaunch(String browserName) {
			switch (browserName) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "edge":
				WebDriverManager.chromedriver().setup();
				driver = new EdgeDriver();
				break;
			}
		}
		// url Launch///

		public static WebDriver urlLaunch(String urlName) {
			driver.get(urlName);
			return driver;

		}

		// implicit waits////
		public static void implicitWait(int sec) {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

		}

		//// sendKeys////
		public static void sendKeys(WebElement e, String txt) {
			e.sendKeys(txt);

		}

		// Click//
		public static void click(WebElement e) {
			e.click();

		}

		//// Get Current URL ////
		public static String getCurrentUrl() {
			String url = driver.getCurrentUrl();
			return url;
		}

		//// GetAttribute////
		public static String GetAttribute(WebElement e, String a) {
			String txt = e.getAttribute("value");
			return txt;

		}

		//// Select Drag and Drop ////
		public static void dragAndDrop(WebElement from, WebElement to) {
			Actions a = new Actions(driver);
			a.dragAndDrop(from, to).perform();

		}

		public static void moveToElement(WebElement e) {
			Actions a = new Actions(driver);
			a.moveToElement(e).perform();

		}

		// Alert accept//
		public static void acceptAlert() {
			Alert a = driver.switchTo().alert();
			a.accept();

		}

		/// Alert Dismiss//
		public static void acceptDismiss() {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		}

		// Alert Get text//
		public static String alertGetText(String text) {
			Alert a = driver.switchTo().alert();
			String txt = a.getText();
			return txt;
		}

		/// Alert sendKeys ////
		public static void alertSendKeys(String text) {
			Alert a = driver.switchTo().alert();
			a.sendKeys(text);
		}

		// Select by index///
		public static void selectByIndex(WebElement e, int index) {
			Select s = new Select(e);
			s.selectByIndex(index);
		}

		// Select by Visible Text//
		public static void selectByVisibleText(WebElement e, String text) {
			Select s = new Select(e);
			s.selectByVisibleText(text);
		}

		// Select by value//
		public static void selectByValue(WebElement e, String text) {
			Select s = new Select(e);
			s.selectByValue(text);

		}
		//// Frames by name or id/////
		public static void framesById(String id) {
			driver.switchTo().frame(id);
			

		}
		//// Frames by index////
		public static void framesByIndex(int index) {
			driver.switchTo().frame(index);

		}
		
		//// Frames by WebElement ////  
		public static void framesByWebElement(WebElement e) {
			driver.switchTo().frame(e);
	}
		//// JavaScript get text ////
		public static String javaScriptGetText(WebElement e ) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments [0]. scrollIntoView(true)", e);
			String txt = e.getText();
			return txt;

		}
		//// JavaScript Set Attribute ////
		public static void javascriptSetAttribute(WebElement e , String text) {
			JavascriptExecutor js =(JavascriptExecutor) driver;
	        js.executeScript("arguments [0]. setAttribute('value',"+text+")", e);
	        
		}
		////Javascript scroll down///
		public static void javaScriptScroolDown(WebElement e ) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments [0]. scrollIntoView(true)", e);
		}
		
		//// JavaScript Scroll up////
		public static void javaScriptScrollUp(WebElement e ) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments [0]. scrollIntoView(false)", e);
		}
		
		//// Javascript Click ////
		public static void javascriptClick(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0]. click()", e);
			
			}
		//// ScreenShot Window////
		public static void screenShotWindow(String text) throws Exception {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to = new File ("E:\\Coding\\Screenshot\\"+text+".png");
			FileUtils.copyFile(from, to);
			}
		//// ScreenShot WebElement////
		public static void screenShotWebElement(WebElement e, String text) throws Exception {

			File from = e.getScreenshotAs(OutputType.FILE);
			File to = new File ("E:\\Coding\\Screenshot\\"+text+".png");
			FileUtils.copyFile(from, to);
		}
		/// Window Handling open new window/////
		public static void winHandlingNewWindow(WebElement e) throws Exception {
			Actions a = new Actions(driver);
			Robot r = new Robot();
			a.moveToElement(e).contextClick().perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}
		//// Window handling Selecting a window by index ////
		public static void winSelectingByIndex(int index) {
			Set<String> sett = driver.getWindowHandles();
			for(String one: sett) {
				System.out.println(one);
			}
			List<String> li = new ArrayList<>();
	        li.addAll(li);
	        driver.switchTo().window(li.get(index));
		}


}
