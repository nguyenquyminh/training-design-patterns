package com.example.singleton.util;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;
    private String connectionString;

    private DatabaseConnection() {
        connectionString = "jdbc:mysql://localhost:3306/myDb";
    }

    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    public String getConnectionString() {
        return connectionString;
    }
}
