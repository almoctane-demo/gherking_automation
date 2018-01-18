package com.microfocus.adm.octane.gherkinautomation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChromeLiveChatTest {
    @Given("^the Google Chrome browser is open$")
    public void theGoogleChromeBrowserIsOpen() {
        System.out.println("The browser is open!");
    }

    @When("^opening the live chat$")
    public void openingTheLiveChat() {
        System.out.println("opening live chat!");
    }

    @Then("^the chat works$")
    public void theChatWorks() {
        System.out.println("The test worked!");
    }
}
