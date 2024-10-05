package src.main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import src.main.java.Database;

public class Main {
    public static void main(String[] args) {
        try {
            Database data = new Database();

            Connection conn = data.establishConnection("jdbc:mysql://localhost:3306/javatosql", "root");
            Statement state = data.createStatement(conn);

            System.out.println("IF you are reading this, a connection has been established!");
            System.out.println(conn);
            String all = data.selectAll("typeOne");
            ResultSet result = data.executeQuery(conn, state, all);

            while (result.next()) {
                String name = result.getString("name");
                int id = result.getInt("id");
                System.out.println("Column Value: " + id + ": " + name);
            }

            data.closeAll(conn, state, result);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Java To Sql 0.1.0");
    }
}