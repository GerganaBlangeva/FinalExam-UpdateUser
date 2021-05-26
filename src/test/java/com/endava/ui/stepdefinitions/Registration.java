package com.endava.ui.stepdefinitions;

import com.endava.ui.components.Home;
import com.endava.ui.components.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Registration {

    @Steps
    Home home;
    Register register;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Given("I go to the SUT home page")
    public void iGoToTheSUTHomePage() {
        home.openHomePage();
    }

    @And("I click on the registration button")
    public void iClickOnTheRegistrationButton() {
        register.clickRegisterButtonHome();

    }

    @When("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        register.enterFirstName(firstName);
    }

    @And("I enter surname {string}")
    public void iEnterSurname(String surname) {
        register.enterSurname(surname);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        register.enterEmail(email);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        register.enterPassword(password);
    }

    @And("I enter country {string}")
    public void iEnterCountry(String country) {
        register.enterCountry(country);
    }

    @And("I enter city {string}")
    public void iEnterCity(String city) {
        register.enterCity(city);
    }

    @And("I agree to the terms of service")
    public void iAgreeToTheTermsOfService() {
        register.agreeToTOS();
    }

    @And("I click on the register button")
    public void iClickOnTheRegisterButton() {
        register.clickRegisterButton();
    }

    @Then("I should see that I am successfully registered")
    public void iShouldSeeThatIAmSuccessfullyRegistered() {
        assertTrue(home.iSeeWelcomeMessage());
    }
}
