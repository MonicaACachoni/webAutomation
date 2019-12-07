package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;
  
    @FindBy(id = "h_search-input")
    WebElement searchField;

   

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void clickSearchOption(final String arg1){
        System.out.println("Clicking Search  option...");
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.sendKeys(arg1);
        searchField.sendKeys(Keys.RETURN);
    }

    public void clickSuppliersMenuOption(String arg1){
        System.out.println("Clicking Suppliers menu option...");
        clickSearchOption(arg1);

    }

    public void accessSuppliersManagementPage(String arg1){
        this.clickSuppliersMenuOption(arg1);
    }
}
