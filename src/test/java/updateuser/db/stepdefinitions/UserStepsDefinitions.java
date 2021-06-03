package updateuser.db.stepdefinitions;
import updateuser.db.JDBCConnector;
import updateuser.db.steps.UserSteps;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

import java.sql.SQLException;

public class UserStepsDefinitions {

    @Steps
    JDBCConnector jdbcConnector;
    @Steps
    UserSteps userSteps;
    @After(value = "@db")
    public void closeDriver() throws SQLException {
        jdbcConnector.closeConnection();
    }

    @Given("I get all existing User data by email {string}")
    public void iGetAllExistingUserDataByEmail(String email) throws SQLException {
        userSteps.getUserDetailsByEmail(email);
    }
}