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

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "AGE")
    private int age;

    @Column(name = "PASSWORD")
    private int password;


    @Column(name= "Username")
    private String username;


    public Employee() {
        super();
    }

    public Employee(String name, String lastname, int age, int password, String username) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.password = password;
        this.username = username;
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




    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username= username;
    }
}



