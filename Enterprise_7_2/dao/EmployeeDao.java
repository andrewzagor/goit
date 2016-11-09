package com.ua.homework_7_2.DAO;

import com.ua.homework_7_2.domain.Employee;

import java.util.List;

public interface EmployeeDao {
        
    void save(Employee employee);

    Employee load(Long id);

    List<Employee> findAll();

    Employee findByName(String name);

    void remove(Employee employee);
}
