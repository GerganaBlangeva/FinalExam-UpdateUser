package updateuser.db.steps;
import updateuser.db.JDBCConnector;
import updateuser.rest.models.User;
import net.thucydides.core.annotations.Step;
import java.sql.ResultSet;
import java.sql.SQLException;
public class UserSteps {

    private ResultSet resultSet;
    private final User user = new User();
    JDBCConnector jdbcConnector;
    {
        try {
            jdbcConnector = new JDBCConnector();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Step("Get user details from the DB")
    public User getUserDetailsByEmail(String email) throws SQLException {
        resultSet = jdbcConnector.getStatement().executeQuery("SELECT * FROM db.users WHERE email = '" + email + "'");
        while (resultSet.next()) {
            user.setEmail(resultSet.getString("email"));
            user.setAdmin(resultSet.getBoolean("is_admin"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setSurName(resultSet.getString("sir_name"));
            user.setTitle(resultSet.getString("title"));
            user.setCountry(resultSet.getString("country"));
            user.setCity(resultSet.getString("city"));
            user.setId(resultSet.getInt("id"));
            user.setPassword(resultSet.getString("password"));
        }
        return user;
    }
}