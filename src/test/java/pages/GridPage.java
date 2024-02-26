package pages;

public class GridPage extends BasePage{

    private String cell ="//main[@role='main']";

    private String closeTakeGridPopup="//p[normalize-space()='Consentir']";
    public GridPage(){
        super(driver);
    }

    public void navigateToGrid (){
        navigateTo("https://toolsqa.com/selenium-webdriver/selenium-grid/");
    }

    public void clickClosePopup(){
        clickElement(closeTakeGridPopup);
    }

    public String getValueFromGrid(int row, int colunm){
        return getValueFromTable(cell,row,colunm);
    }
}
