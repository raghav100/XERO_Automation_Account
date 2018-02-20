package AutomationXero.StepDefs.SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {


    private static WebDriver driver;

    public static WebDriver getDriver() {

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//test//resources//Drivers//geckodriver.exe");
        driver = new FirefoxDriver();

        return driver;
    }

}
