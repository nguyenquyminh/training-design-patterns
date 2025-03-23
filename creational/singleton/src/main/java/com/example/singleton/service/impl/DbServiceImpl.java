package com.example.singleton.service.impl;

import com.example.singleton.service.DatabaseService;
import com.example.singleton.util.DatabaseConnection;
import org.springframework.stereotype.Service;

@Service
public class DbServiceImpl implements DatabaseService {
    @Override
    public void executeQuery(String query) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        System.out.println("Connecting to db with connectionString: "+ connection.getConnectionString());
        System.out.println("Execute query: " + query);
    }
}
