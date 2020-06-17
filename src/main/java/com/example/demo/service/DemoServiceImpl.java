package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        Employee e = new Employee();
        e.setId(1);
        e.setName("test");
        Employee e1 = new Employee();
        e1.setId(2);
        e1.setName("test1");
        employees.add(e);
        employees.add(e1);

        return employees;
    }
}
