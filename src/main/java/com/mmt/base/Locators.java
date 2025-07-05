package com.mmt.base;

public interface Locators {

	String login_signup_popup_close_btn = "span.commonModal__close";
	String train_tab = "li.menu_Trains";
	String from_txtbox = "label[for='fromCity]";
	String from_inputbox = "input[placeholder='From]";
	String from_selectcity = "//span[contains(text(),'Pune Junction')]";

	String to_textbox = "input#toCity";
	String to_inputbox = "input.react-autosuggest__input.react-autosuggest__input--open";
	String to_selectcity = "div.react-autosuggest__section-title+ul>li:nth-child(1)";
   
	String travel_traveldatebox="div[data-cy=\"RailSearchWidget_340\"]";
	String select_traveldate = "div.DayPicker-Months>div:nth-child(1)>div.DayPicker-Body>div:nth-child(5)>div:nth-child(1)";
	
	String select_class = "ul.travelForPopup>li:nth-child(4)";

	String Search_bth = "//a[contains( text(),'Search')]";

}
