package com.ua.homework_7_1.DAO;

public class DishDao {
    
    void save(Dish dish);

    List<Dish> findAll();

    Dish findByName(String name);
}
