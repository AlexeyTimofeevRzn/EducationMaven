package ru.education.project.config;

import ru.education.project.constants.DBParams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(DBParams.URL, DBParams.USER, DBParams.PASSWORD);
        }
        return connection;
    }

}
