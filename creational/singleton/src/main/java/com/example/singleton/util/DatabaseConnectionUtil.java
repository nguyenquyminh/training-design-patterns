package com.example.singleton.util;

public class DatabaseConnectionUtil {

    private static final String connectionString;

    static {
        connectionString = "jdbc:mysql://localhost:3306/myDb";
        System.out.println("Connecting to db with connectionString: " + connectionString);
    }

    public static String getConnectionString() {
        return connectionString;
    }
}
