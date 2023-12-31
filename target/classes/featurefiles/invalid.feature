Feature: login function with inavlid

 @Tagsecond1
Scenario: Landing HomePage2
 Given User Launch the browser
 When User Enter the Mobile Number "9990290033" and send the otp
 And User view the error message
 Then Verify user land on Homepage

 
 
@Tagthird
 Scenario:  Verify Inavlid otp
 Given User Launch the browser
 When User Enter the Mobile Number "9990290033" and send the otp
  And User Enter the OTP as "123455"  and verify
 And User view the error message
 Then Verify user land on Homepage
