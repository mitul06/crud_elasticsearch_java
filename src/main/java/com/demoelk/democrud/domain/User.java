package com.demoelk.democrud.domain;

public class User {
    private String id;
    private String name;
    private String branch;
    private String college;
    private String job;
    private int salary;


    public User() {
    }

    public User(String id, String name, String branch, String college, String job, int salary) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.college = college;
        this.job = job;
        this.salary = salary;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}