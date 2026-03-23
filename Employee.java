package de.tha.prog2.airport.staff;

import java.util.Locale;

public abstract class Employee {
	
	protected int employeeId;
	protected double baseSalary;
	protected String lastName;
	protected String firstName;
	private static int nextEmployeeId = 1;
	
	public Employee() {
		
	}
	
	public Employee(String lastName, String firstName, double baseSalary) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.baseSalary = baseSalary;
		
		this.employeeId = nextEmployeeId;
		nextEmployeeId++;
	}
	
	public abstract void promote();
	
	public double calculateSalary() {
		return baseSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	@Override
	public String toString() {
		return String.format(Locale.US, "Employee{id=%d, lastName=%s, firstName=%s, baseSalary=%.1f}", getEmployeeId(), lastName, firstName, calculateSalary());
	}
	
	

}
