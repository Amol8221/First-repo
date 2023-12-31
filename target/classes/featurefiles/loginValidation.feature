Feature: login validation function

  @Tag
  Scenario Outline: login scenarios
    Given User Launch the browser
    When User Enter the Mobile Number  "<Mobilenumber>" and send the otp.
    And User Enter the OTP as "<otp>"  and verify.
    Then Verify user land on Homepage
    

    Examples: 
      | Mobilenumber | otp    |
      |   9999290571 | 123456 |
      |   9999290572 | 123456 |
      |   9999290571 | 123455 |
