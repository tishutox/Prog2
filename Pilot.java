package de.tha.prog2.airport.staff;

public class Pilot extends Employee {
	
	private Rank rank;
	
	public Pilot(String lastName, String firstName, Rank rank) {
		super(lastName, firstName, rank.getBaseSalary());
		
		this.rank = rank;
	}
	
	public void promote() {
		if(rank == Rank.COPILOT) {
			rank = Rank.FIRST_OFFICER;
			System.out.println("Max Mustermann promoted to FIRST_OFFICER.");
		}
		
		else if(rank == Rank.FIRST_OFFICER) {
			rank = Rank.CAPTAIN;
			System.out.println("Max Mustermann promoted to CAPTAIN.");
		}
		
		else {
			System.out.println("Max Mustermann is already at highest rank.");
		}
	}
	
	public double calculateSalary() {
		if(rank == Rank.FIRST_OFFICER) {
			baseSalary = 7000;
		}
		
		else if(rank == Rank.CAPTAIN) {
			baseSalary = 9000;
		}
		
		return baseSalary;
	}
	
}
