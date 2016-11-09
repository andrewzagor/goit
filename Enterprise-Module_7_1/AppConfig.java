package com.ua.homework_7_1;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import com.ua.homework_7_1.controllers.DishController;
import com.ua.homework_7_1.controllers.EmployeeController;
import com.ua.homework_7_1.controllers.OrderController;
import com.ua.homework_7_1.model.dao.DishDao;
import com.ua.homework_7_1.model.dao.EmployeeDao;
import com.ua.homework_7_1.model.dao.OrderDao;
import com.ua.homework_7_1.model.dao.hibernate.HDishDao;
import com.ua.homework_7_1.model.dao.hibernate.HEmployeeDao;
import com.ua.homework_7_1.model.dao.hibernate.HOrderDao;


@Configuration
public class AppConfig {
        @Bean
    Main mainObject(EmployeeController controller, DishController dishController, OrderController orderController) {
        Main main = new Main();
        main.setEmployeeController(controller);
        main.setDishController(dishController);
        main.setOrderController(orderController);
        return main;
    }

    @Bean
    EmployeeController employeeController(EmployeeDao employeeDao) {
        EmployeeController employeeController = new EmployeeController();
        employeeController.setEmployeeDao(employeeDao);
        return employeeController;
    }

    @Bean
    DishController dishController(DishDao dishDao) {
        DishController dishController = new DishController();
        dishController.setDishDao(dishDao);
        return dishController;
    }

    @Bean
    OrderController orderController(EmployeeDao employeeDao, DishDao dishDao, OrderDao orderDao) {
        OrderController orderController = new OrderController();
        controller.setDishDao(dishDao);
        controller.setEmployeeDao(employeeDao);
        controller.setOrderDao(orderDao);
        return orderController;
    }


    @Bean
    OrderDao orderDao(SessionFactory sessionFactory) {
        HOrderDao orderDao = new HOrderDao();
        orderDao.setSessionFactory(sessionFactory);
        return orderDao;
    }
}
