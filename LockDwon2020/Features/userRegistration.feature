@userRegistration
Feature: User registration


Scenario Outline: add a new valid user

Given I am on the application home page
When I click on user register link
And I enter "<first name>", "<last name>", "<phone>", "<email>", "<user name>","<password>","<confirm password>"
And I click on submit button
Then i find registration Successful page


Examples:

|first name |last name  | phone		    |   email			          |  user name   |  password    | Confirm Password|
|Syed		|Ahmed	    |917-346-1145   | syedsakibahmed91@gmail.com  |  Sakib2691   | Spring2016@  |  Spring2016@    |
|Mahbub		|Siddique	|234-432-4444	| mahbub@yahoo.com	          |  mahbub1     | Password1	|  Password1      |