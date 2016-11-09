package com.ua.homework_7_2.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ZahornyiAI on 09.11.2016.
 */
public class Cook implements Employee {

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "PREPARED_DISH",
            joinColumns = @JoinColumn(name = "COOK_ID"),
            inverseJoinColumns = @JoinColumn(name = "ID")
    )
    @Fetch(FetchMode.JOIN)
    List<PreparedDish> coockedDishes;

    public List<PreparedDish> getCoockedDishes() {
        return coockedDishes;
    }

    public void setCoockedDishes(List<PreparedDish> coockedDishes) {
        this.coockedDishes = coockedDishes;
    }
}
