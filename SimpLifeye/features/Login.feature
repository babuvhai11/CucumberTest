Feature: login 


Scenario: Successfull Login with valid crdentials 
	Given User open chrome browser 
	When Go to Url "https://dashboard-pay-qa.simplifeye.co/amplify/referrals" 
	Then User can view Login page
	And User enters email as "john+db+qa@simplifeye.co" and password as "!Myfamily12" 
	And Click on login button 
	And close browser 