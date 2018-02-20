package AutomationXero.StepDefs.SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SharedDriver  {

    private static WebDriver driver = BrowserFactory.getDriver();



    public static WebDriver getDriver() {
        return driver;
    }








}
