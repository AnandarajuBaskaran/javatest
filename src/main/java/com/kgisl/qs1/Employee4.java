package com.kgisl.qs1;

// Demonstrate Constructor Chaining for the following class
// Class Employee{
// int empid;
// String name;
// float salary;

import java.util.*;



/**
 * Ex4
 */
class Employee4
{   
    
    public String Name;
    public int Salary;
    public int empid;


    public Employee4()
    {
    
        this("Anand");
    }

    public Employee4(String name)
    {
    	this(name, 22244);
    }
    public Employee4(String name, int sal)
    {
    	
    	this(sal, name, 1000);
    }
    public Employee4(int id,String name, int sal)
    {
    	this.Name=name;
    	this.Salary=sal;
    	this.empid= id;
    }

    void disp() {
    	System.out.println("Employee EmpId: "+empid);
    	System.out.println("Employee Name: "+Name);
    	System.out.println("Employee Salary: "+Salary);
    }
    public static void main(String[] args)
    {
        Employee4 obj = new Employee4();
        obj.disp();
    }
}