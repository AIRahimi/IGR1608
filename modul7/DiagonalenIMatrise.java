package modul7;

import java.util.Scanner;

public class DiagonalenIMatrise {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double matrise[][] = new double[4][4];
		int rad = 4, kolonne = 4;
		
		System.out.println("Oppgi en "+ rad + "x" + kolonne + " matrise rad for rad:");
		for (int i = 0; i < rad; i++) {
			for (int j = 0; j < kolonne; j++) {
				matrise[i][j] = input.nextDouble();
			}
		}
		double sum = summerDiagonal(matrise, rad, kolonne);
		System.out.printf("Summen av tall i diagonalen er: %18.2f\n", sum);
		System.out.printf("Gjennomsnittet av tall i diagonalen er: %10.2f", sum/rad);
	}
	
	public static double summerDiagonal(double[][] matrise, int rad, int kolonne) {
		int sum = 0;
		for (int i = 0; i < rad; i++) {
			for (int j = 0; j < kolonne; j++) {
				if (i == j)
					sum += matrise[i][j];
			}
		}
		return sum;
	}
	
	public static void printMatrise(double[][] matrise) {
	    for (int i = 0; i < matrise.length; i++) {
	    	for (int j = 0; j < matrise[i].length; j++) {
	    		System.out.print(matrise[i][j] + " ");
	    	}
	    	System.out.println( );
    	}
	}
}
