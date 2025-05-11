package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage {

    WebDriver driver;

    private static final Logger logger = LogManager.getLogger(LoginPage.class);
    private final By Username = By.cssSelector("#Email");
    private final By Password = By.cssSelector("#Password");
    private final By LoginButton = By.cssSelector("#main > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String Name){
        driver.findElement(Username).sendKeys(Name);
    }

    public  void setPassword(String Pass){
        driver.findElement(Password).sendKeys(Pass);
    }

    public void clickLoginButton(){
        driver.findElement(LoginButton).click();
    }
    public void login(String Name, String Pass){
        setUsername(Name);
        setPassword(Pass);
        clickLoginButton();
    }

}
