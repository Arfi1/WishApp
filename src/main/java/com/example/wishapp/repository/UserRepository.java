package com.example.wishapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void insert(int id, String email, String name) {
        String query = "INSERT INTO movie(userid, email, username)" + "VALUES (?, ?, ?);";
        jdbcTemplate.update(query, id, email, name);
    }
}
