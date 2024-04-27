package com.example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.pageObjects.LoginPageObjects;


public class AppTest 
{

    private String pageURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    
    WebDriver driver;
    
    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();
        
    }
     @Test
    public void login()
    {
        LoginPageObjects lp = new LoginPageObjects(driver);
        driver.get(pageURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
       // driver.findElement(By.name("username").sendKeys("Admin"));
        
        lp.userName("Admin");
        lp.password("admin123");
        lp.login();

    }
    @AfterMethod
    public void tearDown()
    {
        if(driver!=null)
        {
            driver.quit();
        }

    }
}
