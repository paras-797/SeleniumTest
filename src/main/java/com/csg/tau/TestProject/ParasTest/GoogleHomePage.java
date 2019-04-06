package com.csg.tau.TestProject.ParasTest;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
public class GoogleHomePage {
	public GoogleHomePage(WebDriver driver){
		super();
		PageFactory.initElements(driver, this);
		
	}

    @FindBy(id="lst-ib")
    private WebElement textbox;
    
  
    @FindBy(xpath="//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[1]")
    private WebElement listitem;
    
    @FindBy(name="btnK")
    private WebElement buttonOk;
   
    
    public boolean entertext(String textToEnter) throws InterruptedException{
    	try{
    		textbox.sendKeys(textToEnter);
    		
    		Thread.sleep(10000);
    		Reporter.log("Text Entered in textbox");
    		return true;
    		
    	}catch(ElementNotVisibleException e){
    		return true;
    	}
    }
    
    public void selectListItem() throws InterruptedException{
    	try{
    		listitem.click();
    	
    		Thread.sleep(2000);
    		Reporter.log("list item selected");
    	}catch(ElementNotVisibleException e){
    		
    	}
    }
    
    public void clickSearch() throws InterruptedException{
    	try{
    		buttonOk.click();
    	
    		Thread.sleep(5000);
    		Reporter.log("Google Search button clicked");
    	}catch(ElementNotVisibleException e){
    		
    	}
    }
}
