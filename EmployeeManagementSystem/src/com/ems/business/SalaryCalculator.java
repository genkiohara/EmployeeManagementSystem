// business logic
package com.ems.business;

import com.ems.dto.Employee;

// abstract class for specific functionality 
// that we'll distribute and delegate to respective child classes 
public abstract class SalaryCalculator {

    public int getGrossSalary(Employee e, int actualSalary){
        int grossSalary = 0;
        int perDaySalary = actualSalary/30;

        grossSalary = perDaySalary * e.getDaysAttended();
        return grossSalary;
    }

    public abstract void calculateNetSalary(Employee e, int actualSalary);
}