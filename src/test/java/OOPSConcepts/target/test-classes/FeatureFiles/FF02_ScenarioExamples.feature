Feature:Registration screen
  Scenario Outline:Create multiple accounts
    Given Navigate to  registration screen of HN website
    Then customers enters firstname as <"FirstName">
    Then customers enters lastname as <"LastName">
    Then customers enters emailadd as <"EmailAdd">
    Then customers enters pass as <"Password">
    Then customers enters Repass as <"RePassword">
    Examples:
      |FirstName| LastName| EmailAdd| Password| RePassword|
      |FirstName01| LastName01| EmailAdd01@gmail.com| Password01| RePassword01|
      |FirstName02| LastName02| EmailAdd02@gmail.com| Password02| RePassword02|
      |FirstName03| LastName03| EmailAdd03@gmail.com| Password03| RePassword03|
      |FirstName04| LastName04| EmailAdd04@gmail.com| Password04| RePassword04|
