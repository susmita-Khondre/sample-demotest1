package com.datadriventesting;

import org.testng.annotations.DataProvider;

import com.utils.ExcelUtil;

public class DataProviders {

	@DataProvider(name = "ToCity")
	public Object[][] cityDataProvider() {
		ExcelUtil excel = new ExcelUtil();
		String baseDir=System.getProperty("user.dir");//user.dir=gives directory of current working file 
		return excel.readExcel(baseDir+"src/main/resources/excel_file/ListOfCity.xlsx");	
		
		
	}
	
}

