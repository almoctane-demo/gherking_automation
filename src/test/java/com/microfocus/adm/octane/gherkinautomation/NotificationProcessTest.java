package com.microfocus.adm.octane.gherkinautomation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotificationProcessTest {
    @Given("^Data breach$")
    public void dataBreach() {
        System.out.println("Data Breach!");
    }

    @Given("^Data was not encrypted$")
    public void dataWasNotEncrypted() {
        System.out.println("Data was not encrypted");

    }

    @When("^Breach was detected$")
    public void breachWasDetected() {
        System.out.println("Breach Detected!");
    }

    @Then("Verify process for notification of data subjects")
    public void verify_process_for_notification_of_data_subjects() {
        System.out.println("Verified!");
    }
}
