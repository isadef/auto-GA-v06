Feature: General account

  Background:
    Given The 'AccountHomeMenu' is loaded
    Given Fill account name field on 'home menu' page with "Test"
    And Click 'Add' button on 'home menu' page
    Given Fill account name field on 'home menu' page with "Test2"
    And Click 'Add' button on 'home menu' page

  Scenario: Reports table by date for general account filters all transactions data using the specified date range
    Given Click "Test" button on 'home menu' page
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Ingreso1" on 'Income Page'
    And select "Salary" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "12/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given fill 'income name' field with "Ingreso2" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given click 'Exit' button on 'header' page
    Given Click "Test2" button on 'home menu' page
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Ingreso3" on 'Income Page'
    And select "Salary" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "12/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given fill 'income name' field with "Ingreso4" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given click 'Exit' button on 'header' page
    Given Click 'General' button on 'home menu' page
    When Select 'By date' in 'Select report type' selector on 'reports' page
    And Fill 'From' date picker with "12/01/2019" on 'reports' page
    And Fill 'To' date picker with "12/31/2019" on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then Reports table shows
      | Date       | Amount | Name     | Category |
      | 2019-12-04 | 100    | Ingreso1 | Salary   |
      | 2019-12-05 | 100    | Ingreso3 | Salary   |

  Scenario: Reports table by category for general account sorts all transactions data by category
    Given Click "Test" button on 'home menu' page
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Ingreso1" on 'Income Page'
    And select "Salary" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "12/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given fill 'income name' field with "Ingreso2" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given click 'PersonalWallet' button on 'Header' page
    And click 'Expenses' button on 'MainMenu' page
    Given fill 'expense name' field with "Egreso1" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1000" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "11/04/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Given click 'Exit' button on 'header' page
    Given Click "Test2" button on 'home menu' page
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Ingreso3" on 'Income Page'
    And select "Salary" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "12/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given fill 'income name' field with "Ingreso4" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given click 'PersonalWallet' button on 'Header' page
    And click 'Expenses' button on 'MainMenu' page
    Given fill 'expense name' field with "Egreso2" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1000" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "11/04/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Given click 'Exit' button on 'header' page
    Given Click 'General' button on 'home menu' page
    When Select 'By category' in 'Select report type' selector on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then Reports table shows
      | Category | Amount | Name     | Date       |
      | Salary   | 100    | Ingreso1 | 2019-12-04 |
      |          | 100    | Ingreso3 | 2019-12-05 |
      | Others   | 1000   | Ingreso2 | 2019-11-04 |
      |          | 1000   | Ingreso4 | 2019-11-04 |
      |          | -1000  | Egreso1  | 2019-11-04 |
      |          | -1000  | Egreso2  | 2019-11-04 |

  Scenario: Navigation bar does not have 'Account Settings' link for general account
    When Click 'General' button on 'home menu' page
    Then 'Account settings' link does not exist on 'header' page