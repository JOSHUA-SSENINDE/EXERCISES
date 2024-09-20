import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class databaseJ {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/agriapp"; // db name
        String user = "root"; // db username
        String password = "Htp256@age"; // db password

        try {
            // Loading JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing the connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Creating a statement
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Users");

            // Process the result set
            while (resultSet.next()) {
                System.out.println("Column1: " + resultSet.getString("column1"));
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JBDC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}

    

