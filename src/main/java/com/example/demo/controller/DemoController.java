package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/v1/employee")
    public ResponseEntity<List<Employee>> getEmployee(){
       List<Employee> employees= demoService.getEmployee();
       return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }
}
