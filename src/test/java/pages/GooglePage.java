package pages;

import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage {
//Mandamos drive como argumento porque ya está declarado en la clase heredada de forma estatic

    //Ponemos los lacators de Google
    private String closeGoogleButtonPopup="//*[@id=\"W0wltc\"]/div";
    private String searchGoogleButton ="//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";

    private String searchTextField="//textarea[@id='APjFqb']";
    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }
    public void clickClosePopup(){
        clickElement(closeGoogleButtonPopup);
    }
    public void clickSearch(){
        clickElement(searchGoogleButton);
    }

    public void enterSearchCriteria (String criteria){
      write(searchTextField,criteria);
    }
}
