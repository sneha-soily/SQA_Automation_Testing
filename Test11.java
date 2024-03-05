package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {
    public static void main(String[] args) throws InterruptedException{
    	//TODO Auto-generated method stub
    	
    	
    	//web driver initialize 
    	WebDriverManager.chromedriver().setup();
    	
    	//web driver object create
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.saucedemo.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    	
    	
    	
    	//first method for URL
    	
    	String ExpectedURL = "https://www.saucedemo.com/";
    	String ActualURL = driver.getCurrentUrl();
    	
    	System.out.println(ActualURL);
        
    	if(ActualURL.equals(ExpectedURL)) {
    		
    		System.out.println("URL Match");
    		
    	}else {
    		
    		System.out.println("URL doesn't Match");
    		
    	}
    	
    	
    	//Second method for title match
    	
    	String ExpectedURL = "https://www.saucedemo.com/";
    	String ActualURL = driver.getCurrentUrl();
    	
    	Assert.assertEquals(ActualURL, ExpectedURL, "Condition True");
    	
    	
    	//login automation
    	/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	Thread.sleep(1000); //sleep for 3 second
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	Thread.sleep(1000); //sleep for 3 second
    	driver.findElement(By.id("login-button")).click();*/
    	
    	
    	//first method
    	
    	/*String ExpectedTitle = "Swag Labs";
    	String ActualTitle = driver.getTitle();
    	
    	System.out.println(ActualTitle);
        
    	if(ActualTitle.equals(ExpectedTitle)) {
    		
    		System.out.println("Title Match");
    		
    	}else {
    		
    		System.out.println("Title doesn't Match");
    		
    	}*/
    	
    	//Second method
    	
    	/*String ExpectedTitle = "Swag Labs";
    	String ActualTitle = driver.getTitle();
    	
    	Assert.assertEquals(ActualTitle, ExpectedTitle, "Condition True");*/
    }
}






















