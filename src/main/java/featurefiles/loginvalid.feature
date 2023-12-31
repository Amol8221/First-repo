Feature: login function
@Tagfirst
Scenario: Landing HomePage
 Given User Launch the browser
 When User Enter the Mobile Number "9999290572" and send the otp
 And User Enter the OTP as "123456"  and verify
 Then Verify user land on Homepage




@Tagsecondinvalid
Scenario: Landing HomePage2
 Given User Launch the browser
 When User Enter the Mobile Number "9990290033" and send the otp
And User Enter the OTP as "123455"  and verify
 Then user view errormessage
 
