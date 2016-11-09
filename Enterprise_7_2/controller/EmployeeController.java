package com.ua.homework_7_2.controller;

import org.springframework.transaction.annotation.Transactional;
import com.ua.homework_7_1.hibernate.model.Employee;
import com.ua.homework_7_1.hibernate.model.Position;
import com.ua.homework_7_1.hibernate.model.dao.EmployeeDao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeController {
        
private EmployeeDao employeeDao;

    @Transactional
    public void createEmployee() {
        Set<Employee> employees = new HashSet<Employee>(employeeDao.findAll());

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Fedor");
        employee.setSurname("Fon Leeb");
        employee.setPosition(Position.Director);
        employee.setPhoneNumber("123123132");
        employee.setSalary(50000F);

        if (!employees.contains(employee)) {
            employeeDao.save(employee);
        }
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    @Transactional
    public Employee getEmployeesByName(String name) {
        return employeeDao.findByName(name);
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
