Feature: Login
  Scenario: Login with valid userid and password
    Given I navigate to Home page
    And I input abcd on TextBox of userId on Home page
    And I input abcd on TextBox of password on Home page
    And I input 1111111 on TextBox of password on Home page
#    And I click to login button
#    Then I should see title of Manager Home page

#  Scenario: Login with invalid userid and password
#    And I input abcd on TextBox of userId on Home page
#    And I input abcd on TextBox of password on Home page
#    And I click to login button
#    Then I should see alert popup with a message User or Password is not valid

