package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mysteps {


    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {

                System.out.println("I am on home page");

    }

    @When("^I enter details lastname$")
    public void i_enter_details_lastname() throws Throwable {
        System.out.println("I enter details lastname");

    }

    @Then("^click on submit button$")
    public void click_on_submit_button() throws Throwable {
        System.out.println("click on submit button");

    }
}

