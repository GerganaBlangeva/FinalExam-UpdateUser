package com.endava.ui.locators;

import org.openqa.selenium.By;

public class WebElements {
    public static class LogIn {
        public static By USERNAME_FIELD = By.cssSelector("input[name='email']");
        public static By PASSWORD_FIELD = By.cssSelector("input[name='pass']");
        public static By LOGIN_BUTTON = By.cssSelector("button[name='btn-login']");
        public static By LOGGED_IN_BUTTON = By.cssSelector("div#navbar a[role='button']");

    }

    public static class Register{
        public static By FIRST_NAME_FIELD = By.cssSelector("input[name='first_name']");
        public static By SURNAME_FIELD = By.cssSelector("input[name='sir_name']");
        public static By PASSWORD_FIELD = By.cssSelector("input[name='pass']");
        public static By EMAIL_FIELD  = By.cssSelector("input[name='email']");
        public static By COUNTRY_FIELD = By.cssSelector("input[name='country']");
        public static By CITY_FIELD = By.cssSelector("input#city");
        public static By TERMS_OF_SERVICE_CHECKBOX = By.cssSelector("input#TOS");
        public static By REGISTER_BUTTON_HOMEPAGE = By.cssSelector("a[name='btn-login']");
        public static By REGISTER_BUTTON = By.cssSelector("button#reg");
    }
}
