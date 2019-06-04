package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Featurefile {

    @Given("^I am on automation forms$")
    public void i_am_on_automation_forms() throws Throwable {

        System.out.println(" I am on automation forms");

    }

    @When("^I enter details firstnames$")
    public void i_enter_details_firstnames() throws Throwable {

        System.out.println(" I enter details firstnames");

    }

    @Then("^click on buttons$")
    public void click_on_buttons() throws Throwable {

        System.out.println(" click on buttons");

    }
}
