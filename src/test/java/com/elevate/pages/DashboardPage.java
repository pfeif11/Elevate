package com.elevate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elevate.testbase.BaseClass;

public class DashboardPage {
	
	@FindBy (xpath="//a[@data-toggle='dropdown']")
	public WebElement dashboardName;
	
	@FindBy (linkText= "Teacher Management")
	public WebElement teacherManagementButton;
	
	
	
	
	
	
	
	public DashboardPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
