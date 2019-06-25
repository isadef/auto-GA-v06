Feature: Modify Expense Feature

  Background:
    Given 'AccountHomeMenu' page is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Then  clicked "Test" button on 'AccountHomeMenu'
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "05/23/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction success' alert on 'Expenses' page
    And click 'PersonalWallet' button on 'Header' page

  Scenario: Change a transaction
    Given click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new category' on 'expenses page'
    And fill 'new amount' with "1" on 'expense page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeSuccess' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page


  Scenario Outline: try to modify expense with inapropiate data
    Given click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "<Name>" on 'Expenses Page'
    Then fill 'new name' field with "<new Name>" on 'Expenses Page'
    And select category "<new Category>" in 'new category' on 'expenses page'
    And fill 'new amount' with "<new Amount>" on 'expense page'
    And fill 'new date' field with "<new Date>" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Examples:
      | Name          | new Name        | new Category | new Amount | new Date   |
      | Prueba        |                 | Others       | 1          | 05/23/2019 |
      | Prueba        | EmptyDateError  | Others       | 1          |            |
      | Prueba        | Prueba          | Others       | 1          | 05/23/2019 |
      | Prueba        | NegativeWrong   | Others       | -10        | 05/23/2019 |
      | Prueba        | HugeWrong       | Others       | 100000     | 05/23/2019 |
      | Prueba        | EmptyAWrong     | Others       |            | 05/23/2019 |
      |               | EmptyNameWrong  | Others       | 1          | 05/23/2019 |
      | Prueba        | EmptyCatWtrong  |              | 1          | 05/23/2019 |
      | Prueba        | WrongZeroAmount | Others       | 0          | 05/23/2019 |

    Scenario: 'New Amount' field stars empty
      Given click 'Expenses' button on 'MainMenu' page
      Then click 'new amount' field on 'Expenses' page
      And 'new amount' field should be empty on 'Expenses' page