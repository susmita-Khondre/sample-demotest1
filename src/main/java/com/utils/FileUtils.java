package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class FileUtils {
	
	public static String getProperty(String filepath,String Key) {
	
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = prop.getProperty(Key);
		System.out.println(value);
		return value;

	}
	
	
	
	
	
	
	
	
//Tum muze key do main tumhe value dunga locator file se
	public static String getLoactor(String locatorKey) {

		String basedir = System.getProperty("user.dir");
		System.out.println(basedir);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(basedir + "/src/test/resources/locators.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = prop.getProperty(locatorKey);
		return value;

	}
//How read Properties file main code
	public static void main(String[] args) throws IOException {
	

//		String basedir = System.getProperty("user.dir");
//		System.out.println(basedir);
//		FileInputStream fis = new FileInputStream(basedir + "/src/test/resources/locators.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String value = prop.getProperty("from_txtbox");
//		System.out.println(value);

	}
}
