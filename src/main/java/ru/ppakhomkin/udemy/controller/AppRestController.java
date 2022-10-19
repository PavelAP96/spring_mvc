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

    @ExceptionHandler
    public ResponseEntity<EmployeeExceptionInfo> noSuchEmpExceptionHandler(NoSuchEmployeeException exception) {
        return new ResponseEntity<>(new EmployeeExceptionInfo(exception.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeExceptionInfo> noSuchEmpExceptionHandler(Exception exception) {
        return new ResponseEntity<>(new EmployeeExceptionInfo(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
