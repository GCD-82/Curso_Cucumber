package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.TestSandBox;

public class TestSandBoxSteps {

    TestSandBox sandBox= new TestSandBox();

    @Given("I want to navigate to sandbox page")
    public void navigateToSanbox(){
        sandBox.navigateToSandbox();
        sandBox.clickCookies();
    }

    @And("select a value from the dropdown")
    public void selectavaluefromthedropdown (){
        sandBox.selectCategory("Cantabria");
    }
}
