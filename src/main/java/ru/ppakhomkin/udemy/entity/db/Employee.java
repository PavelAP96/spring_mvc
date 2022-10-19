package ru.ppakhomkin.udemy.entity.db;


import ru.ppakhomkin.udemy.validation.Email;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "employees")
public class Employee {

//    private final Map<String, String> departments = new HashMap<>() {{
//        put("IT", "IT");
//        put("HR", "HR");
//    }};
//
//    private final Map<String, String> carBrands = new HashMap<>() {{
//        put("BMW", "BMW");
//        put("MB", "Mercedez - Benz");
//    }};
//
//    private final Map<String, String> languages = new HashMap<>() {{
//        put("EN", "EN");
//        put("DE", "DE");
//    }};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @Size(min = 4, message = "Min size = 4")
    private String name;

    @Column(name = "surname")
    @NotBlank(message = "can not be blanc")
    private String surname;

    @Column(name = "salary")
    @Min(value = 500, message = "min 500")
    @Max(value = 1000, message = "max 1000")
    private int salary;

    @Column(name = "department")
    private String department;

//    private String carBrand;
//
//    private String[] languagesArray;

//    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "not correct phone")
//    private String telephone;
//
//    @Email
//    private String email;

    public Employee() {
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //    public String getCarBrand() {
//        return carBrand;
//    }
//
//    public void setCarBrand(String carBrand) {
//        this.carBrand = carBrand;
//    }
//
//    public String[] getLanguagesArray() {
//        return languagesArray;
//    }
//
//    public void setLanguagesArray(String[] languagesArray) {
//        this.languagesArray = languagesArray;
//    }

//    public Map<String, String> getDepartments() {
//        return departments;
//    }
//
//    public Map<String, String> getCarBrands() {
//        return carBrands;
//    }
//
//    public Map<String, String> getLanguages() {
//        return languages;
//    }

//    public String getTelephone() {
//        return telephone;
//    }
//
//    public void setTelephone(String telephone) {
//        this.telephone = telephone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
}
