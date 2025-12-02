import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONEXION {
    public static final String URL = "jdbc:mysql://localhost:3306/acenamac";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static Connection getConecion() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Conectado");
        }
        return connection;
    }
}
