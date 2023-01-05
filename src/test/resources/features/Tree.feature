 @tree
Feature: Tree
 
  Scenario: Launch the url
	Given user open browser and launch the url "https://dsportalapp.herokuapp.com/"
   When user click  "Get started" button
   And click on signin link
   When user enters  "abcde12ab3@gmail.com" "pranav@12"
   And user click on login button
   
   Scenario: Validate overview of trees link
   Given  The user is at home page with title "NumpyNinja"
    When user click on Get Started button in tree section
    Then user should navigate to corresponding page with title "Tree"
    When user click on overview of Trees
    Then user should navigate to corresponding page with title "Overview of Trees"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      |print("Tree Introduction")|
    And user will click on run button
	Then User navigate back 
	
	Scenario: Validate Terminologies link
   Given  The user is at home page with title "NumpyNinja"
    When user click on Get Started button in tree section
    Then user should navigate to corresponding page with title "Tree"
    When user click on Terminologies
    Then user should navigate to corresponding page with title "Terminologies"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      |print("Tree Terminologies ")|
    And user will click on run button
	Then User navigate back
	
	Scenario: Validate Types of Trees link
   Given  The user is at home page with title "NumpyNinja"
    When user click on Get Started button in tree section
    Then user should navigate to corresponding page with title "Tree"
    When user click on Types of Trees
    Then user should navigate to corresponding page with title "Types of Trees"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      |print("Types of Trees")|
    And user will click on run button
	Then User navigate back
	
	Scenario: Validate Tree Traversals link
   Given  The user is at home page with title "NumpyNinja"
    When user click on Get Started button in tree section
    Then user should navigate to corresponding page with title "Tree"
    When user click on Tree Traversals
    Then user should navigate to corresponding page with title "Tree Traversals"
    When user clicks on Try here
    Then user should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      |print("Tree Traversals")|
    And user will click on run button
	Then User navigate back
	
	
