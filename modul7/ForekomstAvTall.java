package modul7;

import java.util.Scanner;

public class ForekomstAvTall {
	
	public static void main (String [] args) {
		int teller [] = new int [100];
		
		System.out.println("Skriv inn tall mellom 1 og 100, 0 avslutter programmet: ");
		
		tell(teller);	
		
		for (int i = 0; i < teller.length; i++) {
			if (teller[i] > 0) 
				System.out.println((i+1) + " ble oppgitt " + teller[i] + " gang" + (teller[i] > 1 ? "er" : ""));
		}
		
	}
	
	public static void tell (int[] teller) {
		Scanner input = new Scanner(System.in);
		int tall = 1;
		do{
			tall = input.nextInt();
				if (tall >= 1 && tall <= 100)
					teller[tall - 1]++;
		} while (tall != 0);  
		input.close();
	}

}
