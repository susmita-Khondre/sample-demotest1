package com.train;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrainTests {

	static RemoteWebDriver driver;
	static FluentWait<WebDriver> wait;

	@BeforeClass
	public static void openBrowser() throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(2000));
		wait.pollingEvery(Duration.ofMillis(250));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.commonModal__close")));
		driver.findElement(By.cssSelector("span.commonModal__close")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li.menu_Trains")).click();

	}

	/*
	 * TC_TR_03:Verify search with valid inputs-FromCity
	 * 
	 */
	@Test
	public static void fromCity() throws InterruptedException {
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='fromCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Pune Junction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text (),'Pune Junction')]")).click();

	}

	/*
	 * TC_TR_04:Verify search with valid inputs-ToCity
	 * 
	 */
	@Test
	public static void toCity() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.react-autosuggest__input.react-autosuggest__input--open"))
				.sendKeys("Delhi");
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.react-autosuggest__section-title+ul>li:nth-child(1)")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.react-autosuggest__section-title+ul>li:nth-child(1)")).click();
		Thread.sleep(2000);
		WebElement ToCity = driver
				.findElement(By.cssSelector("div.react-autosuggest__section-title+ul>li:nth-child(1)"));
		ToCity.click();
		ToCity.getText();
		Assert.assertSame(ToCity.getText().contains("Delhi"), ToCity);

	}

	/*
	 * TC_TR_05:Verify search with TravelDate
	 */
	@Test
	public static void departureDate() throws InterruptedException {

		driver.findElement(By.cssSelector("label[for=travelDate]")).click();

		Actions action = new Actions(driver);
		action.scrollByAmount(0, 800);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"div.DayPicker-Months>div:nth-child(1)>div.DayPicker-Body>div:nth-child(5)>div:nth-child(1)")).click();
	}

	/*
	 * TC_TR_06:Verify search with valid travelClass
	 */
	@Test
	public void travelClass() throws InterruptedException {
		driver.findElement(By.cssSelector("label[for=travelClass]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul.travelForPopup>li:nth-child(4)")).click();
		driver.findElement(By.xpath("//a[contains( text(),'Search')]")).click();
	}

	/*
	 * TC_TR_07:Verify that user is able to select Journey Class Filters
	 */
	@Test
	public void journeyClassFilters() throws InterruptedException {
		driver.get("https://www.makemytrip.com/railways/listing?date=20250717&srcStn=PUNE&srcCity=Pune&destStn=NDLS&destCity=Delhi&classCode=3A");
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 300);
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li.appendBottom20:nth-child(4)>label")).click();
	}
}
