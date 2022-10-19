package ru.ppakhomkin.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ppakhomkin.udemy.entity.Employee;
import ru.ppakhomkin.udemy.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmps(){
        return employeeService.getAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmpById(@PathVariable int id) {
        return employeeService.getById(id);
    }
}
