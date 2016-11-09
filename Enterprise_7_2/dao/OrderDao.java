package com.ua.homework_7_2.DAO;

import com.ua.homework_7_2.domain.Order;

import java.util.List;

public interface OrderDao {

    void save(Order order);
    void insertDishInOrder(int orderId, int dishId);
    void deleteDishFromOrder(int orderId, int dishId);
    void deleteOrder(int id);
    void closeOrder(int id);
    List<Order> getOrders(boolean closed);
    Order getOrderById(int id);
    void removeAll();

}
