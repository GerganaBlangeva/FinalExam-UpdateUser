package updateuser.rest.suites;

import net.serenitybdd.rest.SerenityRest;
import updateuser.rest.models.User;
import updateuser.rest.suites.AbstractRestClient;

public class DeleteRest extends AbstractRestClient {
    public void delete(User user) {
        SerenityRest.rest()
                .when()
                .delete(getRestBaseUrl()+getRestUsersEndpoint() + "/" + user.getId())
                .then()
                .statusCode(200);
    }
}
