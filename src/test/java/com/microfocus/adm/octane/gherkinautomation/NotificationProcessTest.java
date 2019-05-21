package com.microfocus.adm.octane.gherkinautomation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

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
}
