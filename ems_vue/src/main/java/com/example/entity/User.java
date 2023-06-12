package com.example.entity;

public class User {
    private String id;
    private String name;
    private String path;
    private Double salary;
    private Integer age;

    public User(String id, String name, String path, Double salary, Integer age) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.salary = salary;
        this.age = age;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
