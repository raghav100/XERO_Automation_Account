package AutomationXero.TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/AutomationXero/Features/ManageAccount.feature",
        glue = {"AutomationXero/StepDefs"},
        plugin = {"pretty", "html:reports/cucumber_reports", "json:reports/Json/cucumber-report.json",
                }
)

public class Run_AddAccountNumberTest {


}
