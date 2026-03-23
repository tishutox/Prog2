package de.tha.prog2.airport.staff;

public class FlightAttendant extends Employee {
	
	private boolean isLeadAttendant;
	
	public FlightAttendant(String lastName, String firstName) {
		
		super(lastName, firstName, 3500);
		
		isLeadAttendant = false;
	}
	
	public void promote() {
		if(isLeadAttendant == false) {
			isLeadAttendant = true;
			
			System.out.println("Max Mustermann promoted to lead flight attendant.");
		}
		
		else {
			System.out.println("Max Mustermann is already a lead flight attendant.");
		}
	}
	
	public double calculateSalary() {
		if(isLeadAttendant == true) {
			baseSalary = 4025;
		}
		
		return baseSalary;
	}
	
}
