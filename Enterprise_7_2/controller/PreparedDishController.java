package com.ua.homework_7_2.controller;

import com.ua.homework_7_2.DAO.*;
import com.ua.homework_7_2.domain.IngredientsStorage;

/**
 * Created by ZahornyiAI on 09.11.2016.
 */
public class PreparedDishController {
    private PreparedDishDao preparedDishDao;
    private EmployeeDao employeeDao;
    private OrderDao orderDao;
    private DishDao dishDao;
    private StorageDao storageDao;
    private boolean enoughIngredients;

    @Transactional
    public void insertPreparedDish(PreparedDish preparedDish) {
        preparedDishDao.insertPreparedDish(preparedDish);
    }

    @Transactional
    public List<PreparedDish> getAll() {
        return preparedDishDao.getAll();
    }

    @Transactional
    public void printAll() {
        preparedDishDao.getAll().forEach(System.out::println);
    }

    @Transactional
    public void initPreparedDishes() {

        PreparedDish dish = new PreparedDish();
        dish.setDish(dishDao.findByName("Plov"));
        for (int i = 0; i < dish.getDish().getIngredients().size(); i++) {
            if (!changeQuantityIngredientInStorage(dish.getDish().getIngredients().get(i))) {
                throw new IllegalStateException("Not enough ingredient in the storage [" + dish.getDish().getIngredients().get(i).getIngredient().getTitle() + "]");
            }
        }

        dish.setCook(employeeDao.findByName("Alan"));
        dish.setDate("2016-08-09");
        dish.setOrder(orderDao.getOrderById(1));

        preparedDishDao.insertPreparedDish(dish);

    }

    @Transactional
    private boolean changeQuantityIngredientInStorage(DishIngredient dishIngredient) {
        IngredientsStorage ingredient = storageDao.getIngredientFromStorage(dishIngredient.getIngredient().getTitle());
        System.out.println(ingredient);
        System.out.println(dishIngredient);
        if (ingredient.getQuantity() >= dishIngredient.getQuantity()) {
            storageDao.changeIngredientQuantity(ingredient.getId(), ingredient.getQuantity() - dishIngredient.getQuantity());
            return true;
        }
        return false;
    }

    @Transactional
    public void removeAll() {
        preparedDishDao.removeAll();
    }


    public void setPreparedDishDao(PreparedDishDao preparedDishDao) {
        this.preparedDishDao = preparedDishDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    public void setStorageDao(StorageDao storageDao) {
        this.storageDao = storageDao;
    }
}
