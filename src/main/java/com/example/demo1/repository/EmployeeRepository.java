package com.example.demo1.repository;

import java.lang.*;
import com.example.demo1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // insert method
    //Employee insert(Employee employee);
    @Query("SELECT COUNT(username) FROM Employee WHERE username = ?1 AND password = ?2 ")
    public int login(String username, int password) ;


    }

