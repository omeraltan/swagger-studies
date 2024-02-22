package com.demo.swagger.controller;

import com.demo.swagger.entity.Employee;
import com.demo.swagger.repository.EmployeeRepository;
import com.demo.swagger.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Swagger documentation link: http://localhost:8080/swagger-ui.html#/
 * Swagger editor link       : https://editor.swagger.io/
 * Api docs                  : http://localhost:8080/v2/api-docs
 */

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

    @GetMapping("{id}")
    @ApiOperation(value = "Employee information method with id")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable(value = "id") Long id){
        Optional<Employee> employee = service.findById(id);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/username/{userName}")
    @ApiOperation(value = "Employee information method with name attribute")
    public ResponseEntity<Optional<Employee>> getEmployeeWithName(@PathVariable(value = "userName") String userName){
        Optional<Employee> employee = service.findByUserName(userName);
        return ResponseEntity.ok(employee);
    }

    @PutMapping("{id}")
    @ApiOperation(value = "Employee update method")
    public ResponseEntity<Optional<Employee>> updateEmployee(@PathVariable(value = "id") final Long id, @RequestBody Employee employee){
        return ResponseEntity.ok(Optional.ofNullable(service.update(employee)));
    }

    @PostMapping
    @ApiOperation(value = "Employee create method")
    public ResponseEntity<Optional<Employee>> createEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(Optional.ofNullable(service.save(employee)));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Employee delete method")
    public ResponseEntity<Optional<Employee>> deleteEmployee(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
