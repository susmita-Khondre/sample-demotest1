package com.searchbar;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchFunctionality {
	static RemoteWebDriver driver;
	static FluentWait<WebDriver> wait;

	@BeforeMethod
	public static void openBrowser() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(2000));
		wait.pollingEvery(Duration.ofMillis(250));

	}

	/**
	 * TC_S01:Search valid keyword
	 */

	@Test
	public static void searchValidKeyword() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Wireless Headphones");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER);
		actions.perform();
		List<WebElement> itemTitles = driver.findElements(By.cssSelector("div[data-cel-widget*=MAIN-SEARCH_RESULTS] div[data-cy=\"title-recipe\"]"));
		SoftAssert softly = new SoftAssert();
		for (WebElement itemTitle : itemTitles) {
			String title = itemTitle.getText();
			softly.assertTrue(title.contains("Wireless"),title);
		}
		
		softly.assertAll();

	}

}
