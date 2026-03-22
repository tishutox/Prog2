package de.tha.prog2.task01;

public class Task01 {

	public static String createChessBoard(int i, int j) {
		StringBuilder result = new StringBuilder();
		
		for(int n = 0; n < i; n++) {
			for(int m = 0; m < j; m++) {
				if(n % 2 != 0 && m % 2 != 0) {
					result.append("X");
				}
				
				else if(n % 2 != 0 && m % 2 == 0) {
					result.append("O");
				}
				
				else if(n % 2 == 0 && m % 2 != 0) {
					result.append("O");
				}
				
				else if(n % 2 == 0 && m % 2 == 0) {
					result.append("X");
				}
				
				if(m <= j - 2) {
					result.append(" ");
				}
			}
			
			result.append("\n");
		}
		
		return result.toString();
	}
	
}
