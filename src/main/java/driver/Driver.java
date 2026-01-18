package driver;

import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.thoughtworks.gauge.AfterScenario;


public class Driver {


    public static WebDriver driver;

    @BeforeScenario
    public static WebDriver getDriver() {

        String Baseurl = "https://qatestcase.myideasoft.com/";

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(Baseurl);

        }
        return driver;
    }

    @AfterScenario
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}