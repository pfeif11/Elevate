package com.elevate.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.elevate.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods{
	
	@When("user enters user email {string}")
	public void user_enters_user_email(String userEmail) {
	    sendText(login.userEmail, userEmail);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    sendText(login.password, password);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    click(login.loginButton);
	}

	@Then("user should {string} on dashboard page")
	public void user_should_on_dashboard_page(String expected) {
	    String actual=dashboard.dashboardName.getAttribute("innerText").trim();
	    getWaitObject().until(ExpectedConditions.textToBe(By.xpath("//a[@data-toggle='dropdown']"), expected));
	    System.out.println("Actual name:"+actual);
	    Assert.assertEquals(expected, actual);
	    
	}
	
	@Then("user should see {string} as title of page")
	public void user_should_see_as_title_of_page(String expectedDashboardTitle) {
		System.out.println(driver.getTitle());
		String actualDashboardTitle=driver.getTitle();
	    Assert.assertEquals(actualDashboardTitle, expectedDashboardTitle);
	}
	
	@Then("user should see error message {string} on login page")
	public void user_should_see_error_message_on_login_page(String expectedErrorMessage) {
	    getWaitObject().until(ExpectedConditions.textToBePresentInElement(login.loginError, expectedErrorMessage));
		String actualErrorMessage=login.loginError.getText();
	    System.out.println(actualErrorMessage);
	    Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	}
	
	@Then("user should see email error message {string} on login page")
	public void user_should_see_email_error_message_on_login_page(String expectedEmailErrorMsg){
		String actualErrorMsg=login.emailError.getAttribute("innerText");
		System.out.println("Inner text----->"+actualErrorMsg);
	    Assert.assertEquals(expectedEmailErrorMsg, actualErrorMsg);
	}



}
