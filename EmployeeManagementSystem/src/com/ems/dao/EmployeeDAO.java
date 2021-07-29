package com.ems.dao;

import java.util.List;

import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

//EmployeeDAO - Data Access Object

public interface EmployeeDAO {
    public abstract void addEmployee(Employee e); //e variable
    public abstract void deleteEmployee(int id);
    public abstract Employee findEmployee(Employee e) throws EmployeeNotFoundException;
    public abstract void updateEmployee(Employee e);
    public List<Employee> showAllEmployees();

    public static final String URL = "jdbc:mysql://localhost:3306/employees_database";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "password";
    public static final String Driver_Class = "com.mysql.jdbc.Driver";
}
