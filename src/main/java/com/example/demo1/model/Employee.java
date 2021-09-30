package com.example.demo1.model;


import com.example.demo1.repository.EmployeeRepository;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;


    public Employee() {
        super();
    }


    public Employee(String name) {
        super();

        this.name = name;

    }

    //generate getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}