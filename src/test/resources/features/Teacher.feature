 @teacher
Feature: Teacher
  Description

  Background: 
    Given Admin user is logged in successfully
    And nagivates to Teacher Management section

  @addteacher
  Scenario Outline: Adding course to list
    When user clicks Add Teacher button
    And when user adds "<TeacherName>", "<Education>", "<TeacherDesignation>", "<TeacherEmail>", "<Password>", and "<TeacherContact>"
    Then user sees "<TeacherName>" added to teachers list

    Examples: 
      | TeacherName   | Education | TeacherDesignation | TeacherEmail       | Password | TeacherContact |
      | Roger Federer | Bachelors | Tennis Teacher     | rfederer@gmail.com | 12341234 |     5552223333 |
