package ru.ppakhomkin.udemy.service;

import ru.ppakhomkin.udemy.entity.db.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    void save(Employee employee);

    Employee getById(int id);

    void delete(int id);
}
