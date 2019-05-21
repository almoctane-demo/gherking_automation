#Auto generated Octane revision tag
@TID7006REV0.2.0
Feature: Inform data subjects of breach
	Scenario: Breach happened
		Given Data breach
		Given Data was not encrypted
		When Breach was detected
		Then Verify process for notification of data subjects