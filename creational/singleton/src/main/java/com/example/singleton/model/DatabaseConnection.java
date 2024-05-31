package com.example.singleton.model;

public class DatabaseConnection {
    private String connectionString;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        initializeConnection();
    }

    private void initializeConnection() {
        System.out.println("Connecting to db with connectionString: " + connectionString);
    }

    public void executeQuery(String query) {
        System.out.println("Execute query: " + query);
    }

    // More responsibilities
    public void addUser(String username, String password) {
        executeQuery("INSERT INTO users (un, pw) VALUES ('" + username + "', '" + password + "')");
    }

    public void updateUserPassword(int userId, String newPassword) {
        executeQuery("UPDATE users SET pw = '" + newPassword + "' WHERE id = " + userId);
    }
}

