Feature: Expense Category Feature
  Background:
    Given 'AccountHomeMenu' page is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Then  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Create an expense category
    Given click 'Expenses' button on 'MainMenu' page
    And fill 'category name' field with "category1" on 'Expenses page'
    And click 'Register Category' button on 'Expenses page'
    Then Search 'category success' alert on 'Expenses page'

    Scenario Outline: Create a wrong expense category
      Given click 'Expenses' button on 'MainMenu' page
      And fill 'category name' field with "category1" on 'Expenses page'
      And click 'Register Category' button on 'Expenses page'
      Then Search 'category success' alert on 'Expenses page'
      Then click 'PersonalWallet' button on 'Header' page
      And click 'Expenses' button on 'MainMenu' page
      Then fill 'category name' field with "<category>" on 'Expenses page'
      And click 'Register Category' button on 'Expenses page'
      Then Search 'Missing or repeat data to complete register category!' alert on 'Expenses page'
      Examples:
      |category  |
      |          |
      |category1 |

