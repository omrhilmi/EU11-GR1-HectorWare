Feature: Default


	#US:  As a User I should be able to start and stop any call\conversation.
	#
	# 
	#
	#AC: User can start and stop any conversation.
	@WARE-851
	Scenario: Start and end call funcionality
		Given user can start a call
		When  the user press on the call button
		Then user should see a call is being made