package com.demo.swagger.service;

import com.demo.swagger.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Optional<Employee> findById(Long id);
    Optional<Employee> findByUserName(String userName);

    Employee update(Employee employee);

    Employee save(Employee employee);
    void delete(Long id);

}
