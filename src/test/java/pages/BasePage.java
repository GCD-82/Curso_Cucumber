package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action; //Es una clase especial para poder realizar algunas acciones
    //Static generado por el profesor, para que haya un solo valor para todads las instancias
    static {
        ChromeOptions chromeOptions= new ChromeOptions();
        driver=new ChromeDriver(chromeOptions);
        //esta es en caso de que no encuentre da un margen de 10 s
        wait =new WebDriverWait(driver,Duration.ofSeconds(10));
    }
  //constructor
    public BasePage(WebDriver driver){
        BasePage.driver=driver;
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Método Obtener un web element. Donde busca el Xpath
    private WebElement find (String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    //Método obtener una URL
    public static void navigateTo(String url){
        driver.get(url);
    }

    //Metodo click element
    public void clickElement(String locator){
        find(locator).click();//Devuelve un objeto web element y click es un método
    }

    public void write(String locator, String textToWrite){
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }
   //Para dropDown
   //Podemos hacer un select por Valor
    public void selectFromDropdownByValue (String locator,String valueToSelect){
        Select dropdown = new Select (find(locator));

        dropdown.deselectByValue(valueToSelect);
    }
    //Podemos hacer un select por Indice
    public void selectFromDropdownByIndex (String locator,int index){
        Select dropdown = new Select (find(locator));

        dropdown.selectByIndex(index);
    }
    //Por texto
    public void selectFromDropdownByText (String locator,String valueToSelect){
        Select dropdown = new Select (find(locator));

        dropdown.selectByVisibleText(valueToSelect);
    }

    //Métodos con el action

    public void hoverOverElement(String locator){
        action.moveToElement(find(locator));
    }

    public void doubleClick(String locator){
        action.doubleClick(find(locator));
    }
    //Botón derecho
    public void rightClick(String locator){
        action.contextClick(find(locator));
    }
    //Método para tomar un strin de una celda
    //Tiene contatenación
    public String getValueFromTable(String locator, int row, int column){
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        return find(cellINeed).getText();
    }
    //Para llenar una celda
    public void setValueOnTable (String locator, int row, int column, String stringToSend){
        String cellToFill=locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        find(cellToFill).sendKeys(stringToSend);
    }

}