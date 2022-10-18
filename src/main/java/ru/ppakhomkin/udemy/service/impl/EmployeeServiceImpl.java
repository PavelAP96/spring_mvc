package ru.ppakhomkin.udemy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ppakhomkin.udemy.dao.EmployeeDao;
import ru.ppakhomkin.udemy.entity.Employee;
import ru.ppakhomkin.udemy.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    @Transactional
    public Employee getById(int id) {
        return employeeDao.getById(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        employeeDao.delete(id);
    }
}
