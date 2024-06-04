package com.example.singleton.service.impl;

import com.example.singleton.service.DatabaseService;
import com.example.singleton.util.DatabaseConnectionUtil;
import org.springframework.stereotype.Service;

@Service
public class DbServiceImpl implements DatabaseService {
    @Override
    public void executeQuery(String query) {
        DatabaseConnectionUtil.getConnectionString();
        System.out.println("Execute query: " + query);
    }
}
