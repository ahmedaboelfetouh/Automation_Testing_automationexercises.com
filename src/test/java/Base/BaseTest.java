package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver = new ChromeDriver();
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // Setup driver automatically
    }
}
