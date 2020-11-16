package com.elevate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elevate.testbase.BaseClass;

public class LoginPage  {
	
@FindBy (id="user_email")
public WebElement userEmail;

@FindBy (id="user_password")
public WebElement password;

@FindBy (xpath="//button[@type='submit']")
public WebElement loginButton;

@FindBy (id="login_error")
public WebElement loginError;

@FindBy (id="user_email_error")
public WebElement emailError;


public LoginPage() {
	PageFactory.initElements(BaseClass.driver, this);
	
}
}
