package com.example.wishapp.repository;

import com.example.wishapp.model.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public WishList getWishList(int id){
        String query = "SELECT * FROM wishlist WHERE id = ?;";
        RowMapper<WishList> rowMapper = new BeanPropertyRowMapper<>(WishList.class);
        return jdbcTemplate.queryForObject(query, rowMapper, id);
    }
    public void delete(int id) {
        String query = "DELETE FROM wishlist WHERE id = ?";
        jdbcTemplate.update(query, id);
    }

    public void insert(String title, String image, String wish){
        String query = "INSERT INTO wishlist(title, image, wish" +
                "VALUES (?, ?, ?);";
        jdbcTemplate.update(query, title, image, wish);
    }
}
