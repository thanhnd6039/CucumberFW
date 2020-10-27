package WebUI.Banking.StepDefinitions;

import FW.Manager.PageObjectManager;
import FW.Manager.WebDriverManager;
import FW.SharingTestContext.TestContext;
import WebUI.Banking.Pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinitions {
    HomePage homePage;
    TestContext testContext;

    public LoginStepDefinitions(TestContext context){
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^I navigate to Home page$")
    public void navigateToHomePage() throws Throwable{
        homePage.navigateToHomePage();
    }
//
    @And("^I input (.*) on TextBox of (userId|password) on Home page$")
    public void inputTextOnTextBox(String text, String field) throws Throwable{
        homePage.inputTextOnTextBox(text, field);
    }
//
//    @And("^I click to (login|reset) button$")
//    public void clickToButton() {
//
//    }
//
//    @Then("^I should see alert popup with a message (.*)$")
//    public void getMessageFromAlertPopUp(String message) {
//
//    }




}
