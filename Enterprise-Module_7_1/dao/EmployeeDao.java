package com.ua.homework_7_1.DAO;

public class EmployeeDao {
        
    void save(Employee employee);

    Employee load(Long id);

    List<Employee> findAll();

    Employee findByName(String name);

    void remove(Employee employee);
}
