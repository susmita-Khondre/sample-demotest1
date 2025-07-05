package com.mmt.base;
import static com.mmt.base.Keyword.*;

import org.testng.annotations.BeforeMethod;

import com.utils.Application;

public class TestBase {
	@BeforeMethod
public static void launchBrowser() {
	openBrowser(Application.getBrowserName());
	openUrl(Application.getAppUrl("qa"));
	windowMaximize();
}


}

