package com.ems.business;

import com.ems.dto.Employee;

// a permanent employee has a monthly salary fixed rate
// provident funds 年金？
public class PermanentEmployeeSalaryCalculator extends SalaryCalculator{

    @Override
    public void calculateNetSalary(Employee e, int actualSalary) {

        int grossSalary = getGrossSalary(e, actualSalary);
        int incomeTax = 500;
        int providentFund = 1000;
        int netSalary = grossSalary - (incomeTax + providentFund);

        System.out.println("Permanent Employee Salary Details");
        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Department: " + e.getDept());
        System.out.println("==============================");
        System.out.println("Gross Salary: $" +grossSalary);
        System.out.println("Net Salary: $" + netSalary);
        System.out.println("Deductions: $"+ (incomeTax + providentFund));
    }
}