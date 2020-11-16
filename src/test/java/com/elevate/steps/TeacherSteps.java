package com.elevate.steps;

import com.elevate.utils.CommonMethods;
import com.elevate.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TeacherSteps extends CommonMethods {
	
	@Given("Admin user is logged in successfully")
	public void admin_user_is_logged_in_successfully() {
		sendText(login.userEmail, ConfigsReader.getProperty("email"));
		sendText(login.password,ConfigsReader.getProperty("password"));
		click(login.loginButton);
	}

	@Given("nagivates to Teacher Management section")
	public void nagivates_to_Teacher_Management_section() {
	    click(dashboard.teacherManagementButton);
	}

	@When("user clicks Add Teacher button")
	public void user_clicks_Add_Teacher_button() {
	    click(teacher.addTeacherButton);
	}

	@When("when user adds {string}, {string}, {string}, {string}, {string}, and {string}")
	public void when_user_adds_and(String name, String education, String designation, String email, String password, String contact) throws InterruptedException {
	    sendText(teacher.addTeacherName, name);
	    sendText(teacher.education, education);
	    sendText(teacher.designation, designation);
	    sendText(teacher.email, email);
	    sendText(teacher.password, password);
	    sendText(teacher.contact, contact);
	    sendText(teacher.imageUploadButton, "C:\\Users\\pfeif\\eclipse-workspace\\Elevate\\src\\test\\resources\\teacherpic");
	    click(teacher.saveChangesBtn);
	    Thread.sleep(6000);
	}

	@Then("user sees {string} added to teachers list")
	public void user_sees_added_to_teachers_list(String name) {
	    
	}

}
