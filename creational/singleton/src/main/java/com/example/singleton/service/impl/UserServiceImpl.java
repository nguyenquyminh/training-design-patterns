package com.example.singleton.service.impl;

import com.example.singleton.service.DatabaseService;
import com.example.singleton.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final DatabaseService databaseService;

    public UserServiceImpl(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    private final String SELECT_QUERY = "SELECT * FROM users";
    private final String INSERT_QUERY = "INSERT INTO users (name) VALUES ('Quy Minh')";
    private final String UPDATE_QUERY = "UPDATE users SET name = 'Duc Anh' WHERE id = 1";

    @Override
    public void getUsers() {
        this.databaseService.executeQuery(this.SELECT_QUERY);
    }

    @Override
    public void addUser() {
        this.databaseService.executeQuery(this.INSERT_QUERY);
    }

    @Override
    public void updateUser() {
        this.databaseService.executeQuery(this.UPDATE_QUERY);
    }
}
