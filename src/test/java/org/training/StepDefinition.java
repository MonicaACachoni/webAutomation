package org.training;

import java.io.File;
import java.io.IOException;

import com.intuit.karate.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.LoginPage;
import PageFactory.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinition {

    public static WebDriver driver = new ChromeDriver();

    static WebDriverWait wait = new WebDriverWait(driver, 30);

    static SearchPage objSearch = new SearchPage(driver);
    static LoginPage objLogin = new LoginPage(driver);

    public void Print(final String nomePrint) throws IOException {
        final File foto = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copy(foto, new File("C:\\Evidencias\\" + nomePrint + ".png"));
    }

    String sign_in_url = "https://submarino.com.br";
    
    @Given("^the user \"([^\"]*)\" is logged in to Submarino Site$")
    public void the_user_is_logged_in_to_Submarino_Site(final String arg1) throws Throwable {
        System.out.println("Passo - 1 Abre o Site");
        Print("Evidencia-01 - Home Site");
        objLogin.getLoginPage(driver, sign_in_url);
        driver.manage().window().maximize();
    }

    @When("^product \"([^\"]*)\" are searched$")
    public void product_are_searched(final String arg1) throws Throwable {
        objSearch.clickSuppliersMenuOption(arg1);
    }

    @Then("^product in shown as available")
    public void clicks_On_Add_Button(){
        
    }
}