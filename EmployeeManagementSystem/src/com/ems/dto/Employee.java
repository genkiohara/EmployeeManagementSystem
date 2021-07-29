package com.ems.dto;


//Employee - Data Transfer Object

public class Employee {
    private int id;
    private String name;
    private String dept;
    private int daysAttended;

    public Employee(int id, String name, String dept, int daysAttended) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.daysAttended = daysAttended;
    }

    public Employee(){
        super();
    }

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }

    
}
