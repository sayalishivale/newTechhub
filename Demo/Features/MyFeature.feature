Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on homepage
    When user enters username and Password
    Then success message is displayed
    
    #Scenario: User Gives Feedback
    #Given User is on Feedback page
    #When User Selects all valid options
    #Then User able o submit the feedback 
  #
    #Scenario: User tries to register for TR_ONE sessionONE
    #Given User has logged in
    #When User tries to register for sessionONE in TR_ONE
    #And He is has not registred for any other TR for sessionONE
    #Then User able to register sucessfully
    
    #Scenario: Change Password
    #Given User clicks on Logout
    #When User provides current and new password
    #Then User able to change the password
    
    
    Scenario: User wants to logout
    Given User Clicks on Logout
    Then User LogsOut