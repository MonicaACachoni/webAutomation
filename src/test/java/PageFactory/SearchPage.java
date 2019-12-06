package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.UtilitiesBelt;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;
    static UtilitiesBelt tool = new UtilitiesBelt();

    @FindBy(id = "h_search-input")
    WebElement searchField;

   

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void clickSearhOption(){
        System.out.println("Clicking Search  option...");
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.click();
        searchField.sendKeys("aaa");
    }

    public void clickSuppliersMenuOption(){
        System.out.println("Clicking Suppliers menu option...");
        //wait.until(ExpectedConditions.elementToBeClickable(suppliersMenuOption));
       // suppliersMenuOption.click();
    }

    public void accessSuppliersManagementPage(){
       // this.clickAccountsMenuOption();
        this.clickSuppliersMenuOption();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, \"panel-heading\")][contains(text(), \"Suppliers Management\")]")));
    }
}
