package com.ua.homework_7_1.controller;

import org.springframework.transaction.annotation.Transactional;
import com.ua.homework_7_1.hibernate.model.Dish;
import com.ua.homework_7_1.hibernate.model.DishCategory;
import com.ua.homework_7_1.hibernate.model.dao.DishDao;

import java.util.List;
import java.util.Set;

public class DishController {
        private DishDao dishDao;

    @Transactional
    public void createDish() {

        Set<Dish> dishes;

        Dish dish = new Dish();
        dish.setName("Borch");
        dish.setCategory(DishCategory.MAIN);
        dish.setPrice(10.00F);
        dish.setWeight(350F);

        dishDao.save(dish);}


    @Transactional
    public List<Dish> getAllDishes() {
        return dishDao.findAll();
    }

    @Transactional
    public Dish getDishByName(String name) {
        return dishDao.findByName(name);
    }

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

}

