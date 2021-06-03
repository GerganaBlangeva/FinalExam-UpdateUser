package updateuser.rest.suites;

import updateuser.rest.models.User;
import updateuser.rest.suites.AbstractRestClient;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class LogInRest extends AbstractRestClient {


    public void logIn(User user) {
        String loginEndpoint = getRestLoginEndpoint();
        SerenityRest.rest()
                .body("{\n" +
                        "      \"email" + user.getEmail() + "\n " +
                        "      \"password\": \"123456\"\n" +
                        "   }")
                .contentType(ContentType.JSON)
                .when()
                .post(getRestBaseUrl()+loginEndpoint)
                .then()
                .statusCode(200);
    }

}
