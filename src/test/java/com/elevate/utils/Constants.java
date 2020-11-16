package com.elevate.utils;

public class Constants {
	
	//location of configuration.properties file
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")+"\\src\\test\\resources\\configs\\configuration.properties";
		
	//time for implicit wait
	public static final int IMPLICIT_WAIT_TIME = 15;
		
	//time for explicit wait
	public static final int EXPLICIT_WAIT_TIME = 30;
	
	//location of excel file that has test data
	//public static final String TESTDATA_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/testdata/HrmsTestData.xlsx";

	//location of our html reports
	public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/html-report/Elevate.html";
	
	
	//location of screenshots
	public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"/screenshot/";
		

}
