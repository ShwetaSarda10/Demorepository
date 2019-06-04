package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mystepdefs {


    @Given("^I am on automation form$")
    public void i_am_on_automation_form() throws Throwable {

        System.out.println(" I am on automation form");
    }

    @When("^I enter details firstname$")
    public void iEnterDetails() throws Throwable {
        System.out.println("I enter details firstname");
    }

    @Then("^click on button$")

    public void everythingGetsVanished () throws Throwable {
        System.out.println("click on button");
    }
    }
