package MYSQL;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class DB {

    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/example";
        String username = "root";
        String password = "root";

        String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();

        try (InputStream input = new FileInputStream(userDirectory + "/src/MYSQL/config.properties")) {

//            Class.forName("com.mysql.jdbc.Driver");

            Properties prop = new Properties();
            // load a properties file
            prop.load(input);


            url = prop.getProperty("db.url");
            username = prop.getProperty("db.username");
            password = prop.getProperty("db.password");

            // get the property value and print it out
            System.out.println(url);
            System.out.println(username);
            System.out.println(password);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM clients")) {

            while (rs.next()) {
                int client_id = rs.getInt("client_id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String telNumber = rs.getString("tel_number");
                String registrationDate = rs.getString("registration_date");
                Client client = new Client(client_id, name, surname, email, registrationDate, telNumber);

                System.out.println(client);

            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

