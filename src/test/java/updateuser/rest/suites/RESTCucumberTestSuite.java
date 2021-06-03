package updateuser.rest.suites;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features/rest/",
        glue = "com.endava.rest.stepdefinitions"
)
public class RESTCucumberTestSuite {}
