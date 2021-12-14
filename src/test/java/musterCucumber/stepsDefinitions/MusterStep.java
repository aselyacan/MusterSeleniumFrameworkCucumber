package musterCucumber.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import musterCucumber.pages.MusterPO;
import musterCucumber.utilities.ConfigurationReader;
import musterCucumber.utilities.Driver;

public class MusterStep {

    MusterPO musterPO;


    @Given("user visit localhost")
    public void user_visit_localhost() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enter a username {string}")
    public void user_enter_a_username(String username) {
        musterPO.userName.sendKeys(username);
    }

    @When("User enter a name {string}")
    public void user_enter_a_name(String name) {
        musterPO.userRegister("name",name);
    }

    @When("User enter a lastname {string}")
    public void user_enter_a_lastname(String lastname) {
        musterPO.userRegister("lastname",lastname);
    }

    @When("User enter a passport {string}")
    public void user_enter_a_passport(String passport) {
       musterPO.userRegister("passport1",passport);
    }

    @When("User enter a second passport {string}")
    public void user_enter_a_second_passport(String passport2) {
        musterPO.userRegister("passport2",passport2);
    }
    @Then("User click registerButton")
    public void user_click_registerButton() {
       musterPO.registerButton.click();
    }

    @Then("User sees succes message")
    public void user_sees_succes_message() {
       musterPO.clickRegister();
    }


}
