Feature: Broadleaf Commerce Login Functionality

  Scenario: 1. Valid user valid password
    Given As a not valid  user
    When Browse to the application
    Then Broadleaf home page should show
    When User click login button
    
    #login Info
    And I fill in the followin:
     | emailAdd | grt_rb@hotmail.com |
     | pass     | 12345              |
     
      
    And Click login

    
    
    