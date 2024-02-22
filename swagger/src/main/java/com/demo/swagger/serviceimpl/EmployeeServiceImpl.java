package com.demo.swagger.serviceimpl;

import com.demo.swagger.entity.Employee;
import com.demo.swagger.repository.EmployeeRepository;
import com.demo.swagger.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repository;
    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<Employee> findByUserName(String userName) {
        return repository.findByUserName(userName);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
