package updateuser.rest.suites;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import updateuser.rest.models.User;
import updateuser.rest.suites.AbstractRestClient;

public class UpdateUserRest extends AbstractRestClient {
    public User updateUser(User user) {
        user.setId(user.getId());
        user.setSurName("Plamen");
        user.setFirstName("Ivanov");
        user.setAdmin(false);
        user.setCity("Plovdiv");
        user.setCountry("Bulgaria");
        user.setEmail(user.getEmail());
        user.setPassword("123456");
        user.setTitle("Mr.");

        SerenityRest
                .rest()
                .body(user)
                .contentType(ContentType.JSON)
                .when()
                .put(getRestBaseUrl() + getRestUsersEndpoint())
                .then()
                .statusCode(200);

        return user;
    }
}
