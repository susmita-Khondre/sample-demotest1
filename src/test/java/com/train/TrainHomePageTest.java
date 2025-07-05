package com.train;

import static com.mmt.base.Keyword.*;

import com.mmt.base.Locators;
import com.mmt.base.TestBase;
import com.mmt.pages.HomePage;

import static com.utils.FileUtils.*;

import org.testng.annotations.Test;

public class TrainHomePageTest extends TestBase {
	@Test
	public static void searchTrain() {
		// openUrl("https://www.makemytrip.com/");

		// clickonElemenet("CSSSELECTOR",getLoactor("span.commonModal__close"));//By Proprties file

		clickonElement("CSSSELECTOR", Locators.login_signup_popup_close_btn);// By interface call by class
																				// name.variable name
		clickonElement("CSSSELECTOR",Locators.train_tab);
		
		clickonElement("CSSSELECTOR",Locators.from_txtbox);
		enterText("CSSSELECTOR",Locators.from_inputbox,"Pune");
		clickonElement("CSSSELECTOR",Locators.from_selectcity);
		
		clickonElement("CSSSELECTOR",Locators.to_textbox);
		enterText("CSSSELECTOR",Locators.to_inputbox,"Delhi");
		clickonElement("CSSSELECTOR",Locators.to_selectcity);
		
		clickonElement("CSSSELECTOR",Locators.travel_traveldatebox);
		clickonElement("CSSSELECTOR",Locators.select_traveldate);
		
		
		clickonElement("CSSSELECTOR",Locators.select_class);
		
		clickonElement("CSSSELECTOR",Locators.Search_bth);

}
	@Test
	public void searchTrainUsingPOM() {
		HomePage homepage=new HomePage();
		homepage.clickOnCloseElementLoginPopup();
		
		homepage.clickOnTrainTab();
		
		homepage.clickOnFromText();
		homepage.fromEnterText("Pune");
		homepage.clickOnSelectFromCity();
		
		homepage.clickOnToText();
		homepage.toEnterText("Delhi");
		homepage.clickOnSelectToCity();
		
		homepage.clickOnTravelDateBox();
		homepage.clickOntravelDate();
		
		homepage.clickOnselectClass();
		
		homepage.clickOnSearchbtn();

	} 
}
