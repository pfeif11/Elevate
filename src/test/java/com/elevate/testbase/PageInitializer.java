package com.elevate.testbase;

import com.elevate.pages.DashboardPage;
import com.elevate.pages.LoginPage;
import com.elevate.pages.TeacherManagementPage;

public class PageInitializer extends BaseClass {
	
	public static LoginPage login;
	public static DashboardPage dashboard;
	public static TeacherManagementPage teacher;

	public static void initialize() {
		login=new LoginPage();
		dashboard=new DashboardPage();
		teacher=new TeacherManagementPage();
		
	}
}
