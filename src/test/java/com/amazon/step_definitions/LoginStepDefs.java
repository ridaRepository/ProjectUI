package com.amazon.step_definitions;

import com.amazon.pages.LoginPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.get());

    @Given("User able to go to website")
    public void user_able_to_go_to_website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("user should able to hover over account area")
    public void user_should_able_to_hover_over_account_area() {

        actions.moveToElement(loginPage.signinHoverover);

    }
    @And("user should able to click login button")
    public void user_should_able_to_click_login_button() {
        BrowserUtils.clickWithJS(loginPage.login);
       // loginPage.login.click();
    }

    @Then("user should be able to see login page")
    public void user_should_be_able_to_see_login_page() {

        String actualResult=Driver.get().getTitle();
        String expectedResult="Amazon Sign-In";
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("the user enters {string}  {string}")
    public void the_user_enters(String username, String password) {
        username=ConfigurationReader.get("username");
        password=ConfigurationReader.get("password");

        loginPage.emailOrPhoneTextBox.sendKeys(username);
        loginPage.continueButton.click();
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.loginButton.click();
    }

    /**
     *
     * @param username
     * @param password
     * pass the Example tables variable
     */
    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {

        loginPage.emailOrPhoneTextBox.sendKeys(username);
        loginPage.continueButton.click();
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.loginButton.click();
    }


    @Then("user should be on the main page")
    public void user_should_be_on_the_main_page() {
        BrowserUtils.waitFor(4);
        String actualResult= Driver.get().getTitle();
        String expectedResult= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(expectedResult,actualResult);
    }


    @When("the user enters invalid {string} {string}")
    public void the_user_enters_invalid(String username, String password) {
        username=ConfigurationReader.get("invalid_username");
        loginPage.emailOrPhoneTextBox.sendKeys(username);
        loginPage.continueButton.click();
    }

    @Then("user should able to see warning message on the screen")
    public void user_should_able_to_see_warning_message_on_the_screen() {

        LoginPage loginPage= new LoginPage();
        String actualResult = loginPage.warningMsg.getText();
        String expectedResult= "Bir sorun oluştu";
        Assert.assertEquals(expectedResult,actualResult);
    }




}
