package com.endava.ui.components;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static com.endava.ui.locators.WebElements.LogIn.LOGGED_IN_BUTTON;
import static com.endava.ui.locators.WebElements.Register.*;

public class Register extends PageObject {

    @Step("Open the home page")
    public void openHomePage() {
        this.open();
    }

    @Step("Click on Register button")
    public void clickRegisterButtonHome(){
        $(REGISTER_BUTTON_HOMEPAGE).click();
    }

    @Step("Input first name")
    public void enterFirstName(String firstName){
        $(FIRST_NAME_FIELD).type(firstName);
    }

    @Step("Input surname")
    public void enterSurname(String surname){
        $(SURNAME_FIELD).type(surname);
    }

    @Step("Input email")
    public void enterEmail(String email){
        $(EMAIL_FIELD).type(email);
    }

    @Step("Input password")
    public void enterPassword(String password){
        $(PASSWORD_FIELD).type(password);
    }

    @Step("Input country")
    public void enterCountry(String country){
        $(COUNTRY_FIELD).type(country);
    }

    @Step("Input city")
    public void enterCity(String city){
        $(CITY_FIELD).type(city);
    }

    @Step("Agree to terms of service")
    public void agreeToTOS(){
        $(TERMS_OF_SERVICE_CHECKBOX).click();
    }

    @Step("Click on Register button")
    public void clickRegisterButton(){
        $(REGISTER_BUTTON).click();
    }

    @Step("I see welcome message")
    public boolean iSeeWelcomeMessage(){
        return $(LOGGED_IN_BUTTON).isDisplayed();
    }
}
