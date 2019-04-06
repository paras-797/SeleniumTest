package com.csg.tau.TestProject.ParasTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {	
	
	
    @Given("^Open the \"(.*)\"  in chrome$")				
    public void launchApp() throws Throwable							
    {	System.setProperty("webdriver.chrome.driver","C:\\Users\\Paras sharma\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        System.out.println("This Step open the Firefox and launch the application.");					
    }		

    @When("^Users enters \"(.*)\" in search box and selects suggestion no. (d+)$")					
    public void enterText() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^user should see result page$")					
    public void clickSearch() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }		

}
