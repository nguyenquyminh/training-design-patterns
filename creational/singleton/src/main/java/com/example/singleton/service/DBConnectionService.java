package com.example.singleton.service;

import com.example.singleton.model.DatabaseConnection;

public class DBConnectionService {

    public void updateDatabase() {
        DatabaseConnection db1 = new DatabaseConnection("jdbc:mysql://localhost:3306/myDb");
        db1.executeQuery("SELECT * FROM users");

        DatabaseConnection db2 = new DatabaseConnection("jdbc:mysql://localhost:3306/myDb");
        db2.executeQuery("INSERT INTO users (name) VALUES ('Quy Minh')");

        DatabaseConnection db3 = new DatabaseConnection("jdbc:mysql://localhost:3306/myDb");
        db3.executeQuery("UPDATE users SET name = 'Duc Anh' WHERE id = 1");
    }
}
