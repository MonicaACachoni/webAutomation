package org.training;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:reports/test-report"}, 
tags = "@Test", features = {"src/test/resources/WebSite"})
public class CucumberRunner {


    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//ChromeDriver//chromedriver.exe");
       
    }


    @AfterClass
    public static void tearDownClass() throws InterruptedException {

        if (StepDefinition.driver != null) {
           StepDefinition.driver.quit();
        }
    }
}
