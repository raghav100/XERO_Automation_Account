package AutomationXero.PageObjects.Accounts;

import AutomationXero.StepDefs.SetUp.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static AutomationXero.Helpers.helper.Sleep;

public class AddBankAccounts {

    private WebDriver driver;
    private Wait wait;


    public AddBankAccounts(SharedDriver sharedDriver) {
        this.driver = SharedDriver.getDriver();
        wait = new FluentWait<WebDriver>(driver)
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class)
                .pollingEvery(250, TimeUnit.MILLISECONDS)
                .withTimeout(15, TimeUnit.SECONDS);

        PageFactory.initElements(driver, this);
    }

    private String generateRandomAccountName() {
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            char c = alphabet.charAt(random.nextInt(26));
            s+=c;
        }


        return s;
    }


    private String generateRandomAccountNumber() {

        String digits= "1234567890";
        String s="";

        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            char c = digits.charAt(random.nextInt(10));
            s+=c;
        }

        return s;

    }

    @FindBy(id="xui-searchfield-1018-inputEl")
    private WebElement bankSearchBox;


    @FindBy(xpath = "//*[@id=\"dataview-1025\"]/li")
    private WebElement anzBank;


    //nextpage

    @FindBy(id = "accountname-1037-inputEl")
    private WebElement accountName;

    @FindBy(id = "accounttype-1039-inputEl")
    private WebElement accountType;

    @FindBy(xpath = "//*[@id=\"boundlist-1076-listEl\"]/li[1]")
    private WebElement selectAccountType;

    @FindBy(id = "accountnumber-1068-inputEl")
    private WebElement accountNumberField;

    @FindBy(id = "common-button-submit-1015-btnInnerEl")
    private WebElement continueButton;


 //   @FindBy(id = "ext-gen49")
    @FindBy(xpath = "//*/div[@class=\"message\"]/p[starts-with(@id, \"ext-gen\")]")
    private WebElement confirmationText;


    private String randomAccountName = generateRandomAccountName();
    private String randomAccountNumber = generateRandomAccountNumber();




    public void searchBank(String bankName) {
        bankSearchBox.sendKeys(bankName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dataview-1025\"]/li")));
        anzBank.click();

    }

    public void addAccountDetails(String acctName, String acctNumber) {


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accountname-1037-inputEl")));
        accountName.sendKeys(randomAccountName);
        accountType.click();
        selectAccountType.click();
        Sleep(2);
        accountNumberField.sendKeys(randomAccountNumber);
        accountName.click();
        Sleep(1);
        continueButton.click();


    }

    public String getAccountName() {
        return randomAccountName;
    }




    public String getConfirmationText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div[@class=\"message\"]/p[starts-with(@id, \"ext-gen\")]")));
        return confirmationText.getText();
    }

}
