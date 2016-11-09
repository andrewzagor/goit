package com.ua.homework_7_2.DAO;

import com.ua.homework_7_2.domain.Ingredient;

import java.util.List;

/**
 * Created by ZahornyiAI on 09.11.2016.
 */
public interface IngredientDao {
    void save(Ingredient ingredient);
    Ingredient loadByTitle(String title);
    Ingredient load(int id);
    List<Ingredient> getAll();
    void removeAll();
    void remove(Ingredient ingredient);
}
