package ru.ppakhomkin.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ppakhomkin.udemy.entity.db.Employee;
import ru.ppakhomkin.udemy.entity.message.EmployeeExceptionInfo;
import ru.ppakhomkin.udemy.exceptions.NoSuchEmployeeException;
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
        Employee employee = employeeService.getById(id);
        if (employee == null)
            throw new NoSuchEmployeeException("No user with id = " + id);
        return employee;
    }

    @PostMapping("/employees")
    public Employee saveEmp(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmp(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<EmployeeExceptionInfo> deleteEmp(@PathVariable int id) {
        if (employeeService.getById(id) == null)
            throw new NoSuchEmployeeException("No user with id = " + id + " to delete him");
        employeeService.delete(id);
        return new ResponseEntity<>(new EmployeeExceptionInfo("Employee with id = " + id + "deleted"), HttpStatus.OK);
    }
}
