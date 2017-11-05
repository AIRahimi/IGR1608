package modul7;

import java.util.Scanner;

public class SorterAlleStudenter {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Oppgi antall studenter: ");
		int antallStudenter = input.nextInt();
		
		int [] resultat = new int[antallStudenter];
		String [] navn = new String[antallStudenter];
		
		for(int i = 0; i < antallStudenter; i++) {
			System.out.println("Navn: ");
			navn[i] = input.next();
			System.out.println("Resultat: ");
			resultat[i] = input.nextInt();
		}
		
		selectionSort(resultat, navn);
		
		System.out.printf("Navn       Resultat%n");
		for (int i = 0; i < resultat.length; i++) {
			System.out.printf("%5s %10d%n", navn[i],  resultat[i]);
		}
		input.close();
	}
	
	public static void selectionSort(int[] resultat, String[] navn) {
		for (int i = 0; i < resultat.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < resultat.length; j++) {
				if (resultat[j] < resultat[index]) {
					index = j;
				}
			}
			int minsteResultat = resultat[index];
			resultat[index] = resultat[i];
			resultat[i] = minsteResultat;
			
			String temp = navn[index];
			navn[index] = navn[i];
			navn[i] = temp;
		}
	}

}
