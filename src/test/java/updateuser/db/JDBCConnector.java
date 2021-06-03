package updateuser.db;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import java.sql.*;
public class JDBCConnector {

    EnvironmentVariables environmentVariables;
    private Connection connection;
    public JDBCConnector() throws SQLException {
        environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        String localUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("database.local.url");
        String userName = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("database.local.username");
        String password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("database.local.password");
        connection = DriverManager.getConnection(localUrl, userName, password);
    }

    public Statement getStatement() throws SQLException {
        return connection.createStatement();
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }
}