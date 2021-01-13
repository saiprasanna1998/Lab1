package main;


import java.util.Scanner;

import employeeexception.employeecheck;
import employeeexception.employeecheckimpl;
import exception.EmployeeSalaryException;
import exception.InvalidAgeException;
import exception.InvalidNameException;

public class test {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	employeecheck ec=new employeecheckimpl();
	System.out.println("Enter your age:");
	int age=sc.nextInt();
	
	/*System.out.println("Enter your fname:");
	String name1=sc.next();
	System.out.println("Enter your lname:");
	String name2=sc.next();*/
	
	System.out.println("Enter your name:");
	String name=sc.next();
	System.out.println("Enter your salary:");
	float salary=sc.nextFloat();
	try {
		ec.checkAge(age);
	}catch(InvalidAgeException e)
	{
		System.out.println(e.getMessage());
	}
	try {
		ec.checkName(name);
	}catch(InvalidNameException e)
	{
		System.out.println(e.getMessage());
	}
	try {
		ec.checkSalary(salary);
	}catch(EmployeeSalaryException e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
