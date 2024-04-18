package com.example.wishapp.repository;

import com.example.wishapp.model.Wish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WishRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Wish> getWishes() {
        String query = "SELECT * FROM wish;";
        RowMapper<Wish> rowMapper = new BeanPropertyRowMapper<>(Wish.class);
        return jdbcTemplate.query(query, rowMapper);
    }

    public Wish getWish(int id) {
        String query = "SELECT * FROM wish WHERE wishid = ?;";
        RowMapper<Wish> rowMapper = new BeanPropertyRowMapper<>(Wish.class);
        return jdbcTemplate.queryForObject(query, rowMapper, id);
    }

    public void deleteById(int id) {
        String query = "DELETE FROM wish WHERE wishid = ?";
        jdbcTemplate.update(query, id);
    }

    public void save(Wish wish) {
        String query = "INSERT INTO wish(name, description,)" +
                "VALUES (?,?,?);";
        jdbcTemplate.update(query, wish.getName(), wish.getDescription());
    }

    public List<Wish> findAll() {
        String query = "SELECT * FROM wish;";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Wish.class));
    }
}