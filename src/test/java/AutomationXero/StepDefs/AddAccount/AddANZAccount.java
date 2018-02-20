package AutomationXero.StepDefs.AddAccount;

import AutomationXero.PageObjects.HomePage.homePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddANZAccount {


    private homePage homepage;

    public AddANZAccount(homePage homepage) {
        this.homepage = homepage;
    }

    @Given("^user logged into Xero as an authorized user$")
    public void user_logged_into_Xero_as_an_authorized_user() {

        homepage.clickLogin();

        homepage.userLogin("raghavbhalla10@gmail.com", "xero123$");


    }

    @When("^the user adds a new ANZ account to his profile$")
    public void the_user_adds_a_new_ANZ_account_to_his_profile()  {

    }

    @Then("^the account is added to his Xero profile$")
    public void the_account_is_added_to_his_Xero_profile() throws InterruptedException {

        Thread.sleep(5000);


    }


}
