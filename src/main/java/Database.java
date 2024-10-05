package src.main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Database {

    public Connection establishConnection(String url, String username, String password) {
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established!");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Connection establishConnection(String url, String username) {
        return establishConnection(url, username, null);
    }

    public String select(String column, String table) {
        return "SELECT " + column + " FROM " + table;
    }

    public String select(String[] columns, String table) {

        String columnString = null;

        for (String column : columns) {
            columnString = columnString + column + ", ";
        }

        return "SELECT " + columnString + " FROM " + table;
    }

    public String selectAll(String table) {
        return "SELECT * FROM " + table;
    }

    public Statement createStatement(Connection conn) throws SQLException {
        return conn.createStatement();
    }

    public ResultSet executeQuery(Connection conn, Statement statement, String query) {
        try {
            ResultSet result = statement.executeQuery(query);
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void closeAll(Connection conn, Statement state, ResultSet result) {
        try {
            conn.close();
            state.close();
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
