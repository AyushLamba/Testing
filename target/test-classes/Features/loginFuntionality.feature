Feature: Login

  Scenario Outline: Login Functionality
    Given open browser
    When navigates to the website oranghrmlive.com
    And login using '<username>' and '<password>' as credentials
    Then check URL of the page
    Then click on MyInfo tab
    And check some other tabs
    When click on leave tab
    Then fill all require details and search
    And click on logout

    Examples: 
      | username | password |
      | Admin    | admin123 |
      
      