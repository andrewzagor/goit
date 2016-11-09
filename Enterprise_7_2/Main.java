package com.ua.homework_7_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ua.homework_7_1.hibernate.controllers.DishController;
import com.ua.homework_7_1.hibernate.controllers.EmployeeController;
import com.ua.homework_7_1.hibernate.controllers.OrderController;

import java.util.Arrays;

public class Main {
        private EmployeeController employeeController;
    private DishController dishController;
    private OrderController orderController;

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Main main = applicationContext.getBean(Main.class);
        main.start();

    }

    public void init() {
        if (reInit) {
            preparedDishController.removeAll();
            orderController.removeAll();
            dishController.removeAll();
            employeeController.removeAll();
            storageController.removeAll();
            ingredientController.removeAll();

            ingredientController.initIngredients();
            storageController.initStorage();
            employeeController.initEmployee();
            dishController.initDishes();
            orderController.initOrders();
            preparedDishController.initPreparedDishes();
        }
    }

    private void start() {

        employeeController.createEmployee();
        dishController.createDish();
        orderController.createOrder("John", Arrays.asList("Borch", "Deer"), 1);
        orderController.createOrder("John", Arrays.asList("Soup", "Tekilla"), 2);
        orderController.createOrder("John", Arrays.asList("Plov", "Rom"), 3);

        orderController.printAllOrders();

    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }

    public void setOrderController(OrderController orderController) {
        this.orderController = orderController;
    }
}
