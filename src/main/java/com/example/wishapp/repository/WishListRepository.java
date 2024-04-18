package com.example.wishapp.repository;

import com.example.wishapp.model.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WishListRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<WishList> findAll() {
        String query = "SELECT * FROM Wishlist";
        RowMapper<WishList> rowMapper = new BeanPropertyRowMapper<>(WishList.class);
        return jdbcTemplate.query(query, rowMapper);
    }

    public WishList findById(int id) {
        String query = "SELECT * FROM Wishlist WHERE WishlistID = ?";
        RowMapper<WishList> rowMapper = new BeanPropertyRowMapper<>(WishList.class);
        return jdbcTemplate.queryForObject(query, rowMapper, id);
    }

    public void save(WishList wishList) {
        String query = "INSERT INTO Wishlist (Titel, Billed) VALUES (?, ?)";
        jdbcTemplate.update(query, wishList.getTitle(), wishList.getImage());
    }

    public void update(WishList wishList) {
        String query = "UPDATE Wishlist SET Titel = ?, Billed = ? WHERE WishlistID = ?";
        jdbcTemplate.update(query, wishList.getTitle(), wishList.getImage(), wishList.getWishListID());
    }

    public void deleteById(int id) {
        String query = "DELETE FROM Wishlist WHERE WishlistID = ?";
        jdbcTemplate.update(query, id);
    }
}