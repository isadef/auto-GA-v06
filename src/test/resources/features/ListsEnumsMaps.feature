Feature: Send data structures in Cucumber Scenarios

  Background:
    Given 'AccountHomeMenu' page is loaded
    Given Fill account name field on 'home menu' page with "Test"
    And Click 'Add' button on 'home menu' page

  Scenario Outline: Send list as a parameter
    Given Fill account name field on 'home menu' page with "Test2"
    When Click 'Add' button on 'home menu' page
    Then The accounts "<listOfAccounts>" should exist on 'home menu' page

    Examples:
      | listOfAccounts |
      | Test, Test2    |

  Scenario: Send enum as a parameter
    When Click "Test" button on 'home menu' page
    And Click "Report" option on 'main menu' page
    Then The title is "Reports for: Test"

  Scenario: Send map as a parameter
    Given Click "Test" button on 'home menu' page
    Given Click "Income" option on 'main menu' page
    Given Register the following incomes on 'income' page
      | Name | Category | Amount | Date |
      | Ingreso1 | Salary | 100  | 12/04/2019|
      | Ingreso2 | Others | 1000 | 11/04/2019|
    Given click 'PersonalWallet' button on 'Header' page
    And Click "Report" option on 'main menu' page
    When Select 'By category' in 'Select report type' selector on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then Reports table shows
      | Category | Amount | Name     | Date       |
      | Salary   | 100    | Ingreso1 | 2019-12-04 |
      | Others   | 1000   | Ingreso2 | 2019-11-04 |