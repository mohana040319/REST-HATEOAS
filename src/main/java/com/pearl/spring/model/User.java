package com.pearl.spring.model;

import org.springframework.hateoas.ResourceSupport;

public class User extends ResourceSupport {

    private String name;
    private Long salary;


    public User(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
