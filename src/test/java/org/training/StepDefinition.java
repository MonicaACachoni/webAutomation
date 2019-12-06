package org.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.UtilitiesBelt;

public class StepDefinition {

    public static WebDriver driver = new ChromeDriver();

    static WebDriverWait wait = new WebDriverWait(driver, 30);
    static UtilitiesBelt tool = new UtilitiesBelt();


    String sign_in_url = "https://submarino.com.br";


    String newSupplier_firstname = tool.firstNameGenerator();
    String newSupplier_lastname = tool.lastNameGenerator();
    String newSupplier_email = newSupplier_firstname + "@" + newSupplier_lastname + ".com";
    String newSupplier_password = tool.passwordGenerator(12);
    String newSupplier_mobileNumber = tool.phoneGenerator(9);;
    String newSupplier_address1 = tool.address1Generator();
    String newSupplier_address2 = tool.address2Generator();
    String newSupplier_itemName = newSupplier_lastname + "'s Inn";

   // static LoginPage objLogin = new LoginPage(driver);
    static SearchPage objHome;
  //  static SuppliersMgmtPage objSuppliersMgmt;
   // static AddSupplierPage objAddSupplier;

    @Given("^the user \"([^\"]*)\" is logged in to Submarino Site$")
    public void the_user_is_logged_in_to_Submarino_Site(String arg1) throws Throwable {
        
    }

    @When("^product \"([^\"]*)\" are searched$")
    public void product_are_searched(String arg1) throws Throwable {
        
    }

    @Then("^product in shown as available")
    public void clicks_On_Add_Button(){
        
    }
}