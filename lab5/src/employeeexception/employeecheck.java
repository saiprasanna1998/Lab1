package employeeexception;

import exception.EmployeeSalaryException;
import exception.InvalidAgeException;
import exception.InvalidNameException;

public interface employeecheck {

	void checkAge(int age) throws InvalidAgeException;
	void checkName(String name) throws InvalidNameException;
	void checkSalary(float salary) throws EmployeeSalaryException;
}
