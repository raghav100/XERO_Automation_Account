package AutomationXero.StepDefs.SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SharedDriver extends EventFiringWebDriver {

    private static WebDriver driver = BrowserFactory.getDriver();

    public SharedDriver() {
        super(driver);
    }

    public static WebDriver getDriver() {
        return driver;
    }








}
