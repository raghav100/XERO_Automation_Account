package AutomationXero.PageObjects.Accounts;

import AutomationXero.StepDefs.SetUp.SharedDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankAccounts {

    private WebDriver driver;


    public BankAccounts(SharedDriver sharedDriver) {
        this.driver = SharedDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Add Bank Account")
    private WebElement addBankAccountLink;


    public void clickAddBankAccountLink() {
        addBankAccountLink.click();
    }
}
