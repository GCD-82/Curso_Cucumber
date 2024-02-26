package pages;

public class TestSandBox extends BasePage{

    private String categoryDropdown ="//*[@id=\"answerFilterTwo\"]";

    private String clickResultLocator="//*[@id=\"onetrust-accept-btn-handler\"]";

    //Usamos el segundo construtor para aumentar el wait
    public TestSandBox(){
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("https://www.renfe.com/es/es/experiencias");

    }


    public void clickCookies(){
        clickElement(clickResultLocator);
    }

    public void selectCategory (String category){
        selectFromDropdownByValue(categoryDropdown,category);
    }
}
