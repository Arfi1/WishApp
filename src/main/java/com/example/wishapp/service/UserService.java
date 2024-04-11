package com.example.wishapp.service;

import com.example.wishapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void insert(int id, String email, String name) {
        userRepository.insert(id, email, name);
    }
}
