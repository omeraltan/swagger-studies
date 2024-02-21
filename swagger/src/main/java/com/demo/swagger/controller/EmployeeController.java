package com.demo.swagger.controller;

import com.demo.swagger.entity.Employee;
import com.demo.swagger.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Api(value = "Employee Api documentation")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping
    @ApiOperation(value = "Employee List Method")
    public ResponseEntity<List<Employee>> getAll(){
        List<Employee> employeeList = service.findAll();
        return ResponseEntity.ok(employeeList);
    }


}
