package AutomationXero.StepDefs.AddAccount;

import AutomationXero.PageObjects.Accounts.AddBankAccounts;
import AutomationXero.PageObjects.Accounts.BankAccounts;
import AutomationXero.PageObjects.HomePage.homePage;
import AutomationXero.PageObjects.Navigation.TopNavigation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddANZAccount {


    private homePage homepage;
    private TopNavigation topNavigation;
    private BankAccounts bankAccounts;
    private AddBankAccounts addBankAccounts;


    public AddANZAccount(homePage homepage, TopNavigation topNavigation, BankAccounts bankAccounts, AddBankAccounts addBankAccounts) {
        this.homepage = homepage;
        this.topNavigation = topNavigation;
        this.bankAccounts = bankAccounts;
        this.addBankAccounts = addBankAccounts;
    }



    @Given("^user logged into Xero as an authorized user$")
    public void user_logged_into_Xero_as_an_authorized_user() {

        homepage.clickLogin();
        homepage.userLogin("raghavbhalla10@gmail.com", "xero123$");

    }

    @When("^the user adds a new ANZ account to his profile$")
    public void the_user_adds_a_new_ANZ_account_to_his_profile()  {

        topNavigation.clickAccountLink();
        bankAccounts.clickAddBankAccountLink();
        addBankAccounts.searchBank("ANZ");
        addBankAccounts.addAccountDetails("Business Account", "00354545454556");

    }

    @Then("^the account is added to his Xero profile$")
    public void the_account_is_added_to_his_Xero_profile() throws InterruptedException {

        Assert.assertEquals("Account Successfully Added", addBankAccounts.getAccountName()+" has been added.", addBankAccounts.getConfirmationText());

    }


}
