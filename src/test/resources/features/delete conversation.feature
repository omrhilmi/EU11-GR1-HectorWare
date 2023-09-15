Feature: Default


	#*US*
	#As an application basic user, I should be able to delete any group conversation
	#*AC:*
	#
	#User can delete any selected conversation
	@WARE-853
	Scenario: User can delete any conversation
		Given user wants to delete a conversation
		When user click on delete button 
		Then user should see confirmation message for the delete
		And user clicks on confirm delete
		Then user should see the conversation has been deleted