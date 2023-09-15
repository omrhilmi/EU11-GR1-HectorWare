Feature: Default


	#*US*
	#As an application basic user, I should be able to edit any  conversation so that I can communicate with other users.
	#*AC:*
	#
	#User can edit any selected conversation.
	@WARE-855
	Scenario: User can edit any conversation
		Given user wants to add conversation
		When user press on the + button
		Then user should be able to chose any contact/conversation he wants