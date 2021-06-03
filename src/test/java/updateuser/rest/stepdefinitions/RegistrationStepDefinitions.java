package updateuser.rest.stepdefinitions;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import updateuser.rest.suites.AbstractRestClient;
import updateuser.rest.suites.RegistrationRest;

public class RegistrationStepDefinitions extends AbstractRestClient {

    @Steps
    RegistrationRest registrationRest;

    @Given("I make successful registration")
    public void iMakeSuccessfulRegistrationInTheBackend() {
        registrationRest.createNewUser();

    }
}
