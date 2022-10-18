package ru.ppakhomkin.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ppakhomkin.udemy.entity.Employee;
import ru.ppakhomkin.udemy.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/all")
    public String allEmps(Model model) {
        model.addAttribute("allEmps", employeeService.getAll());
        return "all-emps-view";
    }

    @RequestMapping("/add")
    public String addEmp(Model model) {
        model.addAttribute("employee", new Employee());
        return "create-emp-view";
    }

    @RequestMapping("/save")
    public String saveEmp(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/emp/all";
    }

    @RequestMapping("/update")
    public String updateEmp(@RequestParam("empId") int id, Model model) {
        model.addAttribute("employee", employeeService.getById(id));
        return "create-emp-view";
    }

    @RequestMapping("/delete")
    public String deleteEmp(@RequestParam("empId") int id) {
        employeeService.delete(id);
        return "redirect:/emp/all";
    }
}
