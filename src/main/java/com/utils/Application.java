package com.utils;

public class Application {
	private static String basedir = System.getProperty("user.dir");
	
	private static String filepath = "/src/main/resources/application.properties";

	public static String getBrowserName() {

		return FileUtils.getProperty(basedir+filepath,"browser_name");

	}

	public static String getAppUrl(String env) {
		return FileUtils.getProperty(basedir+filepath, env + ".url");

	}

	public static String userName(String env) {
		return FileUtils.getProperty(basedir + filepath, env + "username");

	}

}
