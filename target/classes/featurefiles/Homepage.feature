Feature: homepage function
@home
Scenario: Landing HomePage
 Given User Launch the browser
 When User Enter the Mobile Number "9999290571" and send the otp
 And User Enter the OTP as "123456"  and verify
 Then Verify user land on Homepage
 When User capture the admin name
 And  User click on the deafault calender
 And  User apply the calender calender
 And User Select state  as "Maharashtra"
 Then Verify user land on Homepage