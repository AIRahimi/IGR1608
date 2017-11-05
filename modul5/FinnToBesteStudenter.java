package modul5;

import java.util.Scanner;

public class FinnToBesteStudenter {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Oppgi antall studenter: ");
		int antallStudenter = input.nextInt();
		
		int score, førstePlass = 0, andrePlass = 0; 
		String navn = "", førsteNavn = "", andreNavn = "";
		
		System.out.println("Oppgi studentens score og navn: ");
		for (int i = 0; i < antallStudenter; i++) {
			score = input.nextInt();
			navn = input.nextLine();
			
			if (i==0) {
				førstePlass = score;
				førsteNavn = navn;
			} else if (i == 1 && score > førstePlass) {
				andrePlass = førstePlass;
				førstePlass = score;
				andreNavn = førsteNavn;
				førsteNavn = navn;
			} else if (i == 1) {
				andrePlass = score;
				andreNavn = navn;
			} else if (i > 1 && score > førstePlass && score > andrePlass) {
				andrePlass = førstePlass;
				andreNavn = førsteNavn;
				førstePlass = score;
				førsteNavn = navn;
			} else if (i > 1 && score > andrePlass) {
				andreNavn = navn;
				andrePlass = score;
			}
		}
		
		System.out.println("Første plass: " + førsteNavn + " med score: " + førstePlass + (antallStudenter > 1 ?  
				("\nAndre plass: " + andreNavn + " med score: " + andrePlass) : ""));
		input.close();
	}
}
