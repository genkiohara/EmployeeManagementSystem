package com.ems.business;

import com.ems.dto.Employee;

public class ContractEmployeeSalaryCalculator extends SalaryCalculator {
    @Override
    public void calculateNetSalary(Employee e, int actualSalary) {

        int grossSalary = getGrossSalary(e, actualSalary);
        int taxDeductions = 800;
        int netSalary = grossSalary - taxDeductions;

        System.out.println("Contract Employee Salary Details");
        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Department: " + e.getDept());
        System.out.println("==============================");
        System.out.println("Gross Salary: $" +grossSalary);
        System.out.println("Net Salary: $" + netSalary);
        System.out.println("Deductions: $"+ taxDeductions);
    }
}