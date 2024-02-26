package steps;

/*
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
*/


import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps{

    GooglePage google= new GooglePage();

    @Given("I am on the Google search page")
    public void navigateToGoogle() {
        google.navigateToGoogle();
        google.clickClosePopup();
    }

    @When("I enter a search criteria")
    public void enterSearchCriteria() {
        google.enterSearchCriteria("Argentina");
    }

    @And("Click on the search button")
    public void clickSearchButton() {
        google.clickSearch();
    }

    @Then("The result match the criteria")
    public void validateResults() {
    }
}