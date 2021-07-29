package com.ems.exceptions;

public class EmployeeNotFoundException extends Exception{
	private int id;
	
	// constructor
    public EmployeeNotFoundException(int id) {
        this.id = id;
    }
    
    //override
    public String toString(){
        return "Employee Not Found Exception";
    }
}