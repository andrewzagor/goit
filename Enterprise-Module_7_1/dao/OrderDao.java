package com.ua.homework_7_1.DAO;

public interface OrderDao {
    
    void save(Order order);

    List<Order> findAllOrders();
}
