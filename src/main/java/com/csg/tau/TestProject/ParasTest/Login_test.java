package com.csg.tau.TestProject.ParasTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Paras\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		Thread.sleep(5000);
		WebElement link=driver.findElement(By.linkText("Click Here"));
		 String MainWindow=driver.getWindowHandle();		
 			link.click();
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                   WebElement email= driver.findElement(By.name("emailid"));
	                    email.sendKeys("paras.m.sharma@gmail.com");                				
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);				
	    
		link.click();
		driver.close();
	}

}
