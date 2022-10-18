package ru.ppakhomkin.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ppakhomkin.udemy.entity.Employee;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class AppController {

    @RequestMapping("/first")
    public String getFirstView() {
        System.out.println("We entered controller!!!!!!!!!!!!!!!");
        return "first";
    }

    @RequestMapping("/details")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "write-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showDetails(HttpServletRequest request, Model model) {
//        String empName = "Mr." + request.getParameter("empName");
//        model.addAttribute("name",empName);
//        return "show-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showDetails(@RequestParam("empName") String empName, Model model) {
//        model.addAttribute("name","Mr." + empName);
//        return "show-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "write-details-view";
        return "show-details-view";
    }
}