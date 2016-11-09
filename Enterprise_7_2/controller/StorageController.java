package com.ua.homework_7_2.controller;

import com.ua.homework_7_2.DAO.IngredientDao;
import com.ua.homework_7_2.DAO.StorageDao;
import com.ua.homework_7_2.domain.Ingredient;
import com.ua.homework_7_2.domain.IngredientsStorage;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ZahornyiAI on 09.11.2016.
 */
public class StorageController {
    private StorageDao storageDao;
    private IngredientDao ingredientDao;

    @Transactional
    public void insertIngredientToStorage(IngredientsStorage ingredientsStorage) {
        storageDao.insertIngredientToStorage(ingredientsStorage);
    }

    @Transactional
    public void deleteIngredientFromStorage(int id) {
        storageDao.deleteIngredientFromStorage(id);
    }

    @Transactional
    public void changeIngredientQuantity(int id, float newQuantity) {
        storageDao.changeIngredientQuantity(id, newQuantity);
    }

    @Transactional
    public IngredientsStorage getIngredientFromStorage(String name) {
        return storageDao.getIngredientFromStorage(name);
    }

    @Transactional
    public List<IngredientsStorage> getAll() {
        return storageDao.getAll();
    }

    @Transactional
    public Ingredient getIngredientByName(String name) {
        return storageDao.getIngredientByName(name);
    }

    @Transactional
    public void initStorage() {
        List<Ingredient> ingredients = ingredientDao.getAll();
        ingredients.forEach(ingredient -> {
            IngredientsStorage ingredientsStorage = new IngredientsStorage();
            ingredientsStorage.setIngredient(ingredient);
            ingredientsStorage.setQuantity((float)Math.random()*100);
            storageDao.insertIngredientToStorage(ingredientsStorage);
        });
    }

    @Transactional
    public void removeAll() {
        storageDao.removeAll();
    }

    public void setStorageDao(StorageDao storageDao) {
        this.storageDao = storageDao;
    }

    public void setIngredientDao(IngredientDao ingredientDao) {
        this.ingredientDao = ingredientDao;
    }
}
