package com.cheer.shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author yangsong
 * @title: IndexDao
 * @data 2019/5/28 11:18
 */
@Repository
public class IndexDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



}
