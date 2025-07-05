package com.mmt.pages;

import org.openqa.selenium.By;

import com.mmt.base.Keyword;

public class HomePage {

	By login_signup_popup_close_btn = By.cssSelector("span.commonModal__close");

	public void clickOnCloseElementLoginPopup() {
		Keyword.clickonElement(login_signup_popup_close_btn);
	}

	By train_tab = By.cssSelector("li.menu_Trains");

	public void clickOnTrainTab() {
		Keyword.clickonElement(train_tab);

	}

	By from_txtbox = By.cssSelector("label[for='fromCity]");

	public void clickOnFromText() {
		Keyword.clickonElement(from_txtbox);

	}

	By from_inputbox = By.cssSelector("input[placeholder='From]");

	public void fromEnterText(String cityName) {
		Keyword.enterText(from_inputbox, "Pune");

	}

	By from_selectcity = By.cssSelector("//span[contains(text(),'Pune Junction')]");

	public void clickOnSelectFromCity() {
		Keyword.clickonElement(from_selectcity);

	}

	By to_testbox = By.cssSelector("input#toCity");

	public void clickOnToText() {
		Keyword.clickonElement(to_testbox);

	}

	By to_inputbox = By.cssSelector("input.react-autosuggest__input.react-autosuggest__input--open");

	public void toEnterText(String cityName) {
		Keyword.enterText(to_inputbox, "Pune");

	}

	By to_selectcity = By.cssSelector("div.react-autosuggest__section-title+ul>li:nth-child(1)");

	public void clickOnSelectToCity() {
		Keyword.clickonElement(to_selectcity);

	}
	By travel_datebox=By.cssSelector("div[data-cy=\"RailSearchWidget_340\"]");
    public void clickOnTravelDateBox() {
    	Keyword.clickonElement(travel_datebox);

	}
	By select_traveldate = By
			.cssSelector("div.DayPicker-Months>div:nth-child(1)>div.DayPicker-Body>div:nth-child(5)>div:nth-child(1)");

	public void clickOntravelDate() {
		Keyword.clickonElement(select_traveldate);

	}

	By select_class = By.cssSelector("ul.travelForPopup>li:nth-child(4)");

	public void clickOnselectClass() {
		Keyword.clickonElement(select_class);

	}

	By Search_btn = By.cssSelector("//a[contains( text(),'Search')]");

	public void clickOnSearchbtn() {
		Keyword.clickonElement(Search_btn);

	}
	
	

}
