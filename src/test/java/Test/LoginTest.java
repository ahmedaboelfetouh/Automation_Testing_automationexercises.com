package Test;

import Base.BaseTest;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(LoginTest.class);
    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://automationexercise.com/");
    }
    @Test
    public void loginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
    }

    @Test
    public void invalidLLogin(){
        LoginPage login=new LoginPage(driver);
        login.login("standard_user1", "secret_sauce");
    }
}
