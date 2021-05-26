package com.endava.ui.stepdefinitions;

import com.endava.ui.components.Home;
import com.endava.utils.TextMatcher;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class BasicSearch {

    @Steps
    Home home;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Given("I go to the SuT home page")
    public void iGoToTheSuTHomePage() {
        home.openHomePage();
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        home.enterUsername(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        home.enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        home.clickLoginButton();
    }

    @Then("I should see that I am successfully logged in")
    public void iShouldSeeThatIAmSuccessfullyLoggedIn() {
        assertTrue(home.iSeeWelcomeMessage());
    }

}
