Feature: Default

	@wip
	#*US*
	#As an application basic user, I should be able to create a new group conversation so that I can communicate with other users.
	#
	#*AC:*
	#Display all conversation lists under the Talk module
	#
	#User can create a new conversation under the Talk module
	@WARE-857
	Scenario: user can create new conversation
		Given user wants to create new conversation
		When user clicks on the + button 
		Then user should see new window to add particepants and create the conversation