package com.example.wishapp.repository;

import com.example.wishapp.model.Wish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WishRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Wish> findAll() {
        return null;
    }

}
