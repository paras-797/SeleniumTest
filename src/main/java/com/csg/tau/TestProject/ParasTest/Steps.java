package com.csg.tau.TestProject.ParasTest;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {	
	
    @FindBy(id="lst-ib")
    private WebElement textbox;
    
  
//    @FindBy(xpath="//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[1]")
//    private WebElement listitem;
    
    @FindBy(name="btnK")
    private WebElement buttonOk;
	
    WebDriver driver;
	
    @Given("^Open the \"(.*)\"  in chrome$")				
    public void launchApp(String url) throws Throwable							
    {	System.setProperty("webdriver.chrome.driver","C:\\Users\\Paras sharma\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
        				
    }		

    @When("^Users enters \"(.*)\" in search box and selects suggestion no. (d+)$")					
    public void enterText(String textToEnter, int num ) throws Throwable 							
    {		

    		textbox.sendKeys(textToEnter);
    		
    		Thread.sleep(5000);
    		Reporter.log("Text Entered in textbox");
    		WebElement listitem=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li["+num+"]"));
    		listitem.click();
        	
    		Thread.sleep(2000);
    		
			
    }		

    @Then("^user should see result page$")					
    public void clickSearch() throws Throwable 							
    {    		
    	buttonOk.click();
    	Thread.sleep(5000);
        //your code goes here				
    }		

}
