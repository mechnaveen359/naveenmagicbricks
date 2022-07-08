@magicbricks
Feature: Validate checkout functionality of magicbricks application of help center page

@successful_Navigating_to_HelpCenter
Scenario: Successful navigation to help center page.
Given User is on home page
And Click on help
And Click on help center
Then User navigate to help center page

@UnSuccessful_search1
Scenario: Failure in searching question with blank data
Given User is on help center page
And Click on search one
Then Alert please Select A Question

@UnSuccessful_search2
Scenario: Failure in searching question with invalid data
Given User is on help center page
When User enter invalid question
And Click on search two
Then Alert You are looking for
And Close


@Successful_search
Scenario: Success in searching question with valid data
Given User is on help center page
When User enter valid question
And Click on search three
Then Suggestion questions will appear
And Click on required question
Then Display the record


@Successful_editing_the_role1
Scenario: Success in selecting role as Owner
Given User is on help center page
And Click on edit option
And Click on Owner
Then User is treated as Owner

@successful_getting_answer_from_User_Profile_section_as_Owner
Scenario: Success in getting answer of any link under user profile section
Given User is on help center page as Owner
And User click on explore more one
And Click on any link under user profile section of owner
Then Navigates to next page one
And Click on any link under page one user profile section of owner
Then Navigates to next page two
And Click on any link under page two user profile section of owner
Then Navigates to next page three

@successful_getting_answer_from_Property_Management_section_as_Owner
Scenario: Success in getting answer of any link under Property Management section
Given User is on help center page as Owner
And User click on explore more two
And Click on any link under Property Management of owner
Then Navigates to next page one
And Click on any link under page one user Property Management of owner
Then Navigates to next page two
And Click on any link under page two user Property Management of owner
Then Navigates to next page three

@successful_getting_answer_from_Response_Management_section_as_Owner
Scenario: Success in getting answer of any link under Response Management section
Given User is on help center page as Owner
And Click on any link under Response Management of owner
Then Navigates to next page one
And Click on any link under page one Response Management of owner
Then Navigates to next page two
And Click on any link under page two Response Management of owner
Then Navigates to next page three

@successful_getting_answer_from_Orders&Services_as_Owner
Scenario: Success in getting answer of any link under Orders & Services section
Given User is on help center page as Owner
And Click on any link under Orders & Services of owner
Then Navigates to next page one
And Click on any link under page one Orders & Services section of owner
Then Navigates to next page two
And Click on any link under page two Orders & Services section of owner
Then Navigates to next page three

@successful_getting_answer_from_MB_Features_as_Owner
Scenario: Success in getting answer of any link under MB Features section
Given User is on help center page as Owner
And Click on any link under MB Features of owner
Then Navigates to next page one
And Click on any link under page one MB Features section of owner
Then Navigates to next page two
And Click on any link under page two MB Features section of owner
Then Navigates to next page three

@successful_getting_answer_from_Frequently_Asked_Questions_as_Owner
Scenario: Success in getting answer of any link under Frequently Asked Questions section
Given User is on help center page as Owner
And Click on any link under Frequently Asked Questions of owner
Then Navigates to next page one

@Successful_editing_the_role2
Scenario: Success in selecting role as Buyer
Given User is on help center page
And Click on edit option
And Click on Buyer
Then User is treated as Buyer

@successful_getting_answer_from_User_Profile_section_as_Buyer
Scenario: Success in getting answer of any link under User Profile section
Given User is on help center page as Buyer
And User click on explore more three
And Click on any link under user profile section of buyer
Then Navigates to next page one
And Click on any link under page one user profile section of buyer
Then Navigates to next page two
And Click on any link under page two user profile section of buyer
Then Navigates to next page three

@successful_getting_answer_from_Search_on_Magicbricks_as_Buyer
Scenario: Success in getting answer of any link under Search on Magicbricks section
Given User is on help center page as Buyer
And User click on explore more four
And Click on any link under Search on Magicbricks of buyer
Then Navigates to next page one
And Click on any link under page one Search on Magicbricks of buyer
Then Navigates to next page two
And Click on any link under page two Search on Magicbricks of buyer
Then Navigates to next page three

@successful_getting_answer_from_MB_Features_as_Buyer
Scenario: Success in getting answer of any link under MB Features section
Given User is on help center page as Buyer
And Click on any link under MB Features of buyer
Then Navigates to next page one
And Click on any link under page one MB Features section of buyer
Then Navigates to next page two
And Click on any link under page two MB Features section of buyer
Then Navigates to next page three

@successful_getting_answer_from_Frequently_Asked_Questions_as_Buyer
Scenario: Success in getting answer of any link under Frequently Asked Questions section
Given User is on help center page as Buyer
And User click on view more one 
And Click on any link under Frequently Asked Questions of buyer
Then Navigates to next page one

@Successful_editing_the_role3
Scenario: Success in selecting role as Agent
Given User is on help center page
And Click on edit option
And Click on Agent
Then User is treated as Agent

@successful_getting_answer_from_User_Profile_section_as_Agent
Scenario: Success in getting answer of any link under User Profile section
Given User is on help center page as Agent
And User click on explore more five 
And Click on any link under user profile section of Agent
Then Navigates to next page one
And Click on any link under page one user profile section of Agent
Then Navigates to next page two
And Click on any link under page two user profile section of Agent
Then Navigates to next page three

@successful_getting_answer_from_Property_Management_section_as_Agent
Scenario: Success in getting answer of any link under Property Management section
Given User is on help center page as Agent
And Click on any link under Property Management of Agent
Then Navigates to next page one
And Click on any link under page one user Property Management of Agent
Then Navigates to next page two
And Click on any link under page two user Property Management of Agent
Then Navigates to next page three

@successful_getting_answer_from_Response_Management_section_as_Agent
Scenario: Success in getting answer of any link under Response Management section
Given User is on help center page as Agent
And Click on any link under Response Management of Agent
Then Navigates to next page one
And Click on any link under page one Response Management of Agent
Then Navigates to next page two
And Click on any link under page two Response Management of Agent
Then Navigates to next page three


@successful_getting_answer_from_Orders&Services_as_Agent
Scenario: Success in getting answer of any link under Orders & Services section
Given User is on help center page as Agent
And Click on any link under Orders & Services of Agent
Then Navigates to next page one
And Click on any link under page one Orders & Services section of Agent
Then Navigates to next page two
And Click on any link under page two Orders & Services section of Agent
Then Navigates to next page three

@successful_getting_answer_from_MB_Features_as_Agent
Scenario: Success in getting answer of any link under MB Features section
Given User is on help center page as Agent
And Click on any link under MB Features of Agent
Then Navigates to next page one
And Click on any link under page one MB Features section of Agent
Then Navigates to next page two
And Click on any link under page two MB Features section of Agent
Then Navigates to next page three


@successful_getting_answer_from_Frequently_Asked_Questions_as_Agent
Scenario: Success in getting answer of any link under Frequently Asked Questions section
Given User is on help center page as Agent
And User click on view more two 
And Click on any link under Frequently Asked Questions of Agent
Then Navigates to next page one
