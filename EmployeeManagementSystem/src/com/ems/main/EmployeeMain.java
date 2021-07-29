package com.ems.main;

import com.ems.dto.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.EmployeeServiceImpl;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        // main classes can confirm to EmployeeDAO
        EmployeeService eService = new EmployeeServiceImpl();
        // access to addEmployee method within the EmployeeServiceImpl class
        // not calling the addEmployee directly within EmployeeDAO
        // input them to mySQL database as employees_database.employees_tbl;
        // eService.addEmployee(new Employee(1111, "Michael", "Sales", 28));
        // eService.addEmployee(new Employee(2222, "Casandra", "Technology", 30));
        // eService.addEmployee(new Employee(3333, "Samuel", "Marketing", 25));
        // eService.addEmployee(new Employee(4444, "John", "Accounts", 27));

        // access eService to showAllEmployees method
        List<Employee> employeeList = eService.showAllEmployees();

        System.out.println("     ");
        for (Employee e: employeeList){
            System.out.println(e.getId()+ " : " +e.getName()+ " : " +e.getDept()+ " : " + e.getDaysAttended());
        }
        System.out.println("     ");

        eService.addEmployee(new Employee(4444, "John", "Accounts", 27));
        eService.updateEmployee (new Employee(2222, "Joey", "Musician", 20));
    }
}