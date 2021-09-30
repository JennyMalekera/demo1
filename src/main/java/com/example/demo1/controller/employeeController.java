package com.example.demo1.controller;


import com.example.demo1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo1.repository.EmployeeRepository;

import java.awt.*;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Employees")
public class employeeController {

    @Autowired
    public  EmployeeRepository employeeRepository;

    //RestP
    @GetMapping("/all")
    public List<Employee> getEmployees() {

        return this.employeeRepository.findAll();
    }
//create
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee ){

    return this.employeeRepository.save(employee);

    }
//update
    @PutMapping ("/edit/{id}")
    public ResponseEntity<Employee> editEmployee(@PathVariable(value="id") int employeeId,@RequestBody Employee employee ) {
        Employee employee1 = employeeRepository.findById(employeeId).orElseThrow();
        employee1.setName(employee.getName());
        final Employee updatedEmployee = employeeRepository.save(employee1);

        return ResponseEntity.ok(updatedEmployee);
        }


//delete
    @DeleteMapping  ("/delete/{id}")
    public void   deleteEmployee(@PathVariable(value="id") int employeeId) {
        employeeRepository.deleteById(employeeId);

    }




    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Error message")
    public void handleError() {
    }
}

