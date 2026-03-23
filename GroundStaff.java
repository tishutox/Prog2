package de.tha.prog2.airport.staff;

public class GroundStaff extends Employee {
	
	private int level;
	private Department department;
	private int overtimeHours;
	
	public GroundStaff(String lastName, String firstName, Department department) {
		super(lastName, firstName, department.getBaseSalary());
		
		this.department = department;
	}
	
	public double calculateSalary() {
		double ueber =  baseSalary * (overtimeHours / 160.0);
		double salary = baseSalary;
		double ergebnis = ueber + salary;
		
		return ergebnis;
	}
	
	public void changeDepartment(Department department) {
		System.out.format("Max Mustermann changed department from %s to %s.", this.department, department);
		System.out.println();
			
			this.department = department;
			
			baseSalary = department.getBaseSalary();
			
		
		
		level = 0;
	}
	
	public void addExtraTime() {
		overtimeHours++;
	}
	
	public void addExtraTime(int hours) {
		overtimeHours += hours;
	}
	
	public void promote() {
		if(department == Department.CHECK_IN && level < 3) {
			if(level == 0) {
				System.out.println("Max Mustermann promoted to level 1.");
				level++;
				baseSalary *= 1.05;
			}
			
			else if(level == 1) {
				System.out.println("Max Mustermann promoted to level 2.");
				level++;
				baseSalary *= 1.05;
			}
			
			else if(level == 2) {
				System.out.println("Max Mustermann promoted to level 3.");
				level++;
				baseSalary *= 1.05;
			}
		}
		
		else if(department == Department.SECURITY && level < 3) {
			if(level == 0) {
				System.out.println("Max Mustermann promoted to level 1.");
				level++;
				baseSalary *= 1.05;
			}
			
			else if(level == 1) {
				System.out.println("Max Mustermann promoted to level 2.");
				level++;
				baseSalary *= 1.05;
			}
			
			else if(level == 2) {
				System.out.println("Max Mustermann promoted to level 3.");
				level++;
				baseSalary *= 1.05;
			}
		}
		
		else if(department == Department.HANDLING && level < 3) {
			if(level == 0) {
				System.out.println("Max Mustermann promoted to level 1.");
				level++;
				baseSalary *= 1.05;
			}
			
			else if(level == 1) {
				System.out.println("Max Mustermann promoted to level 2.");
				level++;
				baseSalary *= 1.05;
			}
			
			else if(level == 2) {
				System.out.println("Max Mustermann promoted to level 3.");
				level++;
				baseSalary *= 1.05;
			}
		}
		
		else if(department == Department.TECHNICAL && level < 3) {
			if(level == 0) {
				System.out.println("Max Mustermann promoted to level 1.");
				level++;
				baseSalary *= 1.05;
			}
			
			else if(level == 1) {
				System.out.println("Max Mustermann promoted to level 2.");
				level++;
				baseSalary *= 1.05;
			}
			
			else if(level == 2) {
				System.out.println("Max Mustermann promoted to level 3.");
				level++;
				baseSalary *= 1.05;
			}
		}
		
		else {
			System.out.println("Max Mustermann cannot be promoted further.");
		}
	}
	
	public static void main(String[] args) {
		GroundStaff sta = new GroundStaff("Mustermann", "Max", Department.CHECK_IN);
		
		System.out.println(sta);
		sta.addExtraTime();
		System.out.println(sta.overtimeHours);
		sta.addExtraTime(7);
		System.out.println(sta.overtimeHours);
		
		
		sta.changeDepartment(Department.SECURITY);
		System.out.println(sta.overtimeHours);
		System.out.println(sta);
		System.out.println(sta.calculateSalary());
	}
	
}
