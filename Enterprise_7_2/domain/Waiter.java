package com.ua.homework_7_2.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ZahornyiAI on 09.11.2016.
 */
@Entity
public class Waiter extends Employee {
    /*@OneToMany(*//*fetch = FetchType.LAZY*//*)
    @JoinColumn(name = "ID")
    @Fetch(FetchMode.JOIN)*/
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "ORDERS",
            joinColumns = @JoinColumn(name = "WAITER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ID")
    )
    @Fetch(FetchMode.JOIN)
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
