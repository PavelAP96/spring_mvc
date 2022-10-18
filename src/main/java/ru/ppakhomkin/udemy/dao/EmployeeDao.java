package ru.ppakhomkin.udemy.dao;

import ru.ppakhomkin.udemy.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAll();

    void save(Employee employee);

    Employee getById(int id);

    void delete(int id);
}
