package com.elevate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elevate.testbase.BaseClass;

public class TeacherManagementPage {
	
	@FindBy (id="add_teacher")
	public WebElement addTeacherButton;
	
	@FindBy (id="user_name")
	public WebElement addTeacherName;
	
	@FindBy (id="education")
	public WebElement education;
	
	@FindBy (id="designation")
	public WebElement designation;
	
	@FindBy (id="user_email")
	public WebElement email;
	
	@FindBy (id="user_password")
	public WebElement password;
	
	@FindBy (id="user_contact")
	public WebElement contact;
	
	@FindBy (xpath="//form[@id='add_teacher_form']/div/button[text()='Save changes']")
	public WebElement saveChangesBtn;
	
	@FindBy (id="teacher_image")
	public WebElement imageUploadButton;
	

	
	public TeacherManagementPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
