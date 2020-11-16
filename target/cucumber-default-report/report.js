$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Teacher.feature");
formatter.feature({
  "name": "Teacher",
  "description": "  Description",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@teacher"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Adding course to list",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addteacher"
    }
  ]
});
formatter.step({
  "name": "user clicks Add Teacher button",
  "keyword": "When "
});
formatter.step({
  "name": "when user adds \"\u003cTeacherName\u003e\", \"\u003cEducation\u003e\", \"\u003cTeacherDesignation\u003e\", \"\u003cTeacherEmail\u003e\", \"\u003cPassword\u003e\", and \"\u003cTeacherContact\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user sees \"\u003cTeacherName\u003e\" added to teachers list",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TeacherName",
        "Education",
        "TeacherDesignation",
        "TeacherEmail",
        "Password",
        "TeacherContact"
      ]
    },
    {
      "cells": [
        "Roger Federer",
        "Bachelors",
        "Tennis Teacher",
        "rfederer@gmail.com",
        "12341234",
        "5552223333"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin user is logged in successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "com.elevate.steps.TeacherSteps.admin_user_is_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "nagivates to Teacher Management section",
  "keyword": "And "
});
formatter.match({
  "location": "com.elevate.steps.TeacherSteps.nagivates_to_Teacher_Management_section()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding course to list",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@teacher"
    },
    {
      "name": "@addteacher"
    }
  ]
});
formatter.step({
  "name": "user clicks Add Teacher button",
  "keyword": "When "
});
formatter.match({
  "location": "com.elevate.steps.TeacherSteps.user_clicks_Add_Teacher_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user adds \"Roger Federer\", \"Bachelors\", \"Tennis Teacher\", \"rfederer@gmail.com\", \"12341234\", and \"5552223333\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.elevate.steps.TeacherSteps.when_user_adds_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees \"Roger Federer\" added to teachers list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.elevate.steps.TeacherSteps.user_sees_added_to_teachers_list(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Adding course to list");
formatter.after({
  "status": "passed"
});
});