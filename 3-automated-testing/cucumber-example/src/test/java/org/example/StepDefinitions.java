package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {


    @Given("that the user has entered {}")
    public void userInput(String expression) {

    }

    @When("I evaluate their expression")
    public void evaluate() {

    }

    @Then("I should get a result of {}")
    public void assertResult() {

    }
}
