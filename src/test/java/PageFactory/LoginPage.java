package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.UtilitiesBelt;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;
    static UtilitiesBelt tool = new UtilitiesBelt();

    @FindBy(id = "h_search-input")
    WebElement searchInput;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);

        PageFactory.initElements(driver, this);
    }

    public void searchElement(WebDriver driver, String url){
        System.out.println("Searching for one product...");
        driver.get(url);
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
    }

}
