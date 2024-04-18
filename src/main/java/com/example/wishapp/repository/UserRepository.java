package com.example.wishapp.repository;

import com.example.wishapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findAll() {
        String query = "SELECT * FROM Users";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return jdbcTemplate.query(query, rowMapper);
    }

    public User findById(int id) {
        String query = "SELECT * FROM Users WHERE UserID = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return jdbcTemplate.queryForObject(query, rowMapper, id);
    }

    public void save(User user) {
        String query = "INSERT INTO Users (UserName, Password, Email) VALUES (?, ?, ?)";
        jdbcTemplate.update(query, user.getUserName(), user.getPassword(), user.getEmail());
    }

    public void update(User user) {
        String query = "UPDATE Users SET UserName = ?, Password = ?, Email = ? WHERE UserID = ?";
        jdbcTemplate.update(query, user.getUserName(), user.getPassword(), user.getEmail(), user.getUserID());
    }

    public void deleteById(int id) {
        String query = "DELETE FROM Users WHERE UserID = ?";
        jdbcTemplate.update(query, id);
    }
}