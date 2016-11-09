package com.ua.homework_7_2.DAO;

import com.ua.homework_7_2.domain.Ingredient;
import com.ua.homework_7_2.domain.IngredientsStorage;

import java.util.List;

/**
 * Created by ZahornyiAI on 09.11.2016.
 */
public interface StorageDao {

    void insertIngredientToStorage(IngredientsStorage ingredientsStorage);
    void deleteIngredientFromStorage(int id);
    void changeIngredientQuantity(int id, float newQuantity);
    IngredientsStorage getIngredientFromStorage(String name);
    List<IngredientsStorage> getAll();
    Ingredient getIngredientByName(String name);
    void removeAll();
}
