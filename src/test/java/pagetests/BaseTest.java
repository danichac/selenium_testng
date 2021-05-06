package pagetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void endTest() {
        driver.quit();
    }

    public void goHome(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }
}
