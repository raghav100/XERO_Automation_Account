package AutomationXero.PageObjects.HomePage;

import AutomationXero.StepDefs.SetUp.SharedDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    private WebDriver driver;

    public homePage(SharedDriver sharedDriver) {
        this.driver = SharedDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Login")
    private WebElement login_button;

    @FindBy(id="email")
    private WebElement user_name_field;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="submitButton")
    private WebElement submitButton;


    public void clickLogin() {
        login_button.click();
    }

    public void userLogin (String username, String pwd) {

        user_name_field.sendKeys(username);
        password.sendKeys(pwd);
        submitButton.click();

    }






}
