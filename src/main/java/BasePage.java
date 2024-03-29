package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BasePage {
    public static WebDriver driver;
    private String BASE_URL =
            "https://www.lambdatest.com/selenium-playground/";
    public BasePage() {
// Default constructor
    }
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
    @BeforeMethod
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }
package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
    public class BasePage {
        public static WebDriver driver;
        private String BASE_URL =
                "https://www.lambdatest.com/selenium-playground/";
        public BasePage() {
// Default constructor
        }
        public BasePage(WebDriver driver) {
            BasePage.driver = driver;
        }
        @BeforeMethod
        public void setUp() {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            driver = new FirefoxDriver(options);
            driver.manage().window().maximize();
            driver.get(BASE_URL);
        }
