package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Employee;
import com.pluralsight.conferencedemo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        repository.save(employee);
        return  "Employee Saved..";
    }
    @GetMapping("/getAllEmployees")
    public List<Employee> getAll(){
        return  repository.findAll();
    }
}
