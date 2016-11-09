package com.ua.homework_7_2.controller;

import org.springframework.transaction.annotation.Transactional;
import com.ua.homework_7_1.controller.hibernate.model.Dish;
import com.ua.homework_7_1.controller.hibernate.model.Order;
import com.ua.homework_7_1.controller.hibernate.model.dao.DishDao;
import com.ua.homework_7_1.controller.hibernate.model.dao.EmployeeDao;
import com.ua.homework_7_1.controller.hibernate.model.dao.OrderDao;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderController {
    private EmployeeDao employeeDao;
    private DishDao dishDao;
    private OrderDao orderDao;

    @Transactional
    public void createOrder(String waiterName, List<String> dishes, int tableNumber) {

        Order order = new Order();
        order.setWaiter(employeeDao.findByName(waiterName));
        order.setDishes(createDishes(dishes));
        order.setTableNumber(tableNumber);
        order.setOrderDate(new Date());

        orderDao.save(order);
    }

    private List<Dish> createDishes(List<String> dishes) {
        List<Dish> result = dishes.stream().map(dishName -> dishDao.findByName(dishName)).collect(Collectors.toList());

        return result;
    }

    @Transactional
    public List<Order> getAllOrders() {
        return orderDao.findAllOrders();
    }

    @Transactional
    public void printAllOrders() {
        getAllOrders().forEach(System.out::println);
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
