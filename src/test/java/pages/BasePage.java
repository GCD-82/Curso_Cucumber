package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    //Static generado por el profesor, para que haya un solo valor para todads las instancias
    static {
        ChromeOptions chromeOptions= new ChromeOptions();
        driver=new ChromeDriver(chromeOptions);
        //esta es en caso de que no encuentre da un margen de 10 s
        wait =new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver){
        BasePage.driver=driver;
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void navigateTo(String url){
        driver.get(url);
    }
}