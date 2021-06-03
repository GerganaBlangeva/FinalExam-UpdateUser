package updateuser.rest.suites;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import updateuser.rest.models.User;

public class RegistrationRest extends AbstractRestClient {
    @Step("I make successful registration")
    public void createNewUser() {

        User user = new User();
        user.setFirstName("Ivan");
        user.setSurName("Ivanov");
        user.setAdmin(false);
        user.setCity("Sofia");
        user.setCountry("Bulgaria");
        user.setEmail(RandomEmailGenerator.randomEmail());
        user.setPassword("123456");
        user.setTitle("Mr.");

        Response response = SerenityRest
                .rest()
                .body(user)
                .contentType(ContentType.JSON)
                .when()
                .post(getRestBaseUrl() + getRestUsersEndpoint());

        response
                .then()
                .statusCode(200);
    }
}
