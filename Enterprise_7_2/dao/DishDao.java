package com.ua.homework_7_2.DAO;

import com.ua.homework_7_2.domain.Dish;

import java.util.List;

public interface DishDao {
    
    void save(Dish dish);

    List<Dish> findAll();

    Dish findByName(String name);
}
