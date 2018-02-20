package AutomationXero.PageObjects.Navigation;

import AutomationXero.StepDefs.SetUp.SharedDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation {

    private WebDriver driver;

    public TopNavigation(SharedDriver sharedDriver) {
        this.driver = SharedDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"Accounts\"]")
    private WebElement AccountLink;

    @FindBy(linkText = "Bank Accounts")
    private WebElement bankAccountsLink;


    public void clickAccountLink() {
        AccountLink.click();
        bankAccountsLink.click();
    }



}
