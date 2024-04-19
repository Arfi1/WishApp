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
    JdbcTemplate jdbcTemplate;

    public List<Wish> getWishes() {
        String query = "SELECT * FROM Wish;";
        RowMapper rowMapper = new BeanPropertyRowMapper(Wish.class);
        return jdbcTemplate.query(query, rowMapper);
    }

    public Wish getWish(int id) {
        String query = "SELECT * FROM wish WHERE id = ?;";
        RowMapper<Wish> rowMapper = new BeanPropertyRowMapper<>(Wish.class);
        return jdbcTemplate.queryForObject(query, rowMapper, id);
    }

    public void delete(int id) {
        String query = "Delete FROM wish WHERE id = ?";
        jdbcTemplate.update(query, id);
    }

    public void insert(int WishID, String beskrivelse, String title, String billed, String URL) {
        String query = "INSERT INTO wish(WishID, beskrivelse, title, billed, URL)" + "VALUES (?,?,?,?,?);";
        jdbcTemplate.update(query, WishID, beskrivelse, title, billed, URL);
    }

    public void update(int WishID, String title, String beskrivelse, String billed, String URL) {
        String query = "UPDATE Wish SET title = ?," +
                "beskrivelse = ?," +
                "billed = ?," +
                "URL = ?" +
                "WHERE Wishid = ?;";
        jdbcTemplate.update(query, WishID, beskrivelse, title, billed, URL);
    }
}