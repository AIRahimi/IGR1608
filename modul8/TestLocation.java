package modul8;

import java.util.Scanner;

public class TestLocation {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Oppgi antall rader og kolonner: ");
		int row = input.nextInt(), column = input.nextInt();
		double[][] array = new double[row][column];
		
		System.out.println("Skriv inn verdier i arrayet: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Største verdien i arrayet er på (" 
		+ locateLargest(array).row + ", "+ locateLargest(array).column
		+ ") som er på " + locateLargest(array).maxValue);
		
		input.close();
	}
	
	
	private static Location locateLargest(double[][] a) {
		Location location = new Location();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > location.maxValue) {
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
				}
			}
		}
		return location;
	}
	
}

	class Location {
		public int row;
		public int column;
		public double maxValue;
		
	}