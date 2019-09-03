package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinations {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("landing page");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	System.out.println("homepage displayed");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("all cards displayed");
       // throw new PendingException();
    }

}