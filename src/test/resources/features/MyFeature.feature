
Feature: Automation Form


@abc
 Scenario: Fill up the automation form
   Given I am on automation form
    When I enter details firstname
    Then click on button

  @def @nmk
  Scenario: Automation form
    Given I am on home page
    When I enter details lastname
    Then click on submit button
