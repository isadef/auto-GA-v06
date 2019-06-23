Feature: Trasnfer Between Accounts

  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
      And clicked 'Add' button on 'AccountHomeMenu'
    Given filled 'Account name' field on 'AccountHomeMenu' with "Destination"
      And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Error Message is displayed when 'Budget Available in Bs' has 0 amount
    Given clicked 'Transfer' Button on 'MainMenu' page
    And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And filled 'amount in BS' text field with "50" on 'Transfer' page
    And click 'Transfer' Button on 'Transfer' page
    Then Search 'Error Message' fail alert on 'Transfer' page

  Scenario: Error Message is displayed when No Category is Selected to Transfer
    Given click 'Income' button on 'MainMenu' page
      And fill 'income name' field with "Prueba income 1" on 'Income Page'
      And select "Others" values on 'category' selector on 'Income Page'
      And fill 'AmountBS' field with "10000" on 'Income Page'
      And fill 'DateField' field with "12/06/2019" on 'Income Page'
      And click 'Register Transaction' button on 'Income Page'
    Then click 'Exit' button on 'Income' page
    Given clicked "Test" button on 'AccountHomeMenu'
    Given clicked 'Transfer' Button on 'MainMenu' page
    And filled 'amount in BS' text field with "100" on 'Transfer' page
    And click 'Transfer' Button on 'Transfer' page
    Then Search 'Error Message' fail alert on 'Transfer' page

  Scenario: Error Message is displayed when No Ammount is filled in text field on 'Transfer' page
    Given click 'Income' button on 'MainMenu' page
      And  fill 'income name' field with "Prueba income 1" on 'Income Page'
      And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "10000" on 'Income Page'
    And fill 'DateField' field with "12/06/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then click 'Exit' button on 'Income' page
    Given clicked "Test" button on 'AccountHomeMenu'
    Given clicked 'Transfer' Button on 'MainMenu' page
    And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And click 'Transfer' Button on 'Transfer' page
    Then Search 'Error Message' fail alert on 'Transfer' page

  Scenario: Success Message is displayed when filled 'Amount BS' with natural number
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income 1" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "10000" on 'Income Page'
    And fill 'DateField' field with "12/06/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then click 'Exit' button on 'Income' page
    Given clicked "Test" button on 'AccountHomeMenu'
    Given clicked 'Transfer' Button on 'MainMenu' page
    And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And filled 'amount in BS' text field with "50" on 'Transfer' page
    And click 'Transfer' Button on 'Transfer' page
    Then search 'Success Message' alert on 'Transfer' page

  Scenario: Check title 'Transfer' appears on 'Transfer' Page
    Given clicked 'Transfer' Button on 'MainMenu' page
    Then check that title 'Transfer' title is visible on 'Transfer' Page

  Scenario: 'Transfer' Button is visible on 'Transfer' Page
    Given clicked 'Transfer' Button on 'MainMenu' page
    Then check that 'Transfer' Button is visible on 'Transfer' page

  Scenario: 'Budget Available in Bs' field is visible after successful transfer
    Given click 'Income' button on 'MainMenu' page
      And fill 'income name' field with "Prueba income 1" on 'Income Page'
      And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "10000" on 'Income Page'
    And fill 'DateField' field with "12/06/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then click 'Exit' button on 'Income' page
    Given clicked "Test" button on 'AccountHomeMenu'
    Given clicked 'Transfer' Button on 'MainMenu' page
    And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And filled 'amount in BS' text field with "20" on 'Transfer' page
    And click 'Transfer' Button on 'Transfer' page
    Then search 'Success Message' alert on 'Transfer' page
    Then check that 'Budget Available in BS' field is visible

      Scenario: Error Message is displayed when filled 'Amount BS' field with negative number
        Given click 'Income' button on 'MainMenu' page
          And fill 'income name' field with "Prueba income 1" on 'Income Page'
          And select "Others" values on 'category' selector on 'Income Page'
        And fill 'AmountBS' field with "10000" on 'Income Page'
        And fill 'DateField' field with "12/06/2019" on 'Income Page'
        And click 'Register Transaction' button on 'Income Page'
        Then click 'Exit' button on 'Income' page
        Given clicked "Test" button on 'AccountHomeMenu'
        Given clicked 'Transfer' Button on 'MainMenu' page
        And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
        And filled 'amount in BS' text field with "-30" on 'Transfer' page
        And click 'Transfer' Button on 'Transfer' page
        Then Search 'Error Message' fail alert on 'Transfer' page

      Scenario: Success Message is displayed when filled 'Amount BS' field with Rational number
        Given click 'Income' button on 'MainMenu' page
        And fill 'income name' field with "Prueba income 1" on 'Income Page'
        And select "Others" values on 'category' selector on 'Income Page'
        And fill 'AmountBS' field with "10000" on 'Income Page'
        And fill 'DateField' field with "12/06/2019" on 'Income Page'
        And click 'Register Transaction' button on 'Income Page'
        Then click 'Exit' button on 'Income' page
        Given clicked "Test" button on 'AccountHomeMenu'
        Given clicked 'Transfer' Button on 'MainMenu' page
        And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
        And filled 'amount in BS' text field with "50.12" on 'Transfer' page
        And click 'Transfer' Button on 'Transfer' page
        Then search 'Success Message' alert on 'Transfer' page

      Scenario: Error Message is displayed when natural number filled in 'Amount BS' field exceeds 'Budget available in Bs' amount
        Given click 'Income' button on 'MainMenu' page
          And fill 'income name' field with "Prueba income 1" on 'Income Page'
          And select "Others" values on 'category' selector on 'Income Page'
        And fill 'AmountBS' field with "10000" on 'Income Page'
        And fill 'DateField' field with "12/06/2019" on 'Income Page'
        And click 'Register Transaction' button on 'Income Page'
        Then click 'Exit' button on 'Income' page
        Given clicked "Test" button on 'AccountHomeMenu'
        Given clicked 'Transfer' Button on 'MainMenu' page
        And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
        And filled 'amount in BS' text field with "10000000" on 'Transfer' page
        And click 'Transfer' Button on 'Transfer' page
        Then Search 'Error Message' fail alert on 'Transfer' page

        Scenario: Registered transfer appears on 'Report' page
          Given click 'Income' button on 'MainMenu' page
          And fill 'income name' field with "Prueba income 1" on 'Income Page'
          And select "Others" values on 'category' selector on 'Income Page'
          And fill 'AmountBS' field with "10000" on 'Income Page'
          And fill 'DateField' field with "12/06/2019" on 'Income Page'
          And click 'Register Transaction' button on 'Income Page'
          Then click 'Exit' button on 'Income' page
          Given clicked "Test" button on 'AccountHomeMenu'
          Given clicked 'Transfer' Button on 'MainMenu' page
          And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
          And filled 'amount in BS' text field with "50" on 'Transfer' page
          And click 'Transfer' Button on 'Transfer' page
          Then search 'Success Message' alert on 'Transfer' page
          Then click 'Exit' button on 'Header' page
          Given clicked "Test" button on 'AccountHomeMenu'
          And Click 'Reports' button on 'main menu' page
          When Select 'By category' in 'Select report type' selector on 'reports' page
          And Click 'Show report' button on 'reports' page
          Then table on 'Report' page should show "Transfer" transaction type on category column, second row



          #Enum
          Scenario: Success Message is displayed when filled 'Amount BS' and selected any 'Destination' account
            Given click 'Exit' button on 'Header' page
            Given filled 'Account name' field on 'AccountHomeMenu' with "Savings"
              And clicked 'Add' button on 'AccountHomeMenu'
            Given filled 'Account name' field on 'AccountHomeMenu' with "Ahorros"
              And clicked 'Add' button on 'AccountHomeMenu'
            Given  clicked "Test" button on 'AccountHomeMenu'
            Given click 'Income' button on 'MainMenu' page
            And fill 'income name' field with "Prueba income 1" on 'Income Page'
            And select "Others" values on 'category' selector on 'Income Page'
            And fill 'AmountBS' field with "10000" on 'Income Page'
            And fill 'DateField' field with "12/06/2019" on 'Income Page'
            And click 'Register Transaction' button on 'Income Page'
            Then click 'Exit' button on 'Income' page
            Given clicked "Test" button on 'AccountHomeMenu'
            Given clicked 'Transfer' Button on 'MainMenu' page
            And select enum value "Savings" on 'Destination Account' selector on 'Transfer' Page
            And filled 'amount in BS' text field with "50" on 'Transfer' page
            And click 'Transfer' Button on 'Transfer' page
            Then search 'Success Message' alert on 'Transfer' page


          #List
          Scenario Outline: Success Message is displayed when filled 'Amount BS' and selected any 'Destination' account
            Given click 'Exit' button on 'Header' page
            Given filled 'Account name' field on 'AccountHomeMenu' with "Savings"
            And clicked 'Add' button on 'AccountHomeMenu'
            Given filled 'Account name' field on 'AccountHomeMenu' with "Ahorros"
            And clicked 'Add' button on 'AccountHomeMenu'
            Given  clicked "Test" button on 'AccountHomeMenu'
            Given click 'Income' button on 'MainMenu' page
            And fill 'income name' field with "Prueba income 1" on 'Income Page'
            And select "Others" values on 'category' selector on 'Income Page'
            And fill 'AmountBS' field with "10000" on 'Income Page'
            And fill 'DateField' field with "12/06/2019" on 'Income Page'
            And click 'Register Transaction' button on 'Income Page'
            Then click 'Exit' button on 'Income' page
            Given clicked "Test" button on 'AccountHomeMenu'
            Given clicked 'Transfer' Button on 'MainMenu' page
            And select "<Account>" value on 'Destination Account' selector on 'Transfer' Page
            And filled 'amount in BS' text field with "<AmountBS>" on 'Transfer' page
            And click 'Transfer' Button on 'Transfer' page
            Then search 'Success Message' alert on 'Transfer' page
            Examples: Some examples for value inputs are
              | Account     | AmountBS | TypeNum |
              | Destination |    50    | Natural |
              | Savings     |   30.13  | Rational|
              | Ahorros     |    10    | Natural |

            #Map
            Scenario: Success Message is displayed when filled 'Amount BS' and selected any 'Destination' account
              Given click 'Exit' button on 'Header' page
              Given filled 'Account name' field on 'AccountHomeMenu' with "Savings"
              And clicked 'Add' button on 'AccountHomeMenu'
              Given filled 'Account name' field on 'AccountHomeMenu' with "Ahorros"
              And clicked 'Add' button on 'AccountHomeMenu'
              Given  clicked "Test" button on 'AccountHomeMenu'
              Given click 'Income' button on 'MainMenu' page
              And fill 'income name' field with "Prueba income 1" on 'Income Page'
              And select "Others" values on 'category' selector on 'Income Page'
              And fill 'AmountBS' field with "10000" on 'Income Page'
              And fill 'DateField' field with "12/06/2019" on 'Income Page'
              And click 'Register Transaction' button on 'Income Page'
              Then click 'Exit' button on 'Income' page
              Given clicked "Test" button on 'AccountHomeMenu'
              Given clicked 'Transfer' Button on 'MainMenu' page
              And select "Destination" value on 'Destination Account' selector on 'Transfer' Page
              And filled 'amount in BS' text field with "50" on 'Transfer' page
              And click 'Transfer' Button on 'Transfer' page
              Then search 'Success Message' alert on 'Transfer' page







