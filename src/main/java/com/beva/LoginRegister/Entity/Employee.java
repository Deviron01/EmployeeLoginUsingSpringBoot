package com.beva.LoginRegister.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="Id", length = 45)
    private Integer Id;

    @Column(name="name", length = 255)
    private String name;

    @Column(name="email", length = 255)
    private String email;

    @Column(name="password", length = 255)
    private String password;

    public Employee(Integer id, String name, String email, String password) {
        Id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Employee() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
