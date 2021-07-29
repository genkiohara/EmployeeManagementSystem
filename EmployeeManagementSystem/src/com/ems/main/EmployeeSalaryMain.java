package com.ems.main;

import com.ems.business.ContractEmployeeSalaryCalculator;
import com.ems.business.PermanentEmployeeSalaryCalculator;
import com.ems.dto.Employee;

public class EmployeeSalaryMain {
    public static void main(String[] args) {
        PermanentEmployeeSalaryCalculator pe = new PermanentEmployeeSalaryCalculator();
        pe.calculateNetSalary(new Employee(1234, "Peter", "HR", 30), 9000);

        System.out.println("\n****************************************\n");

        ContractEmployeeSalaryCalculator ce = new ContractEmployeeSalaryCalculator();
        ce.calculateNetSalary(new Employee(4321, "Beth", "Reception", 30),3000 );
    }
}