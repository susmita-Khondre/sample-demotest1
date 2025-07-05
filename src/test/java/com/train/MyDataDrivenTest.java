package com.train;

import org.testng.annotations.Test;

import com.datadriventesting.DataProviders;

public class MyDataDrivenTest {

	@Test(dataProvider = "ToCity",dataProviderClass=DataProviders.class)//imported data 
	public void verifyFromCityToCity( String Tocity) {
		System.out.println("ToCity: "+Tocity);
		
	}
	
}

