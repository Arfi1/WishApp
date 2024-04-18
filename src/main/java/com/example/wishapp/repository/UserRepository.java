package com.example.wishapp.repository;

import com.example.wishapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    UserService userService;
    public void insert(int id, String email, String name) {
        userService.insert(id, email, name);
    }
}
