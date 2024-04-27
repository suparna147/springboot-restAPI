package com.example.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
    @FindBy(how=How.NAME,using="username")
    private WebElement usernameInput;
    @FindBy(name="password")
     private WebElement passwordInput;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement loginButton;

    public LoginPageObjects(WebDriver driver)
    {
       // pageObjects.initElements(driver,this);
       PageFactory.initElements(driver,this);
    }

    public void userName(String username)
    {
        usernameInput.sendKeys(username);
    }

    public void password(String password)
    {
        passwordInput.sendKeys(password);
    }

    public void login()
    {
        loginButton.click();
    }
}
