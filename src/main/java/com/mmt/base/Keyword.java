package com.mmt.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.exception.InvalidBrowserException;

public class Keyword {
	public static RemoteWebDriver driver;

	public static void openBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			throw new InvalidBrowserException(browsername);
		}
	}
	
	public static void windowMaximize() {
		driver.manage().window().maximize();

	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void openUrl(String url) {
		driver.get("https://www.makemytrip.com/");
		System.out.println("Url is luanched successfully");

	}

	public static WebElement getWebElement(String locatortype, String locator) {
		WebElement e = null;
		if (locatortype.equalsIgnoreCase("id")) {
			e = driver.findElement(By.id(locator));
		} else if (locatortype.equalsIgnoreCase("name")) {
			e = driver.findElement(By.name(locator));
		} else if (locatortype.equalsIgnoreCase("TagName")) {
			e = driver.findElement(By.tagName(locator));
		} else if (locatortype.equalsIgnoreCase("classname")) {
			e = driver.findElement(By.className(locator));
		} else if (locator.equalsIgnoreCase("linktext")) {
			e = driver.findElement(By.linkText(locator));
		} else if (locator.equalsIgnoreCase("partiallinktext")) {
			e = driver.findElement(By.partialLinkText(locator));
		} else if (locatortype.equalsIgnoreCase("xpath")) {
			e = driver.findElement(By.xpath(locator));
		} else if (locatortype.equalsIgnoreCase("css")) {
			e = driver.findElement(By.cssSelector(locator));
		}

		return e;

	}
	public static void clickonElement(String locatortype, String locator) {
		
		getWebElement(locatortype, locator).click();
	}
	public static void enterText(String locatortype,String locator, String text) {
		getWebElement(locatortype, locator).sendKeys(text);
	}

	public static void enterText(By from_inputbox, String text) {
		driver.findElement(from_inputbox).sendKeys(text);
	}

	public static void clickonElement(By locator) {
		driver.findElement(locator).click();
		
	}

	
}
