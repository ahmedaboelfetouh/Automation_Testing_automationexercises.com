package Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegisterTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(RegisterTest.class);

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://automationexercise.com/");
    }


    @Test
    public void registerTest() {
        RegisterPage reg = new RegisterPage(driver);
        logger.info("\uD83D\uDE80 \uD83D\uDE80 \uD83D\uDE80 Starting Test Case 1");
        reg.TestCase1("Ahmed", "xxxx@gmail.com");
    }
}
