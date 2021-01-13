package employeeexception;

import exception.InvalidAgeException;
import exception.InvalidNameException;
import exception.EmployeeSalaryException;

public class employeecheckimpl implements employeecheck {
	
	private String fname="";
	private String lname="";
	public void checkAge(int age) throws InvalidAgeException
	{
		if(age<15)
		{
			throw new InvalidAgeException("Invalid Age");
		}
		else
			System.out.println("Age is valid");
	}
	public void checkName(String name) throws InvalidNameException
	{
		String[] s=name.split(" ");
	;
		///lname=s[1];
	    if(s.length!=2)
		//if(name1.isEmpty() && name2.isEmpty())
		{
			throw new InvalidNameException("Give both fname and lname.");
		}
		else
			System.out.println("Name is valid");
	}
	public void checkSalary(float salary) throws EmployeeSalaryException
	{
		if(salary<3000)
		{
			throw new EmployeeSalaryException("Exception raised.");
		}
		else
			System.out.println("Salary is valid");

	}

}
