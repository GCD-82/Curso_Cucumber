package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.GridPage;

public class TestTakeGrid {

    GridPage gridPage= new GridPage();

    @Given("I want to navigate to take Grid")
    public void navigateToGridPage(){
        gridPage.navigateToGrid();

    }

    @And("select a value grid")
    public void selectavaluegrid (){
        gridPage.clickClosePopup();
        String value=gridPage.getValueFromGrid(1,2);

        System.out.println(value);
    }
}
