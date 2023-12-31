Feature: BimaVahak Usermanagement
@UserMnagement
Scenario: Valiadte Usermanagement Dashboard
 Given User Launch the browser
 When User Enter the Mobile Number "9990290033" and send the otp
 And User Enter the OTP as "123456"  and verify
 Then Verify user land on Homepage
 When User Click on UserManagement option
 Then User land on the Uermanagement page
   When User Logout Sucessfully
  Then User land on loginpage sucessfully
 
@UserDashboard
Scenario: Valiadte Usermanagement Dashboard
 Given User Launch the browser
 When User Enter the Mobile Number "9990290033" and send the otp
 And User Enter the OTP as "123456"  and verify
 Then Verify user land on Homepage
 When User Click on the UserDashboard
 Then User Land on the user dashboard
 When User View the Verfier data
 Then User view Verfier data sucessfully
  When User Logout Sucessfully
  Then User land on loginpage sucessfully
  
  
 @Gravience
 Scenario: Valiadte Graviance Dashboard
  Given User Launch the browser
 When User Enter the Mobile Number "9990290033" and send the otp
 And User Enter the OTP as "123456"  and verify
 Then Verify user land on Homepage
 When User Click on the Graviance Option
 Then User land on Graviance page sucessfully
  When User Logout Sucessfully
  Then User land on loginpage sucessfully
 
 