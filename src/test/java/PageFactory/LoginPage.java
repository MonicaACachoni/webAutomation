package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);

        PageFactory.initElements(driver, this);
    }

    public void getLoginPage(WebDriver driver, String url){
        System.out.println("Loading login page...");
        driver.get(url);
    }
  
}
