package com.demo.swagger.serviceimpl;

import com.demo.swagger.entity.Employee;
import com.demo.swagger.repository.EmployeeRepository;
import com.demo.swagger.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repository;
    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }
}
