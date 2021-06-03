package updateuser.rest.suites;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class AbstractRestClient {
    EnvironmentVariables environmentVariables;

    public String getRestBaseUrl() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("rest.base.url");
    }

    public String getRestUsersEndpoint() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("rest.users.endpoint");
    }

    public String getRestLoginEndpoint(){
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("rest.login.endpoint");
    }
}
