package AutomationXero.StepDefs.SetUp;

import cucumber.api.java.After;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class InitialSetup {

    private WebDriver driver;

    public InitialSetup(SharedDriver sharedDriver) {

        this.driver = SharedDriver.getDriver();
    }

    @Before
    public void init() {

        driver.get("https://www.xero.com/nz/");

    }

    @After
    public void tear_down() {
        driver.quit();
    }



}
