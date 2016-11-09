package com.ua.homework_7_2.DAO;

import com.ua.homework_7_2.domain.PreparedDish;

import java.util.List;

/**
 * Created by ZahornyiAI on 09.11.2016.
 */
public interface PreparedDishDao {
    void insertPreparedDish(PreparedDish preparedDish);
    List<PreparedDish> getAll();
    void removeAll();
}
